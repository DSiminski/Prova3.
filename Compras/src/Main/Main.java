package Main;

import Main.View.ViewCliente;
import Main.View.ViewMenssagem;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    Scanner leitor = new Scanner(System.in);
    ViewMenssagem viewMenssagem = new ViewMenssagem();

    public static void main(String[] args) throws IOException {
        ViewCliente viewCliente = new ViewCliente();
        viewCliente.menu();
    }

}
