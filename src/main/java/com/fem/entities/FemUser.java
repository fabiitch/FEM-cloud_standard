package com.fem.entities;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class FemUser {

    @Id
    public Long id;

    public FemUser() {
        super();
    }
}
