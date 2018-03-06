package com.lt.mapper;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lt.entity.User;

import junit.framework.Assert;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserMapperTest {

	@Resource
	UserMapper userMapper;
	
	@Test
	public void testDeleteByPrimaryKey() {
	}

	@Test
	public void testInsert() {
	}

	@Test
	public void testInsertSelective() {
		User user = new User();
		user.setSex("1");
		user.setUserName("张三");
		user.setCreateTime(new Date());
		int res = userMapper.insertSelective(user);
		Assert.assertEquals(1, res);
	}

	@Test
	public void testSelectByPrimaryKey() {
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user.toString());
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
	}

	@Test
	public void testUpdateByPrimaryKey() {
	}
	
	@Test
	public void testSelectAddressListByUserId(){
		Map<String, Object> map = userMapper.selectMapByUserId(1);
		System.out.println(map);
	}

}
