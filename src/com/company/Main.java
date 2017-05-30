package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please input the number of years you want to get:");
        int years=input.nextInt();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd E");
        Calendar calendar=Calendar.getInstance();
        int n=0;
        while (n<years){
            for (int i=0;i<12;i++){
                calendar.set(2017+n,i,13);
                if(5==(calendar.get(Calendar.DAY_OF_WEEK)-1)){
                    System.out.println("BLACK FRIDAY:"+simpleDateFormat.format(calendar.getTime()));
                }
            }
            n++;
        }

       /* Scanner input=new Scanner(System.in);
        System.out.print("Please input years you want to get:");
        int years=input.nextInt();
        int n=0;
        //format of data
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd E");
        Calendar calendar=Calendar.getInstance();
        while (n<years){
            for (int i=0;i<12;i++){
                calendar.set(2017+n,i,13);
                if(5==(calendar.get(Calendar.DAY_OF_WEEK)-1)){
                    System.out.println("BLACK FRIDAY:"+simpleDateFormat.format(calendar.getTime()));
                }
            }
            n++;
        }*/


    }
}
