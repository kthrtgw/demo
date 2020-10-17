package com.example.demo.dao;

import com.example.demo.entity.Grade;
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
public interface GradeDao {

    /**
     * @param gradeId
     * @return the Grades entity
     */
    @Select
    Grade selectById(Integer gradeId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Grade entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Grade entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Grade entity);
}