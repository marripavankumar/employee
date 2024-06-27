package com.employee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("employees")
public class  Employee implements Persistable<Long>{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String department;
    private double salary;

    @Transient
    private boolean newEmployee;

    @Override
    @Transient
    public boolean isNew() {
        return this.newEmployee || id == null;
    }

    public Employee setAsNew() {
        this.newEmployee = true;
        return this;
    }
}

