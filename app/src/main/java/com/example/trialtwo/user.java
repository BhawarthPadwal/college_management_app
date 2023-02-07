package com.example.trialtwo;

public class user {

    String FullName,Email,MobileNo,Course;

    public user(){}

    public user(String fullName, String email, String mobileNo, String course) {
        FullName = fullName;
        Email = email;
        MobileNo = mobileNo;
        Course = course;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }
}