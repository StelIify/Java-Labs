package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        CompanyServiceImpl service;
        service = new CompanyServiceImpl();

        Company chief = new Company(null, 20);
        Company lawyer = new Company(chief, 5);
        Company developer = new Company(chief, 15);
        Company backEnd = new Company(developer, 10);
        Company devOps = new Company(backEnd, 5);
        Company frontEnd = new Company(developer, 15);
        Company design = new Company(frontEnd, 5);
        Company accounting = new Company(null, 20);


        // test 1
        System.out.println(service.getTopLevelParent(chief));
        System.out.println(service.getTopLevelParent(accounting));
        System.out.println(service.getTopLevelParent(lawyer));
        System.out.println(service.getTopLevelParent(developer));
        System.out.println(service.getTopLevelParent(backEnd));
        System.out.println(service.getTopLevelParent(devOps));
        System.out.println(service.getTopLevelParent(frontEnd));
        System.out.println(service.getTopLevelParent(design));

        // test 2

        List<Company> companies = new ArrayList<>();

        companies.add(chief);
        companies.add(accounting);
        companies.add(lawyer);
        companies.add(developer);
        companies.add(backEnd);
        companies.add(devOps);
        companies.add(frontEnd);
        companies.add(design);

        //System.out.println(service.getEmployeeCountForCompanyAndChildren(acounting, companies));
        System.out.println(service.getEmployeeCountForCompanyAndChildren(chief, companies));

        //   System.out.println(service.getEmployeeCountForCompanyAndChildren(frontEnd, (List<Company>) chief));

    }
}
