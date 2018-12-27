package com.demo3.mapper;

import com.demo3.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Mapper
public interface  UserMapper {
    @Select("SELECT * FROM smbms_user")
    @Cacheable(value="my", key="'users_'")
    public List<User> selectUser();

}
