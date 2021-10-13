public class CriarConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("Primeira conta saldo: " + primeiraConta.saldo);
        System.out.println("Segunda conta saldo: " + segundaConta.saldo);

        System.out.println("Primeira conta GERAL: saldo = " + primeiraConta.saldo +
                " | titular = " + primeiraConta.titular +
                " | agência = " + primeiraConta.agencia +
                " | número = " + primeiraConta.numero);
        System.out.println("Segunda conta GERAL: saldo = " + segundaConta.saldo +
                " | titular = " + segundaConta.titular +
                " | agência = " + segundaConta.agencia +
                " | número = " + segundaConta.numero);

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesmíssima conta!");

        } else {
            System.out.println("São contas diferentissímas!");
        }

        System.out.println("Referencia da primeira conta " + primeiraConta +
                " e referencia da segunda conta " + segundaConta);
    }
}
