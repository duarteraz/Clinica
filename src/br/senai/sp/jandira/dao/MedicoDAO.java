package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private Medico medicos;
    private static ArrayList<Medico> med = new ArrayList<>();

    private static final String ARQUIVO = "C:\\Users\\22282117\\Medico.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282117\\Medico_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public MedicoDAO(Medico medicos) {
        this.med.add(medicos);
    }

    public MedicoDAO() {

    }

    public static void gravar(Medico medicos) {
        med.add(medicos);

        try {
            BufferedWriter bw;
            bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoMedico = medicos.getMedicoSeparadoPorPontoEVirgula();

            bw.write(novoMedico);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Houve um erro ao gravar medico",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public static boolean excluir(Integer codigo) {
        for (Medico p : med) {
            if (p.getCodigo().equals(codigo)) {
                med.remove(p);
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

            for (Medico p : med) {
                bwTemp.write(p.getMedicoSeparadoPorPontoEVirgula());
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
        }
    }

     public static Medico getMedico(Integer codigo) {

        for (Medico p : med) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }


 public static void atualizar(Medico medicos) {
        for (Medico p : med) {
            if (p.getCodigo().equals(medicos.getCodigo())) {
                med.set(med.indexOf(p), medicos);
                break;
            }
        }
        atualizarArquivo();
    }

    public static ArrayList<Medico> listarTodos() {
        return med;
    }

    public static void getListarMedicos() {
        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Medico novoMedico;
                novoMedico = new Medico(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);

                med.add(novoMedico);
                linha = br.readLine();

            }

            br.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Houve um erro ao gravar medico",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static DefaultTableModel getTableModel() {


        Object[][] dados = new Object[med.size()][3];

      
        int i = 0;
        for (Medico p : med) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getNome();
            dados[i][2] = p.getTelefone();
            i++;
        }

        String[] titulos = {"Código", "Nome do(a) Médico(a)", "Telefone"};

       
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }
}
