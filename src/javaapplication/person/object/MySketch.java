/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.person.object;

/**
 *
 * @author 090464
 */
import processing.core.PApplet;

public class MySketch extends PApplet {
  private Person person; // declare a person object
 
  
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(255); // set the background color to white
    // create a person object in the center of the screen
    person = new Person(this, width/2, height/2, "Mr. Loo", 99); 
  }
  
  public void draw() {
    background(255); // clear the screen
    person.move(1, 0); // move the person to the right
    person.draw(); // draw the person on the screen
  }
}


