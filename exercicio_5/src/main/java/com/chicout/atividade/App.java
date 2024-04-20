package com.chicout.atividade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException
    {   
        String regexPhrase;

        File filePython = new File("meuarquivo_python.txt");
            try {
                filePython.createNewFile();
                System.out.println("File Python created sucesfull");
            } catch (IOException e) {
                System.out.println("File Python not created sucesfull");
                e.printStackTrace();
            }

            FileWriter fileWriter = new FileWriter("meuarquivo_python.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        try {
            FileReader fileReader = new FileReader("C:\\Users\\higor\\OneDrive"
                +"\\Área de Trabalho\\Java\\Exercicios_Chicout\\exercicio_1\\meuarquivo.txt");
            System.out.println("File found");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((regexPhrase = bufferedReader.readLine()) != null) {
                regexPhrase = regexPhrase.replaceAll("Java", "Python");
                System.out.println(regexPhrase);

                bufferedWriter.write(regexPhrase);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}
