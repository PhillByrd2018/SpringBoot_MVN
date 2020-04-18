package com.byrd.test.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="mordekasier")
@Getter
@Setter
@Data
public class Mordekaiser {

    @Id
    @Column(name="id")
    @Getter
    @Setter
    private int id;

    @Column(name="ability")
    @Getter
    @Setter
    private String ability;

    public String getAbility() {
        return this.ability;
    }
}