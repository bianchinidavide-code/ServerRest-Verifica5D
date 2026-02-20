/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class DaFareService {
    
    /**
     * 
     * @param GIOCATA
     * @param NUMERO
     * @param VITTORIA
     * @return VITTORIA
     * @throws IllegalArgumentException se ...
     */
    public static Boolean logicaDiCalcolo() 
            throws IllegalArgumentException {
        
        // Controllo se i parametri passati sono validi
                if (!parametriValidi()) {
            throw new IllegalArgumentException("Operatore non può essere vuoto");
        }
        
        try {
            
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Opzione non valida. Opzione deve essere DA FARE");
        }
        return false;
    }

    // Metodo di validazione dei parametri (da implementare)
    private static boolean parametriValidi()
    {
        
        if((numero % 2)== 0){
            
        }
        
        if(giocata == "Dispari" && )
        
        
        return false;
    }
}
