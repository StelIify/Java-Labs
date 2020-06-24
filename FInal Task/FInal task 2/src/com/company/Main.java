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

        //create Company objects
        Company cheif = new Company(null, 40, "cheif");
        Company accounting = new Company( null, 22, "accounting");
        Company lawyer = new Company(cheif, 14, "lawyer");
        Company developer = new Company(cheif, 7, "developer");
        Company backEnd = new Company(developer, 3, "backEnd");
        Company frontEnd = new Company(developer, 1, "frontend");
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

      
        //  lawyer top level parent
        String lawyerTopLevelParent = service.getTopLevelParent(cheif).getName();
        System.out.println("Lawyer top level parent is: " + lawyerTopLevelParent);

        //  Accounting top level parent
        String accountingTopLevelParent = service.getTopLevelParent(accounting).getName();
        System.out.println("Accounting top level parent is: " + accountingTopLevelParent);

        // Developer top level parent
        String developerTopLevelParent = service.getTopLevelParent(cheif).getName();
        System.out.println("Developer top level parent is: " + developerTopLevelParent);

        // Back end top level parent
        String backEndTopLevelParent = service.getTopLevelParent(developer).getName();
        System.out.println("Backend top level parent is: " + backEndTopLevelParent);

        // Front end top level parent
        String frontEndTopLevelParent = service.getTopLevelParent(developer).getName();
        System.out.println("Frontend top level parent is: " + frontEndTopLevelParent);

        // DevOps top level parent
        String devOpsTopLevelParent = service.getTopLevelParent(backEnd).getName();
        System.out.println("DevOps top level parent is: " + devOpsTopLevelParent);
     
        // Designer top level parent
        String designTopLevelParent = service.getTopLevelParent(frontEnd).getName();
        System.out.println("Designer top level parent is: " + designTopLevelParent);

        // employee count for developer and all its children
        long EmployeesCount = service.getEmployeeCountForCompanyAndChildren(developer, companies);
        System.out.println("Employees Amount for developer and all its children: " + EmployeesCount);

        // employee count for developer and all its children
        long EmployeesCount2 = service.getEmployeeCountForCompanyAndChildren(cheif, companies);
        System.out.println("Employees Amount for cheif and all its children: " + EmployeesCount2);

    }
}
