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
public class Example_One {

    /**
     * @param args the command line arguments
     */
    static ArrayList<String> array=new ArrayList();
    static ListIterator list;
    static int index=0;
    public static void main(String[] args) {
        array.add("A");
        array.add("B");
        array.add("C");
        
        list=array.listIterator();
        showList();
    
        // Changing Position - NEXT
        
        System.out.println(list.next());
        index++;
        showList();
    
        // Revoming an item
        list.remove();
        showList();
    
        // Adding an item
        list.add("A");
        showList();
        
        // Changing Position - PREVIOUS
        list.previous();
        index--;
        showList();
        
        // Modifying an item
        list.set("D");
        showList();
        
        // 
    }
    
    public static void showList(){
        for (int i = 0; i < array.size(); i++) {
            if(i==index) System.out.print("*");
            System.out.print(array.get(i));
        
        }
        if(index==array.size()) System.out.print("*");
        System.out.println("");
    }
    
    
    
}
