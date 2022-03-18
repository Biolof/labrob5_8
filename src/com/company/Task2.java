package com.company;
import java.util.Scanner;
public class Task2
{
    public static void main(String[] args)
    {
        int a,b,c,d,n;
        Scanner num = new Scanner(System.in);
        System.out.println("Введіть ціле тьохзначне число: ");
        n = num.nextInt();
        a = n % 10;
        b = n / 10;
        d = b % 10;
        c = n / 100;
        if(a>d && a>c)
            System.out.println("Найбільше число: "+ a);
        else if(d>a && d>c)
            System.out.println("Найбільше число: "+ d);
        else if(c>a && c>d)
            System.out.println("Найбільше число: " +c);
        else if(a==d && d==c)
            System.out.println("Всі числа однакові");
        else
            System.out.println("Ви ввели щось не то");
    }
}
