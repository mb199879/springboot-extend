package com.example.demo.dao;
import com.example.demo.bean.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by meibo on 18/11/8.
 */
@Mapper
public interface UserDao {
    List<UserEntity> findAllUser();

    public void test();
}