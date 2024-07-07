package SortingAlgorithm;

import java.io.*;
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.io.IOException;

import java.util.Scanner;

public class RandomNumber {
    public static int[] arr;

    public static void  GenerateNums(int size_of_myarr) throws IOException {
        String myPath = "src/Data.txt";
        File myFile = new File(myPath);
        if (myFile.createNewFile()) {
            System.out.println(myFile.getName() + " created ");
        } else {
            System.out.println(myFile.getName() + " exists");
        }
        PrintWriter outputFile = new PrintWriter(myPath);
        PrintWriter sortedFile = new PrintWriter(myPath);
        Random rd = new Random();
        int arr[] = new int[size_of_myarr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(size_of_myarr - 1) + 1;
            outputFile.println(arr[i]);
        }
        outputFile.close();
        Scanner s = new Scanner(new File(myPath));
        int[] array = new int[s.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            sortedFile.println(array[i]);
        }
        sortedFile.close();
    }


    public static int[] call() throws IOException {
        String myPath = "src/Data.txt";
        File file = new File(myPath);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        ArrayList<Integer> arrayL = new ArrayList<Integer>();
        int[] array;
        int i = 0;
        while ((st = br.readLine()) != null) {
            arrayL.add(Integer.parseInt(st));
        }
        array = new int[arrayL.size()];

        for (int j = 0; j < arrayL.size() - 1; j++) {
            array[j] = arrayL.get(j);
        }
        return array;
    }
}

