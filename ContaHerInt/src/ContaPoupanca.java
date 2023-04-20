public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);// implementando o metodo da super classe

    }

    @Override
    public boolean saca(double valor) {
        double valorSaque = valor + 0.2;
        return super.saca(valorSaque);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

}
