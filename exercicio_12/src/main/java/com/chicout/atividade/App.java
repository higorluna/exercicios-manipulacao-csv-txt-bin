package com.chicout.atividade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App 
{
    public static void main( String[] args )
    {
        People people = new People("Higor", 27, "male");

        File pessoaDat = new File("pessoa.dat");
        try {
            pessoaDat.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream
            (new FileOutputStream (pessoaDat));
            objectOutputStream.writeObject(people);
            System.out.println("Serializable complete");
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream
             ("pessoa.dat"));

             try {
                People peopleReader = (People) objectInputStream.readObject();
                System.out.println("Name: " + peopleReader.getName() + " Age: " + peopleReader.getAge() + 
                " Gender: " + peopleReader.getGender());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
