package local.kyungmin_wms.web.controller;

import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.domain.Warehouse;
import local.kyungmin_wms.dto.WarehouseSaveDto;
import local.kyungmin_wms.dto.WarehouseSearch;
import local.kyungmin_wms.login_temp.Login;
import local.kyungmin_wms.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("warehouses")
public class WarehouseController {

  private final WarehouseService warehouseService;

  @GetMapping("save")
  public String saveWarehouseForm(Model model){
    model.addAttribute("warehouse" , new WarehouseSaveDto());
    return "warehouse/saveForm";
  }

  @PostMapping("save")
  public String saveWarehouseForm(@Validated @ModelAttribute("warehouse") WarehouseSaveDto warehouseSaveDto , BindingResult bindingResult ,
      RedirectAttributes redirectAttributes , @Login Member member){
    if (bindingResult.hasErrors()){
      return "warehouse/saveForm";
    }
    Long saveWarehouseId = warehouseService.saveWarehouse(warehouseSaveDto);
    redirectAttributes.addAttribute("id", saveWarehouseId);
    redirectAttributes.addAttribute("status", true);
    return "redirect:/warehouses/{id}";
  }



  @GetMapping
  public String getWarehouses(@ModelAttribute("warehouseSearch") WarehouseSearch warehouseSearch,
      Model model) {
    model.addAttribute("warehouseSearch", warehouseSearch);
    model.addAttribute("latitude", 37.218281064433);
    model.addAttribute("longitude", 127.420907144956);
    return "warehouse/warehouses";
  }

  @GetMapping("{id}")
  public String getWarehouse(@PathVariable("id") Long id, Model model) {
    Warehouse warehouse = warehouseService.findWarehouse(id);
    model.addAttribute("warehouse", warehouse);
    return "warehouse/warehouse";
  }

  @GetMapping("aa")
  public String sufjdujfsd(){
    return "warehouse/address_input";
  }




}
