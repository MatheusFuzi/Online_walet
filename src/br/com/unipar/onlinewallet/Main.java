package br.com.unipar.onlinewallet;
//import br.com.unipar.onlinewallet.View.RegistersScreen;
import br.com.unipar.onlinewallet.View.RegisterScreen;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {
       RegisterScreen Screen = new RegisterScreen();
       Screen.setVisible(true); 
       /* Login login = new Login();
        People people = new People();
        Controller controller = new Controller();
        people.setUser("Meu_pau");
        people.setPassword("Minha_pica");
        Scanner userRead = new Scanner(System.in);
        Scanner passwordRead = new Scanner(System.in);
        String user = userRead.next();
        String password = passwordRead.next();
        if (login.validateLogin(user, password, people.getUser(), people.getPassword())) {
            controller.RegisterPeople();
        }else{
            System.out.println("Falhou \n User: " +user+"\n Password: "+password);
        }
        System.out.println(people.getName());*/
    }
    
}
