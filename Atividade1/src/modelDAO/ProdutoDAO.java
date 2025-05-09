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
import model.Produto;

/**
 *
 * @author aluno
 */
public class ProdutoDAO {
    Connection con = null;
    
    public void inserirProduto (Produto p1) throws SQLException, ClassNotFoundException
    {
         con = new Conexao().getConnection();
            String sql = "Insert into ProdutoJava (Nome, Codigo, Preco ) values (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            System.out.println(p1.getNome());
            stmt.setString(1,p1.getNome());
            stmt.setInt(2, p1.getCodigo());
            stmt.setDouble(3, p1.getPreco());
            stmt.execute();
            stmt.close();
            con.close();
    }
    
      public void excluiProduto (int cod ) throws SQLException, ClassNotFoundException
    {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM ProdutoJava WHERE Codigo = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.execute();
        stmt.close();
        con.close();
    }
      
         public ArrayList<Produto> buscarProduto ()  throws SQLException, ClassNotFoundException 
    {
        ResultSet rs;
        ArrayList<Produto> lista = new ArrayList();
         con = new Conexao().getConnection();
       String sql = "SELECT * FROM ProdutoJava";
       PreparedStatement stmt = con.prepareStatement(sql);
       rs = stmt.executeQuery();
       
       while(rs.next())
               {
                  int cod = rs.getInt("Codigo");
                  double preco = rs.getDouble("Preco");
                  String nome = rs.getString("Nome");
                  Produto p1 = new Produto(nome, cod, preco);
                  lista.add(p1);
               }
        stmt.close();
        con.close();
        return lista;
        
    }
    
}
