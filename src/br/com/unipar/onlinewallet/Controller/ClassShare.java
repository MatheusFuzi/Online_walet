/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.onlinewallet.Controller;

import br.com.unipar.onlinewallet.Models.People;
import br.com.unipar.onlinewallet.View.ScreenUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public class ClassShare {
     public int I;   
    public boolean remove(String Campo, String Tabela, String Codigo) {
        try{
            Connection con = new ConnectionCon().getConnection();
            String sql = "DELETE FROM public.\""+Tabela+"\" WHERE \""+Campo+"\" = " + Codigo;
            PreparedStatement statement = con.prepareStatement(sql);
            statement.execute();
            con.close();
            return true;
        }catch(SQLException e){
             return false;
        }
       
    }
    
    public ResultSet findAll(String Tabela) {
        Connection conn;
        try {
            conn = new ConnectionCon().getConnection();
        
            String sql = "SELECT * FROM \""+Tabela+"\"";

            PreparedStatement Stmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet RS = Stmt.executeQuery();  
            return RS;
            
       
        } catch (SQLException ex) {
            Logger.getLogger(ScreenUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public People findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
