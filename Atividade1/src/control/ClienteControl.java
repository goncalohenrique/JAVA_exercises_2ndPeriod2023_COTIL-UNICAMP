/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import modelDAO.ClienteDAO;

/**
 *
 * @author aluno
 */
public class ClienteControl {
      
    public void inserirCli ( String nome, int cpf, int idade) throws SQLException, ClassNotFoundException
    {
        Cliente cl = new Cliente(nome, cpf, idade);
        ClienteDAO cliDao = new ClienteDAO();
        cliDao.inserirCliente(cl);
    }
    
    public void excluirCli( int cpf) throws SQLException, ClassNotFoundException 
    {
        ClienteDAO cliDao = new ClienteDAO();
        cliDao.excluirCliente(cpf);
    }
    
    public ArrayList<Cliente> buscar () throws SQLException, ClassNotFoundException 
    {
        ClienteDAO clidao1 = new ClienteDAO();
        return (clidao1.buscarCliente());
    }
   
    
}
