package Model;

import View.EntradaSaida;

public class Deposito extends Movimentacao{
    public int movimentacaoDeSaldo(){
        setValor(EntradaSaida.solicitaValorDeMovimentacao("Saque"));
        Conta saldoAtual = new Conta();
        return getValor() + saldoAtual.getSaldo();
    }
}
