package local.kyungmin_wms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("warehouses")
public class WarehouseController {

  @GetMapping
  public String getWarehouses(){
    return "warehouse/warehouses";
  }


}
