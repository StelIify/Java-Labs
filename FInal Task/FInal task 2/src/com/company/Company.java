/**
 * @author Oleksandr Zorenko KNUTE
 * @version 23.06.2020
 *
 * Classname Main
 *  Final Testing
 *  Task description: create POJO class Company
 **/

package com.company;

public class Company
{
    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;

    public Company(Company parent, long employeesCount)
    {
        this.parent = parent;
        this.employeesCount = employeesCount;
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

}
