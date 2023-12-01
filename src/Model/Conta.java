package Model;

import View.EntradaSaida;

import java.util.ArrayList;

public class Conta {
	 private String  titularDaConta;
	 private String  tipo ; // (1-conta poupança, 2-conta corrente.)
	 private int saldo;
	 private ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();
	 private ArrayList<Conta> tiposDeConta = new ArrayList<Conta>();
	private  ArrayList<Cofre> listaCorrente = new ArrayList<Cofre>();
	 private ArrayList<Cofre> listaPoupanca = new ArrayList<Cofre>();
	 private ArrayList<Movimentacao> listaDeDsepositos = new ArrayList<Movimentacao>();
	 private ArrayList<Movimentacao> listaDeSaques = new ArrayList<Movimentacao>();
	 private ArrayList<Movimentacao> correnteTipoTrans = new ArrayList<Movimentacao>();
	 private ArrayList<Movimentacao> poupancaTipoTrans = new ArrayList<Movimentacao>();
	 
	 public int depositar( int  valor ){
		  return  this.saldo+= valor;
	 }
	 public int sacar( int valor ){
		  return   this.saldo -= valor;
	 }
	 
	 public int  gerarSaldo(){
		  return 0;
	 }
	 public String  gerarDadosDaConta(){
		  return "";
	 }
	 public void gerarExtrato(){
		
	 }
	 public  void gerarExtratoDepositos(ArrayList<Movimentacao> listaDeDsepositos){
		  setListaDeDsepositos(listaDeDsepositos);
		
	 }
	 public void  gerarExtratoSaques(){
		
	 }
	 //setters e getters variaveis
	 
	 
	 public String getTitularDaConta() {
		  return titularDaConta;
	 }
	 
	 public void setTitularDaConta(String titularDaConta) {
		  this.titularDaConta = titularDaConta;
	 }
	 
	 public String getTipo() {
		  return tipo;
	 }
	 
	 public void setTipo(String tipo) {
		  this.tipo = tipo;
	 }
	 
	 public int getSaldo() {
		  return saldo;
	 }
	 
	 public void setSaldo(int saldo) {
		  this.saldo = saldo;
	 }
	 //setters e getters de listas
	 
	 
	 public ArrayList<Movimentacao> getListaDeMovimentacao() {
		  return listaDeMovimentacao;
	 }
	 
	 public void setListaDeMovimentacao(ArrayList<Movimentacao> listaDeMovimentacao) {
		  this.listaDeMovimentacao = listaDeMovimentacao;
	 }
	 
	 public ArrayList<Cofre> getListaCorrente() {
		  return listaCorrente;
	 }
	 
	 public void setListaCorrente(ArrayList<Cofre> listaCorrente) {
		  this.listaCorrente = listaCorrente;
	 }
	 
	 public ArrayList<Cofre> getListaPoupanca() {
		  return listaPoupanca;
	 }
	 
	 public void setListaPoupanca(ArrayList<Cofre> listaPoupanca) {
		  this.listaPoupanca = listaPoupanca;
	 }
	 
	 public ArrayList<Movimentacao> getListaDeDsepositos() {
		  return listaDeDsepositos;
	 }
	 
	 public void setListaDeDsepositos(ArrayList<Movimentacao> listaDeDsepositos) {
		  this.listaDeDsepositos = listaDeDsepositos;
	 }
	 
	 public ArrayList<Movimentacao> getListaDeSaques() {
		  return listaDeSaques;
	 }
	 
	 public void setListaDeSaques(ArrayList<Movimentacao> listaDeSaques) {
		  this.listaDeSaques = listaDeSaques;
	 }

	public ArrayList<Conta> getTiposDeConta() {
		return tiposDeConta;
	}

	public void setTiposDeConta(ArrayList<Conta> tiposDeConta) {
		this.tiposDeConta = tiposDeConta;
	}

	public ArrayList<Movimentacao> getCorrenteTipoTrans() {
		return correnteTipoTrans;
	}

	public void setCorrenteTipoTrans(ArrayList<Movimentacao> correnteTipoTrans) {
		this.correnteTipoTrans = correnteTipoTrans;
	}

	public ArrayList<Movimentacao> getPoupancaTipoTrans() {
		return poupancaTipoTrans;
	}

	public void setPoupancaTipoTrans(ArrayList<Movimentacao> poupancaTipoTrans) {
		this.poupancaTipoTrans = poupancaTipoTrans;
	}
}
