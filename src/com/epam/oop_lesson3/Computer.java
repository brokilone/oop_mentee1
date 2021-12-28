package com.epam.oop_lesson3;

import com.epam.oop_lesson1.Ram;
import com.epam.oop_lesson1.Ssd;

/**
 * @author Kseniia Ushakova
 */

//Инкапсуляция
  //Наследование
  //Полиморфизм
  //Абстракция
public abstract class Computer extends Object{
  private Ssd ssd;
  private Ram ram;


  public Computer(Ssd ssd, Ram ram) {
    this.ssd = ssd;
    this.ram = ram;
  }

  public void load() {
    System.out.println("I am loaded!");
  }

  public abstract void printInfo();
}
