package com.byrd.test.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Data
@Table(name="gank")

public class CanGank {

    @Column(name="id")
    @Getter
    @Setter
    private @Id int id;

    @Column(name="can_gank")
    @Getter
    @Setter
    private boolean cangank;

    public boolean getCanGank() {
        return this.cangank;
    }
}