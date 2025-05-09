/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteDAO {
    Connection con = null;
    
    
    public void inserirCliente (Cliente c1) throws SQLException, ClassNotFoundException
    {
         con = new Conexao().getConnection();
            String sql = "Insert into ClienteJava (Nome, Cpf, Idade) values (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,c1.getNome());
            stmt.setInt(2, c1.getCpf());
            stmt.setInt(3, c1.getIdade());
            stmt.execute();
            stmt.close();
            con.close();
    }
    
    public void excluirCliente (int cpf) throws SQLException, ClassNotFoundException
    {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM ClienteJava WHERE Cpf = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public ArrayList<Cliente> buscarCliente()  throws SQLException, ClassNotFoundException 
    {
        ResultSet rs;
        ArrayList<Cliente> lista = new ArrayList();
         con = new Conexao().getConnection();
       String sql = "SELECT * FROM ClienteJava";
       PreparedStatement stmt = con.prepareStatement(sql);
       rs = stmt.executeQuery();
       
       while(rs.next())
               {
                  int cpf = rs.getInt("Cpf");
                  int idade = rs.getInt("idade");
                  String nome = rs.getString("Nome");
                  Cliente cl = new Cliente(nome, cpf, idade);
                  lista.add(cl);
               }
        stmt.close();
        con.close();
        return lista;
        
    }
    
}
