package com.example.demo.dao;

import com.example.demo.entity.Organization;
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
public interface OrganizationDao {

    /**
     * @param organizationId
     * @return the Organizations entity
     */
    @Select
    Organization selectById(Integer organizationId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Organization entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Organization entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Organization entity);
}