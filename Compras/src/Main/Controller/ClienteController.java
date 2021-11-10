package Main.Controller;

import Main.Model.ClienteModel;
import Main.Dao.ClienteDao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    List<ClienteModel> cliente = new ArrayList<>();
    ClienteDao clienteDao = new ClienteDao();
    public void cadastro(ClienteModel clienteM) throws IOException {
        cliente.add(clienteM);
        clienteDao.gravaArq();
    }
    public List<ClienteModel> listar(){
        return cliente;
    }
    public int id(int i){
        return cliente.get(i-1).getIdCliente();
    }
}
