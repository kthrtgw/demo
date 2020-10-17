package com.example.demo.dao;

import com.example.demo.entity.RoleUser;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@Dao
@ConfigAutowireable
public interface RoleUserDao {

    /**
     * @param roleUserId
     * @return the RoleUsers entity
     */
    @Select
    RoleUser selectById(Integer roleUserId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(RoleUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(RoleUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(RoleUser entity);
}