
package com.mycompany.proyecto_final;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import javax.persistence.*;


public class Vehiculo { 
    
     private String placaVehiculo;
     private String tipoVehiculo;
     private LocalDateTime horaIngreso;
     private LocalDateTime horaSalida;
     
    
    
    public long calcularTiempoEstancia(){
        
        long tiempoTotal = horaSalida.toEpochSecond(ZoneOffset.UTC) - horaIngreso.toEpochSecond(ZoneOffset.UTC);
        return tiempoTotal;
    }
       public void calcularCosto(){
        
        long costoParticular = getTarifa * tiempoTotal;

    
    }
}
