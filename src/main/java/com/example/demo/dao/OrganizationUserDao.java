package com.example.demo.dao;

import com.example.demo.entity.OrganizationUser;
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
public interface OrganizationUserDao {

    /**
     * @param organizationUserId
     * @return the OrganizationUsers entity
     */
    @Select
    OrganizationUser selectById(Integer organizationUserId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(OrganizationUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(OrganizationUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(OrganizationUser entity);
}