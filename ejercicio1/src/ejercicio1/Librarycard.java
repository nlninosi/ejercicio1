/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Nicolas
 */
public class Librarycard {
    public String owner;
    public int borrowcnt;
    public void librarycard(){
        owner="nadie";
        borrowcnt=0;
    }
    public void getNumberofbooks(){
        System.out.println(this.borrowcnt);
    }
    public void getOwner(){
        System.out.println(this.owner);
    }
    public void setOwner(){
        owner=this.owner;
    }
    
    
    
}
