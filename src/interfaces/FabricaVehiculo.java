package interfaces;

import abstractas.Automovil;
import abstractas.Scooter;

public interface FabricaVehiculo {
    Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);
    Scooter creaScooter(String modelo, String color, int potencia);
    
    
}
