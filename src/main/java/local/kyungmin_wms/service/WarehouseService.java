package local.kyungmin_wms.service;

import java.util.List;
import local.kyungmin_wms.domain.Address;
import local.kyungmin_wms.domain.Warehouse;
import local.kyungmin_wms.dto.WarehouseSaveDto;
import local.kyungmin_wms.dto.WarehouseSearch;
import local.kyungmin_wms.dto.WarehouseUpdateDto;
import local.kyungmin_wms.mapper.WarehouseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class WarehouseService {
  private final WarehouseMapper warehouseMapper;

  public Long saveWarehouse(WarehouseSaveDto warehouseSaveDto){
    Warehouse warehouse = Warehouse.builder().name(warehouseSaveDto.getName())
        .code(warehouseSaveDto.getCode()).address(new Address(warehouseSaveDto.getRoadNameAddress()
            , warehouseSaveDto.getJibunAddress()
            , warehouseSaveDto.getDetailsAddress()
            , warehouseSaveDto.getZipcode())).build();
    warehouseMapper.save(warehouse);
  }

  public void updateWarehouse(Long id , WarehouseUpdateDto warehouseUpdateDto){
    Warehouse warehouse = findWarehouse(id);
  }

  public Warehouse findWarehouse(Long id){
    return warehouseMapper.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 창고입니다."));
  }

  public List<Warehouse> findWarehouses(WarehouseSearch warehouseSearch){
    return warehouseMapper.findAll(warehouseSearch);
  }

}
