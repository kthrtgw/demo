package com.example.demo.entity;

import java.time.LocalDate;
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
@Table(name = "objective_plans")
public class ObjectivePlan {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "objective_plan_id")
    public Integer objectivePlanId;

    /** */
    @Column(name = "objective_id")
    public Integer objectiveId;

    /** */
    @Column(name = "current_grade_id")
    public Integer currentGradeId;

    /** */
    @Column(name = "objective_grade_id")
    public Integer objectiveGradeId;

    /** */
    @Column(name = "grade_plan")
    public String gradePlan;

    /** */
    @Column(name = "other_plan")
    public String otherPlan;

    /** */
    @Column(name = "objectived_on")
    public LocalDate objectivedOn;

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