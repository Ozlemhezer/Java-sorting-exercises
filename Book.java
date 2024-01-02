/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication26;


public class Book {
    private String name;
    private String author;
    private int year;
    public Book(){
        
    }
    public Book(String name,String author,int year){
        this.name=name;
        this.author=author;
        this.year=year;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
     
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
       return "kitabın adı: "+this.getAuthor()+" kitabın yazarı: "+this.author+" kitabın yayınlanma yılı: "+this.getYear();
    }
}
