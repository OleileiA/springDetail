package com.oleileia.spring.basic_dl.quick_start_byname.bean;

public class Dog {

    private String name;

    private Person master;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }
}
