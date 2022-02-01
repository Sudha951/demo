package com.example.demo.model;

import java.util.UUID;

public class person {
    private final String name;
    private final UUID id;
    public person (String name, UUID id)
    {
        this.id=id;
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public UUID getId()
    {
        return id;
    }
    
}
