package local.kyungmin_wms.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.login_temp.Login;
import local.kyungmin_wms.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/stocks")
public class StockController {

  private final StockService stockService;


  public String getStocks(Model model , @Login Member member){
    model.addAttribute("stocks" , stockService.findAll());
    return "stock/stocks";
  }

}
