package domain;
import java.util.*;

public class Catalogo {
    public static int nAutos = 3;
    public static int nScooters = 2;
    
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        FabricaVehiculo fabrica;
        Automovil[] autos = new Automovil[nAutos];
        Scooter[] scooters = new Scooter[nScooters];
        System.out.println("Desea utilizar "
        + "vehiculos electricos (1) o a gasolina (2)");
        String eleccion = reader.next();
        if(eleccion.equals(1)){
            fabrica = new FabricaVehiculoElectricidad();
        }else{
            fabrica = new FabricaVehiculoGasolina();
        }
        for(int index = 0; index < nAutos; index++)
            autos[index] = fabrica.creaAutomovil("Estandar","Amarillo", 6+index, 3.2);
        for(int index = 0; index < nScooters; index++)
            scooters[index] = fabrica.creaScooter("Clasico", "Rojo", 2+index);
        for(Automovil auto: autos)
            auto.mostrarCaracteristicas();
        for(Scooter scooter: scooters)
            scooter.mostrarCaracteristicas();
        
    
}
}
