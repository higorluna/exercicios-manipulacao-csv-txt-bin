package com.chicout.atividade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        FileReader reader;
        String regexPhrase;
        FileWriter writer;
        try {
            reader = new FileReader("meuarquivo.txt");
            System.out.println("File Open");
            BufferedReader bufferedReader = new BufferedReader(reader);
            writer = new FileWriter("meuarquivo_sem_excluir.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            while ((regexPhrase = bufferedReader.readLine()) != null) {
                regexPhrase = regexPhrase.replaceAll("excluir", "");
                bufferedWriter.write(regexPhrase);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found ");
            e.printStackTrace();
        }
        
        
    }
}
