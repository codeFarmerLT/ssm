package com.lt.mapper;

import java.util.List;

import com.lt.entity.UserCopy;

public interface UserCopyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCopy record);

    int insertSelective(UserCopy record);

    UserCopy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCopy record);

    int updateByPrimaryKey(UserCopy record);
    
}