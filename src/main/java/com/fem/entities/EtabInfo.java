package com.fem.entities;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class EtabInfo {
    @Id
    public long id;

    public String name;
    public String email;
    public String type;

    public EtabInfo() {
        super();
    }
}
