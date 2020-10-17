package com.example.demo.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

/**
 */
@Entity
@Data
@Table(name = "objective_results")
public class ObjectiveResult {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "objective_result_id")
    public Integer objectiveResultId;

    /** */
    @Column(name = "objective_id")
    public Integer objectiveId;

    /** */
    @Column(name = "grade_rate")
    public Integer gradeRate;

    /** */
    @Column(name = "grade_result")
    public String gradeResult;

    /** */
    @Column(name = "other_rate")
    public Integer otherRate;

    /** */
    @Column(name = "other_result")
    public String otherResult;

    /** */
    @Column(name = "created_id")
    public Integer createdId;

    /** */
    @Column(name = "created_at")
    public LocalDateTime createdAt;

    /** */
    @Column(name = "updated_id")
    public Integer updatedId;

    /** */
    @Column(name = "updated_at")
    public LocalDateTime updatedAt;
}