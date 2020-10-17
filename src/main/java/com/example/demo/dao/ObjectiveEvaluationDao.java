package com.example.demo.dao;

import com.example.demo.entity.ObjectiveEvaluation;
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
public interface ObjectiveEvaluationDao {

    /**
     * @param objectiveResultId
     * @return the ObjectiveEvaluations entity
     */
    @Select
    ObjectiveEvaluation selectById(Integer objectiveResultId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(ObjectiveEvaluation entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(ObjectiveEvaluation entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(ObjectiveEvaluation entity);
}