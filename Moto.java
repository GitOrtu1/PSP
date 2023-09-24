package p0;

public class Moto extends Vehiculo{
	
	//Constructor
		public Moto(String marca, String matricula,float Kms,float estadoDeposito){
			super(marca,matricula,Kms,estadoDeposito);		
		}

		@Override
		public void llenarDeposito() {
			this.setEstadoDeposito(15);
		}
		
		@Override
		public void avanzarVehiculo(float kmsAvanzar) {
			if(kmsAvanzar>estadoDeposito) {
				Kms=Kms+estadoDeposito;
				estadoDeposito=0;
				
			}else {
				Kms=Kms+kmsAvanzar;
				estadoDeposito=estadoDeposito - kmsAvanzar;
				
			}
			
			
		}
}
