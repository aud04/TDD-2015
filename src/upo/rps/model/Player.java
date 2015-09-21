package upo.rps.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by austepha on 21/09/2015.
 * Cette classe sert à réaliser une session de jeu.
 */
public class Player {

    private String nomJoueur;
    private int score = 0;
    List<RPSEnum> sessionJeu;
    Iterator<RPSEnum> mouv;

    public Player (String nomJoueur, int score,List<RPSEnum> sessionJeu ){
        this.nomJoueur = nomJoueur;
        this.score = score;
        this.sessionJeu=sessionJeu;
        mouv=sessionJeu.iterator();
    }

    public Player (String nomJoueur){
        this.nomJoueur = nomJoueur;
        sessionJeu = new ArrayList<RPSEnum>(20);
        mouv=sessionJeu.iterator();

        for (int i=0; i<sessionJeu.size(); i++){
            int lower = 0;
            int higher = 2;

            int random = (int)(Math.random() * (higher-lower)) + lower;
           switch (random){
               case 0 : sessionJeu.add(RPSEnum.ROCK);
                   break;
               case 1 : sessionJeu.add(RPSEnum.PAPER);
                   break;
               case 2 : sessionJeu.add(RPSEnum.SCISSORS);
                   break;


           }
        }
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNbMouvement(){
        return this.sessionJeu.size();
    }

    public RPSEnum getNextMove() {

        if (mouv.hasNext()) {
            return mouv.next();
        }
        return null;
    }
}
