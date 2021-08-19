public class Main {
    public static void main(String[] args) {

        Conta contaDiego = new Conta();
        contaDiego.set_nome("Diego");
        contaDiego.set_numero(72628);
        contaDiego.Saldo();
        contaDiego.Depositar(100);
        contaDiego.Depositar(600);
        contaDiego.Depositar(786);
        contaDiego.Saldo();
        contaDiego.Sacar(500);
        contaDiego.Saldo();

        System.out.println();

        Conta contaCarlos = new Conta();
        contaCarlos.set_nome("Carlos");
        contaCarlos.set_numero(82628);
        contaCarlos.Saldo();
        contaCarlos.Depositar(100000);
        contaCarlos.Depositar(387);
        contaCarlos.Depositar(9857);
        contaCarlos.Saldo();
        contaCarlos.Sacar(10000);
        contaCarlos.Saldo();

        System.out.println();

        Conta contaJuan = new Conta();
        contaJuan.set_nome("Juan");
        contaJuan.set_numero(58393);
        contaJuan.Saldo();
        contaJuan.Depositar(639374);
        contaJuan.Depositar(4648);
        contaJuan.Depositar(938386);
        contaJuan.Saldo();
        contaJuan.Sacar(700000);
        contaJuan.Saldo();
    }
}
