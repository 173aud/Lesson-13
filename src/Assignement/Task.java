/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignement;

/**
 *
 * @author feli8871
 */
public class Task {
    private String name, description;
    
    public Task(String n, String d){
        name=n;
        description=d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public boolean validate(){
        if(name==null||description==null||name.equals("")||description.equals("")){
        return false;
        
    }
        else return true;
    }
        
    public String toString(){
        return "Name: "+name+"\nDescription: "+description+"\n==========\n";
    }
}
