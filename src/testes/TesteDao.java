package testes;

import br.senai.sp.jandira.dao.EspecialidadesDAO;
import br.senai.sp.jandira.model.Especialidade;
import java.util.Iterator;

//import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;import br.senai.sp.jandira.model.Especialidade;
//import br.senai.sp.jandira.model.PlanoDeSaude;
public class TesteDao {

    public static void main(String[] args) {}

}

//        String[] linha0 = {"Cotia", "Itapevi", "Jandira"};
//        String[] linha1 = {"Barueri", "Carapicuíba", "Pirapora"};
//        String[] linha2 = {"Osasco", "Itu", "Valinhos"};
//        String[] linha3 = {"Presidente Prudente", "São Roque", "Pindamonhagaba"};
//
////        String[][] linhas = {linha0, linha1, linha2, linha3};
////        
////        System.out.println(linhas[2][2]);
////        
////        String[][] frutas = {
////            {"banana", "Pera", "Maçã"},
////            {"Melancia", "Uva", "Abacate"},
////            {"Ameixa", "Pêssego", "Nectarina"}
////        };
////        
////        System.out.println(frutas[0][1]);
////        System.out.println(frutas[2][2]);
////        
//        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
//        PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
//        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
//        PlanoDeSaude plano4 = new PlanoDeSaude("NotreDame", "Advance");
//        PlanoDeSaude plano5 = new PlanoDeSaude();
//
//        System.out.println(PlanoDeSaude.getContador());
//        System.out.println(plano1.getCodigo());
//        System.out.println(plano5.getCodigo());
//
//        PlanoDeSaudeDAO.gravar(plano1);
//        PlanoDeSaudeDAO.gravar(plano2);
//        PlanoDeSaudeDAO.gravar(plano3);
//        PlanoDeSaudeDAO.gravar(plano4);
//        PlanoDeSaudeDAO.gravar(plano5);
//
//        PlanoDeSaudeDAO.excluir(101);
//
//        for (PlanoDeSaude p : PlanoDeSaudeDAO.listarTodos()) {
//            System.out.println("Código: " + p.getCodigo());
//            System.out.println("Operadora: " + p.getOperadora());
//            System.out.println("--------------------");
//
//        }
//
//        int b[][] = new int[4][5];
//        int a[][] = {{1, 2, 3},
//        {4, 5, 6},
//        {7, 8, 9},
//        {0, 11, 12}};
//
////		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
////		dao.gravar(plano1);
////		dao.gravar(plano2);
////		
////		for (PlanoDeSaude planos : dao.listarTodos()) {
////			System.out.println(planos.getOperadora());
////		}
////		
////		
////		System.out.println("---------------------------");
////		PlanoDeSaudeDAO dao2 = new PlanoDeSaudeDAO();
////		dao.gravar(plano3);
////		dao.gravar(plano4);
////		
////		for (PlanoDeSaude planos : dao.listar()) {
////			System.out.println(planos.getOperadora());
////		}
//        //Testar o metodo getPlanoDeSaude() do Dao
//        PlanoDeSaude p = PlanoDeSaudeDAO.getPlanoDeSaude(102);
//        System.out.println("Código: " + p.getCodigo());
//        System.out.println("Operadora: " + p.getOperadora());
//
//        int i = PlanoDeSaudeDAO.listarTodos().indexOf(plano3);
//        System.out.println(i);
//
//    }


//        //////// ESPECIALIDES TESTES 
//        Especialidade especial1 = new Especialidade("Cardio", "Basic");
//        Especialidade especial2 = new Especialidade("Nutri", "Premium");
//        Especialidade especial3 = new Especialidade("Neuro", "Platina");
//        Especialidade especial4 = new Especialidade("Oftalmo", "Ouro");
//
//        System.out.println(Especialidade());
//        System.out.println(especial1.getCodigo());
//        System.out.println(especial2.getCodigo());
//
//        EspecialidadesDAO.gravar(especial1);
//        EspecialidadesDAO.gravar(especial2);
//        EspecialidadesDAO.gravar(especial3);
//        EspecialidadesDAO.gravar(especial4);
//
//        EspecialidadesDAO.excluir(100);
//        for (Especialidade p : EspecialidadesDAO.listarTodos()) {
//            System.out.println("Código: " + p.getCodigo());
//            System.out.println("Nome: " + p.getNome());
//            System.out.println("Descrição: " + p.getDescricao());
//            System.out.println("--------------------");
//        }
//
//        int b[][] = new int[4][5];
//        int a[][] = {{1, 2, 3},
//        {4, 5, 6},
//        {7, 8, 9},
//        {0, 11, 12}};
//
//        int o = EspecialidadesDAO.listarTodos().indexOf(3);
//        System.out.println(o);
//        
//        
//
//    }
//}
