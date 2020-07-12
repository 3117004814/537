package cn.book.service;

import java.util.List;

import cn.book.common.pojo.EasyUIDataGridResult;
import cn.book.pojo.Book;

public interface BookService {

	Book selectByPrimaryKey(int bookId);
	EasyUIDataGridResult getItemList(int page, int rows);
	List<Book> getIndexbook();
	Book getBook_infoByBid(int bid);
	List<Book> findbookBycid(int cid);
	boolean borrowBookByBid(int bid, Long uid);
	
}
