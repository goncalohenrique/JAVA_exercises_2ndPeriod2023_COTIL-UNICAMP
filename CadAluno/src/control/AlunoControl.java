/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoControl {
    
    ArrayList<Aluno> listaAl; 
    
    public AlunoControl()
    {
        listaAl = new ArrayList<>();
       
    }
    
    public void cadastar(int raTela, String nomeTela)
    {
       
        Aluno a1 = new Aluno(raTela, nomeTela);
        System.out.println(a1.getNome() + "=====" + a1.getRa());
        listaAl.add(a1);
        for(Aluno alu: listaAl)
        {
            System.out.println(alu.getRa());
            System.out.println(alu.getNome());
        }
        System.out.println("====================");
            
    }
    
    public String mostradad()
    {
        String result ="";
        for (Aluno aln : listaAl )
        {
            result = result.concat(aln.getRa()+", " +aln.getNome()+"\n");
        }
        return result;
    }
    
    public void excluir(int raTela)
    {
        for(Aluno al1: listaAl)
        {
            if(al1.getRa()==raTela)
            {
                listaAl.remove(al1);
                break;
            }
        }
        
           
    }
    
    
}
