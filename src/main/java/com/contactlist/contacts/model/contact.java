package com.contactlist.contacts.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="contact_id")
    private int contact_id;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
    @Column(name="email")
    private String email;
    @Column(name="company")
    private String company;
    @Column(name="datestarted")
    private Date datestarted;
    @Column(name="active")
    private Boolean active;
    @Column(name="worknumber")
    private Integer worknumber;
    @Column(name="exten")
    private Integer exten;
    @Column(name="companynumber")
    private Integer companynumber;

    public int getId() {
        return contact_id;
    }
    public void setId(int contact_id) {
        this.contact_id = contact_id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getDateStarted() {
        return datestarted;
    }

    public void setDateStarted(Date datestarted) {
        this.datestarted = datestarted;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return contact_id + " " + firstname + " " + lastname + " " + 
                email + " " + company + " " + datestarted + " " + 
                active;
    }

    public Integer getWorknumber() {
        return worknumber;
    }

    public void setWorknumber(Integer worknumber) {
        this.worknumber = worknumber;
    }

    public Integer getExten() {
        return exten;
    }

    public void setExten(Integer exten) {
        this.exten = exten;
    }

    public Integer getCompanynumber() {
        return companynumber;
    }

    public void setCompanynumber(Integer companynumber) {
        this.companynumber = companynumber;
    }


}