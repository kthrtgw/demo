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
@Table(name = "closures")
public class Closure {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "closure_id")
    public Integer closureId;

    /** */
    @Column(name = "ancestor_id")
    public Integer ancestorId;

    /** */
    @Column(name = "descendant_id")
    public Integer descendantId;

    /** */
    @Column(name = "depth")
    public Integer depth;

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