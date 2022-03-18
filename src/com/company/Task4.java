package com.company;
import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        String choose,rabbit;
        Scanner num = new Scanner(System.in);
        System.out.println("Виберіть слово: 'Погодитись','Відмовитись'");
        choose = num.nextLine();
        System.out.println("Якщо ви вибрали слово 'Погодитись' виберіть: 'Так','ОК','Yes','Y','+','Ok'; або 'Ні','NO','N','-','No' якщо ви вибрали 'Відмовитись'");
        rabbit = num.nextLine();
        switch (choose)
        {
            case"Погодитись":
                switch (rabbit){
                    case "Так":
                        System.out.println("Я погоджуюсь!");
                        break;
                    case "OK":
                        System.out.println("Я погоджуюсь!");
                        break;
                    case "Yes":
                        System.out.println("Я погоджуюсь!");
                        break;
                    case "Y":
                        System.out.println("Я погоджуюсь!");
                        break;
                    case "+":
                        System.out.println("Я погоджуюсь!");
                        break;
                    case "Ok":
                        System.out.println("Я погоджуюсь!");
                        break;
                }
            case"Відмовитись":
                switch (rabbit){
                    case"Ні":
                        System.out.println("Я відмовляюсь!");
                        break;
                    case"NO":
                        System.out.println("Я відмовляюсь!");
                        break;
                    case"N":
                        System.out.println("Я відмовляюсь!");
                        break;
                    case"-":
                        System.out.println("Я відмовляюсь!");
                        break;
                    case"No":
                        System.out.println("Я відмовляюсь!");
                        break;
                }
        }

    }
}
