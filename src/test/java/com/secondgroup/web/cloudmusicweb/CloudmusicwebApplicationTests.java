package com.secondgroup.web.cloudmusicweb;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.secondgroup.web.cloudmusicweb.entity.Role;
import com.secondgroup.web.cloudmusicweb.entity.Singer;
import com.secondgroup.web.cloudmusicweb.entity.User;
import com.secondgroup.web.cloudmusicweb.entity.Userinfo;
import com.secondgroup.web.cloudmusicweb.mapper.RoleMapper;
import com.secondgroup.web.cloudmusicweb.mapper.UserMapper;
import com.secondgroup.web.cloudmusicweb.mapper.UserinfoMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

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
		//IPage<Userinfo> userinfoIPage =userinfoMapper.getUserInfosList(new Page<Userinfo>(1, 5), new QueryWrapper<Userinfo>());
		PageHelper.startPage(1, 10);
		List<Userinfo> userInfosList = userinfoMapper.getUserInfosList();
		for (Userinfo c2 : userInfosList) {
			logger.info(c2.toString());
			Assert.assertNotNull(c2);
			Assert.assertNotNull(c2.getUser());
		}
	}
}
