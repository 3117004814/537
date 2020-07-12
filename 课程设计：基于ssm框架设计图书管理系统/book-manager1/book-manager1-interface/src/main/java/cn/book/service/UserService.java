package cn.book.service;

import java.util.List;

import cn.book.pojo.Users;

public interface UserService {

	List<Users> getItemList(int page, int rows) throws Exception;
	Boolean findUser(Long uid, String upassword);
	Boolean register(Users user);
}
