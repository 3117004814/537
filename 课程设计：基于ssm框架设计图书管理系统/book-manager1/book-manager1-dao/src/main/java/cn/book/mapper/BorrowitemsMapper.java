package cn.book.mapper;

import cn.book.pojo.Borrowitems;
import cn.book.pojo.BorrowitemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowitemsMapper {
    int countByExample(BorrowitemsExample example);

    int deleteByExample(BorrowitemsExample example);

    int insert(Borrowitems record);

    int insertSelective(Borrowitems record);

    List<Borrowitems> selectByExample(BorrowitemsExample example);

    int updateByExampleSelective(@Param("record") Borrowitems record, @Param("example") BorrowitemsExample example);

    int updateByExample(@Param("record") Borrowitems record, @Param("example") BorrowitemsExample example);
}