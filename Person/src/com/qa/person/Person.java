package com.qa.person;

public class Person {
    // Attribute
    private String name;
    
    // Constructors
    public Person() {
        this("Unknown");
    }
    
    public Person(String name) {
        this.name = name;
    }
    
    // Methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
