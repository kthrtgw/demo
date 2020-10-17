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
@Table(name = "objective_evaluations")
public class ObjectiveEvaluation {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "objective_result_id")
    public Integer objectiveResultId;

    /** */
    @Column(name = "objective_id")
    public Integer objectiveId;

    /** */
    @Column(name = "valuer_user_id")
    public Integer valuerUserId;

    /** */
    @Column(name = "grade_evaluation")
    public String gradeEvaluation;

    /** */
    @Column(name = "other_evaluation")
    public String otherEvaluation;

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