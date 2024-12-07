/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.ws.rs.core.Application;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 34633
 */
@XmlRootElement
public class User extends Application{
    private int id;
    private String name;
    private String email;
    private String lastArticleLink;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getLastArticleLink(){
        return lastArticleLink;
    }
    
    public void setLastArticleLink(String lastArticleLink){
        this.lastArticleLink = lastArticleLink;
    }
}
