package com.LickingHeights;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 80;
        int highestNumber = 90;

        int[] array = createNumberArray(size, lowestNumber, highestNumber);

//
//        Pattern1();
//        Pattern2();
//        Pattern3();
//        Pattern4();
//        Pattern5();
//        System.out.println("The sum of the array is " +sum(array));
//        System.out.println("The min of the array is " +min(array));
//        System.out.println("The min of the array is " +max(array));
//        printArray(array);
//        System.out.println("After Bubble Sort");
//        printArray(bubbleSort(array));
        String[] adjectivs = {"Boring", "Lame", "Kind", "Cool"};
        String[] places = {"Mount Everest", "Great Wall of China", "Columbus", "Kitchen"};
        String[] people = {"Peter Griffin", "Cristiano Ronaldo", "Iron Man", "Captain America"};
        String[] verbs = {"Listening", "Drinking", "Laughing", "Running" };
        String[] times = {"11:30am", "7pm", "3am", "Noon"};
        String[] things = {"Monkeys", "Pizza", "Italy", "Chair"};
System.out.println("I was"+" "+sentenceGenerator(verbs) + " down the " + sentenceGenerator(places)
        + " around " + sentenceGenerator(times) + " with my best friend " + sentenceGenerator(people)
        + " and we " +sentenceGenerator(verbs) + " a " + sentenceGenerator(adjectivs) + " "  + sentenceGenerator(things)
        + " that was " + sentenceGenerator(verbs) + " " + sentenceGenerator(things) + "s");

    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    public static void Pattern1() {
        for (int rows = 0; rows < 6; rows++) {

            for (int columns = 0; columns < 6; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Pattern2() {
        for (int rows = 1; rows < 7; rows++) {


            for (int columns = 1; columns < 8; columns++) {
                System.out.print(rows);
            }
            System.out.println();
        }
    }

    public static void Pattern3() {
        for (int rows = 1; rows < 7; rows++) {

            for (int columns = 1; columns < 7; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
    }

    public static void Pattern4() {
        for (int rows = 1; rows < 8; rows++) {

            for (int columns = 1; columns < rows; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern5() {
        for (int rows = 1; rows < 8; rows++) {
            for (int columns = 1; columns < rows; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
    }

    public static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; n - 1 - i > j; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        return array;
    }

    public static String sentenceGenerator(String[] array) {
        Random random = new Random();

        return array[random.nextInt(array.length)];
    }

    public static String randomWord(String[] array) {
        Random random = new Random();

        return array[random.nextInt(array.length)];
    }



}

