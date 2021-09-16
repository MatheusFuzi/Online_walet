package br.com.unipar.onlinewallet.Models;


public class Identifier extends Documents {
    private String rg;
    private String cpf;
    private String cnh;

    public String getCnh() {
        return cnh;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
}
