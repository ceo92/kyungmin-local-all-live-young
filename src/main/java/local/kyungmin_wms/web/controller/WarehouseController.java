package local.kyungmin_wms.web.controller;

import local.kyungmin_wms.dto.WarehouseSearch;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("warehouses")
public class WarehouseController {

  @GetMapping
  public String getWarehouses(@ModelAttribute("warehouseSearch") WarehouseSearch warehouseSearch, Model model){
    model.addAttribute("warehouseSearch", warehouseSearch);
    model.addAttribute("latitude" , 37.566535);
    model.addAttribute("longitude" , 126.977969);
    return "warehouse/warehouses";
  }



}
