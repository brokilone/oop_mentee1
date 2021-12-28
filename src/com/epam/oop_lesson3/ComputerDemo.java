package com.epam.oop_lesson3;

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
    Tablet tablet2 = new Tablet(ssd, ram);

    printComputerInfo(lapTop, tablet, tablet2);

    Computer tablet3 = new Tablet(ssd, ram);

  }

  public static void  printComputerInfo(Computer computer) {
    computer.printInfo();
  }

  public static void printComputerInfo(Computer... computers) {
    for (int i = 0; i < computers.length; i++) {
      computers[i].printInfo();
      //если это ноутбук, то вызвать метод open()
      if (computers[i] instanceof LapTop) {
        LapTop lapTop = (LapTop) computers[i];
        lapTop.open();
      }
    }
  }
}
