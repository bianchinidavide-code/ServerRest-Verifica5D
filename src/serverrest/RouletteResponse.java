/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteResponse {
    
    private String giocata;
    private String numero;
    private Boolean vittoria;

    
    // Costruttore vuoto necessario per GSON
    public RouletteResponse() {
    }
    
    // Costruttore con parametri
    public RouletteResponse(String giocata, String numero, Boolean vittoria) {
        
        this.giocata = "";
        this.numero = "";
        this.vittoria = false;
    }
    
    // Getter
    public String getGiocata() {
        return giocata;
    }

    public String getNumero() {
        return numero;
    }

    public Boolean getVittoria() {
        return vittoria;
    }
    
    // Setter
    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setVittoria(Boolean vittoria) {
        this.vittoria = vittoria;
    }

    @Override
    public String toString() {
        return "RouletteResponse{" + "giocata=" + giocata + ", numero=" + numero + ", vittoria=" + vittoria + '}';
    }
    
    
}