package com.epam.oop_lesson1;

/**
 * @author Kseniia Ushakova
 */

//Инкапсуляция
  //Наследование
  //Полиморфизм
  //Абстракция
public class Computer {
  private Ssd ssd;
  private Ram ram;

  public Computer(Ssd ssd, Ram ram) {
    this.ssd = ssd;
    this.ram = ram;
  }

  public void load() {
    System.out.println("I am loaded!");
  }
}
