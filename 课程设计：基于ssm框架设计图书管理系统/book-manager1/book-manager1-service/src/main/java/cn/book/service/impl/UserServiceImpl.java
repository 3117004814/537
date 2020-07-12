package cn.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.book.mapper.BookMapper;
import cn.book.mapper.UsersMapper;
import cn.book.pojo.Book;
import cn.book.pojo.BookExample;
import cn.book.pojo.Users;
import cn.book.pojo.UsersExample;
import cn.book.pojo.UsersExample.Criteria;
import cn.book.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public List<Users> getItemList(int page, int rows) throws Exception{
		// TODO Auto-generated method stub
		PageHelper.startPage(page, rows);
		//执行查询
		UsersExample example=new UsersExample();
		List<Users> list=usersMapper.selectByExample(example);
		return list;
	}

	@Override
	public Boolean findUser(Long uid, String upassword) {
		// TODO Auto-generated method stub
		
		UsersExample example=new UsersExample();
		Criteria criteria=example.createCriteria();
		criteria.andUidEqualTo(uid);
		List<Users> user=usersMapper.selectByExample(example);
		
		if(user==null||user.size()==0) {
			return false;
		}
		Users users=user.get(0);
		if(!users.getUpassword().equals(upassword)) {
			return false;
		}
		return true;
		
	}

	@Override
	public Boolean register(Users user) {
		// TODO Auto-generated method stub
		UsersExample example=new UsersExample();
		Criteria criteria=example.createCriteria();
		criteria.andUidEqualTo(user.getUid());
		List<Users> u=usersMapper.selectByExample(example);
		
		if(u==null||u.size()==0) {
			usersMapper.insert(user);
			return true;
		}else {
		
		return false;
		}
	}

}
