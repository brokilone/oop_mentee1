package com.epam.oop_lesson4;

import com.epam.oop_lesson1.Ram;
import com.epam.oop_lesson1.Ssd;


/**
 * @author Kseniia Ushakova
 */
public class InterfaceDemo {
  public static void main(String[] args) {
    Ram ram = new Ram(1024);
    Ssd ssd = new Ssd(256);
    LapTop lapTop = new LapTop(ssd, ram, 2);

    Tablet tablet = new Tablet(ssd, ram);
    Tablet tablet2 = new Tablet(ssd, ram);
    Pot pot = new Pot();

    printInfo(lapTop, tablet, tablet2, pot);

  }

  public static void printInfo(Printable... objects) {
    for (int i = 0; i < objects.length; i++) {
      objects[i].printInfo();
    }
  }
}
