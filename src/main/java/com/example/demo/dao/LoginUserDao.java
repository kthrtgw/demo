package com.example.demo.dao;

import com.example.demo.entity.LoginUser;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@Dao
@ConfigAutowireable
public interface LoginUserDao {

    /**
     * @param emailAddress
     * @return the Users entity
     */
    @Select
    LoginUser selectByEmailAddress(String emailAddress);

}