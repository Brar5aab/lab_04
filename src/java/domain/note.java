/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


/**
 *
 * @author balji
 */
public class note{
    
    String title;
    String contents;
    
    
    public note(String title,String contents){
        
        
        this.title = title;
        this.contents = contents;
    }
    note(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    
}
