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
 public static int solicitaValorDeMovimentacao(String tipo){
		 return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a ser movimentado.", tipo, JOptionPane.PLAIN_MESSAGE ));
 }

 public static int escolha(){
	 String[] opcoes = {"Opcoes de Movimentação", "Detalhes do Extrato", "Sair"};
	 JComboBox<String> menu = new JComboBox<>(opcoes);
	 JOptionPane.showConfirmDialog(null, menu, "Selecione a opcao que deseja executar.", JOptionPane.DEFAULT_OPTION);
	 return menu.getSelectedIndex();

 }
	public static int escolhaEntrada(){
		String[] opcoes = {"Entrar Em conta", "Sair"};
		return JOptionPane.showOptionDialog(null,"Selecione a opcao que deseja executar", "B.S.", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);
	}
 public static String solicitaNome(String opcao){
	return JOptionPane.showInputDialog(null, "escreva o nome do "+opcao+" da conta", "Banco da Somália", JOptionPane.PLAIN_MESSAGE);
 }
	public static String solicitacaoAoUsuario(String dado, String tipo){
		return JOptionPane.showInputDialog(null, "Digite o seu "+dado, tipo, JOptionPane.INFORMATION_MESSAGE);
	}
	public static int login(){
		 return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu Passe de Login para entrar "));
	}
	 public static void msgEncerraPrograma(){
		  JOptionPane.showMessageDialog(null, "O programa será encerrado");
	 }
	 public static int passeDeLogin(){
		  return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Seu passe de Login"));
	 }
	 public static String solicitaTipoDeConta(){
		  String[] opcoes = {"Corrente", "Poupança"};
		  int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de conta que deseja abrir", "B.S", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);
		  if(escolha==0){
			   return "Corrente";
		  }else {
			   return "Poupança";
		  }
	 }
	 public static void mensagemGeral(String mensagem){
		  JOptionPane.showMessageDialog(null, mensagem, "Banco da Somália", -1);
	 }
	 


}
