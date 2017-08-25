/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Nicolas Niño Sierra
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1=new Student();
        s1.email="jj@javauniv.com";
        s1.name="jon java";        
        Librarycard c1=new Librarycard(s1,0);
        Librarycard c2=new Librarycard(s1,3);
        System.out.println(c1);
        System.out.println(c2);
    }
    
}
