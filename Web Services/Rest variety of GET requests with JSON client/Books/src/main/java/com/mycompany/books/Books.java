/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.books;

import javax.ws.rs.core.Link;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author User
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Books {

    @XmlElement(name="bookISBN")
    private int bookid;
    
    
    private String bookname;
    private boolean audioform;


    private double price;
    
   
    public Books(){
    
    }   
    
    public Books(int bookid, String bookname, boolean audioform, double price) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.audioform = audioform;
        this.price = price;
    }
    
    


    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public boolean isAudioform() {
        return audioform;
    }

    public void setAudioform(boolean audioform) {
        this.audioform = audioform;
    }
 
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
 
    
}
