# 基于ssm框架设计的图书管理系统
---
## 实验目的
1. 学习Eclipse的安装。
2. 学习Eclipse以及mysql数据库的使用
3. 学习ssm框架的搭建
4. 学习前后端数据的交互

## 实验平台
1. 操作系统
    - Window版本：Window10
2. 编辑工具
    - Eclipse
3. 服务器
    - tomcat服务器
4. 框架
    - ssm框架（spring、springmvc、mybatis）
5. 数据库
    - mysql3.7
6. 编译环境
    - jdk1.8以上
7. 项目管理工具
    -  apache-maven-3.3.9
    -  git

## 实验前准备
1. 翻阅相关资料，掌握 ssm 框架的基础知识和使用。
2. 翻阅相关资料，掌握 mysql数据库的基础知识和使用。
3. 翻阅相关资料，学习如何进行前后端数据的交互
4. 安装必要的软件和开发工具。

## 实验内容
### 安装
#### 下载地址https://www.eclipse.org/downloads/
#### 安装Eclipse。
![Eclipse安装](img\eclipse1.png)
#### 更改安装路径
![Eclipse安装](img\eclipse2.png)
#### 然后就可以正常打开使用了
![Eclipse安装](img\eclipse3.png)
#### 可以新建project了，File->New->Maven Project
![Eclipse安装](img\eclipse4.png)
这样子就完成了，我们eclipse的第一次安装使用了

### mysql 安装
#### 访问官方网站：https://www.mysql.com/ 选择Downloads下的Community，选择合适的安装版本，因为我电脑是win10的，所以选择x64的
![mysql安装](img\mysql1.png)
#### 下载完毕将文件解压到D:\目录下
![mysql安装](img\mysql2.png)
#### 右击此电脑，属性—>高级系统设置—>环境变量—>系统变量，编辑环境变量
![mysql安装](img\mysql3.png)
#### 到https://navicatformysql.en.softonic.com/?ex=MOB-614.2下载Navicat for Mysql,并选择合适的版本下载
![mysql安装](img\mysql4.png)
#### 点击桌面的快捷方式图标，打开Navicat for MySQL,单击“connection”按钮
![mysql安装](img\mysql5.png)
#### 输入“Connection Name”，“Password”，单击“Test COnnection”按钮，创建连接。
![mysql安装](img\mysql6.png)
#### 右击“此电脑->管理->服务和应用程序->服务”找到mysql，启动服务。
![mysql安装](img\mysql7.png)

### 基于ssm框架设计图书管理系统
### 下载apache-maven-3.3.9并配置本地仓库，用maven项目管理工具
![maven1](img\maven1.png)
### 将整个项目按照三层架构分成表现层，业务逻辑层，数据访问层
![maven1](img\maven2.png)
### 编写xml配置文件，整合ssm框架，为接下来实现项目功能做准备
![maven1](img\xml.png)
### 主要的配置文件内容如下
配置包扫描器

	<context:component-scan base-package="cn.book.service"/>
设置静态资源部过滤

	<mvc:resources location="/css/" mapping="/css/**"/>
	<mvc:resources location="/js/" mapping="/js/**"/>
	<mvc:resources location="/imgs/" mapping="/imgs/**"/>
	<mvc:resources location="/img/" mapping="/img/**"/>
	<mvc:resources location="/plugins/" mapping="/plugins/**"/>
	<mvc:resources location="/pages/" mapping="/pages/**"/>
加载配置文件

	<context:property-placeholder location="classpath:conf/db.properties" />
数据库连接池

	<bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource"
		destroy-method="close">
		<property name="url" value="${jdbc.url}" />
		<property name="username" value="${jdbc.username}" />
		<property name="password" value="${jdbc.password}" />
		<property name="driverClassName" value="${jdbc.driver}" />
		<property name="maxActive" value="10" />
		<property name="minIdle" value="5" />
	</bean>

db.properties配置文件内容主要是数据库的名字，数据库驱动，数据库用户名及密码

jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/book
jdbc.username=root
jdbc.password=123456

### 登录

  @RequestMapping(value = "/user/login", method =RequestMethod.POST)
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
登录界面：

![登录界面](img\login1.png)

登录失败：

![登录界面](img\login2.png)



## 实验总结
这次实验是为接下来的课设做准备的，本次课程设计经历了从选题、目录、摘要、前言、系统设计、需求分析到E-R图设计，再到关系模型设计，最后建立数据库。在这其中我通过查阅相关书籍，进行了很多次大大小小的扩充和修改，使数据库结构和内容更趋于完善。
本次实验主要解决的是在开始设计图书管理系统前所做的准备，比如下载安装编译软件Eclipse，配置编译环境，下载maven项目管理工具，整合ssm框架，下载mysql数据库，配置数据库信息并连接数据库
再次感谢郝老师孜孜不倦的教诲
