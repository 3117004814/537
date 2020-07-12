package cn.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.book.mapper.CategoryMapper;
import cn.book.pojo.Category;
import cn.book.pojo.CategoryExample;

import cn.book.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public List<Category> getname() {
		CategoryExample example=new CategoryExample();
		List<Category> categoryList=categoryMapper.selectByExample(example);
		return categoryList;
	}

}
