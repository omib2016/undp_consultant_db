package com.undp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by omib on 06/09/2016.
 */
@Entity
public class Dual
{
    @Id
    private int id;

    public Dual(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
