/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication26;

import java.util.Comparator;


public class AuthorComparator implements Comparator<Book> {
    public int compare(Book b1,Book b2){
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
