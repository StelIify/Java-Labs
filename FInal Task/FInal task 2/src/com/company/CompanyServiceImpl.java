/**
 * @author Oleksandr Zorenko KNUTE
 * @version 23.06.2020
 *
 * Classname CompanyServiceImpl
 *  Final Testing
 **/
package com.company;

import java.util.List;

public class CompanyServiceImpl implements ICompanyService
{
    /**
     * @param child - company for which we are searching the top level parent
     *              (parent of parent of ...)
     * @return top level paren
     */

    @Override
    public Company getTopLevelParent(Company child)
    {
        if (child.getParent() == null )
        {
            return child;
        }

        Company company = child;

        while (company.getParent() != null)
        {
            company = company.getParent();
        }
        return company;
    }

    /**
     * @param company   - company for which we are searching the count of employees
     *                  (count of this company employees +
     *                  count employees of all children and their children employees )
     * @param companies - list of all available companies
     * @return count of employees
     */
    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies)
    {
        
        long count = company.getEmployeesCount();

        
        List<Company> children = company.getChildren();

        for (Company child : children) {
            
            count += this.getEmployeeCountForCompanyAndChildren(child, companies);
        }

        
        return count;
        
        /*
        companies.add(company);

        long employees = 0;

        employees = companies.stream().mapToLong(Company::getEmployeesCount).sum();

        return employees;
        */
    }
}
