/*
 * Student
 *
 * Programming patterns. Factory, Builder
 *
 * Copyright Oleksandr Zorenko KNUTE
 *
 * Develop for your class
 *
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4. Create a builder for the class Student
 */
package com.company;

import java.time.LocalDate;

public class Student
{
    private String firstName;
    private String secondName;
    private String patronymic;
    private String dateOfBirth;
    private String countryOfBirth; // Country in which was born
    private int age;
    private int height;
    private int weight;
    private String gender;
    private String homeAddress;
    private long phoneNumber;
    private String parentsAddress;
    private String emergencyParentContact;
    private long parentPhoneNumber;
    private String university;
    private String universityEntryDate; // Date when date when he was enrolled in university
    private boolean budgetPlace; // Budget or contract
    private String faculty;
    private String specialisation;
    private int yearOfStudy; // What year of study student in at university
    private boolean sportAchievements;
    private String kindOfSportingAchievement; // What kind of Achievements student has
    private boolean scienceAchievements;
    private String academicPerformance; // what grades student has, average or good

    public Student(String firstName, String secondName, String patronymic, String dateOfBirth,
                   String countryOfBirth, int age, int height, int weight, String gender,
                   String homeAddress, long phoneNumber, String parentsAddress, String emergencyParentContact,
                   long parentPhoneNumber, String university, String universityEntryDate, boolean budgetPlace,
                   String faculty, String specialisation, int yearOfStudy, boolean sportAchievements,
                   String kindOfSportingAchievement, boolean scienceAchievements, String academicPerformance)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.parentsAddress = parentsAddress;
        this.emergencyParentContact = emergencyParentContact;
        this.parentPhoneNumber = parentPhoneNumber;
        this.university = university;
        this.universityEntryDate = universityEntryDate;
        this.budgetPlace = budgetPlace;
        this.faculty = faculty;
        this.specialisation = specialisation;
        this.yearOfStudy = yearOfStudy;
        this.sportAchievements = sportAchievements;
        this.kindOfSportingAchievement = kindOfSportingAchievement;
        this.scienceAchievements = scienceAchievements;
        this.academicPerformance = academicPerformance;
    }

    public Student()
    {
    }

    //Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getParentsAddress() {
        return parentsAddress;
    }

    public void setParentsAddress(String parentsAddress) {
        this.parentsAddress = parentsAddress;
    }

    public String getEmergencyParentContact() {
        return emergencyParentContact;
    }

    public void setEmergencyParentContact(String emergencyParentContact) {
        this.emergencyParentContact = emergencyParentContact;
    }

    public long getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(long parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getUniversityEntryDate() {
        return universityEntryDate;
    }

    public void setUniversityEntryDate(String universityEntryDate) {
        this.universityEntryDate = universityEntryDate;
    }

    public boolean isBudgetPlace() {
        return budgetPlace;
    }

    public void setBudgetPlace(boolean budgetPlace) {
        this.budgetPlace = budgetPlace;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public boolean isSportAchievements() {
        return sportAchievements;
    }

    public void setSportAchievements(boolean sportAchievements) {
        this.sportAchievements = sportAchievements;
    }

    public String getKindOfSportingAchievement() {
        return kindOfSportingAchievement;
    }

    public void setKindOfSportingAchievement(String kindOfSportingAchievement) {
        this.kindOfSportingAchievement = kindOfSportingAchievement;
    }

    public boolean isScienceAchievements() {
        return scienceAchievements;
    }

    public void setScienceAchievements(boolean scienceAchievements) {
        this.scienceAchievements = scienceAchievements;
    }

    public String getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(String academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    //Overriding toString method
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", parentsAddress='" + parentsAddress + '\'' +
                ", emergencyParentContact='" + emergencyParentContact + '\'' +
                ", parentPhoneNumber=" + parentPhoneNumber +
                ", university='" + university + '\'' +
                ", universityEntryDate=" + universityEntryDate +
                ", budgetPlace=" + budgetPlace +
                ", faculty='" + faculty + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", sportAchievements=" + sportAchievements +
                ", kindOfSportingAchievement='" + kindOfSportingAchievement + '\'' +
                ", scienceAchievements=" + scienceAchievements +
                ", academicPerformance='" + academicPerformance + '\'' +
                '}';
    }

    // Creating class Builder
    public static class Builder
    {
        private Student studentToBuild;

        public Builder()
        {
            this.studentToBuild = new Student();
        }

        public Builder setSimilarTo(Student student)
        {
            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.secondName = student.secondName;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.dateOfBirth = student.dateOfBirth;
            this.studentToBuild.countryOfBirth = student.countryOfBirth;
            this.studentToBuild.age = student.age;
            this.studentToBuild.height = student.height;
            this.studentToBuild.weight = student.weight;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.homeAddress = student.homeAddress;
            this.studentToBuild.phoneNumber = student.phoneNumber;
            this.studentToBuild.parentsAddress = student.parentsAddress;
            this.studentToBuild.emergencyParentContact = student.emergencyParentContact;
            this.studentToBuild.parentPhoneNumber = student.parentPhoneNumber;
            this.studentToBuild.university = student.university;
            this.studentToBuild.universityEntryDate = student.universityEntryDate;
            this.studentToBuild.budgetPlace = student.budgetPlace;
            this.studentToBuild.faculty = student.faculty;
            this.studentToBuild.specialisation = student.specialisation;
            this.studentToBuild.yearOfStudy = student.yearOfStudy;
            this.studentToBuild.sportAchievements = student.sportAchievements;
            this.studentToBuild.kindOfSportingAchievement = student.kindOfSportingAchievement;
            this.studentToBuild.scienceAchievements = student.scienceAchievements;
            this.studentToBuild.academicPerformance = student.academicPerformance;
            return this;
        }

         //Creating Setters

        public Builder setFirstName(String firstName)
        {
            studentToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setSecondName(String secondName)
        {
            studentToBuild.setSecondName(secondName);
            return this;
        }

        public Builder setPatronymic(String patronymic)
        {
            studentToBuild.setPatronymic(patronymic);
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth)
        {
            studentToBuild.setDateOfBirth(dateOfBirth);
            return this;
        }

        public Builder setCountryOfBirth(String countryOfBirth)
        {
            studentToBuild.setCountryOfBirth(countryOfBirth);
            return this;
        }

        public Builder setAge(int age)
        {
            studentToBuild.setAge(age);
            return this;
        }

        public Builder setHeight(int height)
        {
            studentToBuild.setHeight(height);
            return this;
        }

        public Builder setWeight(int weight)
        {
            studentToBuild.setWeight(weight);
            return this;
        }

        public Builder setGender(String gender)
        {
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setHomeAddress(String homeAddress)
        {
            studentToBuild.setHomeAddress(homeAddress);
            return this;
        }

        public Builder setPhoneNumber(long phoneNumber)
        {
            studentToBuild.setPhoneNumber(phoneNumber);
            return this;
        }

        public Builder setParentsAddress(String parentsAddress)
        {
            studentToBuild.setParentsAddress(parentsAddress);
            return this;
        }

        public Builder setEmergencyParentContact(String emergencyParentContact)
        {
            studentToBuild.setEmergencyParentContact(emergencyParentContact);
            return this;
        }

        public Builder setParentPhoneNumber(long parentPhoneNumber)
        {
            studentToBuild.setParentPhoneNumber(parentPhoneNumber);
            return this;
        }

        public Builder setUniversity(String university)
        {
            studentToBuild.setUniversity(university);
            return this;
        }

        public Builder setUniversityEntryDate(String universityEntryDate)
        {
            studentToBuild.setUniversityEntryDate(universityEntryDate);
            return this;
        }

        public Builder setBudgetPlace(boolean budgetPlace)
        {
            studentToBuild.setBudgetPlace(budgetPlace);
            return this;
        }

        public Builder setFaculty(String faculty)
        {
            studentToBuild.setFaculty(faculty);
            return this;
        }

        public Builder setSpecialisation(String specialisation)
        {
            studentToBuild.setSpecialisation(specialisation);
            return this;
        }

        public Builder setYearOfStudy(int yearOfStudy)
        {
            studentToBuild.setYearOfStudy(yearOfStudy);
            return this;
        }

        public Builder setSportAchievements(boolean sportAchievements)
        {
            studentToBuild.setSportAchievements(sportAchievements);
            return this;
        }

        public Builder setKindOfSportingAchievement(String kindOfSportingAchievement)
        {
            studentToBuild.setKindOfSportingAchievement(kindOfSportingAchievement);
            return this;
        }

        public Builder setScienceAchievements(boolean scienceAchievements)
        {
            studentToBuild.setScienceAchievements(scienceAchievements);
            return this;
        }

        public Builder setAcademicPerformance(String academicPerformance)
        {
            studentToBuild.setAcademicPerformance(academicPerformance);
            return this;
        }

        //Building method
        public Student Build()
        {
            return studentToBuild;
        }

    }
}

