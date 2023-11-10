/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4q1exer2_truthposadas;

/**
 *
 * @author marielleposadas
 */
public class CS4Q1Exer2_TruthPosadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hybe ent1 = new Hybe("BigHit", 2005);
        Hybe ent2 = new Hybe("PLEDIS", 2007);
        Hybe ent3 = new Hybe("Source Music", 2009);
        ent2.chooseEnt();
        Song track1 = new Song("Shadow", 212, "K-Pop");
        Song track2 = new Song("Kidult", 192, "K-Pop");
        Singer artist1 = new Singer("SEVENTEEN", 0, 0.0, track1);
        track1.displaySongDetails();
        artist1.performForAudience(12);
        artist1.changeFavSong(track2);
        track2.displaySongDetails();
    }
    
}
