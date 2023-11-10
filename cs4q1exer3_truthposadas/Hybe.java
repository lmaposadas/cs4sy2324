/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4q1exer3_truthposadas;

/**
 *
 * @author marielleposadas
 */
public class Hybe {
    String name;
    int date;
    public Hybe(String id, int d) {
        this.name = id;
        this.date = d;
    }
    public String getName() {
        return name;
    }    
    public int getDate() {
        return date;
    }
    public void chooseEnt() {
        System.out.println(name + "\nEstablished: " + date + "\n");
    }
}
