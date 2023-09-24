package p0;

import java.text.DecimalFormat;

public class Vehiculo {
	
	String marca;
	String matricula;
	float Kms;
	float estadoDeposito;
	
	public Vehiculo(String marca, String matricula,float Kms,float estadoDeposito){
		this.marca=marca;
		this.matricula=matricula;
		this.Kms=Kms;
		this.estadoDeposito=estadoDeposito;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getKms() {
		return Kms;
	}

	public void setKms(float kms) {
		Kms = kms;
	}

	public float getEstadoDeposito() {
		return estadoDeposito;
	}

	public void setEstadoDeposito(float estadoDeposito) {
		this.estadoDeposito = estadoDeposito;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche=new Coche("Audi","1234ABC",1000,20);
		coche.llenarDeposito();
		coche.avanzarVehiculo(25);
		
		Moto moto=new Moto("Yamaha","0202PRL",1000,4);
		moto.llenarDeposito();
		moto.avanzarVehiculo(25);
		
		Camion camion=new Camion("Mercedes","4676HAD",1000,26);
		camion.llenarDeposito();
		camion.avanzarVehiculo(25);
		
		infoVehiculo(coche,moto,camion);
		
	}
	
	public void llenarDeposito() {
	}
	
	public void avanzarVehiculo(float kmsAvanzar) {
	}
	
	public static void infoVehiculo(Coche coche,Moto moto,Camion camion) {
		
			DecimalFormat df = new DecimalFormat("0.00");
		
			System.out.println("*********************************************************************************");
			System.out.println("* PRACTICA 0 ********************************************************************");
			System.out.println("Se considera que todos los vehiculos tienen el mismo numero inicial (1000 kms) ");
			System.out.println("y un deposito lleno segun su capacidad (Coche 10 l, Moto 15 l, Camion 100 l)");
			System.out.println("Se intentan recorrer 25 kms...");
			
			System.out.println("*********************************************************************************");
			System.out.println("Coche:          "+coche.getMarca()+" con Matricula "+coche.getMatricula()) ;
			System.out.println("Kilometros: 	"+df.format(coche.getKms()) +" Kms") ;
			System.out.println("Deposito total: "+df.format(coche.getEstadoDeposito()) +" l.") ;
			System.out.println("*********************************************************************************");
	
			System.out.println("*********************************************************************************");
			System.out.println("Moto: 	        "+moto.getMarca()+" con Matricula "+moto.getMatricula()) ;
			System.out.println("Kilometros: 	"+df.format(moto.getKms()) +" Kms") ;
			System.out.println("Deposito total: "+df.format(moto.getEstadoDeposito()) +" l.") ;
			System.out.println("*********************************************************************************");

			System.out.println("*********************************************************************************");
			System.out.println("Camion:         "+camion.getMarca()+" con Matricula "+camion.getMatricula()) ;
			System.out.println("Kilometros: 	"+df.format(camion.getKms()) +" Kms") ;
			System.out.println("Deposito total: "+df.format(camion.getEstadoDeposito()) +" l.") ;
			System.out.println("*********************************************************************************");
	}
}
