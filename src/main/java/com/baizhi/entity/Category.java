package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "s_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    private Integer id;
    @Column(name = "categoryname")
    private String categoryName;
}
