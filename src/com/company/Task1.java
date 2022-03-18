package com.company;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        int n;
	    Scanner num = new Scanner(System.in);
        System.out.println("Введіть число: ");
        n = num.nextInt();
        if (n>25 && n<100)
            System.out.println("Число " + n + " міститься в проміжку (25; 100)");
        else
            System.out.println("Число " + n + " не міститься в проміжку (25; 100)");
    }
}
