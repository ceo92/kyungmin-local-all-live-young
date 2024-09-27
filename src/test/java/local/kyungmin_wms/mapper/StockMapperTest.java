package local.kyungmin_wms.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.RoleType;
import local.kyungmin_wms.constant.StoreTemperature;
import local.kyungmin_wms.domain.Company;
import local.kyungmin_wms.domain.InboundRequestProduct;
import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.domain.Pallet;
import local.kyungmin_wms.domain.Product;
import local.kyungmin_wms.domain.Stock;
import local.kyungmin_wms.domain.Warehouse;
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
    Company member = new Company();
    member.setId(1L);
    member.setName("이경민");
    member.setRoleType(RoleType.COMPANY);

    InboundRequestProduct inboundRequestProduct = new InboundRequestProduct();
    inboundRequestProduct.setId(1L);
    inboundRequestProduct.setExpirationDate(LocalDateTime.now());

    Pallet pallet = new Pallet();
    pallet.setId(1L);
    pallet.setInboundRequestProduct(inboundRequestProduct);

    Product product = new Product();
    product.setId(1L);
    product.setProductName("모닝");
    product.setProductType(ProductType.BIOLOGICAL);
    product.setStoreTemperature(StoreTemperature.ROOM_TEMPERATURE);
    product.setCompany(member);

    Warehouse warehouse = new Warehouse();
    warehouse.setId(1L);
    warehouse.setName("여주 창고");
    warehouse.setCode("0X100");

    Stock stock = new Stock();
    stock.setId(1L);
    stock.setPallet(pallet);
    stock.setStockCode("K1-001");
    stock.setProduct(product);
    stock.setWarehouse(warehouse);

    stockMapper.findAll(new StockSearch(), new Member())
  }

  @Test
  void findById() {
  }
}