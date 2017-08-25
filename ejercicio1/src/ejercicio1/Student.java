/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Nicolas
 */
public class Student {
    public String name;
    public String email;
    public void student(){
        name="...";
        email="...";
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getEmail(){
        System.out.println(this.email);
    }
    public String setName(String nombre){
        return this.name =nombre;
        
    }
     public String setEmail(String correo){
        return this.email =correo;
    } 
}
