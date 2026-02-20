/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteService {
    
    String giocata;
    int numero;
    static Boolean vittoria;
    
    
    /**
     * 
     * @param giocata
     * @param numero
     * @param vittoria
     * @return VITTORIA
     * @throws IllegalArgumentException se ...
     */
    public Boolean logicaDiCalcolo(String giocata, int numero) throws IllegalArgumentException {
        // Controllo se i parametri passati sono validi
                if (!parametriValidi()) {
            throw new IllegalArgumentException("Operatore non può essere vuoto");
        }
        
        try {
            
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Opzione non valida. Opzione deve essere DA FARE");
        }
        return vittoria;
    }

    // Metodo di validazione dei parametri (da implementare)
    private boolean parametriValidi()
    {
        
        if(numero == 0 || numero > 36 || numero < 0){
            
            return false;
            
        }
        
        if(numero % 2 == 0){
            
            if("Pari".equals(giocata)){
                
                
                return true;
            }else{
                
                
                return false;
            }
            
        }else{
            
            if("Dispari".equals(giocata)){
                
                
                return true;
            }else{
                
                
                return false;
            }
        }
    }

}
