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

public class Person {
  private int x, y; // position of the person
  private String name; // name of the person
  private int age; // age of the person
  private PApplet app; //the canvas used to display graphical elements
  public Person(PApplet p, int x, int y, String name, int age) {
    this.app = p;
    this.x = x;
    this.y = y;
    this.name = name;
    this.age = age;
  }
  
  public void move(int dx, int dy) {
    x += dx;
    y += dy;
  }
  
  public void draw() {
    app.fill(255, 255, 0); // set the fill color to red
    app.ellipse(x, y, 50, 50); // draw a circle at the person's position
  }
}


