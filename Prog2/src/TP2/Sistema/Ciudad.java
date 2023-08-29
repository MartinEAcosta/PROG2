package TP2.Sistema;

public class Ciudad {

	private String nombre;
	private int habitantes;
	private int gastoPublico;
	private int imp1,imp2,imp3,imp4,imp5;
	
	public Ciudad(String nombre, int habitantes, int gastoPublico) {
	
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.gastoPublico = gastoPublico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	
	public int getGastoPublico() {
		return gastoPublico;
	}
	
	public void setGastoPublico(int gastoPublico) {
		this.gastoPublico = gastoPublico;
	}

	public int getRecaudado() {
		return (imp1+imp2+imp3+imp4+imp5);
	}

	public int getImp1() {
		return imp1;
	}

	public void setImp1(int imp1) {
		this.imp1 = imp1;
	}

	public int getImp2() {
		return imp2;
	}

	public void setImp2(int imp2) {
		this.imp2 = imp2;
	}

	public int getImp3() {
		return imp3;
	}

	public void setImp3(int imp3) {
		this.imp3 = imp3;
	}

	public int getImp4() {
		return imp4;
	}

	public void setImp4(int imp4) {
		this.imp4 = imp4;
	}

	public int getImp5() {
		return imp5;
	}

	public void setImp5(int imp5) {
		this.imp5 = imp5;
	}

}
