package br.com.unipar.onlinewallet.Models;

import java.util.Date;


public class Documents {
    private String typeDoc;
    private int numberDoc;
    private Date expirationDate;
    private boolean validate;

    public Date getExpirationDate() {
        return expirationDate;
    }

    public int getNumberDoc() {
        return numberDoc;
    }

    public String getTypeDoc() {
        return typeDoc;
    }
    

    public boolean getvalidate(){
        return validate;
    }
    
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setNumberDoc(int numberDoc) {
        this.numberDoc = numberDoc;
    }

    public void setTypeDoc(String type) {
        this.typeDoc = type;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }
    
    
    
public void validate(){
        

    
    }
}
