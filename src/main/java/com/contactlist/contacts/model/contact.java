package com.contactlist.contacts.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer contact_id;
    private String firstname;
    private String lastname;
    private String email;
    private String company;
    private Date datestarted;
    private Boolean active;

    public Integer getId() {
        return contact_id;
    }
    public void setId(Integer contact_id) {
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
        return getId().toString() + " " + firstname + " " + lastname + " " + 
                email + " " + company + " " + datestarted.toString() + " " + 
                active.toString();
    }


}