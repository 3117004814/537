package cn.book.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.book.common.pojo.EasyUIDataGridResult;
import cn.book.pojo.Book;
import cn.book.pojo.Borrowitems;
import cn.book.pojo.Category;
import cn.book.service.BookService;
import cn.book.service.BorrowitemService;
import cn.book.service.CategoryService;

/**
 * 书籍管理
 * @author 郑剑鑫
 * @time   2019
 *
 */
@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private BorrowitemService borrowitemService;
	
	//"/book/{/bookId}要和(@PathVariable int bookId)一致"
	@RequestMapping("/book/{bookId}")
	@ResponseBody
	public Book selectByPrimaryKey(@PathVariable int bookId) {
		Book book=bookService.selectByPrimaryKey(bookId);
		
		return book;
		
	}
	
	@RequestMapping("/booklist")
	@ResponseBody
	public ModelAndView getItemList(@RequestParam(name="page",required=true,defaultValue="1")int page,@RequestParam(name="size",required=true,defaultValue="4")int size) throws Exception {
		ModelAndView mv=new ModelAndView();
		//调用服务查询商品列表
		EasyUIDataGridResult result=bookService.getItemList(page, size);
		mv.addObject("pageInfo", result);
		mv.setViewName("book-page-list");
		return mv;
		
	}
	
	@RequestMapping("/book_info")
	@ResponseBody
	public ModelAndView getBook_infoByBid(@RequestParam(name="bid")int bid) throws Exception {
		ModelAndView mv=new ModelAndView();
		List<Category> categoryList=categoryService.getname();
		mv.addObject("categoryList", categoryList);
		Book book=bookService.getBook_infoByBid(bid);
		mv.addObject("book", book);
		mv.setViewName("book_info");
		
		return mv;
		
	}
	
	//根据书籍类别返回书籍
	@RequestMapping("/findbook")
	@ResponseBody
	public ModelAndView findbookBycid(@RequestParam(name="cid")int cid) throws Exception {
		ModelAndView mv=new ModelAndView();
		List<Book> booklistById=bookService.findbookBycid(cid);
		mv.addObject("booklistById", booklistById);
		mv.setViewName("book_list");
		List<Category> categoryList=categoryService.getname();
		mv.addObject("categoryList", categoryList);
		
		return mv;
		
	}
	@RequestMapping("/book/borrow")
	@ResponseBody
	public ModelAndView borrowByBid(@RequestParam(name="bid",required=false)int bid,HttpSession session) throws Exception {
		ModelAndView mv=new ModelAndView();
		Long uid=(Long) session.getAttribute("uid");
		
		
		//调用服务查询商品列表
		boolean isSuccess=bookService.borrowBookByBid(bid,uid);
		if(isSuccess){
			mv.addObject("tip", "借书成功，以下是你的全部借书记录");
		}else {
			mv.addObject("tip", "这本已经被借完啦，借书失败！！！以下是你以往的借书记录");
			
		}
		List<Category> categoryList=categoryService.getname();
		mv.addObject("categoryList", categoryList);
		List<Borrowitems> list=borrowitemService.findItemsByUid(uid);
		mv.addObject("orderList", list);
		mv.setViewName("order_list");
		return mv;
		
	}
	
	@RequestMapping("/returnbook")
	@ResponseBody
	public ModelAndView returnBookByOrder(@RequestParam(name="uid")Long uid,@RequestParam(name="bid")int bid,HttpSession session) throws Exception {
		ModelAndView mv=new ModelAndView();
		boolean isReturn=borrowitemService.returnBookByOrder(uid,bid);
		if(isReturn){
			mv.addObject("tip", "还书成功");
		}else {
			mv.addObject("tip", "还书失败，你未借过或已归还此书");
			
		}
		List<Category> categoryList=categoryService.getname();
		mv.addObject("categoryList", categoryList);
		List<Borrowitems> list=borrowitemService.findItemsByUid(uid);
		mv.addObject("orderList", list);
		mv.setViewName("order_list");
		return mv;
		
	}
	@RequestMapping("/borrowitem")
	@ResponseBody
	public ModelAndView borrowitemList(HttpSession session) throws Exception {
		ModelAndView mv=new ModelAndView();
		Long uid=(Long) session.getAttribute("uid");
		List<Category> categoryList=categoryService.getname();
		mv.addObject("categoryList", categoryList);
		List<Borrowitems> list=borrowitemService.findItemsByUid(uid);
		mv.addObject("orderList", list);
		mv.setViewName("order_list");
		return mv;
		
	}
	
}
