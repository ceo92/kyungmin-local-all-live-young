package local.kyungmin_wms.mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import local.kyungmin_wms.constant.ProductType;
import local.kyungmin_wms.constant.RoleType;
import local.kyungmin_wms.constant.StoreTemperature;
import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.domain.Stock;
import local.kyungmin_wms.dto.StockSearch;
import local.kyungmin_wms.mapper.StockMapperTest.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.context.TestConfiguration;

@SpringBootTest
class StockMapperTest {

  @Autowired StockMapper stockMapper;
  @Autowired MemberRepository memberRepository;
  @Test
  void update() {

  }

  @Test
  void RoleType_테스트(){
    Member member = new Member();
    member.setRoleType(RoleType.ADMIN);

    Long saveId = memberRepository.save(member);

    Assertions.assertThat(memberRepository.findById(saveId)).isEqualTo(member);

  }



  @Test
  void findAll() {
    //given
    List<StoreTemperature> storeTemperatures = new ArrayList<>();
    storeTemperatures.add(StoreTemperature.ROOM_TEMPERATURE);
    storeTemperatures.add(StoreTemperature.FROZEN);

    List<ProductType> productTypes = new ArrayList<>();
    productTypes.add(ProductType.EXPLOSIVE);
    productTypes.add(ProductType.DRUG);
    StockSearch stockSearch = new StockSearch("여주 창고", "C100", "AA", storeTemperatures , productTypes , "아메리카노" , "이경민" , LocalDateTime.of(2024 , 3 , 11 ,12 , 30 , 0));
    //INSERT INTO MEMBER VALUES(1 , '이경민' , 'abcd' , '010-0000-0000' , 'abcd' , '경수대로1100' , '100-1010' , '활성' , '2024-03-11' , '2024-03-19' , '총관리자' , 'B100' , 1 , 1 , '2024-04-01');
    Member member = new Member();
    member.setId(1L);
    member.setRoleType(RoleType.ADMIN);

    //when
    List<Stock> findAll = stockMapper.findAll(stockSearch, member);
    for (Stock stock : findAll) {
      System.out.println("stock = " + stock);
    }


    //then
    //Assertions.assertThat(findAll.size()).isEqualTo(1);
  }

  @Test
  void findById() {
  }

  @TestConfiguration
  static class MemberRepository{
    private final Map<Long, Member> store = new HashMap<>();
    private static Long sequence = 0L;

    public Long save(Member member){
      member.setId(++sequence);
      store.put(member.getId() , member);
      return member.getId();
    }

    public Member findById(Long id){
      return store.get(id);
    }

  }
}