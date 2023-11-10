/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4q1exer2_truthposadas;

/**
 *
 * @author marielleposadas
 */
public class Hybe {
    String name;
    int date;
    public Hybe(String id, int d) {
        name = id;
        date = d;
    }
    public void chooseEnt() {
        System.out.println(name + "\nEstablished: " + date + "\n");
    }
}
