/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.*;

/**
 *
 * @author feli8871
 */
public class Example_Two {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Book> book=new ArrayList();
        ListIterator books=book.listIterator();
        books.add(new Book("The Lord of the Rings: The Fellowship of the Ring","JRR Tolkein"));
        books.add(new Book("The Lord of the Rings: The Two Towers","JRR Tolkein"));
        books.add(new Book("The Lord of the Rings: The Return of the King","JRR Tolkein"));
        
        // Move Itererator to Start
        while(books.hasPrevious()){
            
            System.out.println(books.previous());
            
        }
        
        // Insterting a book
        Book temp=new Book("The Silmarillion","JRR Tolkein");
        
        while(books.hasNext()){
            System.out.println(books.next());
        }
        
        books.add(temp);
        books.previous();
        books.remove();
        
    
    }
    
}
