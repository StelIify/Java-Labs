/**
 * @author Oleksandr Zorenko KNUTE
 * @version 23.06.2020
 *
 * Classname Main
 * Final Testing
 *
 * Create a test set of companies in your main class.
 * Take for this set IT-companies: Chief, Lawyer, Developer (Design, Front-end, Back-end, DevOps). See attch.
 **/
 
package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        CompanyServiceImpl service = new CompanyServiceImpl();

       / create Company objects
        Company cheif = new Company("cheif", null, 40);
        Company accounting = new Company("accounting", null, 22);
        Company lawyer = new Company("lawyer", cheif, 14);
        Company developer = new Company("developer", cheif, 7);
        Company backEnd = new Company("backEnd", developer, 3);
        Company frontEnd = new Company("frontEnd", developer, 1);
        Company devOps = new Company("devOps", backEnd, 3);
        Company design = new Company("design", frontEnd, 3);

        // add all companies to ArrayList
        List<Company> companies = new ArrayList<>
         (
                Arrays.asList(
                        cheif,
                        accounting,
                        lawyer,
                        developer,
                        backEnd,
                        frontEnd,
                        devOps,
                        design
                )
        );

        System.out.println("All existing companies: ");
        for (Company company : companies) {
            System.out.println(company.getName());
        }

        // Designer top level parent
        String designTopLevelParent = service.getTopLevelParent(design).getName();
        System.out.println("Designer top level parent is: " + designTopLevelParent);

        //  Designer top level parent
        String lawyerTopLevelParent = service.getTopLevelParent(lawyer).getName();
        System.out.println("Lawyer top level parent is: " + lawyerTopLevelParent);

        //  Accounting top level parent
        String accountingTopLevelParent = service.getTopLevelParent(accounting).getName();
        System.out.println("Accounting top level parent is: " + accountingTopLevelParent);

        // employee count for developer and all its children
        long EmployeesCount = service.getEmployeeCountForCompanyAndChildren(developer, companies);
        System.out.println("Employees Amount for developer and all its children: " + EmployeesCount);

        // employee count for developer and all its children
        long EmployeesCount2 = service.getEmployeeCountForCompanyAndChildren(cheif, companies);
        System.out.println("Employees Amount for cheif and all its children: " + EmployeesCount2);

    }
}
