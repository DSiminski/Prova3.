package Main.View;


import Main.Controller.MenssagemController;
import Main.Model.MenssagemModel;

import java.io.IOException;
import java.util.Scanner;

public class ViewMenssagem {
    MenssagemController menssagemController = new MenssagemController();

    public void cadastro(int idCliente) throws IOException {

        Scanner leitor = new Scanner(System.in);
        MenssagemModel menssagemModel = new MenssagemModel();

        System.out.println("Informe o nome:");
        menssagemModel.setNome(leitor.next());

        System.out.println("Informe seu ID:");
        menssagemModel.setId(leitor.nextInt());

        menssagemModel.setIdCliente(idCliente);
        menssagemController.cadastro(menssagemModel);
    }
    public void mostrar(int idCliente){
        System.out.println(menssagemController.listar(idCliente));
    }

}
