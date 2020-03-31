package com.contactlist.contacts.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contact_id;
    private String firstname;
    private String lastname;
    private String email;
    private String company;
    private Date datestarted;
    private Boolean active;
    private Integer worknumber;
    private Integer exten;
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