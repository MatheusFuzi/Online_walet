package br.com.unipar.onlinewallet.Models;

import java.util.Date;

public class Vaccines {
    private String name;
    private String typeVaccine;
    private Date datesDose;
    private Date nextDose;
    private int rangedose;

    public String getTypeVaccine() {
        return typeVaccine;
    }

    public void setTypeVaccine(String typeVaccine) {
        this.typeVaccine = typeVaccine;
    }

    public int getRangedose() {
        return rangedose;
    }

    public void setRangedose(int rangedose) {
        this.rangedose = rangedose;
    }

    public Date getDatesDose() {
        return datesDose;
    }

    public String getName() {
        return name;
    }

    public Date getNextDose() {
        return nextDose;
    }

    public String getType() {
        return typeVaccine;
    }

    public void setDatesDose(Date datesDose) {
        this.datesDose = datesDose;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNextDose(Date nextDose) {
        //Calculo da próxima Dose
        this.nextDose = nextDose;
    }

    public void setType(String type) {
        this.typeVaccine = type;
    }
    
    
}
