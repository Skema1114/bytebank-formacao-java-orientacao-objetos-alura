public class ContaPrivadaConstrutor {
    private double saldo;
    private int agencia;
    private int numero;
    private ClientePrivado titular;
    // O static aqui está dizendo que o total é da classe e nao das instancias;
    private static int total;

    public ContaPrivadaConstrutor(int agencia, int numero) {
        total++;
        // System.out.println("Total de contas criadas " + total);

        this.agencia = agencia;
        this.numero = numero;
        // System.out.println("Estou criando uma conta " + this.numero);
    }

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

    public boolean transferir(double valor, ContaPrivadaConstrutor destino) {
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não é permitido valor menor ou igual a 0!");
            return;
        }

        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não é permitido valor menor ou igual a 0!");
            return;
        }

        this.numero = numero;
    }

    public ClientePrivado getTitular() {
        return this.titular;
    }

    public void setTitular(ClientePrivado titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        ContaPrivadaConstrutor.total = total;
    }
}