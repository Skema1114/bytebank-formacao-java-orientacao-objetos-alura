public class TesteSacarValorNegativo {
    public static void main(String[] args) {
        ContaPrivada conta = new ContaPrivada();
        conta.depositar(100);
        System.out.println(conta.sacar(300));
        System.out.println(conta.getSaldo());

        // proibido:
        // conta.saldo = conta.saldo - 201;
        // System.out.println(conta.saldo);
    }
}
