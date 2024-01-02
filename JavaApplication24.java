/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

import java.util.ArrayList;
import java.util.Collections;

/*öğrenci sıralama: 
1)öğrenci sınıfı oluştur.
2)ad, öğrenci numarası,not ortalaması
3)comparable kullanarak not ortalamasına göre sırala.*/
public class JavaApplication24 {

    
    public static void main(String[] args) {
        System.out.println("ilk satır");
        Student std1 = new Student(1,"Özlem HEZER",43.5);
        Student std2 = new Student(2,"Medine TIRAŞ",43.4);
        Student std3 = new Student(3,"Betül TOPALOĞLU",43.3);
        Student std4 = new Student(4,"Metehan HEZER",43.6);
        Student std5 = new Student(5,"Nermin HEZER",44);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(std1);
        students.add(std3);
        students.add(std2);
        students.add(std5);
        students.add(std4);
        Collections.sort(students);
        for(Student s:students){
            System.out.println(s);
        }
        
        
      
        
        
    }
    
}
