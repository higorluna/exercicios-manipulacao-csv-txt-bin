package com.chicout.atividade;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

import com.opencsv.bean.CsvToBeanBuilder;

public class App 
{
    public static void main( String[] args )
    {
       try {
        List<Product> listBean = new CsvToBeanBuilder(new FileReader("products.csv"))
        .withType(Product.class).build().parse();

        for(int i=0; i<listBean.size(); i++){
            System.out.println(listBean.get(i));
        }
    } catch (IllegalStateException e) {
        e.printStackTrace();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }
}
