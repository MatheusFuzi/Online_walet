package br.com.unipar.onlinewallet.Models;



import java.sql.*;
import java.text.ParseException;
import java.io.Serializable;

public class People extends Identifier implements Serializable{
    
    private static Long id;
    private String name;
    private String birthDate;
    private String card;
    private int type;
    private String road;
    private int number;
    private String district;
    private String city;
    private String state;
    private String zipCode;
    private String telephone;
    private String email;
    private String sex;
    
   public void RegisterPeople(People People)throws SQLException, ParseException{
       
   }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
           
    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
  
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    
    public Long getId() {
        return id;
    }

    public static void setId(Long id) {
        People.id = id;
    }

    
    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getBirthDate() {
        return birthDate;
    }


    public String getName() {
        return name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoad(String road) {
        this.road = road;
    }
    
    
    public void register(){
    
    }
    
    public void changeData(){
    
    }  
    
    public void registerDoc(){
    
    } 

}
