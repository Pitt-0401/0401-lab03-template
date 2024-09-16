/*
 * Created on 2024-9-17
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import java.util.Scanner;

public class Cat {
    
    static String name;
    static int piecesOfFurnitureDestroyed = 0;

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your cat's name?");
        name = myScanner.nextLine();

        System.out.println("Your cat says what?");
        String catSound = myScanner.nextLine();

        System.out.println("Tell a funny story about your cat!");
        String funnyStory = myScanner.nextLine();

        meow(catSound);
        destoryFurniture();
        printFunnyStory(funnyStory);

        myScanner.close();
    }

    public static void meow(String sound) {
        System.out.println(name + " says: " + sound + "!");
    }

    public static void printFunnyStory(String story) {
        System.out.println("Here is a funny story about " + name + ": \n" + story);

    }

    public static void destoryFurniture() {
        piecesOfFurnitureDestroyed++;
        String message = name + " has now destroyed " + piecesOfFurnitureDestroyed + " piece(s) of furniture!";
        System.out.println(message);
    }
}
