package com.chicout.atividade;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App 
{
    public static void main( String[] args )
    {
        File myFile = new File("meuarquivo.txt");
        try {
            myFile.createNewFile();
            System.out.println("File create sucesfull");
        } catch (IOException e) {
        System.out.println("File not created");
        }

        try {
            FileWriter fileWriter = new FileWriter("meuarquivo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Olá mundo!");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
