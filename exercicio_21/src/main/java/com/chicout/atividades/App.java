package com.chicout.atividades;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;


public class App 
{
    public static void main( String[] args )
    {  
        System.out.print("Please tell the product name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Please tell the product price: ");
        double price = input.nextDouble();
        System.out.print("Please tell the product quantity: ");
        int quantity = input.nextInt();

       Product product = new Product(name, price, quantity);

       try {
        FileWriter writer = new FileWriter("C:\\Users\\higor\\OneDrive\\Área de Trabalho" +
        "\\Java\\Exercicios_Chicout\\exercicio_20\\products.csv", true);
        BufferedWriter buffer = new BufferedWriter(writer);

        String format = (product.getName() + "," + String.valueOf(product.getPrice()) + "," + String.valueOf(product.getQuant()));

        buffer.newLine();
        buffer.write(format);
        buffer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
