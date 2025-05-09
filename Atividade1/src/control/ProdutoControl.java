/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;
import modelDAO.ProdutoDAO;


/**
 *
 * @author aluno
 */
public class ProdutoControl {
    
     public void inserirProd ( String nome, int cod, double preco) throws SQLException, ClassNotFoundException
    {
        Produto cl = new Produto(nome, cod, preco);
        System.out.println(cl.getNome());
        ProdutoDAO cliDao = new ProdutoDAO();
        cliDao.inserirProduto(cl);
    }
    
    public void excluirProd( int cod) throws SQLException, ClassNotFoundException 
    {
        ProdutoDAO cliDao = new ProdutoDAO();
        cliDao.excluiProduto(cod);
    }
    
    public ArrayList<Produto> buscar () throws SQLException, ClassNotFoundException 
    {
        ProdutoDAO clidao1 = new ProdutoDAO();
        return (clidao1.buscarProduto());
    }
    
}
