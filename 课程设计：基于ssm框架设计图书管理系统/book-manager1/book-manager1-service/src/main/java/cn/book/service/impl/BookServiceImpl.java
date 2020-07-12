package cn.book.service.impl;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.book.common.pojo.EasyUIDataGridResult;
import cn.book.mapper.BookMapper;
import cn.book.mapper.BorrowitemsMapper;
import cn.book.pojo.Book;
import cn.book.pojo.BookExample;

import cn.book.pojo.BookExample.Criteria;
import cn.book.pojo.Borrowitems;
import cn.book.service.BookService;
/**
 * 书籍管理service
 * @author 郑剑鑫
 * @time   2019
 *
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	@Autowired
	private BorrowitemsMapper itemMapper;
	
	@Override
	public Book selectByPrimaryKey(int bookId) {
		// TODO Auto-generated method stub
		//根据主键查询
		Book book = bookMapper.selectByPrimaryKey(bookId);
		return book;
	}

	@Override
	public EasyUIDataGridResult getItemList(int page, int rows) {
		// TODO Auto-generated method stub
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询
		BookExample example=new BookExample();
		List<Book> list=bookMapper.selectByExample(example);
		//创建一个返回值对象
		EasyUIDataGridResult result=new EasyUIDataGridResult();
		result.setList(list);
		//取分页结果
		PageInfo<Book> pageInfo=new PageInfo(list);
	
		//取总记录数
		long total=pageInfo.getTotal();
		result.setTotal(total);
		int pageSize=pageInfo.getPageSize();
		result.setPageSize(pageSize);
		int pageNum=pageInfo.getPageNum();
		result.setPageNum(pageNum);
		int pages=pageInfo.getPages();
		result.setPages(pages);
		return result;
	}

	@Override
	public List<Book> getIndexbook() {
		// TODO Auto-generated method stub
		BookExample example=new BookExample();
		List<Book> list=bookMapper.selectByExample(example);
		
		return list;
	}

	@Override
	public Book getBook_infoByBid(int bid) {
		BookExample example=new BookExample();
		Criteria criteria=example.createCriteria();
		criteria.andBidEqualTo(bid);
		List<Book> list=bookMapper.selectByExample(example);
		Book book=list.get(0);
		return book;
	}

	@Override
	public List<Book> findbookBycid(int cid) {
		// TODO Auto-generated method stub
		BookExample example=new BookExample();
		Criteria criteria=example.createCriteria();
		criteria.andCidEqualTo(cid);
		List<Book> list=bookMapper.selectByExample(example);
		return list;
	}

	@Override
	public boolean borrowBookByBid(int bid, Long uid) {
		// TODO Auto-generated method stub
		BookExample example=new BookExample();
		Criteria criteria=example.createCriteria();
		criteria.andBidEqualTo(bid);
		List<Book> list=bookMapper.selectByExample(example);
		Book book=list.get(0);
		if(book.getCurrentnumber()==0) {
			return false;	
		}else {
			book.setCurrentnumber(book.getCurrentnumber()-1);
			bookMapper.updateByPrimaryKey(book);
			Borrowitems item=new Borrowitems();
			item.setBid(bid);
			item.setUid(uid);
			item.setBorrowtime(new Date());
			itemMapper.insert(item);
			
			return true;
			
		}
		
	}

}
