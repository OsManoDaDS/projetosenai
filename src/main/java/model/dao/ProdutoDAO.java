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
import model.bean.Produtos;

/**
 *
 * @author renan, pedroportales
 */
public class ProdutoDAO {
    
    public void create(Produtos p){

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;

    try {
        stmt = con.prepareStatement("INSERT INTO produtos (nomeProduto,quantidade,preco)VALUES(?,?,?)");
        stmt.setString(1, p.getNomeProdutos());
        stmt.setInt(2, p.getQuantidade());
        stmt.setDouble(3, p.getPreco());

        int affectedRows = stmt.executeUpdate();

        if (affectedRows > 0) {
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao salvar. Verifique os dados.");
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex.getMessage());
    } finally {
        ConnectionFactory.closeConnection(con, stmt);
    }
}

     
    public List<Produtos> read(){
      
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;  
       ResultSet rs = null;
       
       List<Produtos> produtos = new ArrayList<>();
       
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
            
               Produtos produto = new Produtos();
               
               produto.setId_produtos(rs.getInt("id_produtos"));
               produto.setNomeProdutos(rs.getString("nomeProdutos"));
               produto.setQuantidade(rs.getInt("quantidade"));
               produto.setPreco(rs.getDouble("preco"));
               produtos.add(produto);
            }
    
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       
        
        return produtos; 

                
    }
   
    public void update(Produtos p){
      
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        
        try {
            stmt = con.prepareStatement("UPDATE produtos SET nomeProduto = ?,quantidade = ?,preco = ? WHERE id_produto = ?");
            stmt.setString(1, p.getNomeProdutos());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getPreco());
            stmt.setInt(4, p.getId_produtos());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    }
    
    public List<Produtos> readQuant(Integer quant){
      
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;  
       ResultSet rs = null;
       
       List<Produtos> produtos = new ArrayList<>();
       
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos WHERE quantidade LIKE ?");
            stmt.setInt(1, quant);
            rs = stmt.executeQuery();
            
            while(rs.next()){
            
               Produtos produto = new Produtos();
               
               produto.setId_produtos(rs.getInt("id_produtos"));
               produto.setNomeProdutos(rs.getString("nomeProdutos"));
               produto.setQuantidade(rs.getInt("quantidade"));
               produto.setPreco(rs.getDouble("preco"));
               produtos.add(produto);
            }
    
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        } 
       
        
        return produtos; 
    }
    
    public void delete(Produtos p){
      
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        
        try {
            stmt = con.prepareStatement("DELETE FROM produtos WHERE id_produto = ?");
            stmt.setInt(1, p.getId_produtos());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Removido com Sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Remover: "+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    }
     
}
