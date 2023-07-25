package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program has started...");
        Author authorObject =new Author();
        authorObject.setName("Octavio");
        authorObject.setAge(88);
        authorObject.setLastName("Paz");
        authorObject.setPhoneNumber("+59 78 78 16 45");

        Book bookObject = new Book();
        bookObject.setName("The importance of being Ernest");
        bookObject.setAuthor(authorObject);
        bookObject.setCategory("Latam Drama");
        bookObject.setIsb("gd4rg8rg4g8rg4dr8g44g8rg8r4");
        bookObject.setPagesNumber(78);
        bookObject.setPublicationDate(new Date(1982,03,17));
        System.out.println("Book:"+bookObject.getName());
        System.out.println("Author:"+bookObject.getAuthor().getName()+" "+bookObject.getAuthor().getLastName());
    }
}