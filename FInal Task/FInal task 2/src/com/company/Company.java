/**
 * @author Oleksandr Zorenko KNUTE
 * @version 23.06.2020
 *
 * Classname Main
 *  Final Testing
 *  Task description: create POJO class Company
 **/

package com.company;

import java.util.ArrayList;

public class Company
{
    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;
    private String name;
    private ArrayList<Company> children;
    
    public Company(Company parent, long employeesCount, String name)
    {
        this.parent = parent;
        this.employeesCount = employeesCount;
        this.name = name;
        this.children = new ArrayList<>();
    }
    public Company()
    {

    }

    //Getters and Setters
    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public ArrayList<Company> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Company> children) {
        this.children = children;
    }

}
