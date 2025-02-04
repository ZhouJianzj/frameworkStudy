package com.zj.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_unit_it")
public class AdUnitIt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id" ,nullable = false)
    private Integer id;
    @Basic
    @Column(name = "unit_id",nullable = false)
    private Integer unitId;
    @Basic
    @Column(name = "it_tag",nullable = false)
    private String itTag;

}
