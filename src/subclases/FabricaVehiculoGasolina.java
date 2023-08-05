package subclases;

import subclases.AutomovilGasolina;
import subclases.ScooterGasolina;
import interfaces.FabricaVehiculo;
import abstractas.Automovil;
import abstractas.Scooter;

public class FabricaVehiculoGasolina implements FabricaVehiculo{
    
    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio){
        return new AutomovilGasolina(modelo, color, potencia, espacio);
    }
    @Override
    public Scooter creaScooter(String modelo, String color, int potencia){
        return new ScooterGasolina(modelo, color, potencia);
    }
    
    
    
}
