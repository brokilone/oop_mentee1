package com.epam.oop_lesson1;

/**
 * @author Kseniia Ushakova
 */
public class ComputerDemo {
  public static void main(String[] args) {
    Ram ram = new Ram(1024);
    Ssd ssd = new Ssd(256);
    Computer computer = new Computer(ssd, ram);
    computer.load();
  }
}
