package com.example.demo.dao;

import com.example.demo.entity.Objective;
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
public interface ObjectiveDao {

    /**
     * @param objectiveId
     * @return the Objectives entity
     */
    @Select
    Objective selectById(Integer objectiveId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Objective entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Objective entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Objective entity);
}