import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int aux = 1;
        int opcao;
        int verificar;
        String nome;

        Client cliente = new Client();
        Account checking = new ChekingAccount(cliente);
        Account savings = new SavingsAccount(cliente);
        Menu menu = new Menu();
        Banking banco = new Banking();

        while(aux == 1) {

            System.out.println("\n========= Bem vindo ao "+banco.getNome()+" =========\n");

            menu.mostrarOpcoes();
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome:\n");
                    nome = input.next();
                    cliente.setNome(nome);
                    break;

                case 2:
                    System.out.println("1- Conta corrente\n2- Poupança?\n");
                    verificar = input.nextInt();
                    if(verificar == 1){
                        System.out.println("Digite o valor desejado:\n");
                        double valor = input.nextDouble();
                        checking.sacar(valor);}
                    else if(verificar == 2){
                        System.out.println("Digite o valor desejado:\n");
                        double valor = input.nextDouble();
                        savings.sacar(valor);}
                    else{
                        System.out.println("Opcao invalida.\n");}
                    break;

                case 3:
                    System.out.println("1- Conta corrente\n2- Poupança?\n");
                    verificar = input.nextInt();

                    if(verificar == 1){
                        System.out.println("Digite o valor desejado:\n");
                        double valor = input.nextDouble();
                        checking.depositar(valor);}
                    else if(verificar == 2){
                        System.out.println("Digite o valor desejado:\n");
                        double valor = input.nextDouble();
                        savings.depositar(valor);}
                    else{
                        System.out.println("Opcao invalida.\n");}
                    break;

                case 4:
                    System.out.println("De qual conta deseja transferir?\n");
                    System.out.println("1- Conta corrente\n2- Poupança?\n");
                    verificar = input.nextInt();
                    System.out.println("Digite o valor desejado:\n");
                    double valor = input.nextDouble();
                    if(verificar == 1){
                        checking.transferir(savings, valor);}
                    if(verificar == 2){
                        savings.transferir(checking, valor);}
                    else{
                        System.out.println("Opcao invalida\n");}
                    break;

                case 5:
                    checking.imprimirExtratos();
                    savings.imprimirExtratos();
                    break;

                case 6:
                    System.out.println("Programa encerrado.\n");
                    aux = 0;
                    break;

                default:
                    System.out.println("Opcao invalidade.\n");
                    break;
            }
        }
    }
}
