package com.nie.dao;

import com.nie.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookId") int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("bookId")int id);

    //查询全部书
    List<Books> queryAllBook();

    List<Books> queryBookByName(@Param("bookName")String bookName);
}
