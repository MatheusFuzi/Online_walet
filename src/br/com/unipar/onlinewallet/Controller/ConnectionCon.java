/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.onlinewallet.Controller;

import java.sql.*;
import java.sql.PreparedStatement;



/**
 *
 * @author Matheus
 */
public class ConnectionCon {

    
    public Connection getConnection() throws SQLException{
        String url = "jdbc:postgresql://localhost:5432/OnlineWalet";
        String usuario = "postgres";
        String senha = "081399";
        Connection con = null;
        try {
            //Class.forName("org.postgresql.Driver");
            con =  DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            // Erro caso o driver JDBC não foi instalado
        }
        // Erro caso haja problemas para se conectar ao banco de dados
        return con;
    }

    

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    PreparedStatement prepareStatement(String sql) {  
        return null;
        
    }
}
