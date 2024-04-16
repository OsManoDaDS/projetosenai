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
    
    public List<Funcionarios> read(){
      
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;  
       ResultSet rs = null;
       
       List<Funcionarios> funcionarios = new ArrayList<>();
       
        try {
            stmt = con.prepareStatement("SELECT * FROM funcionarios");
            rs = stmt.executeQuery();
            
            while(rs.next()){
            
               Funcionarios funcionario = new Funcionarios();
               
               funcionario.setId_funcionarios(rs.getInt("id_funcionarios"));
               funcionario.setNomeFuncionario(rs.getString("nomeFuncionario"));
               funcionario.setEmail(rs.getString("email"));
               funcionario.setCargo(rs.getString("cargo"));
               funcionario.setCpf(rs.getString("cpf"));
               funcionarios.add(funcionario);
            }
    
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       
        
        return funcionarios; 
      
    }

    public void update(Funcionarios p){
      
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        
        try {
            stmt = con.prepareStatement("UPDATE funcionarios SET nomeFuncionario = ?,email = ?,cargo = ?,cpf = ? WHERE id_funcionarios = ?");
            stmt.setString(1, p.getNomeFuncionario());
            stmt.setString(2, p.getEmail());
            stmt.setString(3, p.getCargo());
            stmt.setString(4, p.getCpf());
            stmt.setInt(5, p.getId_funcionarios());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    }
    
    public void delete(Funcionarios p){
      
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        
        try {
            stmt = con.prepareStatement("DELETE FROM funcionarios WHERE id_funcionarios = ?");
            stmt.setInt(1, p.getId_funcionarios());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Removido com Sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Remover: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    }
}