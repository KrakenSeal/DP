package com.kr4ken.dp.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class InterestType {

    @Id
    @GeneratedValue
    private Long id;

    InterestType() { // jpa only
    }

    public InterestType(String name,String description)
    {
        this.name = name;
        this.description = description;
    }

    public String name;
    public String description;

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}