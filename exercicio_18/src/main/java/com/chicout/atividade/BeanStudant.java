package com.chicout.atividade;

import com.opencsv.bean.CsvBindByName;

public class BeanStudant {
    
    @CsvBindByName(column = "Nome", required = true)
    private String name;
    @CsvBindByName(column = "Idade", required = true)
    private int age;
    @CsvBindByName(column = "Nota", required = true)
    private float note;

    
    public BeanStudant() {
    }

    @Override
    public String toString() {
        return "    " + name + "         " + age + "             " + note ;
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
    public float getNote() {
        return note;
    }
    public void setNote(float note) {
        this.note = note;
    }

    
}
