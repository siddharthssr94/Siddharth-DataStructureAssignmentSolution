package com.greatlearning.main;

import com.greatlearning.services.SkyscraperServices;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        SkyscraperServices ss = new SkyscraperServices();

        //Defining new Scanner
        Scanner sc = new Scanner(System.in);

        //Taking input for no of floors
        System.out.println("Enter the total no of floors in the building :");
        int noOfFloors = sc.nextInt();

        //Taking input for floor sizes day wise
        int[] dayWiseFloorSizes = new int[noOfFloors];
        for (int i = 0; i < noOfFloors; i++) {
            System.out.println("Enter the floor size given on day : " + (i + 1));
            dayWiseFloorSizes[i] = sc.nextInt();
        }

        /*Implementation Start*/
        System.out.println("The order of construction is as follows : ");
        ss.displayConstructionOrder(noOfFloors,dayWiseFloorSizes);
        /*Algo implementation End*/

        sc.close();
    }
}
