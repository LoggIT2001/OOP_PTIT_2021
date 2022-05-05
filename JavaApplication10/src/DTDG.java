/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LONGDT
 */
public class DTDG {
    public static double polygonArea(double X[], double Y[],
                                                       int n)
    {
        // Initialize area
        double area = 0.0;
     
        // Calculate value of shoelace formula
        int j = n - 1;
        for (int i = 0; i < n; i++)
        {
            area += (X[j] + X[i]) * (Y[j] - Y[i]);
             
            // j is previous vertex to i
            j = i;
        }
     
        // Return absolute value
        return Math.abs(area / 2.0);
    }
 
    // Driver program
    public static void main (String[] args)
    {
        double X[] = {0, 2, 2, 0};
        double Y[] = {0, 0, 2, 2};
     
        int n = 4;
        System.out.println(polygonArea(X, Y, n));
    }
 
}
