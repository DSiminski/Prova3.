package Main.View;

import Main.Controller.ClienteController;
import Main.Model.ClienteModel;

import java.io.IOException;
import java.util.Scanner;

public class ViewCliente {

    ClienteController clienteController = new ClienteController();

    ViewMenssagem viewMenssagem = new ViewMenssagem();
    Scanner leitor = new Scanner(System.in);

    public void cadastro() throws IOException {

        ClienteModel clienteModel = new ClienteModel();

        System.out.println("Informe o nome:");
        clienteModel.setNome(leitor.next());

        System.out.println("Informe seu ID:");
        clienteModel.setIdCliente(leitor.nextInt());

        clienteController.cadastro(clienteModel);
    }
    public void mostrar() {
        System.out.println(clienteController.listar());
    }
    public int acesso(){
        System.out.println("Digite qual cliente quer acessar:");
        this.mostrar();
        int acessar = clienteController.id(leitor.nextInt());
        return acessar;
    }
    public void menu() throws IOException {
        System.out.println("1  - Cadastrar");
        System.out.println("2 - Visualizar");
        System.out.println("3 - Acessar");

        switch (leitor.nextInt()){
            case 1:
                this.cadastro();
                this.menu();
                break;
            case 2:
                this.mostrar();
                this.menu();
                break;
            case 3:
                int id = this.acesso();
                this.menum(id);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
    public void menum(int id) throws IOException {
        System.out.println("1 - Digita Menssagem");
        System.out.println("2 - Visualiza menssagem");
        System.out.println("3 - Retorna para o menu");

        switch (leitor.nextInt()){
            case 1:
                viewMenssagem.cadastro(id);
                this.menum(id);
                break;
            case 2:
                viewMenssagem.mostrar(id);
                this.menum(id);
                break;
            case 3:
                this.menu();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
