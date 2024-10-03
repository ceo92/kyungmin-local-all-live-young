package local.kyungmin_wms.mapper;

import java.util.List;
import java.util.Optional;
import local.kyungmin_wms.domain.InboundRequestProduct;
import local.kyungmin_wms.domain.Member;
import local.kyungmin_wms.domain.Stock;
import local.kyungmin_wms.dto.PageSearchDto;
import local.kyungmin_wms.dto.StockSearch;
import local.kyungmin_wms.dto.StockUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StockMapper {

  void update(@Param("stockId") Long stockId , @Param("inboundRequestProduct") InboundRequestProduct inboundRequestProduct); //재고 수정(재고 실사)

  List<Stock> findAll(@Param(value = "stockSearch") StockSearch stockSearch, @Param(value = "member") Member member, @Param("pageSearchDto")
      PageSearchDto pageSearchDto); // 검색조건 별 전체 재고 화면 조회


  https://congsong.tistory.com/26
  int count(PageSearchDto pageSearchDto);

  Optional<Stock> findById(Long id); //상세 재고 화면 조회



}
