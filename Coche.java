package p0;

public class Coche extends Vehiculo{
	
	//Constructor
	public Coche(String marca, String matricula,float Kms,float estadoDeposito){
		super(marca,matricula,Kms,estadoDeposito);
	}

	@Override
	public void llenarDeposito() {
		this.setEstadoDeposito(10);
	}
	
	@Override
	public void avanzarVehiculo(float kmsAvanzar) {
		if(kmsAvanzar>(estadoDeposito/2)) {
			Kms=Kms+(estadoDeposito/2);
			estadoDeposito=0;
			
		}else {
			Kms=Kms+kmsAvanzar;
			estadoDeposito=estadoDeposito - (kmsAvanzar/2);
			
		}
		
		
	}
	
}
