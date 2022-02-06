import java.util.List;

public class Banking extends Account{

    private String nome = "DowgBanking";
    private List<Client> contas;

    public Banking(Client cliente) {
        super(cliente);
    }

    public void receberCliente(Client conta){
        contas.add(conta);
    }

    public void listarCliente(){
        for(Client lista : contas){
            System.out.println(lista);
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Client> getContas() {
        return contas;
    }

    public void setContas(List<Client> contas) {
        this.contas = contas;
    }
}
