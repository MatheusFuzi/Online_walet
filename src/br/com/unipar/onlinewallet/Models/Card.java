package br.com.unipar.onlinewallet.Models;

import java.util.Date;


public class Card {
    private int number;
    private int codSecurity;
    private String holderName;
    private Date expirationDate;

    public int getCodSecurity() {
        return codSecurity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getNumber() {
        return number;
    }

    public void setCodSecurity(int codSecurity) {
        this.codSecurity = codSecurity;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
