import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Client cliente = new Client();
        cliente.setNome("Dowg");

        Account checking = new ChekingAccount(cliente);
        Account savings = new SavingsAccount(cliente);

        checking.imprimirExtratos();
        savings.imprimirExtratos();

    }
}
