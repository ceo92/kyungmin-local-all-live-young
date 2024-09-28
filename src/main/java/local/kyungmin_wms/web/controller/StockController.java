package local.kyungmin_wms.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.RoleType;
import local.kyungmin_wms.constant.StoreTemperature;
import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.domain.Stock;
import local.kyungmin_wms.dto.StockSearch;
import local.kyungmin_wms.login_temp.Login;
import local.kyungmin_wms.service.StockService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
    System.out.println(stockSearch.getStockCode());
    System.out.println(stockSearch.getProductTypes());
    System.out.println(stockSearch.getStoreTemperatures());
    System.out.println(stockSearch.getStockCode());
    List<Stock> stocks = stockService.findAll(stockSearch, member);
    model.addAttribute("member" , member);
    model.addAttribute("stocks" , stocks);
    return "stock/stocks";
  }


}
