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
@Table(name = "grades")
public class Grade {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grade_id")
    public Integer gradeId;

    /** */
    @Column(name = "grade_name")
    public String gradeName;

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