package com.heningburg.newPatientReg;

public class Patient {
// Initialization
   private String patientFirstName;
   private String patientLastName;
   private String patientStreetName;
   private String patientResidsState;
   private String patientResidsCity;
   private int patientHouseNumber;
   private int patientZipCode;
   private int patientSocialSecurityNum;
   private int patientBirthMonth;
   private int patientBirthDay;
   private int patientBirthYear;

//  Setters
    public void setPatientFirstName(String patientFirstName) { this.patientFirstName = patientFirstName; }
    public void setPatientLastName(String patientLastName) { this.patientLastName = patientLastName; }
    public void setPatientResidsState(String patientResidsState) { this.patientResidsState = patientResidsState; }
    public void setPatientResidsCity(String patientResidsCity) { this.patientResidsCity = patientResidsCity; }
    public void setPatientStreetName(String patientStreetName) { this.patientStreetName = patientStreetName; }
    public void setPatientHouseNumber(int patientHouseNumber) { this.patientHouseNumber = patientHouseNumber; }
    public void setPatientZipCode(int patientZipCode) { this.patientZipCode = patientZipCode; }
    public void setPatientSocialSecurityNum(int patientSocialSecurityNum) { this.patientSocialSecurityNum = patientSocialSecurityNum; }
    public void setPatientBirthMonth(int patientBirthMonth) { this.patientBirthMonth = patientBirthMonth; }
    public void setPatientBirthDay(int patientBirthDay) { this.patientBirthDay = patientBirthDay; }
    public void setPatientBirthYear(int patientBirthYear) { this.patientBirthYear = patientBirthYear; }

//  Getters
    public String getPatientFirstName(){ return patientFirstName; }
    public String getPatientLastName() { return  patientLastName; }
    public String getPatientResidsState() { return patientResidsState; }
    public String getPatientResidsCity() { return patientResidsCity; }
    public String getPatientStreetName() { return patientStreetName; }
    public int getPatientHouseNumber() { return  patientHouseNumber; }
    public int getPatientZipCode() { return patientZipCode; }
    public int getPatientSocialSecurityNum() { return patientSocialSecurityNum; }
    public int getPatientBirthMonth() { return patientBirthMonth; }
    public int getPatientBirthDay() { return patientBirthDay; }
    public int getPatientBirthYear() { return patientBirthYear; }
}



//TODO:
// > patientHouseNumber
// > patientZipCode
// > patientSocialSecurityNum
// > patientBirthDate
// > employerNumber
// > employerZip
// > employerAddressNumber
// > userChoice
// > patientStreetName
// > employerName
// > employerCity
// > employerAddress
// > employerStreetName
// > city(employer)
// > state (employer)
