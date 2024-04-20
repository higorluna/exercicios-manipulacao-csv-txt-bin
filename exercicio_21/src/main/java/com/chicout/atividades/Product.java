package com.chicout.atividades;

import com.opencsv.bean.CsvBindByName;

public class Product {
    
    @CsvBindByName(column = "Nome", required = true)
    private String name;
    @CsvBindByName(column = "Preco", required = true)
    private double price;
    @CsvBindByName(column = "Quantidade", required = true)
    private int quant;
    
    public Product() {
    }

    public Product(String name, double price, int quant) {
        this.name = name;
        this.price = price;
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quant=" + quant + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    

   
    
}
