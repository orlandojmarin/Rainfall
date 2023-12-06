/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rainfallclass;

/**
 *
 * @author orlandomarin
 */
public class Rainfall 
{
    // INSTANCE FIELDS
    // double array that contains rainfall amounts for 12 months
    private double [] rainfallAmounts;
    
    // CONSTRUCTORS    
    /* constructoor accepts the double array of rainfall amounts last year 
    and copies it to the instance field */
    
    public Rainfall (double [] rainfallLastYear)
    {
        
        rainfallAmounts = new double [rainfallLastYear.length];
        
        for (int index = 0; index < rainfallLastYear.length; index++)
        {
            rainfallAmounts[index] = rainfallLastYear[index];
        }
        
    }
    
    // METHODDS
    // totalRainfall method returns a double for the total rainfall for the 12 months (no arguments)
    
    public double totalRainfall()
    {
        double total = 0;
        
        for (int index = 0; index < rainfallAmounts.length; index++)
        {
            total += rainfallAmounts[index];
        }
        return total;
    }
    
    // avgRainfall method returns a double for the average rainfall for the 12 months (no arguments)
    
    public double avgRainfall()
    {
        double total = 0;
        double average = 0;
        
        for (int index = 0; index < rainfallAmounts.length; index++)
        {
            total += rainfallAmounts[index];    
        }
        
        average = total / rainfallAmounts.length;
        return average;
    }
     
    // mostRainfall method returns a double for the highest rainfall in a month during the 12 months (no arguments)
    
    public double mostRainfall()
    {
        double mostRainfall = rainfallAmounts[0];
        for (int index = 0; index < rainfallAmounts.length; index++)
        {
            if (rainfallAmounts[index] > mostRainfall)
            {
                mostRainfall = rainfallAmounts[index];
            }
        }
        return mostRainfall;
    }
    
    // leastRainfall method returns a double for the lowest rainfall in a month during the 12 months (no arguments)
    
    public double leastRainfall()
    {
        double leastRainfall = rainfallAmounts[0];
        for (int index = 0; index < rainfallAmounts.length; index++)
        {
            if (rainfallAmounts[index] < leastRainfall)
            {
                leastRainfall = rainfallAmounts[index];
            }
        }
        return leastRainfall;
    }     
}
