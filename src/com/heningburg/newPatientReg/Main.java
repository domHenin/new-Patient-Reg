package com.heningburg.newPatientReg;
import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String patientFirstName;
        String patientLastName;
        String patientStreetName;
        int patientHouseNumber;
        int patientZipCode;
        int patientSocialNumber;
        int patientBirthMonth;
        int patientBirthDay;
        int patientBirthYear;

        Patient patient = new Patient();
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
//      System.out.println("Return: "+patient.getPatientZipCode());

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

        System.out.println("RETURNS....");
        System.out.println(patient.getPatientFirstName());
        System.out.println(patient.getPatientLastName());
        System.out.println(patient.getPatientStreetName());
        System.out.println(patient.getPatientHouseNumber());
        System.out.println(patient.getPatientZipCode());
        System.out.println(patient.getPatientZipCode());
        System.out.println(patient.getPatientSocialSecurityNum());
        System.out.println(patient.getPatientBirthMonth());
        System.out.println(patient.getPatientBirthDay());
        System.out.println(patient.getPatientBirthYear());
    }
}

//directory:
//>