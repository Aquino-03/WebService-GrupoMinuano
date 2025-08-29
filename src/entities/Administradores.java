package entities;

public class Administradores extends Usuario {
	private boolean acesso=false;

	public Administradores(boolean acesso) {
		super();
		this.acesso = acesso;
	}

	public boolean isAcesso() {
		return acesso;
	}

	public void setAcesso(boolean acesso) {
		this.acesso = acesso;
	}
	
	public void cadastrar(Chefe newUser, String login, String senhaPadrao) {
		newUser.setLogin(login);
		newUser.setSenha(senhaPadrao);
		//Falta inserir no BD
	} 
	
	public boolean autenticar(Usuario newUser, String login, String senha) {
		if (newUser.getLogin()==login & newUser.getSenha()==senha) {
			return true;
		}
		else {
			System.out.println("Usuario ou senha incorretos.");
			return false;
		}
	}

}
