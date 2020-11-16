/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.rabbit;

/**
 *
 * @author
 * NAMA  : Rachman ALdiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi class Animal
 * 
 */

public class Animal {
   protected boolean vegetarian;
   protected String eats;
   protected int noOfLegs;
   
   Animal(boolean vegetarian,String food,int legs) {
       this.vegetarian = vegetarian;
       this.eats = food;
       this.noOfLegs = legs;
   }
   
  public boolean isVegetarian() {
      return vegetarian = false;
  }

  public String getEats() {
    return eats = "grass";
  }

  public int getNoOfLegs() {
    return noOfLegs = 4;
  }
}