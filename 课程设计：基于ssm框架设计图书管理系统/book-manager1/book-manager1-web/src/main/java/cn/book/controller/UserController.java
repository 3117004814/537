package cn.book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import cn.book.common.pojo.EasyUIDataGridResult;
import cn.book.pojo.Book;
import cn.book.pojo.Category;
import cn.book.pojo.Users;
import cn.book.service.BookService;
import cn.book.service.CategoryService;
import cn.book.service.UserService;




@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/userlist")
	@ResponseBody
	public ModelAndView getItemList(@RequestParam(name="page",required=true,defaultValue="1")int page,@RequestParam(name="size",required=true,defaultValue="4")int size) throws Exception {
		ModelAndView mv=new ModelAndView();
		//调用服务查询商品列表
		List<Users> list =userService.getItemList(page, size);
		PageInfo pageInfo=new PageInfo(list);
		mv.addObject("userInfo", pageInfo);
		mv.setViewName("user-page-list");
		return mv;
		
	}
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView checklogin(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception {
		ModelAndView mv=new ModelAndView();
		String upassword=request.getParameter("upassword");
		Long uid=Long.parseLong(request.getParameter("uid"));
		boolean isExist=userService.findUser(uid,upassword);
	
		if(isExist==true) {
			session.setAttribute("uid", uid);
			mv.addObject("msg", " ");
			List<Book> IndexBoolist=bookService.getIndexbook();
			mv.addObject("IndexBoolist", IndexBoolist);
			List<Category> categoryList=categoryService.getname();
			mv.addObject("categoryList", categoryList);
			mv.setViewName("index");
			return mv;
		}else {
			mv.addObject("msg", "您的账号或密码输入错误");
			mv.setViewName("login");
			return mv;
		}
		
		
	}
	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView register(@ModelAttribute Users user,HttpSession session) throws Exception {
		ModelAndView mv=new ModelAndView();
		boolean isSuccess=userService.register(user);
		
		if(isSuccess==true) {
			mv.setViewName("login");
			return mv;
		}else {
			mv.addObject("ms", "您的学号已被注册,请核对信息后重新输入");
			mv.setViewName("register");
			return mv;
		}
		
		
	}
}
