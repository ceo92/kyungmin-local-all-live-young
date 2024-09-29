package local.kyungmin_wms.web.controller;

import java.util.List;
import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.StoreTemperature;
import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.domain.Stock;
import local.kyungmin_wms.dto.StockSearch;
import local.kyungmin_wms.dto.StockUpdateDto;
import local.kyungmin_wms.login_temp.Login;
import local.kyungmin_wms.service.StockService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/stocks")
public class StockController {

  private final StockService stockService;


  //이렇게 모델로 넘겨주는 게 나음 ㅇㅇ
  @ModelAttribute("storeTemperatures")
  public StoreTemperature[] storeTemperatures(){
    return StoreTemperature.values();
  }

  @ModelAttribute("productTypes")
  public ProductType[] productTypes(){
    return ProductType.values();
  }

  @GetMapping
  public String getStocks(@ModelAttribute("stockSearch") StockSearch stockSearch, Model model , @Login Member member){
    List<Stock> stocks = stockService.findStocks(stockSearch, member);
    model.addAttribute("member" , member);
    model.addAttribute("stocks" , stocks);
    return "stock/stocks";
  }

  @GetMapping("{id}")
  public String getStock(@PathVariable("id") Long id , Model model){
    Stock stock = stockService.findStock(id);
    model.addAttribute("totalStockCount", stock.getTotalStockCount());
    model.addAttribute("stock" , stock);
    return "stock/stock";
  }


  @GetMapping("{id}/update")
  public String updateStockForm(@PathVariable("id") Long id , Model model){
    Stock stock = stockService.findStock(id);
    StockUpdateDto stockUpdateDto = new StockUpdateDto(stock.getStockCode() ,
        stock.getProduct().getProductName() ,
        stock.getProduct().getMember().getName() ,
        stock.getPallet().getInboundRequestProduct().getManufactureNumber() ,
        stock.getPallet().getInboundRequestProduct().getPalletQuantity() ,
        stock.getPallet().getInboundRequestProduct().getBoxQuantity());
    model.addAttribute("id", id);
    model.addAttribute("stock" , stockUpdateDto);
    return "stock/updateForm";
  }

  @PostMapping("{id}/update")
  public String updateStockForm(@Validated @ModelAttribute("stock") StockUpdateDto stockUpdateDto , BindingResult bindingResult ,@PathVariable("id") Long id ,  RedirectAttributes redirectAttributes , @Login Member member){
    if (bindingResult.hasErrors()){
      return "stock/updateForm";
    }
    stockService.updateQuantity(id , stockUpdateDto);
    redirectAttributes.addAttribute("id" , id);
    redirectAttributes.addAttribute("status" , true);
    return "redirect:/stocks/{id}";
  }





}
