/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4q1exer2_truthposadas;

/**
 *
 * @author marielleposadas
 */
public class Song {
    String title;
    int duration;
    String genre;
    public Song(String name, int time, String type){
        title = name;
        duration = time;
        genre = type;
    }
    public void displaySongDetails() {
        System.out.println("Duration in Seconds: " + duration + " seconds " + "\nGenre: " + genre + "\n");
    }
    @Override
    public String toString() {
        return title;
    }
}
