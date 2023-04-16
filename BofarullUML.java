package com.company;

import java.util.Date;

public class BofarullUML {

    public static void main(String[] args) {

        abstract class Person {
            private int ID;
            private String name;
            private String phone;
            private String email;

            public Person(int ID, String name, String phone, String email) {
                this.ID = ID;
                this.name = name;
                this.phone = phone;
                this.email = email;
            }

            public int getID() {
                return ID;
            }

            public void setID(int ID) {
                this.ID = ID;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            protected String getPhone() {
                return phone;
            }

            protected void setPhone(String phone) {
                this.phone = phone;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }

        class Address {
            private String street;
            private String city;
            private String state;
            private int postalCode;
            private String country;
            private boolean validate;

            public Address(String street, String city, String state, int postalCode, String country, boolean validate) {
                this.street = street;
                this.city = city;
                this.state = state;
                this.postalCode = postalCode;
                this.country = country;
                this.validate = validate;
            }

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public int getPostalCode() {
                return postalCode;
            }

            public void setPostalCode(int postalCode) {
                this.postalCode = postalCode;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public boolean isValidate() {
                return validate;
            }

            public void setValidate(boolean validate) {
                this.validate = validate;
            }
        }

        class Customer extends Person {
            private Date registration;
            public int creditScore;

            public Customer(int ID, String name, String phone, String email, Date registration, int creditScore) {
                super(ID, name, phone, email);
                this.registration = registration;
                this.creditScore = creditScore;
            }

            public Date getRegistration() {
                return registration;
            }

            public void setRegistration(Date registration) {
                this.registration = registration;
            }

            public int getCreditScore() {
                return creditScore;
            }

            public void setCreditScore(int creditScore) {
                this.creditScore = creditScore;
            }
        }

        class Employee extends Person {
            enum Department {
                HR, IT, FINANCE, OPERATIONS
            }

            private Department department;
            public float salary;

            public Employee(int ID, String name, String phone, String email, Department department, float salary) {
                super(ID, name, phone, email);
                this.department = department;
                this.salary = salary;
            }

            public Department getDepartment() {
                return department;
            }

            public void setDepartment(Department department) {
                this.department = department;
            }

            public float getSalary() {
                return salary;
            }

            public void setSalary(float salary) {
                this.salary = salary;
            }
        }

        class Account {
            private String IBAN;
            protected float amount;

            public Account(String IBAN, float amount) {
                this.IBAN = IBAN;
                this.amount = amount;
            }

            public boolean Transaction(String transaction) {
                return false;
            }

            public String getIBAN() {
                return IBAN;
            }

            public void setIBAN(String IBAN) {
                this.IBAN = IBAN;
            }

            protected float getAmount() {
                return amount;
            }

            protected void setAmount(float amount) {
                this.amount = amount;
            }
        }

        class Transaction {
            private String from;
            private String to;
            private float amount;
            private Date request;

            public Transaction(String from, String to, float amount, Date request) {
                this.from = from;
                this.to = to;
                this.amount = amount;
                this.request = request;
            }

            public String getFrom() {
                return from;
            }

            public void setFrom(String from) {

                this.from = from;
            }

            public String getTo() {
                return to;
            }

            public void setTo(String to) {
                this.to = to;
            }

            public float getAmount() {
                return amount;
            }

            public void setAmount(float amount) {
                this.amount = amount;
            }

            public Date getRequest() {
                return request;
            }

            public void setRequest(Date request) {
                this.request = request;
            }
        }

        class Investing extends Account {
            private float interest;

            public Investing(String IBAN, float amount, float interest) {
                super(IBAN, amount);
                this.interest = interest;
            }

            public float getInterest() {
                return interest;
            }

            public void setInterest(float interest) {
                this.interest = interest;
            }

            public void applyInterest() {
            }
        }

        class Savings extends Account {
            public float protectedAmount;

            public Savings(String IBAN, float amount, float protectedAmount) {
                super(IBAN, amount);
                this.protectedAmount = protectedAmount;
            }

            public float getProtectedAmount() {
                return protectedAmount;
            }

            public void setProtectedAmount(float protectedAmount) {
                this.protectedAmount = protectedAmount;
            }

            public void liberateSavings() {
            }
        }
    }
}
