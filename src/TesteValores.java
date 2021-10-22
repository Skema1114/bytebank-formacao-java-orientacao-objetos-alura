public class TesteValores {
    public static void main(String[] args) {
        ContaPrivadaConstrutor contaPrivadaConstrutor = new ContaPrivadaConstrutor(1337, 24226);
        // contaPrivadaConstrutor.setAgencia(-50);
        // contaPrivadaConstrutor.setNumero(-333);
        System.out.println(contaPrivadaConstrutor.getAgencia());

        ContaPrivadaConstrutor contaPrivadaConstrutor2 = new ContaPrivadaConstrutor(1337, 16549);
        ContaPrivadaConstrutor contaPrivadaConstrutor3 = new ContaPrivadaConstrutor(2112, 24226);

        System.out.println(ContaPrivadaConstrutor.getTotal());
    }
}
