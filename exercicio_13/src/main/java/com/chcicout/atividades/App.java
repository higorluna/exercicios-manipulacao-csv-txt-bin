package com.chcicout.atividades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        File file = new File("produtos.dat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Products productOne = new Products("Cup", 10, 5.70);
        Products productTwo = new Products("Computer", 34, 343.70);
        Products productThree = new Products("Glue", 123, 1.70);

        List<Products> listProducts = new ArrayList<>();
        listProducts.add(productOne);
        listProducts.add(productTwo);
        listProducts.add(productThree);

        ObjectOutputStream outputStream;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(file));
            for(Products products : listProducts){
                outputStream.writeObject(products);
            }
            System.out.println("Serializable completed");
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ObjectinputStream = new ObjectInputStream(new FileInputStream(file));
             
            try {
                List<Products> productsReader = (List<Products>) ObjectinputStream.readObject();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            for(Products produto : productsReader){
                System.out.println(produto);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
