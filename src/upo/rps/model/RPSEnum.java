package upo.rps.model;

/**
 * Created by austepha on 14/09/2015.
 * Defines the 3 moves of Paper-Rock-Scissors game.
 */
public enum RPSEnum {

    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors)");

    private final String nom;

    RPSEnum(String nom){
        this.nom=nom;
    }

    public String getNom(){
        return nom;
    }
}
