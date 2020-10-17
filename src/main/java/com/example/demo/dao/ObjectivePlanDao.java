package com.example.demo.dao;

import com.example.demo.entity.ObjectivePlan;
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
public interface ObjectivePlanDao {

    /**
     * @param objectivePlanId
     * @return the ObjectivePlans entity
     */
    @Select
    ObjectivePlan selectById(Integer objectivePlanId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(ObjectivePlan entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(ObjectivePlan entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(ObjectivePlan entity);
}