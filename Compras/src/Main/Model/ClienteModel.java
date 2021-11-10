package Main.Model;

public class ClienteModel {
    private String nome;
    private int idCliente;

    public ClienteModel() {
    }

    public ClienteModel(String nome, int idCliente) {
        this.nome = nome;
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "ClienteModel{" +
                "nome='" + nome + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}
