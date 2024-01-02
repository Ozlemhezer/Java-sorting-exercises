/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
Bir kütüphane için kitapları temsil eden bir Book sınıfınız olsun.
Bu sınıfın başlık, yazar ve yayın yılı gibi özellikleri olsun.
Kitapları Comparator kullanarak yazar adına veya yayın yılına göre sıralayın.*/


public class JavaApplication26 {

    
    public static void main(String[] args) {
        ArrayList<Book> kitaplar = new ArrayList<Book>();
        Book kitap1 = new Book("Yüz Yıllık Yalnızlık","Gabriel Garcia Marquez",1967);
        Book kitap2 = new Book("İnsanlığımı Yitirirken","Osamu Dazai",1948);
        Book kitap3 = new Book("Patlama Kayıtları","Yan Lianke",2013);
        kitaplar.add(kitap1);
        kitaplar.add(kitap2);
        kitaplar.add(kitap3);
        System.out.println("sorted by author");
        Collections.sort(kitaplar, new AuthorComparator());
        Iterator itr = kitaplar.iterator();
        while(itr.hasNext()){
            Book b=(Book)itr.next();
            System.out.println(b);
        }
        System.out.println("Sorted by year");
        Collections.sort(kitaplar, new YearComparator());
        Iterator itr2 = kitaplar.iterator();
        while(itr2.hasNext()){
            Book b = (Book)itr2.next();
            System.out.println(b);
        }
    }
    
}
