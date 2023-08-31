package TP2.Establecimiento;

public class Usuario {

	private String username;
	private String password;
	private boolean socio;
	private int vecesalq;
	
	private static final int serSocio = 4;
	
	public Usuario(String username, String password) {
		this.username = username;
		this.password = password;
		this.vecesalq = 0;
		this.socio = false;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isSocio() {
		if(vecesalq >= serSocio) {
			vecesalq++;
			return true;
		}
		else {
			vecesalq++;
			return false;
		}
	}
	
	public void setSocio(boolean socio) {
		this.socio = socio;
	}

	public int getVecesalq() {
		return vecesalq;
	}

	public void setVecesalq(int vecesalq) {
		this.vecesalq = vecesalq;
	}
}
