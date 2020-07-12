package cn.book.service;

import java.util.Date;
import java.util.List;

import cn.book.common.pojo.EasyUIDataGridResult;
import cn.book.pojo.Book;
import cn.book.pojo.Borrowitems;

public interface BorrowitemService {

	List<Borrowitems> findItemsByUid(Long uid);

	boolean returnBookByOrder(Long uid,int bid);

	
	
}
