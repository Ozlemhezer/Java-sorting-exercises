/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication29;

import java.util.Comparator;


public class AreaComparator implements Comparator<Circle> {
    public int compare(Circle c1,Circle c2){
        return Double.compare(c1.CalculateArea(),c2.CalculateArea());
    }
    
    
}
