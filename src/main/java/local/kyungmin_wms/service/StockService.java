package local.kyungmin_wms.service;

import java.util.List;
import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.domain.Stock;
import local.kyungmin_wms.dto.StockSearch;
import local.kyungmin_wms.mapper.StockMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class StockService {

  private final StockMapper stockMapper;

  public List<Stock> findAll(StockSearch stockSearch, Member member) {
    return stockMapper.findAll(stockSearch, member);

  }
}
