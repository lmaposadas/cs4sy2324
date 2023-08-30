/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4truthposadas;

/**
 *
 * @author TRUTH
 */
public class Cs4TruthPosadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String group1 = "\nSEVENTEEN";
        int debut1 = 2015;
        int member1 = 13;
        String ent1 = "PLEDIS";
        String group2 = "\nNCT 127";
        int debut2 = 2016;
        int member2 = 10;
        String ent2 = "SM";
        String group3 = "\nMONSTA X";
        int debut3 = 2015;
        int member3 = 6;
        String ent3 = "Starship";
        int totalmembers = member1 + member2 + member3;
        int diff = member1 - member3;
        String ans1 = "null";
        String ans2 = "null";
    
    System.out.println(group1 + "\nNo. of members: " + member1 + "\nEntertainment Company: " + ent1 + "\nYear of Debut: " + debut1); 
    System.out.println(group2 + "\nNo. of members: " + member2 + "\nEntertainment Company: " + ent2 + "\nYear of Debut: " + debut2);
    System.out.println(group3 + "\nNo. of members: " + member3 + "\nEntertainment Company: " + ent3 + "\nYear of Debut: " + debut3);

    System.out.println("\nTotal number of members: " + totalmembers);

    if (debut1 < debut2 || debut3 < debut2) {
      ans1 = "true"; }
    else {
      ans1 = "false"; }
    System.out.println("NCT 127 debuted later than SEVENTEEN and MONSTA X: " + ans1);
    
    if (ent1 == ent2) {
      ans2 = "true"; }
    else {
      ans2 = "false"; }
        
    System.out.println("SEVENTEEN and NCT 127 come from the same entertainment company: " + ans2);

    System.out.println("Difference between the number of MONSTA X and SEVENTEEN members: " + diff);
    }
    
}
