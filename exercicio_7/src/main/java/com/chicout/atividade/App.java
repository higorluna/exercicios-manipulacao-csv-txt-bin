package com.chicout.atividade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class App 
{
    public static void main( String[] args )
    {
        String names;
         
       try {
        FileReader reader = new FileReader("meuarquivo.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        List<String> listNames = new ArrayList<>();

        try {
            while ((names = bufferedReader.readLine()) != null) {
                listNames.add(names);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(listNames);

        File myFile = new File("meuarquivo_ordenado.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created");    
        } catch (IOException e) {
            System.out.println("File not created");
            e.printStackTrace();
        }

        try {
            FileWriter whiter = new FileWriter("meuarquivo_ordenado.txt");
            System.out.println("File Writer Open");
            BufferedWriter bufferedWriter = new BufferedWriter(whiter);

            for(int i=0; i<listNames.size(); i++){
                bufferedWriter.write(listNames.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("File Writer not open");
            e.printStackTrace();
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }
}
