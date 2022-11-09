/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kalmamigos;

/**
* Name: Joeldon L. Gañolon
* Section: Fidelity
* Year: 4th Year
*/
import java.util.Scanner;
public class schoolActivity {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int again =1;
        int order;

        int food;
        int snack;
        int beverage;
        int loop = 1;
        int price = 0;
        System.out.println("----------Welcome to my store-------------");
        
        do{
            loop++;
            System.out.print("Do you want to order?: ");
        String ask = sc.next();
        
        if(ask.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter your order");
            System.out.println("1-FOOD\t\t2-SNACKS\t\t3-beverages");
            order = sc.nextInt();
                switch(order){
                    case 1: {
                        System.out.println("\n*****************");
                        System.out.println("1-adobo(30) || 2-homba(40) || 3-pancit(20)");
                        System.out.print("\nEnter your order: ");
                        food = sc.nextInt();
                            if(food == 1){
                                price = price + 30;
                                System.out.println("--------------------");
                                System.out.println("Current price -> "+price);
                            }
                            else if(food == 2){
                                price = price + 40;
                                System.out.println("--------------------");
                                System.out.println("Current price -> "+price);
                            }
                            else if(food == 3){
                                 price = price + 20;
                                 System.out.println("--------------------");
                                 System.out.println("Current price -> "+price);
                            }
                            else{
                                System.out.println("invalid input");
                            }
                        break;
                    }
                    case 2:{
                         System.out.println("\n*****************");
                        System.out.println("1-milkshake(100) || 2-letus(300) || 3-quick quick(20)");
                        System.out.print("\nEnter your order: ");
                        snack = sc.nextInt();
                            if(snack == 1){
                                price = price + 100;
                                System.out.println("--------------------");
                                System.out.println("Current price -> "+price);
                            }
                            else if(snack == 2){
                                price = price + 300;
                                System.out.println("--------------------");
                                System.out.println("Current price -> "+price);
                            }
                            else if(snack == 3){
                                 price = price + 20;
                                 System.out.println("--------------------");
                                 System.out.println("Current price -> "+price);
                            }
                            else{
                                System.out.println("invalid input");
                            }
                        break;
                    }
                    case 3:{
                          System.out.println("\n*****************");
                        System.out.println("1-c2(30) || 2-coke(50) || 3-redbull(100)");
                        System.out.print("\nEnter your order: ");
                        beverage = sc.nextInt();
                            if(beverage == 1){
                                price = price + 30;
                                System.out.println("--------------------");
                                System.out.println("Current price -> "+price);
                            }
                            else if(beverage == 2){
                                price = price + 50;
                                System.out.println("--------------------");
                                System.out.println("Current price -> "+price);
                            }
                            else if(beverage == 3){
                                 price = price + 100;
                                 System.out.println("--------------------");
                                 System.out.println("Current price -> "+price);
                                 System.out.println("--------------------");
                            }
                            else{
                                System.out.println("invalid input");
                            }
                        break;
                    }
                    default:{
                        System.out.println("invalid");
                    }
                    
                }
            
            again = 1; 
        }
        else
        {           
            again = 0;
            System.out.println("total price: "+price);
        }
            
        }while(again == 1);
    }
}
