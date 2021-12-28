package com.epam.oop_lesson4;

import com.epam.oop_lesson1.Ram;
import com.epam.oop_lesson1.Ssd;

/**
 * @author Kseniia Ushakova
 */
public class Tablet extends Computer implements Printable{

  public Tablet(Ssd ssd, Ram ram) {
    super(ssd, ram);
  }

  @Override
  public void printInfo() {
    System.out.println("I am tablet pc");
  }
}
