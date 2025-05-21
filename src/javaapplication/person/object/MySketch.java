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
  String userInput = "";
  int stage =0;
 
  
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(255); // set the background color to white
        textSize(20);
    person = new Person(this, width/2, height/2, "Mr. Loo", 99); 
  }
  
  public void draw() {
   background(255);
    
    if (stage == 0) {
      fill(0);
      text("Enter text:", 20, 50);
      text(userInput, 20, 100);
    } else if (stage == 1) {
      person.draw();

      if (keyPressed) {
        if (keyCode == LEFT) {
          person.move(-5, 0);
        } else if (keyCode == RIGHT) {
          person.move(5, 0);
        } else if (keyCode == UP) {
          person.move(0, -5);
        } else if (keyCode == DOWN) {
          person.move(0, 5);
        }
      }

  }
}
  
  public void keyPressed() {
    if (stage == 0) {
      if (keyCode == BACKSPACE) {
        if (userInput.length() > 0) {
          userInput = userInput.substring(0, userInput.length() - 1);
        }
      } else if (keyCode == ENTER) {
        stage = 1; // Move to next stage
      } else if (key != CODED) {
        userInput += key;
      }
    }
  }

}

