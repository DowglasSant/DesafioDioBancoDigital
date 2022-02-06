public class SavingsAccount extends Account{

    public SavingsAccount(Client cliente) {
        super(cliente);
    }

    public void imprimirExtratos(){
        System.out.println("=== Extratos Conta Poupança ===");
        super.imprimirInfos();
    }
}
