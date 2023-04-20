public class App {
    public static void main(String[] args) throws Exception {
        


        ContaCorrente cc = new ContaCorrente(100, 100);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(200, 200);
        cp.deposita(100);

        cc.transfere(10, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP:" + cp.getSaldo());

    }
}
