package cn.book.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.book.mapper.BookMapper;
import cn.book.mapper.BorrowitemsMapper;
import cn.book.pojo.Book;
import cn.book.pojo.BookExample;
import cn.book.pojo.Borrowitems;
import cn.book.pojo.BorrowitemsExample;
import cn.book.pojo.BorrowitemsExample.Criteria;
import cn.book.service.BorrowitemService;

@Service
public class BorrowitemServiceImpl implements BorrowitemService {

	@Autowired
	private BorrowitemsMapper itemsMapper;
	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<Borrowitems> findItemsByUid(Long uid) {
		BorrowitemsExample example=new BorrowitemsExample();
		Criteria criteria=example.createCriteria();
		criteria.andUidEqualTo(uid);
		List<Borrowitems> list=itemsMapper.selectByExample(example);
		return list;
	}

	@Override
	public boolean returnBookByOrder(Long uid,int bid) {
		BorrowitemsExample example=new BorrowitemsExample();
		Criteria criteria=example.createCriteria();
		criteria.andUidEqualTo(uid);
		criteria.andBidEqualTo(bid);
		List<Borrowitems> list=itemsMapper.selectByExample(example);
		System.out.println(list.size());
		
		for(Borrowitems item:list) {
			
			if(item.getReturntime()==null||"".equals(item.getReturntime())) {
				item.setReturntime(new Date());
				itemsMapper.updateByExample(item, example);
				BookExample example1=new BookExample();
				cn.book.pojo.BookExample.Criteria criteria1=example1.createCriteria();
				criteria1.andBidEqualTo(bid);
				List<Book> list1=bookMapper.selectByExample(example1);
				Book book=list1.get(0);
				book.setCurrentnumber(book.getCurrentnumber()+1);
				bookMapper.updateByPrimaryKey(book);
				return true;
				
			}
			
		}
		return false;
		
		
		
	}

}
