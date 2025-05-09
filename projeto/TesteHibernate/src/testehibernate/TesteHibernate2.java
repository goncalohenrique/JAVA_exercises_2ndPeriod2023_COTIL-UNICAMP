/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testehibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 *
 * @author taniabasso
 */
public class TesteHibernate2 {
    public static void main(String[] args) {
        
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
     
            //primeiro cria as disciplinas
            Disciplina disc1 = new Disciplina (1,"java", 80);
            Disciplina disc2 = new Disciplina (2, "estrutura de dados", 40);
            Disciplina disc3 = new Disciplina (3, "banco de dados", 40);


            //cria os alunos
            Aluno al1 =new Aluno(1234,"Tania");
            Aluno al2 =new Aluno(5678,"Leandro");
            Aluno al3 =new Aluno(9012,"Maria");

            Professor p1= new Professor(21,"marcos",100000);
            Professor p2 = new Professor(51,"Tania",230000);
            Professor p3 = new Professor(61,"Alexa",520000);

            Departamento d1 = new Departamento(60,"Dep1");
            Departamento d2 = new Departamento(70,"dep2");

            Funcionario f1 = new Funcionario(96,"Cauan",200);
            Funcionario f2 = new Funcionario(64,"Matheus",300);

        List<Disciplina> listaDisc = new ArrayList<Disciplina>();
        listaDisc.add(disc1);
        listaDisc.add(disc2);
        p1.setListaDisc(listaDisc);

        List<Disciplina> listad2 = new ArrayList<Disciplina>();
        listad2.add(disc3);
        p2.setListaDisc(listad2);

           //salva alunos
           session.save(al1);
           session.save(al2);
           session.save(al3);

           //salva disciplinas
            session.save(disc1);
            session.save(disc2);
            session.save(disc3);

        //salva Professor
        session.save(p1);
        session.save(p2);
        session.save(p3);

        //salva Departamento
        session.save(d1);
        session.save(d2);


        //salva Funcionario
        session.save(f1);
        session.save(f2);

        session.getTransaction().commit();
        
        String hql = "From Professor";
        Query query = session.createQuery(hql);
        List<Professor> result = query.list();
          for (Professor prof : result)
          {
              System.out.println(prof.getNome()+", com salário:"+prof.getSalario());
          }

          String hql1 = "From Departamento";
          Query query1 = session.createQuery(hql1);
          List<Departamento> result1 = query1.list();
          for (Departamento dep: result1)
          {
              System.out.println("ID:" +dep.getCod()+ ", Nome:" +dep.getNome());
          }

         String hql3 = "From Funcionario";
          Query query3 = session.createQuery(hql3);
          List<Funcionario> result3 = query3.list();
          for (Funcionario func: result3)
          {
              System.out.println("Id: "+func.getId()+", nome: "+func.getNome());
          }


        session.close();
        HibernateUtil.shutdown();
    }
}
