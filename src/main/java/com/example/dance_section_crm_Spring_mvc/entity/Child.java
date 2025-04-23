package com.example.dance_section_crm_Spring_mvc.entity;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
@Table(name = "report")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "group name")
    private String group_name;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "health_certificate")
    private String health_certificate;
    @Column(name = "form")
    private String form;
    @Column(name = "safety rules")
    private String safety_rules;
    @Column(name = "birth certificate")
    private String birth_certificate;
    @Column(name = "payment")
    private int payment;

    public Child() {

    }

    public Child(String name, String surname, String group_name, LocalDate birthday,
                 String health_certificate, String form, String safety_rules, String
                         birth_certificate, int payment) {
        this.name = name;
        this.surname = surname;
        this.group_name = group_name;
        this.birthday = birthday;
        this.health_certificate = health_certificate;
        this.form = form;
        this.safety_rules = safety_rules;
        this.birth_certificate = birth_certificate;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getHealth_certificate() {
        return health_certificate;
    }

    public void setHealth_certificate(String health_certificate) {
        this.health_certificate = health_certificate;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getSafety_rules() {
        return safety_rules;
    }

    public void setSafety_rules(String safety_rules) {
        this.safety_rules = safety_rules;
    }

    public String getBirth_certificate() {
        return birth_certificate;
    }

    public void setBirth_certificate(String birth_certificate) {
        this.birth_certificate = birth_certificate;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        try {
            this.payment = Integer.parseInt(payment.replaceAll("[^0-9]", ""));
        } catch (NumberFormatException e) {
            System.out.println("Помилка: Введене значення не є цілим числом.");
        }
    }

}


