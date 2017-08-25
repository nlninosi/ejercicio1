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
    public int borrowcnt;
    public Student owner;
    public Librarycard(Student owner, int borrowcnt){
        this.owner=owner;
        this.borrowcnt=borrowcnt;
    }
    public int getNumberofbooks(){
        return borrowcnt;
    }
    public Student getOwner(){
        return owner;
    }
    public void setOwner( Student student){
        owner=this.owner;
    }
    @Override
    public String toString() {
        return "Libray Card{" + "numero de libros=" +borrowcnt+ ", dueño=" + owner + ",}";
    }
    
    
}
