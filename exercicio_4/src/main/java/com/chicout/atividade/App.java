package com.chicout.atividade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException
    {   
        int contador = 0;
        try {
            FileReader fileReader = new FileReader("C:\\Users\\higor\\OneDrive"
            +"\\Área de Trabalho\\Java\\Exercicios_Chicout\\exercicio_1\\meuarquivo.txt");
            System.out.println("File found");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.readLine() != null) {
                contador++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        System.out.println("The total number of lines in the file is: " + contador);
    }
}
