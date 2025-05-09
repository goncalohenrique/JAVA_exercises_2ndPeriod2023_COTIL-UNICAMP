/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Atleta;

/**
 *
 * @author aluno
 */
public class AtletaControl {
    
    private double med=0;
    private int qtdmen=0;
    private int qtdmai=0;
    private int i=0;
    private double altu=0; 
    ArrayList <Atleta> ListaAtl;
    
    public AtletaControl()
    {
        ListaAtl = new ArrayList<>();
    }
    
    public void cadastrarAtleta(String nomeTe, int idadeTe, double pesoTe, double altuTe, int codTe)
    {
        Atleta a1 = new Atleta(nomeTe, idadeTe, pesoTe, altuTe, codTe );      
        ListaAtl.add(a1);
        System.out.println("Atleta cadastrado");
         
         for(Atleta atle: ListaAtl)
        {  
            if(altuTe>altu)
            {
                altu=altuTe;
            }
            
           
            
            med+=pesoTe;
            
        }
        System.out.println("=========================");
      
    }
    
    public void excluir (String codexc)
    {
        for (Atleta a1: ListaAtl)
        {
            if (a1.getNome().equals(codexc))
            {
                ListaAtl.remove(a1);
                break;
            }
        }
    }
    
     public String mostradad()
    {
        String resul = "";
       for ( Atleta at1: ListaAtl)
       {
         resul= resul.concat("Nome: "+ at1.getNome() +", idade:"+ at1.getIdade()+", peso: "+ at1.getPeso()+", código: "+ at1.getCod()+" e altura: "+at1.getAltura());
           
       }
       return resul;
    }
     
     public String buscaNo(String nomeT)
     {
           String resul = "";
       for ( Atleta at2: ListaAtl)
       {
           if(at2.getNome().equals(nomeT))
           {
         resul= resul.concat("Nome: "+ at2.getNome() +", idade:"+ at2.getIdade()+", peso: "+ at2.getPeso()+", código: "+ at2.getCod()+" e altura: "+at2.getAltura());
           }
           
       }
       return resul;
     }
     
     public String buscacod(int codT)
     {
           String resul = "";
       for ( Atleta at2: ListaAtl)
       {
           if(at2.getCod()==codT)
           {
         resul= resul.concat("Nome: "+ at2.getNome() +", idade:"+ at2.getIdade()+", peso: "+ at2.getPeso()+", código: "+ at2.getCod()+" e altura: "+at2.getAltura());
           }
           
       }
       return resul;
     }
     
     public String buscaida(int idaT)
     {
           String resul = "";
       for ( Atleta at2: ListaAtl)
       {
           if(at2.getIdade()==idaT)
           {
         resul= resul.concat("Nome: "+ at2.getNome() +", idade:"+ at2.getIdade()+", peso: "+ at2.getPeso()+", código: "+ at2.getCod()+" e altura: "+at2.getAltura());
           }
           
       }
       return resul;
     }
     
     public String buscaAlt(double altT)
     {
           String resul = "";
       for ( Atleta at2: ListaAtl)
       {
           if(at2.getAltura()==altT)
           {
         resul= resul.concat("Nome: "+ at2.getNome() +", idade:"+ at2.getIdade()+", peso: "+ at2.getPeso()+", código: "+ at2.getCod()+" e altura: "+at2.getAltura());
           }
           
       }
       return resul;
     }
     
     public String buscapeso(double pesoT)
     {
           String resul = "";
       for ( Atleta at2: ListaAtl)
       {
           if(at2.getPeso()==pesoT)
           {
         resul= resul.concat("Nome: "+ at2.getNome() +", idade:"+ at2.getIdade()+", peso: "+ at2.getPeso()+", código: "+ at2.getCod()+" e altura: "+at2.getAltura());
           }
           
       }
       return resul;
     }
     
    public double mediaPeso ()
    {
           for(Atleta atl1: ListaAtl)
        {
           i+=1;
        }
           med=med/i;
        
       return med;      
    }
    
    public String maisAlto ()
    {
          String resul = "";
           for(Atleta at2: ListaAtl)
        {
         if( altu == at2.getAltura())
                 {
          resul= resul.concat("Nome: "+ at2.getNome() +", idade:"+ at2.getIdade()+", peso: "+ at2.getPeso()+", código: "+ at2.getCod()+" e altura: "+at2.getAltura());
                 }
          
        }
           return resul;
    }
    
    public int qtdmeno()
    {
        for(Atleta at1 : ListaAtl)
        {
        if (at1.getIdade()<18)
            {
                qtdmen+=1;
            }
        }
        
      return  qtdmen;
    }
   
     public int qtdmai()
    {
        
         for(Atleta at1 : ListaAtl)
        {
        if (at1.getIdade()>=18)
            {
                qtdmai+=1;
            }
        }
        
         return qtdmai;
    }
     
     public void BuscaNome(String buscaNome)
     {
          for(Atleta atle: ListaAtl)
          {
              if(atle.getNome().equals(buscaNome))
              {
                  System.out.println(ListaAtl);
                  break;
              }
          }
     }
    
    
}


