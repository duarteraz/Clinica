package testes;

import java.util.ArrayList;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

    public static void main(String[] args) {

        // Vetor com 3 planos de saúde
//
//		PlanoDeSaude plano1 = new PlanoDeSaude();
//		plano1.setOperadora("Unimed");
//		plano1.setTipoDoPlano("Bronze");
//
//		PlanoDeSaude[] planos = { plano1, new PlanoDeSaude("Porto Seguro"), new PlanoDeSaude("Allianz", "Ouro") };
//
//		System.out.println(planos[0].getOperadora());
//		System.out.println(planos[0].getTipoDoPlano());
//		System.out.println(planos[1].getOperadora());
//		System.out.println(planos[1].getTipoDoPlano());
//		System.out.println(planos[2].getOperadora());
//		System.out.println(planos[2].getTipoDoPlano());
//
//		// Utilização do ArrayList
//		ArrayList<String> cidades = new ArrayList<>();
//		cidades.add("São Paulo");
//		cidades.add("Jandira");
//		cidades.add("Barueri");
//		cidades.add("Itapevi");
//		cidades.add("Cotia");
//
//		System.out.println(cidades.get(4));
//		System.out.println(cidades.size());
//
//		ArrayList<PlanoDeSaude> planos2 = new ArrayList<>();
//		planos2.add(new PlanoDeSaude("NotreDame"));
//		planos2.add(new PlanoDeSaude("Ativia", "Advanced"));
//		planos2.add(new PlanoDeSaude("Bio Saúde"));
//		planos2.add(new PlanoDeSaude("Blue Med", "Exclusive"));
//
//		PlanoDeSaude planoNovo = new PlanoDeSaude();
//		planoNovo.setOperadora("Ameplan");
//		planoNovo.setTipoDoPlano("Prata");
//
//		planos2.add(planoNovo);
//		// Adicionar o tipo do plano no NotreDame
//		planos2.get(0).setTipoDoPlano("Basic");
//
//		System.out.println(planos2.get(4).getDadosDoPlano());
//		System.out.println(planos2.get(0).getDadosDoPlano());
//
//		ArrayList<Double> precos = new ArrayList<>();
//		precos.add(5.9);
        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
        PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
        PlanoDeSaude plano4 = new PlanoDeSaude("NotreDame", "Advance");

        ArrayList<PlanoDeSaude> planos = new ArrayList<>();
        planos.add(plano1);
        planos.add(plano2);
        planos.add(plano3);
        planos.add(plano4);

//		System.out.println(planos.get(0).getOperadora());
//		System.out.println(planos.get(1).getOperadora());
//		System.out.println(planos.get(2).getOperadora());
//		System.out.println(planos.get(3).getOperadora());
        int i = 0;
        while (i < planos.size()) {
            System.out.println(planos.get(i).getOperadora());
            i++;
        }
        System.out.println("Saiu do looping!!");

        // Looping FOR
        // estrututa do dor -> for ( contador;condição;acumulador ) {}
        System.out.println("--------  UTILIZANDO FOR  --------");
        for (int contador = 0; contador < planos.size(); contador++) {
            System.out.println(planos.get(contador).getOperadora());
        }
        //Iteração (repetição) em listas - ArrayList<>
        System.out.println("--------  FOR EACH - PARA CADA --------");
        for (PlanoDeSaude plano : planos) {
            System.out.println(plano.getOperadora());
        }

        // ESPECIALIDADES 
        System.out.println("--------  ESPECIALIDADE --------");
        Especialidade E1 = new Especialidade();
        E1.setNome("Cardiologista");
        E1.setDescricao("Cuida do coração");
        E1.setQuantidade();

        Especialidade E2 = new Especialidade();
        E2.setNome("Otorrino");
        E2.setDescricao("Cuida do ouvido");
        E2.setQuantidade();

        Especialidade E3 = new Especialidade();
        E3.setNome("Fisioterapia");
        E3.setDescricao("Cuida dos musculos e ossos");
        E3.setQuantidade();

        ArrayList<Especialidade> especialidade = new ArrayList<>();
        especialidade.add(E1);
        especialidade.add(E2);
        especialidade.add(E3);

        for (Especialidade E : especialidade) {
            System.out.printf("%s --> %s\n", E.getNome(), E.getDescricao());
        }

    }
}
