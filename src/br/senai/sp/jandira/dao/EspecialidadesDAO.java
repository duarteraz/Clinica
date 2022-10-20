package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadesDAO {

    private Especialidade especialidades;
    private static ArrayList<Especialidade> especial = new ArrayList<>();

    public EspecialidadesDAO(Especialidade especialidades) {
        this.especial.add(especialidades);
    }

    public EspecialidadesDAO() {

    }

    public static void gravar(Especialidade especialidades) {
        especial.add(especialidades);
    }

    public static boolean excluir(Integer codigo) {
        for (Especialidade p : especial) {
            if (p.getCodigo().equals(codigo)) {
                especial.remove(p);
                return true;
            }
        }
        return false;
    }

    public static Especialidade getDadosEspecialidade(Integer codigo) {

        for (Especialidade p : especial) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade p : especial) {
            if (p.getCodigo().equals(especialidade.getCodigo())) {
                especial.set(especial.indexOf(p), especialidade);
                break;
            }
        }
    }

    public static ArrayList<Especialidade> listarTodos() {
        return especial;
    }

    public static void criarPlanosDeSaudeTeste() {
        Especialidade p1 = new Especialidade("Cardiologia", "Diagnóstico e tratamento de doenças do"
                + " coração e sistema circulatório");

        Especialidade p2 = new Especialidade("Neurocirurgia", "Tratamentodoenças que atingem os sistemas nervosos central e periférico");

        Especialidade p3 = new Especialidade("Oftalmologia", "Cuidado dos aspectos da saúde"
                + " dos olhos");

        Especialidade p4 = new Especialidade("Psiquiatria", "prevenção, diagnóstico, tratamento "
                + "e reabilitação de pessoas com distúrbios e transtornos mentais");

        Especialidade p5 = new Especialidade("Urologia", " tratamento de doenças relacionadas ao"
                + " aparelho urinário");

        especial.add(p1);
        especial.add(p2);
        especial.add(p3);
        especial.add(p4);
        especial.add(p5);
    }

    public static DefaultTableModel getTableModel() {

        // Matriz que receberá as Especialidades
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[especial.size()][3];

        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (Especialidade p : especial) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getNome();
            dados[i][2] = p.getDescricao();
            i++;
        }
      
                // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código", "Nome da Especialidade", "Descrição da Especialidade"};
        
        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }
    }
