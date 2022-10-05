/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Input: Sales Person, Item number, Item Cost
 * Output: Total Gross Sales, Commission, and Total Earnings
 * App that takes user input and calculates 9% commission of total gross sales and adds to a bass pay. Outputs total earnings for sales person. 
 * @author James
 */
package chapterfour.mavenproject2;
import java.util.Scanner;
public class totalEarnings {
    public static void main(String[] args){
    // create Scanner to obtain input from command window
    Scanner input =new Scanner(System.in);
    // initialize
    double total=0;
    double commission=0.09; 
    double totalPay=0;
    double basePay=200;
    double sale = 0;
    int salesCounter = 1;
    
    // prompt for total items
    System.out.print("Enter Amount of Items Sold (if unknown press 0): ");
    int itemTotal = input.nextInt();
    
    // Output total items
    System.out.printf("%n Total Items Sold: %d%n", itemTotal);
    
    // run loop for dynamic sales counter/tracker
    if (itemTotal != 0){
        while ( itemTotal  >= salesCounter)
        {
            System.out.print("Enter Sale Amount: ");
            sale = input.nextInt();
            System.out.printf("%n Sale Amount: $%.2f%n", sale);
            total = total + sale;
            salesCounter++; 
        }
    } else {
        while (sale != -1)
        {
            System.out.print("Enter Sale Amount(type -1 to exit): ");
            sale = input.nextInt();
            System.out.printf("%n Sale Amount: $%.2f%n", sale);
            total = total + sale;
            salesCounter++; 
        }
        total++;
    }
    
    // Calculation Phase
    basePay = basePay+totalPay;
    totalPay =(total*commission)+basePay;
    double commisionAmount = commission*total;
    
    // display gross sales, average for items sold, commission, and total pay
    System.out.printf("%n Total amount of Sales: %d%n", salesCounter);
    System.out.printf("%n Total Sales: $%.2f%n" , total);    
    System.out.printf("%n Commission is  $%.2f%n", commisionAmount);
    System.out.printf("%n Employee Pay: $%.2f%n", totalPay);
    }
}

