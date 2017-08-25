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
public class Student {
    public String name;
    public String email;
    public void Student(String name,String email){
        this.name=name;
        this.email=email;
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
    @Override
    public String toString() {
        return "Estudiante{nombre:" +name+ ", email=" + email + ",}";
    }
}
