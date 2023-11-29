package Model;

import java.util.ArrayList;

public class Conta {
	 private String  titularDaConta;
	 private String  tipo ; // (1-conta poupança, 2-conta corrente.)
	private String tipoDeUsuario;
	private int saldo;
	 private ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();
	 private ArrayList<Movimentacao> listaDeDsepositos = new ArrayList<Movimentacao>();
	 private ArrayList<Movimentacao> listaDeSaques = new ArrayList<Movimentacao>();
	 private ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
	 
	 
	 public int depositar(){
		return 0;
	 }
public int   sacar(){
return 0;
}

public int  gerarSaldo(){
return 0;
}
public String  gerarDadosDaConta(){
return "";
}
public void gerarExtrato(){

}
public  void gerarExtratoDepositos(){

}
public void  gerarExtratoSaques(){

}

	public String getTipoDeUsuario() {
		return tipoDeUsuario;
	}

	public void setTipoDeUsuario(String tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}

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
	 
	 public ArrayList<Movimentacao> getListaDeMovimentacao() {
		  return listaDeMovimentacao;
	 }
	 
	 public void setListaDeMovimentacao(ArrayList<Movimentacao> listaDeMovimentacao) {
		  this.listaDeMovimentacao = listaDeMovimentacao;
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
	 
	 public ArrayList<Usuario> getListaDeUsuarios() {
		  return listaDeUsuarios;
	 }

	 public void setListaDeUsuarios(ArrayList<Usuario> listaDeUsuarios) {
		  this.listaDeUsuarios = listaDeUsuarios;
	 }
}
