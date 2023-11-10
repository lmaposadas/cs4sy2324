/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4q1exer2_truthposadas;

/**
 *
 * @author marielleposadas
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    public Singer(String id, int NOP, double money, Song title){
        name = id;
        noOfPerformances = NOP;
        earnings = money;
        favoriteSong = title;
        
        System.out.println(name + " " + "\nNo of Performances: " + noOfPerformances + " " + "\nEarnings: " + earnings + " " + "\nFavorite Song: " + favoriteSong);
    }
    public void performForAudience(int audience) {
        noOfPerformances++;
        earnings = audience * 100;
        
        System.out.println(name + " " + "\nNo of Performances: " + noOfPerformances + " " + "\nEarnings: " + earnings);
    }
    public void changeFavSong(Song newSong){
        this.favoriteSong = newSong;
        
        System.out.println("Favorite Song: " + newSong);
    }
}
