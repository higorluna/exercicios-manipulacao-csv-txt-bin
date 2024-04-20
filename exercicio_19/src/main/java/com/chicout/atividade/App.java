package com.chicout.atividade;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriterBuilder;

import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;


public class App 
{
    
    public static void main( String[] args )
    {
        String option = "y";
        File csvFile = new File("funcionarios.csv");
        try {
            csvFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] header = {"Name", "Age", "State"};
        List<BeanEmployees> listBean = new ArrayList<>();
        BeanEmployees bean = new BeanEmployees();
        Scanner input = new Scanner(System.in);

        while (option == "y") {
            System.out.println("Enter name, age and state");
            String name = input.next();
            bean.setName(name);
            input.nextLine(); 
            int age = input.nextInt();
            bean.setAge(age);
            input.nextLine(); 
            String state = input.next();
            bean.setState(state);
            input.nextLine(); 

            listBean.add(bean);

            System.out.println("Continue:  Yes(y)  No(n)");
            option = input.next();
            input.nextLine();
        }
         
        ICsvBeanWriter beanWriter;
        try {
            FileWriter writer = new FileWriter(csvFile);
            beanWriter = new CsvBeanWriter(writer, null);

            beanWriter.writeHeader(header);
            for(BeanEmployees b : listBean){
                beanWriter.write(b, header);
            }
            beanWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
