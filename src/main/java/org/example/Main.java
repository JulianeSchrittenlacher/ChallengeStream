package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*





Step 6: Collect the processed numbers into a new list using 'collect'.
Please post the link to your GitHub repository here, where you have solved the task. inputfield
If you have already completed this task earlier, you may work on the bonus task on the next page.
         */

        List<Integer> myInitialNumbers = Arrays.asList(-5, 3, -10, 7, -1, 0, 2, -8, 10, -6);


        Integer myFinalInt = myInitialNumbers.stream()
                //Step 1: Filter a list of numbers and only output the even numbers.
                .filter(n -> n % 2 == 0)
                //Step 2: Use 'map' and double each number in the list.
                .map(c -> c*2)
                //Step 3: Sort the list in ascending order.
                .sorted()
                //Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.
                .reduce(0,Integer::sum);


        System.out.println(myFinalInt);
        System.out.println();

        myInitialNumbers.stream()
                .filter(n -> n % 2 != 0)
                //Step 5: Use 'forEach' and output each processed number.
                .forEach(n ->System.out.println(n));

        System.out.println();

        List<Integer> myFinalList= myInitialNumbers.stream()
        //Step 6: Collect the processed numbers into a new list using 'collect'.
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(myFinalList);










    }
}