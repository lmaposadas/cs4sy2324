/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4q1exer3_truthposadas;

/**
 *
 * @author marielleposadas
 */
public class CS4Q1Exer3_TruthPosadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ent company
        Hybe ent1 = new Hybe("BigHit", 2005);
        Hybe ent2 = new Hybe("PLEDIS", 2007);
        Hybe ent3 = new Hybe("SM", 2009);
        
        // svt
        ent2.chooseEnt();
        Song track1 = new Song("Shadow", 212, "K-Pop");
        Song track2 = new Song("Kidult", 192, "K-Pop");
        Singer artist1 = new Singer("SEVENTEEN", 0, 0.0, track1);
        
        //nct
        Song track3 = new Song("Regular", 212, "K-Pop");
        Song track4 = new Song("Back 2 U", 192, "K-Pop");
        Singer artist2 = new Singer("NCT 127", 0, 0.0, track3);
                
        //output svt
        artist1.performForAudience(12);
        System.out.println(artist1.getName() + "\nFavorite Song: " + track1.getTitle());
        System.out.println("Duration in Seconds: " + track1.getDuration() + "\nGenre: " + track1.getGenre());
        System.out.println("\n" + artist1.getName() + " (UPDATED) \nNEW Favorite Song: " + track2.getTitle());
        System.out.println("Duration in Seconds: " + track2.getDuration() + "\nGenre: " + track2.getGenre());
        
        //output nct
        System.out.println("\n---- \n \n" + ent3.getName() + "\nEstablished: " + ent3.getDate());
        artist2.performForAudience(12);
        System.out.println("\n" + artist2.getName() + "\nFavorite Song: " + track3.getTitle());
        System.out.println("Duration in Seconds: " + track3.getDuration() + "\nGenre: " + track3.getGenre());
        System.out.println("\n" + artist2.getName() + " (UPDATED) \nNEW Favorite Song: " + track4.getTitle());
        System.out.println("Duration in Seconds: " + track4.getDuration() + "\nGenre: " + track4.getGenre());
        
        //performance
        artist1.performForAudience(13);
        artist2.performForAudience(20);
        System.out.println("\n---- \n \n" + "SVT No of Performances: " + artist1.getNoOfPerformances());
        System.out.println("NCT 127 No of Performances: " + artist2.getNoOfPerformances());
        System.out.println("Total Earnings: " + (artist1.getEarnings() + artist2.getEarnings()));
        System.out.println("Split of Profit: \nSVT: " + artist1.getEarnings() + "\nNCT 127: " + artist2.getEarnings());
    }
    
}
