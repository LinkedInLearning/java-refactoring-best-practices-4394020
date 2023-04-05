package com.linkedin.mod4.bloater.refactored;

public class Customer {
    private String name;
    private int age;
    private Address address;
    private ContactInfo contactInfo;

    public Customer(String name, int age, Address address, ContactInfo contactInfo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

}

