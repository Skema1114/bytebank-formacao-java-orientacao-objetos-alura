public class ContaPrivada {
    private double saldo = 100;
    private int agencia;
    private int numero;
    private ClientePrivado titular = new ClientePrivado();

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;

        } else {
            return false;
        }
    }

    public boolean transferir(double valor, ContaPrivada destino) {
        if (this.saldo >= valor && destino != this) {
            this.sacar(valor);
            destino.depositar(valor);
            return true;

        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ClientePrivado getTitular() {
        return this.titular;
    }

    public void setTitular(ClientePrivado titular) {
        this.titular = titular;
    }
}