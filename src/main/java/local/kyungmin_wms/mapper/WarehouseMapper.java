package local.kyungmin_wms.mapper;

import java.util.List;
import java.util.Optional;
import local.kyungmin_wms.domain.Warehouse;
import local.kyungmin_wms.dto.WarehouseSearch;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WarehouseMapper {

  void save(Warehouse warehouse);

  void update(Warehouse warehouse);

  Optional<Warehouse> findById(Long id);

  void delete(Long id);

  List<Warehouse> findAll(WarehouseSearch warehouseSearch);

}
