package com.chicout.atividade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App 
{
    public static void main( String[] args )
    {
        File fileOne = new File("arquivo1.txt");
        File fileTwo = new File("arquivo2.txt");
        File fileConcatenated = new File("arquivo_concatenado.txt");
        String phrase;

        try {
            fileOne.createNewFile();
            fileTwo.createNewFile();
            fileConcatenated.createNewFile();
            System.out.println("Files creted");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writerOne = new FileWriter(fileOne);
            FileWriter writeTwo = new FileWriter(fileTwo);
            FileWriter writerConcatenated = new FileWriter(fileConcatenated);

            BufferedWriter bufferedWriterOne = new BufferedWriter(writerOne);
            BufferedWriter bufferedWriterTwo = new BufferedWriter(writeTwo);
            BufferedWriter bufferedWriterConcatenated = new BufferedWriter(writerConcatenated);

            bufferedWriterOne.write("one");
            bufferedWriterTwo.write("two");
            bufferedWriterOne.close();
            bufferedWriterTwo.close();

            FileReader readerOne = new FileReader(fileOne);
            FileReader readerTwo = new FileReader(fileTwo);

            BufferedReader bufferedReaderOne = new BufferedReader(readerOne);
            BufferedReader bufferedReaderTwo = new BufferedReader(readerTwo);

            while((phrase = bufferedReaderOne.readLine()) != null){
                bufferedWriterConcatenated.write(phrase);
                bufferedWriterConcatenated.newLine();
            }

            while ((phrase = bufferedReaderTwo.readLine()) != null) {
                bufferedWriterConcatenated.write(phrase);
                bufferedWriterConcatenated.newLine();
            }

            bufferedReaderOne.close();
            bufferedReaderTwo.close();
            bufferedWriterConcatenated.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
