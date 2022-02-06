public class ChekingAccount extends Account{

    public ChekingAccount(Client cliente) {
        super(cliente);
    }

    public void imprimirExtratos(){
        System.out.println("=== Extratos Conta Corrente ===");
        super.imprimirInfos();
    }
}
