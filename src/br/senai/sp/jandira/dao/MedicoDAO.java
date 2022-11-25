package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private Medico medico;
    private static ArrayList<Medico> med = new ArrayList<>();

    private static final String ARQUIVO = "C:\\Users\\22282117\\projeto\\Medicos.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282117\\projeto\\Medicos_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public MedicoDAO(Medico medico) {
        this.med.add(medico);

    }

    public MedicoDAO() {

    }

    public static void gravar(Medico medico) {
        med.add(medico);

        try {
            BufferedWriter bw;
            bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoPlanoDeSaude = medico.getMedicoComPontoVirgula();

            bw.write(novoPlanoDeSaude);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Houve um erro ao gravar o medico",
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
                bwTemp.write(p.getMedicoComPontoVirgula());
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

    public static Medico getMedico(Integer codigo) {

        for (Medico p : med) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(Medico medico) {
        for (Medico p : med) {
            if (p.getCodigo().equals(medico.getCodigo())) {
                med.set(med.indexOf(p), medico);
                break;
            }
        }
        atualizarArquivo();
    }

    public static ArrayList<Medico> listarTodos() {
        return med;
    }

    public static void getListaMedicos() {
        try {
            BufferedReader br = Files.newBufferedReader(PATH);
            String linha = "";
            linha = br.readLine();
            while (linha != null && !linha.isEmpty()) {
                String[] linhavetor = linha.split(";");

                int i = 0;
                ArrayList<Especialidade> especialidades = new ArrayList<>();
                while (linhavetor.length > i + 6) {
                    especialidades.add(EspecialidadesDAO.getEspecialidade(Integer.valueOf(linhavetor[6 + i])));
                    i++;
                }

                String[] data = linhavetor[5].split("/");
                int ano = Integer.parseInt(data[2]);
                int mes = Integer.parseInt(data[1]);
                int dia = Integer.parseInt(data[0]);
                LocalDate dataDeNascimento = LocalDate.of(ano, mes, dia);

                Medico m = new Medico(Integer.valueOf(
                        linhavetor[0]), linhavetor[1],
                        linhavetor[2], linhavetor[3]
                        , linhavetor[4],
                        dataDeNascimento, especialidades);
                med.add(m);
                linha = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "DEU MERDA!!!");
        }
    }


public static DefaultTableModel getTableModel() {

        
        Object[][] dados = new Object[med.size()][3];

        
        int i = 0;
        for (Medico p : med) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getCrm();
            dados[i][2] = p.getNome();
            i++;
        }

        String[] titulos = {"Código", "Crm", "Nome"};
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }
}
