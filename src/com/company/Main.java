package com.company;
import java.util.Random;
import java.util.Scanner;

class getData{
    Scanner sc = new Scanner(System.in);
    getData(){
        Random rand = new Random();
        int random = rand.nextInt(100);
        checkData(random,1);
    }
    void checkData(int random, int i){
        System.out.print("Enter a number(under 100):");
        int a = sc.nextInt();
        if (a == random){
            System.out.println("You got it in " + i + " times");
        }
        if (a > random){
            System.out.println("Enter a smaller number");
            i++;
            checkData(random,i);
        }
        if (a < random){
            i++;
            System.out.println("Enter a bigger number");
            checkData(random,i);
        }
    }
}

class Main{
    public static void main(String[] args) {
        getData obj = new getData();
    }
}