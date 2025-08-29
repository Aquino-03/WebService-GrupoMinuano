package entities;

public abstract class Usuario {
	private String login;
	private String senha;
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
		
	}
	
	public void cadastro(Usuario newUser, String login, String senha) {
		newUser.setLogin(login);
		newUser.setSenha(senha);
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
