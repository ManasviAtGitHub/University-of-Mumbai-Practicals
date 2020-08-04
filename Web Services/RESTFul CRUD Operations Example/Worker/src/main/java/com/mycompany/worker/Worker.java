
package com.mycompany.worker;

import javax.xml.bind.annotation.XmlRootElement;

/*
    Make sure you type the way it is given else you would end up with errors
    not compatible to human mind or mankind
*/
@XmlRootElement
public class Worker {
    int id;
    String name;
    
    
    public Worker(){}
    
    public Worker(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
 
}
