/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.extending;

import com.tenzin.extending.entity.Person;
import com.tenzin.extending.entity.Student;

/**
 *
 * @author Home
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student std=new Student();
        std.setId(0);
        std.setContactNo("+9779856455");
        std.setFirstName("Ronan");
       
        System.out.println(std.getId());
        System.out.println(std.getFirstName());
        System.out.println(std.getFirstName());
        System.out.println(std.getContactNo());
    }
    
}
