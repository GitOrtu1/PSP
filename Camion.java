package p0;

public class Camion extends Vehiculo{
	
		//Constructor
		public Camion(String marca, String matricula,float Kms,float estadoDeposito){
			super(marca,matricula,Kms,estadoDeposito);
		}

		@Override
		public void llenarDeposito() {
			this.setEstadoDeposito(100);
		}
		
		@Override
		public void avanzarVehiculo(float kmsAvanzar) {
			if(kmsAvanzar>(estadoDeposito/3)) {
				Kms=Kms+(estadoDeposito/3);
				estadoDeposito=0;
				
			}else {
				Kms=Kms+kmsAvanzar;
				estadoDeposito=estadoDeposito - (kmsAvanzar/3);
				
			}
			
			
		}
}
