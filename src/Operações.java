public interface Operações{

    void sacar(double valor);

    void depositar(double valor);

    void transferir(Account contaDestino, double valor);

    void imprimirExtratos();

}
