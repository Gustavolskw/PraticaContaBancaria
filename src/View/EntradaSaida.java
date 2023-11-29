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
 public static String escolhaTipoDeUsuario(){
	 String[] opcoes= {"Pessoa Fisica", "Pessoa Juridica"};
	 int escolha  =  JOptionPane.showOptionDialog(null, "Selecione o tipo de conta que dseja abrir", "Banco da Somalia", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
	 if(escolha== 0 ){
		 return "Pessoa Fisica";
	 }else {
		 return "Pessoa Juridica";
	 }
 }
 public static int escolha(){
	 String[] opcoes = {"Opcoes de Movimentação", "Detalhes do Extrato", "Sair"};
	 JComboBox<String> menu = new JComboBox<>(opcoes);
	 JOptionPane.showConfirmDialog(null, menu, "Selecione a opcao que deseja executar.", JOptionPane.DEFAULT_OPTION);
	 return menu.getSelectedIndex();

 }
	public static int escolhaEntrada(){
		String[] opcoes = {"CriarConta", "Entrar Em conta", "Sair"};
		JComboBox<String> menu = new JComboBox<>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opcao que deseja executar.", JOptionPane.DEFAULT_OPTION);
		return menu.getSelectedIndex();

	}
 public static String solicitaNome(String opcao){
	return JOptionPane.showInputDialog(null, "escreva o nome do "+opcao+" da conta", "Banco da Somália", JOptionPane.PLAIN_MESSAGE);
 }
	public static String solicitacaoAoUsuario(String dado, String tipo){
		return JOptionPane.showInputDialog(null, "Digite seu "+dado, tipo, JOptionPane.INFORMATION_MESSAGE);
	}


}
