package local.kyungmin_wms.mapper;

import java.util.List;
import java.util.Optional;
import local.kyungmin_wms.domain.Stock;
import local.kyungmin_wms.dto.StockSearch;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockMapper {

  void update(Stock stock);

  List<Stock> findAll(StockSearch stockSearch);

  Optional<Stock> find



}
