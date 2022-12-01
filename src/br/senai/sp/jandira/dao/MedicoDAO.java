package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Pessoa;
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

public class MedicoDAO extends Pessoa{

    private Medico medico;
    private static ArrayList<Medico> medicoList = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282117\\projeto\\medico.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282117\\projeto\\medico_temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public MedicoDAO(Medico medico) {
        this.medicoList.add(medico);
    }

    public MedicoDAO() {

    }

    public static void gravar(Medico medico) {
        medicoList.add(medico);

        try {
            //Gravar o Médico no arquivo texto
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            bw.write(medico.getMedicoSeparadoPorPontoEVirgula());
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao gravar.\n\nEntre em contato com o suporte",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
//            ex.printStackTrace();
        }
    }

    public static boolean excluir(Integer codigo) {
        for (Medico m : medicoList) {
            if (m.getCodigo().equals(codigo)) {
                medicoList.remove(m);
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
//          Criar o arquivo temporário para escrita 
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

//          Iterar na lista para adicionar os planos no arquivo temporário
            for (Medico m : medicoList) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

//            Excluir o arquivo atual - plano_de_saude.txt
            arquivoAtual.delete();

//            Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro ao criar o arquivo", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                    
//            ex.getStackTrace();
        }
    }

    public static Medico getMedico(Integer codigo) {
        for (Medico m : medicoList) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public static void atualizar(Medico medico) {
        for (Medico m : medicoList) {
            if (m.getCodigo().equals(medico.getCodigo())) {
                medicoList.set(medicoList.indexOf(m), medico);
                break;
            }
        }
        atualizarArquivo();
    }

    public static ArrayList<Medico> listarTodos() {
        return medicoList;
    }


  public static void getListaMedicos() {

        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = "";

            linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");

                ArrayList<Especialidade> especialidades = new ArrayList<>();
                int i = 0;

                while (linhaVetor.length > i + 6) {
                especialidades.add(EspecialidadesDAO.getEspecialidade(Integer.valueOf(linhaVetor[6+i])));
                    i++;
                }

                Medico medico = new Medico(
                        Integer.valueOf(linhaVetor[0]), //codigo
                        linhaVetor[1], // nome
                        linhaVetor[2], // crm
                        linhaVetor[3], // telefone
                        linhaVetor[4], // email
                        linhaVetor[5], //data de nascimento.
                        especialidades
                );

                medicoList.add(medico);
                linha = br.readLine();
            }

            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro na leitura do arquvo");

        }
    }

    public static DefaultTableModel getTableModel() {
        Object[][] dados = new Object[medicoList.size()][3];

        int i = 0;
        for (Medico m : medicoList) {
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getNome();
            dados[i][2] = m.getTelefone();
            i++;
        }

        String[] titulos = {"Código", "Nome", "Telefone"};

        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
        return tableModel;
    }

}

//criar array
//criar listmodel