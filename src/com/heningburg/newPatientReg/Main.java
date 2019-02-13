//need to set these for Strings
package com.heningburg.newPatientReg;
import java.util.*;

//class BuildPatient {
//    private int patientHouseNumber;
//    private int patientZipCode;
//    private int patientSocialSecurityNum;
//    private int patientBirthDate;
//    private int employerNumber;
//    private int employerZip;
//    private int employerAddressNumber;
//    private int userChoice;
//    //  static int employerExt;  --> Not sure what this is just yet
//    private String patientStreetName;
//    private String employerName;
//    private String employerCity;
//    private String employerAddress;
//    private String employerStreetName;
//    private String city;
//    private String state;
//
////setter and getter for PatientHouseNumber
//    public void setPatientHouseNumber(int patientHouseNumber) {
//        this.patientHouseNumber = patientHouseNumber;
//    }
//    public int getPatientHouseNumber() {
//        return patientHouseNumber;
//    }
//
////setter and getter for PatientStreetName
//    public void setPatientStreetName(String setPatientStreetName) {
//        this.patientStreetName = patientStreetName;
//    }
//    public String getPatientStreetName() {
//        return patientStreetName;
//    }
//
////setter and getter for PatientSocialSecurityNum
//    public void setPatientSocialSecurityNum(int patientSocialSecurityNum) {
//        this.patientSocialSecurityNum = patientSocialSecurityNum;
//    }
//    public int getPatientSocialSecurityNum() {
//        return patientSocialSecurityNum;
//    }
//
//
////setter and getter for patientBirthDate
//    public void setPatientBirthDate(int patientBirthDate) {
//        this.patientBirthDate = patientBirthDate;
//    }
//    public int getPatientBirthDate() { return patientBirthDate; }
//
//
////setter and getter for employerNumber
//    public void setEmployerNumber(int employerNumber) {
//        this.employerNumber = employerNumber;
//    }
//    public int getEmployerNumber() { return employerNumber;    }
//
//
////setter and getter for employerZip
//    public void setEmployerZip(int employerZip) {
//        this.employerZip = employerZip;
//    }
//    public int getEmployerZip() { return employerZip;    }
//
//
////setter and getter for employerAddressNumber
//    public void setEmployerAddressNumber(int employerAddressNumber) {
//        this.employerAddressNumber = employerAddressNumber;
//    }
//    public int getEmployerAddressNumber() { return employerAddressNumber;    }
//
////setter and getter for patientStreetName
//    public void setPatientStreetName() {
//        this.patientStreetName = patientStreetName;
//    }
//    public String getEmployerStreetName() { return patientStreetName;    }
//
////setter and getter for employerName
//    public void setEmployerName(String employerName) {
//        this.employerName = employerName;
//    }
//    public String getEmployerName() { return employerName;    }
//
////setter and getter for UserChoice
//    public void setUserChoice(int userChoice) {
//        this.userChoice = userChoice;
//    }
//    public int getUserChoice() { return userChoice;    }
//
////setter and getter for employerCity
//    public void setEmployerCity(String employerCity) {
//        this.employerCity = employerCity;
//    }
//    public String getEmployerCity() { return employerCity;    }
//
////setter and getter for employerAddress
//    public void setEmployerAddress(String employerAddress) {
//        this.employerAddress = employerAddress;
//    }
//    public String getEmployerAddress() { return employerAddress;    }
//
//
////setter and getter for employerStreetName
//    public void setEmployerStreetName(String employerStreetName) {
//        this.patientStreetName = employerStreetName;
//    }
//    public String geEemployerStreetName() { return employerStreetName;    }
//
////setter and getter for city
//    public void setCity(String city) {
//        this.city = city;
//    }
//    public String getCity() { return city;    }
//
//
////setter and getter for state
//    public void setState(String state) {
//        this.state = state;
//    }
//    public String getState() { return state;    }
//}
//
//class BuildPatientInfo {
//    Scanner input = new Scanner(System.in);
//
//
//    public void patientHouseNumber() {
//        System.out.println("Enter Your House Number: ");
//
//    }
//}


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
//    static int employerExt;  --> Not sure what this is just yet
//    static int userChoice;
//    static String employerName;
//    static String employerCity;
//    static String employerAddress;
//    static String employerStreetName;
//    static String city;
//    static String state;
    public static void main(String[] args) {
        String patientFirstName;
        String patientLastName;
        Patient patient = new Patient();
        System.out.println("Welcome to New Patient Regristration.");
        System.out.println("Please input the following information for patient.");

        System.out.println("Patient's First Name: ");
        patientFirstName = input.nextLine();
        patient.changePatientFirstName(patientFirstName);
//TEST  System.out.println("Return: "+patient.getPatientFirstName());
        System.out.println("Patient's Last Name: ");
        patientLastName = input.nextLine();
        patient.changePatientLastName(patientLastName);


    }


}

//directory:
//>