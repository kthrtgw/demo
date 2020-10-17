package com.example.demo.dao;

import com.example.demo.entity.GradeUser;
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
public interface GradeUserDao {

    /**
     * @param gradeUserId
     * @return the GradeUsers entity
     */
    @Select
    GradeUser selectById(Integer gradeUserId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(GradeUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(GradeUser entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(GradeUser entity);
}