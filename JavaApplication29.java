/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

class Circle{
    private static final double PI=3.14;
    String color;
    double radius;
    Circle(String color,double radius){
        this.color=color;
        this.radius=radius;
    }
    double CalculateArea(){
        return PI * Math.pow(radius,2);
    }
    public String toString(){
        return color+" "+radius+" "+this.CalculateArea();
    }
    
}
        
public class JavaApplication29 {

   
    public static void main(String[] args) {
        LinkedList<Circle> Circlelist= new LinkedList<>();
        Circle c1 = new Circle("Yeşil",2);
        Circle c2 = new Circle("Sarı",4);
        Circle c3 = new Circle("Pembe",8);
        Circlelist.add(c1);
        Circlelist.add(c2);
        Circlelist.add(c3);
        
        Collections.sort(Circlelist, new AreaComparator());
        ListIterator<Circle> itr = Circlelist.listIterator();
        System.out.println("Dairelerin alanlarına göre sıralanışı");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
      
    }
    
}
