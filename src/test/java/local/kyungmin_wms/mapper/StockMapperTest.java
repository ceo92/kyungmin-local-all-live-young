package local.kyungmin_wms.mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.StoreTemperature;
import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.dto.StockSearch;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StockMapperTest {

  @Autowired StockMapper stockMapper;
  @Test
  void update() {

  }

  @Test
  void findAll() {
    /*Company member = new Company();
    member.setId(1L);
    member.setName("이경민");
    member.setRoleType(RoleType.COMPANY);

    InboundRequestProduct inboundRequestProduct = new InboundRequestProduct();
    inboundRequestProduct.setId(1L);
    inboundRequestProduct.setExpirationDate(LocalDateTime.now());

    Pallet pallet = new Pallet();
    pallet.setId(1L);
    pallet.setInboundRequestProduct(inboundRequestProduct);

    Product product = new Product();
    product.setId(1L);
    product.setProductName("모닝");
    product.setProductType(ProductType.BIOLOGICAL);
    product.setStoreTemperature(StoreTemperature.ROOM_TEMPERATURE);
    product.setCompany(member);

    Warehouse warehouse = new Warehouse();
    warehouse.setId(1L);
    warehouse.setName("여주 창고");
    warehouse.setCode("0X100");

    Stock stock = new Stock();
    stock.setId(1L);
    stock.setPallet(pallet);
    stock.setStockCode("K1-001");
    stock.setProduct(product);
    stock.setWarehouse(warehouse);*/
    List<StoreTemperature> storeTemperatures = new ArrayList<>();
    storeTemperatures.add(StoreTemperature.ROOM_TEMPERATURE);
    storeTemperatures.add(StoreTemperature.FROZEN);
    List<ProductType> productTypes = new ArrayList<>();
    productTypes.add(ProductType.EXPLOSIVE);
    productTypes.add(ProductType.DRUG);
    StockSearch stockSearch = new StockSearch(
        "여주 창고",
        "C100",
        "AA",
        storeTemperatures ,
        productTypes ,
        "아메리카노" ,
        "이경민" ,
        LocalDateTime.of(2024 , 3 , 11 ,12 , 30 , 0));
    //INSERT INTO MEMBER VALUES(1 , '이경민' , 'abcd' , '010-0000-0000' , 'abcd' , '경수대로1100' , '100-1010' , '활성' , '2024-03-11' , '2024-03-19' , '총관리자' , 'B100' , 1 , 1 , '2024-04-01');
    stockMapper.findAll(stockSearch, new Member())
  }

  @Test
  void findById() {
  }
}