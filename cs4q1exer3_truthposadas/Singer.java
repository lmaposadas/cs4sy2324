/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4q1exer3_truthposadas;

/**
 *
 * @author marielleposadas
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private static int totalPerformances;
    private double earnings;
    private Song favoriteSong;
    public Singer(String id, int perf, double money, Song title){
        this.name = id;
        this.noOfPerformances = 0;
        this.earnings = money;
        this.favoriteSong = title;
    }
    public void performForAudience(int audience) {
        noOfPerformances++;
        earnings = audience * 100;
        totalPerformances++;
    }
    public void performForAudience(int audience, Singer svt, Singer nct) {
        noOfPerformances++;
        svt.noOfPerformances++;
        nct.noOfPerformances++;
        totalPerformances++;
        
        earnings = 100 * audience;
        svt.earnings = 100 * audience;
        nct.earnings = 100 * audience;
    }
    public void changeFavSong(Song newSong){
        this.favoriteSong = newSong;
    }
    public String getName() {
        return name;
    }
    public int getNoOfPerformances() {
        return noOfPerformances;
    }
    public double getEarnings() {
        return earnings;
    }
    public Song getFavoriteSong() {
        return favoriteSong;
    }
    public static int getTotalPerformances(){
        return totalPerformances;
    }
    public void setNoOfPerformances(){
        noOfPerformances++;
    }
    public void setEarnings(double money){
        earnings +=money;
    }
    public void setTotalPerformances(){
        totalPerformances++;
    }
}
