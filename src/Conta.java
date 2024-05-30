public class Conta implements Iconta{

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" Agencia:  " +  this.agencia);
        System.out.println(" Conta:  " +  this.numero);
        System.out.println(" Saldo:  " +  this.saldo);
        System.out.println(" Nome:  " +  this.cliente.getNome());
    }
}
