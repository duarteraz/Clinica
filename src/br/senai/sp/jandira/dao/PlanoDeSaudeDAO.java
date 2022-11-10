package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO { // Simular nosso banco de dados

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    private static final String ARQUIVO = "C:\\Users\\22282117\\PlanoDeSaude.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282117\\PlanoDeSaude_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    public PlanoDeSaudeDAO() {

    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        planos.add(planoDeSaude);

        //Gravar plano de saude no arquivo 
        try {
            BufferedWriter bw;
            bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoPlanoDeSaude = planoDeSaude.getPlanoDeSaudeSeparadoPorPontoEVirgula();

            bw.write(novoPlanoDeSaude);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Houve um erro ao gravar plano",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public static boolean excluir(Integer codigo) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                planos.remove(p);
                break;
            }
        }
        atualizarArquivo();
        return false;

    }

    private static void atualizarArquivo() {
        // Reconstruir um arquivo atualizado ou seja, sem o plano removido      
        // Passo 01 ---> Criar uma representação dos arquivos manipulado
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            //          boolean criou =  arquivoTemp.createNewFile();
            //            System.out.println(criou);

            //criar o arquivo temporario para a escrita
            arquivoTemp.createNewFile();

            // abrir o arquivo temporario para a escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            // interar na lista para adicionar os planos no arquivo
            for (PlanoDeSaude p : planos) {
                bwTemp.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            //fechar o arquivo temporario 
            bwTemp.close();

            // excluir o arquivo atual - planoDeSaude.txt
            arquivoAtual.delete();

            //Renomear o arquivoTemp
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao criar o arquivo!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {

        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaude) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(planoDeSaude.getCodigo())) {
                planos.set(planos.indexOf(p), planoDeSaude);
                break;
            }
        }
        atualizarArquivo();
    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;
    }

    public static void getListarPlanosDeSaude() {
        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                PlanoDeSaude novoPlanoDeSaude;
                novoPlanoDeSaude = new PlanoDeSaude(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);

                planos.add(novoPlanoDeSaude);
                linha = br.readLine();

            }

            br.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Houve um erro ao gravar",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static DefaultTableModel getTableModel() {

        // Matriz que receberá os planos de saúde
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[planos.size()][3];

        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código", "Nome da operadora", "Tipo do plano"};

        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }

}
