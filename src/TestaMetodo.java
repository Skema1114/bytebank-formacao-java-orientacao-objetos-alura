public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.depositar(50);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirarContaDoPaulo = contaDoPaulo.sacar(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirarContaDoPaulo);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.depositar(1000);

        boolean conseguiuTransferirContaDaMarcela = contaDaMarcela.transferir(300, contaDoPaulo);

        if (conseguiuTransferirContaDaMarcela) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Que pena! Faltou dinheiro.");
        }

        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
    }
}
