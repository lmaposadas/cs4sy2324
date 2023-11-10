/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storesim;

/**
 *
 * @author marielleposadas
 */
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    // Initialize itemList as a new ArrayList
    this.itemList = new ArrayList();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if (index > itemList.size()){
        System.out.println("There are " + itemList.size() + " items in the store.");
    }
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    else {
        Item i = itemList.get(index);
        earnings += i.getCost();
        
        System.out.println( "\nYou have purchased " + i.getName() + " for Php" + i.getCost() + ".");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    boolean found = false;
    // get Item from itemList and add its cost to earnings
    for(Item i:itemList) {
        if(i.getName().equals(name)) {
            this.earnings += i.getCost();
            found = true;
            System.out.println("You have purchased " + i.getName() + " for Php " + i.getCost() + ".");
        }
    }
    if(!found) {
        found = false;
        System.out.println("The store does not sell " + name + ".");
    }
    // print statement indicating the sale
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    if (!itemList.contains(i)){
        System.out.print("\n" + i.getName() + " is not available in this store." + "\n");
    }
    
    else {
    // get Item i from itemList and add its cost to earnings
    this.earnings += i.getCost();
    // print statement indicating the sale
    System.out.print("You have purchased " + i.getName() + " for Php " + i.getCost() + ".");
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for (Item i : itemList){
        if(i.getType().equals(type)){
            System.out.print(i.getName() + "\n");
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for(Item i : itemList) {
        if(i.getCost() <= maxCost){
            System.out.print(i.getName() + "\n");
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for(Item i : itemList) {
        if(i.getCost() >= minCost){
            System.out.print(i.getName() + "\n");
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(Store i : storeList) {          
        System.out.print("\nStore: " + i.getName() + "\nEarnings: " + i.getEarnings() + "\n");
    }
  }
}
