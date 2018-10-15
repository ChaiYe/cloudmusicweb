package com.secondgroup.web.cloudmusicweb;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.secondgroup.web.cloudmusicweb.controller.FocusController;
import com.secondgroup.web.cloudmusicweb.controller.UserController;
import com.secondgroup.web.cloudmusicweb.entity.*;
import com.secondgroup.web.cloudmusicweb.mapper.*;
import com.secondgroup.web.cloudmusicweb.service.IFocusService;
import com.secondgroup.web.cloudmusicweb.service.IUserService;
import com.secondgroup.web.cloudmusicweb.service.impl.UserServiceImpl;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudmusicwebApplicationTests {


	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private RoleMapper roleMapper;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserinfoMapper userinfoMapper;

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private FocusController focusController;

	@Autowired
	private IFocusService focusService;

	@Autowired
	private FocusMapper focusMapper;

	@Autowired
	private SongMapper songMapper;

	@Autowired
	private MvMapper mvMapper;

	@Autowired
	private DownloadMapper downloadMapper;
	/**
	 * 测试数据库连接
	 */
	@Test
	public void testJdbcConnect(){
		User user = userMapper.selectById(1);
		System.out.println(user);
		System.out.println("连接成功");
		}

	/**
	 * 测试分页
	 */
	@Test
	public void testPageHelper() {

		IPage<Role> roleIPage = roleMapper.selectPage(new Page<Role>(1, 5), new QueryWrapper<Role>());

		for (Role role:roleIPage.getRecords()) {
			System.out.println(role.getRoleId());
		}
	}

	@Test
	public  void cmdUser(){

		PageHelper.startPage(1, 10);
		List<Userinfo> userInfosList = userinfoMapper.getUserInfosList();
		for (Userinfo c2 : userInfosList) {
			logger.info(c2.toString());
			Assert.assertNotNull(c2);
			Assert.assertNotNull(c2.getUser());
		}

	}


	/**
	 * 测试连接redis
	 */
	@Test
	public void testTemplate() throws InterruptedException {
		User user = new User();
		user.setUserId(100);
		user.setName("毒物为");

		ValueOperations<String, User> operations=redisTemplate.opsForValue();

		operations.set("com.neox", user);
		operations.set("com.neo.f", user,1, TimeUnit.SECONDS);
		Thread.sleep(1000);
		//redisTemplate.delete("com.neo.f");
		boolean exists=redisTemplate.hasKey("com.neo.f");
		User temp = operations.get("com.neox");
		System.out.println(temp.toString());

	}

	@Test
	public void test() throws Exception {
		/*List<Focus> foci = focusService.pageWithName(1, 10, null);
        System.out.println("book");*/
		/*List<Mv> page = mvMapper.getPage(null);
		System.out.println(page);*/
		List<Download> mapperPage = downloadMapper.getPage(null);
		System.out.println("困");

	}


}
