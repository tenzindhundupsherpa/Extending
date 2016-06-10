/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.extending.entity;

/**
 *
 * @author Home
 */
public class Student extends Person{
    private int id;
    private String contactNo;
    private boolean status;

    public Student(int id, String conatactNo, boolean status) {
        this.id = id;
        this.contactNo =contactNo;
        this.status = status;
    }

    public Student() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String conatactNo) {
        this.contactNo = conatactNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
 
    public String getFirstName(){
        System.out.println("wa wa wa");
        return super.getFirstName();
    }
}
