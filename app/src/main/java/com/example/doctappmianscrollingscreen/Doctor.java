package com.example.doctappmianscrollingscreen;

public class Doctor {
    String Name;
    String email;
    String password;
    String Specialization;
    String InstitutionOfStudy;
    String WorkingOrganization;
    String Experience;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getInstitutionOfStudy() {
        return InstitutionOfStudy;
    }

    public void setInstitutionOfStudy(String institutionOfStudy) {
        InstitutionOfStudy = institutionOfStudy;
    }

    public String getWorkingOrganization() {
        return WorkingOrganization;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public void setWorkingOrganization(String workingOrganization) {
        WorkingOrganization = workingOrganization;
    }
}
