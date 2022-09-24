package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public  static int leones;
	private Boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero,Boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.patas = patas;
		this.pelaje = pelaje;
	}
	public Mamifero() {}
	
	public static int cantidadMamiferos() {
		return Mamifero.listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		Animal.setTotalAnimales();
		listado.add(caballo);
		return caballo;
	}
	public static Mamifero crearLeones(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero,true, 4);
		Mamifero.listado.add(leon);
		leones++;
		Animal.setTotalAnimales();
		return leon;
	}
	public Boolean getPelaje() {
		return pelaje;
	}
	public void setPelaje(Boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public static ArrayList<Mamifero> getListado() {
		return Mamifero.listado;
	}
	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	
	
}
