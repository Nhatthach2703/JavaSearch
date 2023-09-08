/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

/**
 *
 * @author Xuan Vinh
 */
public class SearchProgramming extends Menu<String> {

    static String[] mc = {"Binary Search", "Linear Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SearchProgramming(Element element) {
        super("Search Option:", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    public void execute(int n) {
        algorithm.buddleSort(array);
        library.display(array);
        int value;
        switch (n) {
            case 1: //Linear search
                value = library.getInt("\nEnter number to find: ", 1, 100);
                if(algorithm.linearSearch(array, value) != -1)
                    System.out.println("Found value: " + value + " at index: " + algorithm.linearSearch(array, value));
                else
                    System.out.println("The number you entered don't have in the array!");
                break;
            case 2: //Binary search
                value = library.getInt("\nEnter number to find: ", 1, 100);
                if (algorithm.binarySearch(array, value) != -1)
                    System.out.println("Found value: " + value + " at index: " + algorithm.binarySearch(array, value));
                else
                    System.out.println("The number you entered don't have in the array!");
                break;
            case 3: //Exit
                System.exit(0);
        }
    }
}