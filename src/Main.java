public class Main {
    public static void main(String[] args) {
        Cliente client1 = new Cliente();

        client1.setNome("Alisson");

        Conta contaConrrente = new ContaCorrente(client1);
        Conta contaPoupanca = new ContaPoupanca(client1);

        contaConrrente.depositar(100);

        contaConrrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaConrrente.transferir(25, contaPoupanca);

        contaConrrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
