public class TesteGetESet {
    public static void main(String[] args) {
        ContaPrivada contaPrivada = new ContaPrivada();
        // conta.numero = 1337;
        contaPrivada.setNumero(1337);
        System.out.println(contaPrivada.getNumero());

        ClientePrivado paulo = new ClientePrivado();
        // conta.titular = paulo;
        // paulo.nome = "Paulo Silvira";

        paulo.setNome("Paulo Silveira");
        contaPrivada.setTitular(paulo);

        System.out.println(contaPrivada.getTitular().getNome());
        contaPrivada.getTitular().setProfissao("Programador");
        // Agora feito em duas linhas e em passo a passo:
        ClientePrivado titularDaConta = contaPrivada.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println(paulo);
        System.out.println(titularDaConta);
        System.out.println(contaPrivada.getTitular());
    }
}
