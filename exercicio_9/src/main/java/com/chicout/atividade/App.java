package com.chicout.atividade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import org.apache.commons.lang3.*;
public class App 
{
    public static void main( String[] args ) throws IOException
    {   
        String phrases;
        int count = 0;
        try {
            FileReader reader = new FileReader("meuarquivo.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            while ((phrases = bufferedReader.readLine()) != null) {
                count += StringUtils.countMatches(phrases.toLowerCase(), "java");
            }
            System.out.println("The total is: " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}
