/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Funcionarios;

/**
 *
 * @author pedroportales
 */
public class FuncionarioDAO {
    public void create(Funcionarios p){
      
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionarios (nomeFuncionario,email,cargo,cpf)VALUES(?,?,?,?)");
            stmt.setString(1, p.getNomeFuncionario());
            stmt.setString(2, p.getEmail());
            stmt.setString(3, p.getCargo());
            stmt.setString(4, p.getCpf());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    }
}
