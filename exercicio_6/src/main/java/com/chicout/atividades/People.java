package com.chicout.atividades;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByName;

public class People implements Serializable {
    
    @CsvBindByName(column = "name", required = true)
    private String name;
    @CsvBindByName(column = "age")
    private int age;
    @CsvBindByName(column = "type")
    private String type;
    
    public People() {
    }

    public People(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public String toString() {
        return "| name = " + name + " | age = " + age + " | type = " + type + " |";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    
}
