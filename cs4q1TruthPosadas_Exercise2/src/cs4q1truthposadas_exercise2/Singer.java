/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4q1truthposadas_exercise2;

/**
 *
 * @author TRUTH
 */
public class Singer {
    String name;
    int noOfPerformances;
    int audience;
    double earnings;
    Song favoriteSong;
}
public int audience {
    
}
public void performForAudience(int audience) {
    this.noOfPerformances+=100;
}
public void changeFavSong(Song favoriteSong) {
    this.favoriteSong = favoriteSong;
}
