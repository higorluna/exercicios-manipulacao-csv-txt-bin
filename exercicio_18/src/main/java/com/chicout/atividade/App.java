package com.chicout.atividade;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

public class App 
{
    public static void main( String[] args )
    {
        try {
            List<BeanStudant> csvBeanList = new CsvToBeanBuilder(new FileReader("alunos.csv"))
            .withType(BeanStudant.class).build().parse();

            System.out.println("|    Nome    |    Idade    |    Nota    |");
            for(int i=0; i<csvBeanList.size(); i++){
                System.out.println(csvBeanList.get(i));
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
