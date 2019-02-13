package com.heningburg.newPatientReg;
import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//      For Patient
        String patientFirstName;
        String patientLastName;
        String patientResidState;
        String patientResidCity;
        String patientStreetName;
        int patientHouseNumber;
        int patientZipCode;
        int patientSocialNumber;
        int patientBirthMonth;
        int patientBirthDay;
        int patientBirthYear;

//      For Patient Employer
        String employerName;
        int employerContact;
        int employerContactExt;
        String employerStreetName;
        int employerStreetNumber;
        String employerState;
        String employerCity;

        Patient patient = new Patient();
        Employer employer = new Employer();
        System.out.println("Welcome to New Patient Registration.");
        System.out.println("Please input the following information for patient.");

//      Patient First Name
        System.out.println("Patient's First Name: ");
        patientFirstName = input.nextLine();
        patient.setPatientFirstName(patientFirstName);
//TEST  System.out.println("Return: "+patient.getPatientFirstName());

//      Patient Last Name
        System.out.println("Patient's Last Name: ");
        patientLastName = input.nextLine();
        patient.setPatientLastName(patientLastName);
//TEST  System.out.println("Return: "+patient.getPatientLastName());

//      Patient Residence Street Name
        System.out.println("Enter Patient's Residence Street Name: ");
        patientStreetName = input.nextLine();
        patient.setPatientStreetName(patientStreetName);
//TEST  System.out.println("Return: "+patient.getPatientStreetName());

//      Patient House Number
        System.out.println("Patient's Residence Number(Just Number): ");
        patientHouseNumber = input.nextInt();
        patient.setPatientHouseNumber(patientHouseNumber);
//TEST  System.out.println("Return: "+patient.getPatientHouseNumber());

//      Patient Zip Code
        System.out.println("Patients's Residence Zip Code: ");
        patientZipCode = input.nextInt();
        patient.setPatientZipCode(patientZipCode);
//TEST  System.out.println("Return: "+patient.getPatientZipCode());

//      Patient Residence State
        System.out.println("Patient's Residence State: ");
        patientResidState = input.nextLine();
        patient.setPatientResidsState(patientResidState);
//TEST  System.out.println("Return: "+patient.getPatientResidsState());

//      Patient Residence City
        System.out.println("Patient's Residence City: ");
        patientResidCity = input.nextLine();
        patient.setPatientResidsCity(patientResidCity);
//TEST  System.out.println("Return: "+patient.getPatientResidsCity());

//      Patient Social Security Number
        System.out.println("Patient's Social Security Number: ");
        patientSocialNumber = input.nextInt();
        patient.setPatientSocialSecurityNum(patientSocialNumber);
//TEST  System.out.println("Return: "+patient.getPatientSocialSecurityNum());

//      Patient Birth Month
        System.out.println("Patient's Birth Month(numerical): ");
        patientBirthMonth = input.nextInt();
        patient.setPatientBirthMonth(patientBirthMonth);
//TEST  System.out.println("Return: "+patient.getPatientBirthMonth());

//      Patient Birth Day
        System.out.println("Patient's Birth Day: ");
        patientBirthDay = input.nextInt();
        patient.setPatientBirthDay(patientBirthDay);
//TEST  System.out.println("Return: "+patient.getPatientBirthDay());

//      Patient Birth Year
        System.out.println("Patient's Birth Year: ");
        patientBirthYear = input.nextInt();
        patient.setPatientBirthYear(patientBirthYear);
//TEST  System.out.println("Return: "+patient.getPatientBirthYear());

        System.out.println("\nThank You");

        System.out.println("RETURNS....");
        System.out.println("Patient's Name: "+patient.getPatientFirstName()+" "+patient.getPatientLastName());
//      System.out.println(patient.getPatientLastName());
        System.out.println("Patient's Residence: "+patient.getPatientHouseNumber()+" "+patient.getPatientStreetName());
//      System.out.println(patient.getPatientHouseNumber());
//      System.out.println(patient.getPatientZipCode());
        System.out.println("Patient's Residence: "+patient.getPatientZipCode()+", "+patient.getPatientResidsState()+", "+patient.getPatientResidsCity());
        System.out.println("Patient's Social: "+patient.getPatientSocialSecurityNum());
        System.out.println("Patient's Birthday: (Month)"+patient.getPatientBirthMonth()+" (Day)"+patient.getPatientBirthDay()+" (Year)"+patient.getPatientBirthYear());
//      System.out.println(patient.getPatientBirthDay());
//      System.out.println(patient.getPatientBirthYear());

        System.out.println("Enter "+patientFirstName+" Employer Name: ");
        employerName = input.nextLine();
        employer.setEmployerName(employerName);

        System.out.println("Enter "+patientFirstName+" Employer Contact(number): ");
        employerContact = input.nextInt();
        employer.setEmployerContact(employerContact);

        System.out.println("Enter "+patientFirstName+" Employer Extentsion(number): ");
        employerContactExt = input.nextInt();
        employer.setEmployerContactExt(employerContactExt);

        System.out.println("Enter "+patientFirstName+" Employer Street Number: ");
        employerStreetNumber = input.nextInt();
        employer.setEmployerStreetNumber(employerStreetNumber);

        System.out.println("Enter "+patientFirstName+" Employer Street Name: ");
        employerStreetName = input.nextLine();
        employer.setEmployerStreetName(employerStreetName);

        System.out.println("Enter "+patientFirstName+" Employer City: ");
        employerCity = input.nextLine();
        employer.setEmployerCity(employerCity);

        System.out.println("Enter "+patientFirstName+" Employer State: ");
        employerState = input.nextLine();
        employer.setEmployerState(employerState);

        System.out.println("RETURN....");
        System.out.println(employer.getEmployerName());
        System.out.println(employer.getEmployerContact());
        System.out.println(employer.getEmployerContactExt());
        System.out.println(employer.getEmployerStreetNumber());
        System.out.println(employer.getEmployerStreetName());
        System.out.println(employer.getEmployerCity());
        System.out.println(employer.getEmployerState());
    }
}

//directory:
//>