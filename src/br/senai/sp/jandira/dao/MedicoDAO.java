
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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
    
    private Medico medicos;
    private static ArrayList<Medico> medico = new ArrayList<>();

    private static final String ARQUIVO = "C:\\Users\\22282117\\Medico.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282117\\Medico_Temp.txt";
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);
    
     public MedicoDAO(Medico medicos) {
        this.medico.add(medicos);
    }

        public MedicoDAO() {

    }
    
          public static void gravar(Medico medicos) {
        medico.add(medicos);

        try {
            BufferedWriter bw;
            bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoMedico = medicos.getMedicoPorPontoEVirgula();

            bw.write(novoMedico);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Houve um erro ao gravar",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
