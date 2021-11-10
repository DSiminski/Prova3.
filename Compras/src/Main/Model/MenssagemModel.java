package Main.Model;

public class MenssagemModel {
    private String nome;
    private int id;
    private int idCliente;

    public MenssagemModel() {
    }

    public MenssagemModel(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MenssagemModel{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
