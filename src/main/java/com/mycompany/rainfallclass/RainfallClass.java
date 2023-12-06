/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rainfallclass;

/**
 *
 * @author orlandomarin
 */
public class RainfallClass {

    public static void main(String[] args) 
    {   
        // variables - double array for last year's rain results each month
        
        double [] lastYearRainResults = {1.5, 2.34, 3.45, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        
        // create an amount object that uses the lastYearRainResults array as an argument
        
        Rainfall amount = new Rainfall(lastYearRainResults);
        
        /* print the total and average rainfall last year, as well as the 
        most and least amount of rainfall in a specific month last year */
        
        System.out.printf("The total amount of rainfall last year was %.1f inches, Orlando Marin.\n", amount.totalRainfall());
        
        System.out.printf("The average amount of rainfall per month last year was %.1f inches, Orlando Marin.\n", amount.avgRainfall());
        
        System.out.printf("The most amount of rainfall in a month last year was %.1f inches, Orlando Marin.\n", amount.mostRainfall());
        
        System.out.printf("The least amount of rainfall in a month last year was %.1f inches, Orlando Marin.\n", amount.leastRainfall());
        
    }
}
