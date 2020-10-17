package com.example.demo.dao;

import com.example.demo.entity.ObjectiveResult;
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
public interface ObjectiveResultDao {

    /**
     * @param objectiveResultId
     * @return the ObjectiveResults entity
     */
    @Select
    ObjectiveResult selectById(Integer objectiveResultId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(ObjectiveResult entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(ObjectiveResult entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(ObjectiveResult entity);
}