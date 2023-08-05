package subclases;

import subclases.AutomovilElectricidad;
import subclases.ScooterElectrico;
import interfaces.FabricaVehiculo;
import abstractas.Automovil;
import abstractas.Scooter;

public class FabricaVehiculoElectricidad implements FabricaVehiculo{
    
    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio){
        return new AutomovilElectricidad(modelo, color, potencia, espacio);
    }
    @Override
    public Scooter creaScooter(String modelo, String color, int potencia){
        return new ScooterElectrico(modelo, color, potencia);
    }
    
    
}
