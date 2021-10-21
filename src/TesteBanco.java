public class TesteBanco {
    public static void main(String[] args) {
        Cliente rafael = new Cliente();
        rafael.nome = "Rafael Martins";
        rafael.cpf = "111.111.111-14";
        rafael.profissao = "Programador";

        Conta contaDoRafael = new Conta();
        contaDoRafael.depositar(100);
        contaDoRafael.titular = rafael;

        System.out.println(contaDoRafael.titular.nome);
        System.out.println(contaDoRafael.titular);
        System.out.println(rafael);
    }
}
