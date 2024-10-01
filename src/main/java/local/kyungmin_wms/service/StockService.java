package local.kyungmin_wms.service;

import java.util.List;
import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.StoreTemperature;
import local.kyungmin_wms.domain.InboundRequestProduct;
import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.domain.Stock;
import local.kyungmin_wms.dto.StockSearch;
import local.kyungmin_wms.dto.StockUpdateDto;
import local.kyungmin_wms.mapper.StockMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class StockService {

  private final StockMapper stockMapper;

  public List<Stock> findStocks(StockSearch stockSearch, Member member) {
    List<String> productTypeList = stockSearch.getProductTypes().stream().map(productType -> ProductType.valueOf(productType).getDescription()).toList();
    List<String> storeTemperatureList  = stockSearch.getStoreTemperatures().stream().map(storeTemperature -> StoreTemperature.valueOf(storeTemperature).getDescription()).toList();
    stockSearch.setProductTypes(productTypeList);
    stockSearch.setStoreTemperatures(storeTemperatureList);
    return stockMapper.findAll(stockSearch, member);
  }

  public Stock findStock(Long id){
    return stockMapper.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 재고입니다."));
  }

  @Transactional //한 트랜잭션으로 두 쿼리를 묶음으로써 둘 다 처리돼야 커밋 하나라도 예외 나면 롤백!
  public void updateQuantity(Long stockId , StockUpdateDto stockUpdateDto){
    InboundRequestProduct inboundRequestProduct = findStock(stockId).getPallet().getInboundRequestProduct();
    inboundRequestProduct.updateTotalQuantity(stockUpdateDto.getPalletQuantity(), stockUpdateDto.getBoxQuantity());
    stockMapper.update(stockId , inboundRequestProduct);
  }
}
