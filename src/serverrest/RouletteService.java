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

       public static boolean logicaDiCalcolo(String giocata, String numeroStr) throws IllegalArgumentException {
        
        // Controllo se i parametri passati sono validi
        if (!parametriValidi(giocata, numeroStr)) {
            throw new IllegalArgumentException("Parametri mancanti o non validi");
        }
        
        try {
            int n = Integer.parseInt(numeroStr);
            
            // Logica documento: Il numero 0 perde sempre
            if (n == 0) return false;
            
            if (giocata.equalsIgnoreCase("DISPARI")) {
                return n % 2 != 0;
            } else if (giocata.equalsIgnoreCase("PARI")) {
                return n % 2 == 0;
            } else {
                throw new Exception();
            }
            
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Opzione non valida. La giocata deve essere PARI o DISPARI");
        }
    }

    // Metodo di validazione dei parametri
    private static boolean parametriValidi(String giocata, String numero)
    {
        return giocata != null && !giocata.isEmpty() && numero != null && !numero.isEmpty();
    }
}
