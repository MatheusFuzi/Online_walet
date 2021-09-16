package br.com.unipar.onlinewallet.Controller;
public class Login {
    
    public boolean  validateLogin(String user, String password, String userpeople, String passwordpeople){
       if((user.equals(userpeople) ) && (password.equals(passwordpeople))){
            return true;
        } else{
            return false;
        }
    }
        
}
