package Model;

public class Usuario implements IUsuario{
	 protected String nome;
	 protected String endereco;
	protected String cpf;
	protected int ping;
		
	 public String getEndereco() {
		  return endereco;
	 }
	 
	 public void setEndereco(String endereco) {
		  this.endereco = endereco;
	 }
	 
	 public String getNome() {
		  return nome;
	 }
	 
	 public void setNome(String nome) {
		  this.nome = nome;
	 }
	 
	 public String getCpf() {
		  return cpf;
	 }
	 
	 public void setCpf(String cpf) {
		  this.cpf = cpf;
	 }
	 
	 public int getPing() {
		  return ping;
	 }
	 
	 public void setPing(int ping) {
		  this.ping = ping;
	 }
}
