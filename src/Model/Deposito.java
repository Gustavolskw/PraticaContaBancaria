package Model;

import View.EntradaSaida;

public class Deposito extends Movimentacao{
    public void movimentacaoDeSaldo(){
        setValor(EntradaSaida.solicitaValorDeMovimentacao("Saque"));
        Conta saldo = new Conta();
        saldo.setSaldo(getValor() + saldo.getSaldo());
    }
}
