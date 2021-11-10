package Main.Controller;

import Main.Model.MenssagemModel;
import Main.Dao.MenssagemDao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MenssagemController {
    List<MenssagemModel> menssagemModels = new ArrayList<>();
    MenssagemDao menssagemDao = new MenssagemDao();

    public void cadastro(MenssagemModel menssagemModel) throws IOException {
        menssagemModels.add(menssagemModel);
        menssagemDao.gravaArq();
    }
    public List<MenssagemModel> listar(int id){
        List<MenssagemModel> menssagemListCliente = new ArrayList<>();

        for(int i = 0;i < menssagemModels.size();i++){
            if(menssagemModels.get(i).getIdCliente() == id){
                menssagemListCliente.add(menssagemModels.get(i));
            }
        }
        return menssagemListCliente;
    }
}
