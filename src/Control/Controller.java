package Control;

import Model.*;
import View.EntradaSaida;
import java.util.ArrayList;
public class 	Controller {
	 Conta conta = null;
	 Movimentacao movimentacao = null;
	 public void exibeMenu() {
		  Usuario usuario = new Usuario();
		  this.conta = new Conta();
		 var poupanca1 = new Poupanca();
		 var corrente1 = new Corrente();
		  this.movimentacao = new Movimentacao();
		  var deposito1 = new Deposito();
		  boolean saldoBaixo = false;
		  int escolha;
		  ArrayList<Movimentacao> listaDeMoviemntacao = new ArrayList<Movimentacao>();
		  ArrayList<Cofre> listaCorrente = new ArrayList<Cofre>();
		  ArrayList<Cofre> listaPoupanca = new ArrayList<Cofre>();
		 ArrayList<Conta> tiposDeConta = new ArrayList<Conta>();
		 ArrayList<Movimentacao> correnteTipoTrans = new ArrayList<Movimentacao>();
		 ArrayList<Movimentacao> poupancaTipoTrans = new ArrayList<Movimentacao>();

		  //Cadastrar usuario
		  EntradaSaida.mensagemGeral("Bem Vindo ao Banco da Somália\nCrie uma Nova Conta");
		  usuario.cadastro();

		  //entrada na conta
		  escolha = EntradaSaida.escolhaEntrada();
		  if(escolha==0) {
			   System.out.println(usuario.getPing());
			   int passe = EntradaSaida.login();
			   System.out.println(passe);
			   while (passe!=usuario.getPing()){
					EntradaSaida.mensagemGeral("Senha Incorreta!!!");
					passe = EntradaSaida.login();
			   }

			   //Priemeiro deposito
			   EntradaSaida.mensagemGeral("Para inicar você precisa depositar uma valor a conta...");
			  this.conta.setTipo(EntradaSaida.solicitaTipoDeConta());
			   tiposDeConta.add(this.conta);
			   this.movimentacao.setTipo("Depositar");
			   if(this.conta.getTipo().equalsIgnoreCase("Corrente")) {
				   correnteTipoTrans.add(this.movimentacao);
					deposito1.setValor(EntradaSaida.solicitarInformacoesDeposito());
					listaDeMoviemntacao.add(deposito1);
					corrente1.setTransferConta(deposito1.getValor());
					listaCorrente.add(corrente1);

					
			   }else {
				  poupancaTipoTrans.add(this.movimentacao);
					deposito1.setValor(EntradaSaida.solicitarInformacoesDeposito());
					listaDeMoviemntacao.add(deposito1);
					poupanca1.setTransferConta(deposito1.getValor());
					listaPoupanca.add(poupanca1);

			   }
			   this.conta.depositar(deposito1.getValor());

			   //Operacoes dentro da conta
			   do {
					escolha = EntradaSaida.escolha();
					switch (escolha) {
						 case 0:
							 Movimentacao tipoDeTransacao = new Movimentacao();
							 //Opcao de movimentar Conta (Sacar) (Depositar)
							 var tipoConta = new Conta();
							  tipoConta.setTipo(EntradaSaida.solicitaTipoDeConta());
							  tiposDeConta.add(tipoConta);
							  if(tipoConta.getTipo().equalsIgnoreCase("Corrente")){
								  //Conta corrente
								  var corrente = new Corrente();
								  tipoDeTransacao.setTipo(EntradaSaida.solicitaOpcaoDeMovimentacao());
								   if(this.conta.getSaldo()<10){
										saldoBaixo = true;
								   }
								   if (tipoDeTransacao.getTipo().equalsIgnoreCase("Depositar")) {
									   correnteTipoTrans.add(tipoDeTransacao);
										var deposito = new Deposito();
										deposito.setValor(EntradaSaida.solicitarInformacoesDeposito());
										listaDeMoviemntacao.add(deposito);
										corrente.setTransferConta(deposito.getValor());
										listaCorrente.add(corrente);

										this.conta.depositar( deposito.getValor());

								   }else {
									   correnteTipoTrans.add(tipoDeTransacao);
								   if(!saldoBaixo){
											 var saque = new Saque();
											 saque.setValor(EntradaSaida.solicitarInformacoesSaque());
											 while(saque.getValor()>this.conta.getSaldo()){
												  EntradaSaida.mensagemGeral("O valor Digitado é acima do Saldo atual!!!");
												  saque.setValor(EntradaSaida.solicitarInformacoesSaque());
											 }
											 listaDeMoviemntacao.add(saque);
											 corrente.setTransferConta(saque.getValor());
											 listaCorrente.add(corrente);
											 this.conta.sacar(saque.getValor());

										}else{
											 EntradaSaida.mensagemGeral("Seu Saldo é Baixo para realizar um Saque");
										}
								   }
							  }else {
								  //conta poupança
								  var poupanca = new Poupanca();
								  tipoDeTransacao.setTipo(EntradaSaida.solicitaOpcaoDeMovimentacao());
								   if (this.conta.getSaldo() < 10) {
										saldoBaixo = true;
								   }
								   if (tipoDeTransacao.getTipo().equalsIgnoreCase("Depositar")) {
									   poupancaTipoTrans.add(tipoDeTransacao);

										var deposito = new Deposito();
										deposito.setValor(EntradaSaida.solicitarInformacoesDeposito());
										listaDeMoviemntacao.add(deposito);
									   poupanca.setTransferConta(deposito.getValor());
									   listaPoupanca.add(poupanca);
									   this.conta.depositar(deposito.getValor());

								   } else {
									   poupancaTipoTrans.add(tipoDeTransacao);
										if (!saldoBaixo) {
											 var saque = new Saque();
											 saque.setValor(EntradaSaida.solicitarInformacoesSaque());
											 while (saque.getValor() > this.conta.getSaldo()) {
												  EntradaSaida.mensagemGeral("O valor Digitado é acima do Saldo atual!!!");
												  saque.setValor(EntradaSaida.solicitarInformacoesSaque());
											 }
											listaDeMoviemntacao.add(saque);
											 poupanca.setTransferConta(saque.getValor());
											 listaPoupanca.add(poupanca);
											this.conta.sacar( saque.getValor());

										} else {
											 EntradaSaida.mensagemGeral("Seu Saldo é Baixo para realizar um Saque");
										}
								   }
							  }
							  break;
						 case 1:
							 for (int i = 0; i < listaDeMoviemntacao.size(); i++) {
								EntradaSaida.exibirExtratoDeDepositos(listaDeMoviemntacao, tiposDeConta, i);
							 }
							 System.out.println("###########################################################");
							 System.out.println("<<POUPANÇA>>");
								 for(int i = 0; i<listaPoupanca.size(); i++){

									 EntradaSaida.exibirExtratoPopCorr(poupancaTipoTrans, listaPoupanca,"Poupança",  i);

								 }
							 System.out.println("###########################################################");
							 System.out.println("<<CORRENTE>>");
								 for(int i = 0; i<listaCorrente.size(); i++){

							 EntradaSaida.exibirExtratoPopCorr(correnteTipoTrans, listaPoupanca,"Corrente",  i);
						 }

							  break;
					}
			   } while (escolha != 2);
			   EntradaSaida.msgEncerraPrograma();
			   System.out.println(this.conta.getSaldo());
			   System.exit(0);
		  }else{
			   EntradaSaida.msgEncerraPrograma();
			   System.exit(0);
		  }
		  
	 }
}
