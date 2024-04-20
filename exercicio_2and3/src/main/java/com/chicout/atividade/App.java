package com.chicout.atividade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args ) 
    {   
        String phrase = null;

        try {
            FileReader fileReader = new FileReader("C:\\Users\\higor\\OneDrive"
            +"\\Área de Trabalho\\Java\\Exercicios_Chicout\\exercicio_1\\meuarquivo.txt");
            System.out.println("File found");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            phrase = bufferedReader.readLine();
            System.out.println(phrase);
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\higor\\OneDrive"
            +"\\Área de Trabalho\\Java\\Exercicios_Chicout\\exercicio_1\\meuarquivo.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Isso é uma adição!");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
