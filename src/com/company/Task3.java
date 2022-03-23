package com.company;
import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        int flour;
        String direction;
        Scanner num = new Scanner(System.in);
        System.out.println("Виберіть куди ви будете їхати:'До низу','До гори'");
        direction = num.nextLine();
        System.out.println("Виберіть поверх 1-9");
        flour = num.nextInt();
        if (direction.equals("До низу"))
        {
            if(flour==1){
                System.out.println("Ви спустились на 1 поверх");
            }
            else if(flour==2){
                System.out.println("Ви спустились на 1 поверх");
            }
            else if(flour==3){
            System.out.println("Ви спустились на 3 поверх");
            }
            else if(flour==4){
                System.out.println("Ви спустились на 4 поверх");
            }
            else if(flour==5){
                System.out.println("Ви спустились на 5 поверх");
            }
            else if(flour==6){
                System.out.println("Ви спустились на 6 поверх");
            }
            else if(flour==7){
                System.out.println("Ви спустились на 7 поверх");
            }
            else if(flour==8){
                System.out.println("Ви спустились на 8 поверх");
            }
            else if(flour==9){
                System.out.println("Ви спустились на 9 поверх");
            }

        }
        if (direction.equals("До гори"))
        {
            if(flour==1){
                System.out.println("Ви піднялись на 1 поверх");
            }
            else if(flour==2){
                System.out.println("Ви піднялись на 3 поверх");
            }
            else if(flour==3){
                System.out.println("Ви піднялись на 3 поверх");
            }
            else if(flour==4){
                System.out.println("Ви піднялись на 4 поверх");
            }
            else if(flour==5){
                System.out.println("Ви піднялись на 5 поверх");
            }
            else if(flour==6){
                System.out.println("Ви піднялись на 6 поверх");
            }
            else if(flour==7){
                System.out.println("Ви піднялись на 7 поверх");
            }
            else if(flour==8){
                System.out.println("Ви піднялись на 8 поверх");
            }
            else if(flour==9){
                System.out.println("Ви піднялись на 9 поверх");
            }

        }





    }
}
