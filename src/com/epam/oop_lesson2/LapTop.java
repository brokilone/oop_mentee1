package com.epam.oop_lesson2;

import com.epam.oop_lesson1.Ram;
import com.epam.oop_lesson1.Ssd;

/**
 * @author Kseniia Ushakova
 */
public class LapTop extends Computer{
  private int weight;

  public LapTop(Ssd ssd, Ram ram, int weight) {
    super(ssd, ram);
    this.weight = weight;
  }

  public void open() {
    System.out.println("i am opened!");
  }

  public int getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return "LapTop{" +
        "weight=" + weight +
        '}';
  }

  @Override
  public void printInfo() {
    System.out.println("I am laptop");
  }
}
