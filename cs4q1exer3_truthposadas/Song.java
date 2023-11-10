/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4q1exer3_truthposadas;

/**
 *
 * @author marielleposadas
 */
public class Song {
    String title;
    int duration;
    String genre;
    public Song(String name, int time, String type){
        this.title = name;
        this.duration = time;
        this.genre = type;
    }
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public String getGenre() {
        return genre;
    }
    public void displaySongDetails() {
        System.out.println("Duration in Seconds: " + duration + " seconds " + "\nGenre: " + genre + "\n");
    }
    @Override
    public String toString() {
        return title;
    }
}
