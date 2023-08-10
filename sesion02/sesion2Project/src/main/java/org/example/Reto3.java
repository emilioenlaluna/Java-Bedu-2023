package org.example;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write some words");
        String input=scanner.nextLine();
        input=input.toString().toLowerCase();
        int vocals=0;
        char letra='A';
        for(int i=0;i<input.length();i++){
            letra=input.charAt(i);
            if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
                vocals++;
            }

        }
        System.out.println(vocals);
        scanner.close();
    }
}
