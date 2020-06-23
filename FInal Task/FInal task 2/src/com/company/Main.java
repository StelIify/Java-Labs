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
        Company cheif = new Company(null, 40, "cheif",);
        Company accounting = new Company( null, 22, "accounting");
        Company lawyer = new Company(cheif, 14, "lawyer");
        Company developer = new Company(cheif, 7, "lawyer");
        Company backEnd = new Company(developer, 3, "backEnd");
        Company frontEnd = new Company(, developer, 1, "frontEnd);
        Company devOps = new Company(backEnd, 3, "devOps");
        Company design = new Company(frontEnd, 3, "design");

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
