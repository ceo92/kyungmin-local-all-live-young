package local.kyungmin_wms.mapper;

import java.util.List;
import java.util.Optional;
import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.domain.Stock;
import local.kyungmin_wms.dto.StockSearch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StockMapper {

  void update(Stock stock); //재고 수정(재고 실사)

  List<Stock> findAll(@Param(value = "stockSearch") StockSearch stockSearch, @Param(value = "member") Member member); // 검색조건 별 전체 재고 화면 조회

  Optional<Stock> findById(Long id); //상세 재고 화면 조회



}
