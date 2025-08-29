package entities;

public class Chefe extends Usuario {
	private boolean acesso=true;

	public Chefe(boolean acesso) {
		super();
		this.acesso = acesso;
	}

	public boolean getAcesso() {
		return acesso;
	}

	public void setAcesso(boolean acesso) {
		this.acesso = acesso;
	}
	
	//public boolean 
	
	public boolean alterarSenha(String senhaPadrao, String novaSenha) {
		senhaPadrao = novaSenha;
			return true;
	}
		
	public boolean autenticar(Usuario newUser, String login, String senha) {
		if (newUser.getLogin()==login & newUser.getSenha()==senha) {
			return true;
		}
		else {
			System.out.println("Usuario ou senha incorretos.");
			return false;
		}
		//new status
	}
}
