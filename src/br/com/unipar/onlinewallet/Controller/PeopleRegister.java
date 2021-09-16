/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.onlinewallet.Controller;

import br.com.unipar.onlinewallet.Interfaces.BaseRegister;
import br.com.unipar.onlinewallet.Models.People;
import br.com.unipar.onlinewallet.View.ScreenUser;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class PeopleRegister implements BaseRegister<People>{
      
    ResultSet RS;
    
    @Override
    public void save(People t) throws Exception {
        try{
           Connection con = new ConnectionCon().getConnection();
           Date data;
           SimpleDateFormat in = new SimpleDateFormat("dd/MM/yyyy");
           data = in.parse(t.getBirthDate());
            String sql = "INSERT INTO public.\"Person\"("+
	"\"NAME\", \"CPF\",\"ROAD\", \"NUMBER\", \"DISTRICT\",\"COUNTRY\",\"EMAIL\",\"TELEPHONE\",\"STATES\","
       +"\"SEX\", \"CEP\", \"FAMILY_MAMBER\", \"BORNDATE\")" +
	"VALUES(\'" + t.getName()+"\',\'"+t.getCpf()+"\',\'"+t.getRoad()+"\',"+
                    t.getNumber()+",\'"+t.getDistrict()+"\',\'"+t.getCity()+"\',\'"+
                    t.getEmail()+"\',\'"+t.getTelephone()+"\',\'"+t.getState()+"\',\'"+
                    t.getSex()+"\',\'"+t.getZipCode()+"\',\'"+t.getType()+"\',\'"+ new java.sql.Date(data.getTime())+
                    "\');"; 
            PreparedStatement statement = con.prepareStatement(sql);
            statement.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Sucesso", INFORMATION_MESSAGE);        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Erro",ERROR_MESSAGE);
        }
    }

    @Override
    public People update(People t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
}
