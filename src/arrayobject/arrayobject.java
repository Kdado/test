/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobject;

/**
 *
 * @author Revenger Mini
 */
public class arrayobject {
    public static void main (String[]args){
        Student[] list = new Student[3];// array of objects instead of only simple variables 
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.setName("Kevin");
        s1.setAge(25);
        s2.setName("Khris");
        s2.setAge(21);
        s3.setName("Ashley");
        s3.setAge(22);
        
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for (int i=0; i<list.length;i++){
            System.out.println(list[i].getName() + " " + list[i].getAge());
        }
    
    }
    
}
