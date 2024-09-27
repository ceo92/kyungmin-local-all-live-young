package local.kyungmin_wms.mapper;

import static org.junit.jupiter.api.Assertions.*;

import local.kyungmin_wms.domain.InboundRequestProduct;
import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.domain.Stock;
import local.kyungmin_wms.dto.StockSearch;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StockMapperTest {

  @Autowired StockMapper stockMapper;
  @Test
  void update() {

  }

  @Test
  void findAll() {
    InboundRequestProduct inboundRequestProduct = new InboundRequestProduct();
    Stock stock = new Stock();

    stockMapper.findAll(new StockSearch(), new Member())
  }

  @Test
  void findById() {
  }
}