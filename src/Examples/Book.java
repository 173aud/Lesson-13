/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author feli8871
 */
public class Book {

    private String title, author;
    private int id;
    static int nextid=0;

    public Book(String t,String a){
        title=t;
        author=a;
        nextid++;
        id=nextid;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", id=" + id + '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
    
    
    
    
    
}
