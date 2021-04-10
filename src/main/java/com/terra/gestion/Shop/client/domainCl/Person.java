package com.terra.gestion.Shop.client.domainCl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

    @Id
    private Integer personId;
    private String personName;
    private String personLastName;
    private String personEmail;
    private Integer personCelPhone;
    private Date personBirthdate;
    private Date personCreationDate;
    private Integer personIdentification;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public Integer getPersonCelPhone() {
        return personCelPhone;
    }

    public void setPersonCelPhone(Integer personCelPhone) {
        this.personCelPhone = personCelPhone;
    }

    public Date getPersonBirthdate() {
        return personBirthdate;
    }

    public void setPersonBirthdate(Date personBirthdate) {
        this.personBirthdate = personBirthdate;
    }

    public Date getPersonCreationDate() {
        return personCreationDate;
    }

    public void setPersonCreationDate(Date personCreationDate) {
        this.personCreationDate = personCreationDate;
    }

    public Integer getPersonIdentification() {
        return personIdentification;
    }

    public void setPersonIdentification(Integer personIdentification) {
        this.personIdentification = personIdentification;
    }
}
