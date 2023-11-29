package View;

import javax.swing.*;

public class EntradaSaida {
	 public static int solicitarInformacoesDeposito(){
		return 0;
	 }
	 public static int solicitarInformacoesSaque(){
		return 0;
	 }
	 public static void exibirSaldo(){
		
	 }
	public static void exibirDadosDaConta() {
		 //exibir nome do titular, tipo e saldo
		 
	}
public static void exibirExtratoCompleto(){

}
public static void exibirExtratoDeDepositos(){

}
 public static void exibirExtratoDeSaques(){
	
 }
 public static String solicitaOpcaoDeMovimentacao(){
		  String[] opcoes= {"Depositar", "Sacar"};
	  int escolha  =  JOptionPane.showOptionDialog(null, "Selecione entre as movimentaçoes Disponiveis", "Banco da Somalia", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
	  if(escolha== 0 ){
		   return "Depositar";
	  }else {
		   return "Sacar";
	  }
 }
	 
}
