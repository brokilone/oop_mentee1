package com.epam.oop_lesson2;

import com.epam.oop_lesson1.Ram;
import com.epam.oop_lesson1.Ssd;

/**
 * @author Kseniia Ushakova
 */
public class ComputerDemo {
  public static void main(String[] args) {
    Ram ram = new Ram(1024);
    Ssd ssd = new Ssd(256);
    LapTop lapTop = new LapTop(ssd, ram, 2);

    Tablet tablet = new Tablet(ssd, ram);

    lapTop.printInfo();
    tablet.printInfo();

  }
}
