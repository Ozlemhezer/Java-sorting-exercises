/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;


public class Student implements Comparable<Student>{
    public String ad;
    public double not_ortalama;
    public int no;
    public  Student(){
    }
    public  Student(int no,String ad,double not_ortalama){
        this.no=no;
        this.ad=ad;
        this.not_ortalama=not_ortalama;
    } 
    @Override
    public int compareTo(Student st){
        return Double.compare(this.not_ortalama,st.not_ortalama);
    }
    @Override
    public String toString(){
        return "öğrenci numarası= "+this.no+"öğrencinin adı= "+this.ad+"öğrencinin ortalama notu= "+this.not_ortalama;
    }
}
