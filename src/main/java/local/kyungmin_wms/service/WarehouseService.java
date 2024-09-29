package local.kyungmin_wms.service;

import java.util.List;
import local.kyungmin_wms.domain.Warehouse;
import local.kyungmin_wms.dto.WarehouseSearch;
import local.kyungmin_wms.mapper.WarehouseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class WarehouseService {
  private final WarehouseMapper warehouseMapper;

  public Long saveWarehouse(){

  }

  public void updateWarehouse(){

  }

  public Warehouse findWarehouse(Long id){
    return warehouseMapper.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 창고입니다."));
  }

  public List<Warehouse> findWarehouses(WarehouseSearch warehouseSearch){
    return warehouseMapper.findAll(warehouseSearch);
  }

}
