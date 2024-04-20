package com.chicout.atividades;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

public class App 
{
    public static void main( String[] args ) throws IOException
    { 
        try {
            List<People> listBeanCsv = new CsvToBeanBuilder(new FileReader("dados.csv"))
            .withType(People.class).build().parse();

            System.out.println("|   NAME   |  AGE   |   TYPE HOUSE   |");
            for(People csvBean : listBeanCsv){
                System.out.println(csvBean.toString());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
