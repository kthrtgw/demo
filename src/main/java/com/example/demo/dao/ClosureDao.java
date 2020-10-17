package com.example.demo.dao;

import com.example.demo.entity.Closure;
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
public interface ClosureDao {

    /**
     * @param closureId
     * @return the Closures entity
     */
    @Select
    Closure selectById(Integer closureId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Closure entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Closure entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Closure entity);
}