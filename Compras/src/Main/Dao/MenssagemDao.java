package Main.Dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MenssagemDao {
    public void gravaArq() throws IOException {

        FileWriter localDoArquivo = new FileWriter("arquivolog.txt", true);
        PrintWriter escreveArquivo = new PrintWriter(localDoArquivo);

        escreveArquivo.println("Uma menssagem foi cadastrada!");

        localDoArquivo.close();
        escreveArquivo.flush();
    }

}