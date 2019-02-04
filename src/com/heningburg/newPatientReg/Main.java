package com.heningburg.newPatientReg;
import java.util.*;

class buildPatient {
    int patientHouseNumber;
    int patientZipCode;
    int patientSocialSecurityNum;
    int patientBirthDate;
    int employerNumber;
    int employerZip;
    int employerAddressNumber;
    //  static int employerExt;  --> Not sure what this is just yet
    int userChoice;
    String patientStreetName;
    String employerName;
    String employerCity;
    String employerAddress;
    String employerStreetName;
    String city;
    String state;

//setter and getter for PatientHouseNumber
    public void setPatientHouseNumber(int patientHouseNumber) {
        this.patientHouseNumber = patientHouseNumber;
    }
    public int getPatientHouseNumber() {
        return patientHouseNumber;
    }

//setter and getter for PatientStreetName
    public void setPatientStreetName(String setPatientStreetName) {
        this.patientStreetName = patientStreetName;
    }
    public String getPatientStreetName() {
        return patientStreetName;
    }

//setter and getter for PatientSocialSecurityNum
    public void setPatientSocialSecurityNum(int patientSocialSecurityNum) {
        this.patientSocialSecurityNum = patientSocialSecurityNum;
    }
    public int getPatientSocialSecurityNum() {
        return patientSocialSecurityNum;
    }


//setter and getter for patientBirthDate
    public void setPatientBirthDate(int patientBirthDate) {
        this.patientBirthDate = patientBirthDate;
    }
    public int getPatientBirthDate() {
        return patientBirthDate;
    }


//setter and getter for employerNumber
    public void setEmployerNumber(int employerNumber) {
        this.employerNumber = employerNumber;
    }
    public int getEmployerNumber() {
        return employerNumber;
    }


//setter and getter for employerZip
    public void setEmployerZip(int employerZip) {
        this.employerZip = employerZip;
    }
    public int getEmployerZip() {
        return employerZip;
    }



//setter and getter for employerAddressNumber
    public void setEmployerAddressNumber(int employerAddressNumber) {
        this.employerAddressNumber = employerAddressNumber;
    }
    public int getEmployerAddressNumber() {
        return employerAddressNumber;
    }

//setter and getter for patientStreetName
//need to set these for Strings


}


public class Main {
    static Scanner input = new Scanner(System.in);
//    static int patientHouseNumber;
//    static int patientStreetName;
//    static int patientZipCode;
//    static int patientSocialSecurityNum;
//    static int patientBirthDate;
//    static int employerNumber;
//    static int employerZip;
//    static int employerAddressNumber;
//  static int employerExt;  --> Not sure what this is just yet
//    static int userChoice;
//    static String employerName;
//    static String employerCity;
//    static String employerAddress;
//    static String employerStreetName;
//    static String city;
//    static String state;

    public static void main(String[] args) {
        System.out.println("Welcome to New Patient Regristration.");
        System.out.println("Please input the following information for patient.");
        userName();
        userAddress();
        userMiscellaneous();
        userOccupation();
    }
}
//    private static void userOccupation() {
//
//    }
//
//    private static void userMiscellaneous() {
//
//    }
//
//    private static void userName(){
//        System.out.println("Enter Name: ");
//        String name = new input.nextLine();
//    }
//
//    private static void userAddress() {
//        System.out.println("Enter the House Number: ");
//        patientHouseNumber = new input.nextInt();
//
//        System.out.println("Enter the Name of the Street: ");
//        patientStreetName = new input.nextInt();
//    }
//}

//directory:
//>