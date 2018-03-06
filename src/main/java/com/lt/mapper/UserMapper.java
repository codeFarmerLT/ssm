package com.lt.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lt.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    Map<String, Object> selectMapByUserId(@Param("userid")Integer userId);
}