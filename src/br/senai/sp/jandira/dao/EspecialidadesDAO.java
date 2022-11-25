package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadesDAO {

    private Especialidade especialidades;
    private static ArrayList<Especialidade> especial = new ArrayList<>();

    private static final String ARQUIVO = "C:\\Users\\22282117\\projeto\\Especialidade.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282117\\projeto\\Especialidade_Temp.txt";
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public EspecialidadesDAO(Especialidade especialidades) {
        this.especial.add(especialidades);
    }

    public EspecialidadesDAO() {

    }

   public static void gravar(Especialidade especialidade) {
        especial.add(especialidade);

        try {
            BufferedWriter bw;
            bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novaEspecialidade = especialidade.getEspecialidadePorPontoEVirgula();

            bw.write(novaEspecialidade);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Houve um erro ao gravar o especialidade",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
            
        }

    }

    public static boolean excluir(Integer codigo) {
        for (Especialidade p : especial) {
            if (p.getCodigo().equals(codigo)) {
                especial.remove(p);
                break;
            }
        }

        atualizarArquivo();
        return false;

    }


    private static void atualizarArquivo() {

        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {

            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Especialidade p : especial) {
                bwTemp.write(p.getEspecialidadePorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            arquivoAtual.delete();

            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao criar o arquivo!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    public static Especialidade getDadosEspecialidade(Integer codigo) {

        for (Especialidade especialidades : especial) {
            if (especialidades.getCodigo().equals(codigo)) {
                return especialidades;
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

        atualizarArquivo();;
    }
    
    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade especialidade: especial) {
            if (especialidade.getCodigo().equals(codigo)) {
                return especialidade;
            }
        }
        return null;
    }

    public static ArrayList<Especialidade> listarTodos() {
        return especial;
    }

    public static void getListarEspecialidades() {
    try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Especialidade novaEspecialidade;
                novaEspecialidade = new Especialidade(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);

                especial.add(novaEspecialidade);
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

        
        Object[][] dados = new Object[especial.size()][3];

        
        int i = 0;
        for (Especialidade p : especial) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getNome();
            dados[i][2] = p.getDescricao();
            i++;
        }

        String[] titulos = {"Código", "Nome", "Descrição"};
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }
}
