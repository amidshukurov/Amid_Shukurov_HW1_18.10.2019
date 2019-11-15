package step.controller;

import classroom.WarmUP_07_11_2019.Pairs;
import classroom._14_11_19_LinkedLIst.LinkedList;
import step.Console;
import step.SystemConsole;
import step.entity.TimetableLine;
import step.io.Command;
import step.io.Parser;
import sun.security.krb5.internal.PAData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookingController {
  public void add() {
    /*The user is prompted to enter the following information:
    destination, date, number of people (how many tickets to buy).
    After that, the program must search for flights that meet the specified conditions
    (there must be enough seats for all passengers). All found flights should be displayed on the screen.
    After that, the user can choose one of the found flights by specifying its serial number or
    return to the main menu (selecting item 0). If the user decides to book a flight,
    he will need to enter the names and surnames of all passengers.
*/
    Console console = new SystemConsole();
   // Parser parser = new Parser();

    List<TimetableLine> flight = new ArrayList<>();
    boolean cont = true;
    while (cont){
      System.out.println("Enter Source City:");
      String src = console.readLn();
      System.out.println("Enter Destination City:");
      String dest = console.readLn();
      System.out.println("Enter time");
      String time = console.readLn();
    }

  }

  public void remove() {

  }

  public void show() {

  }

  public void showMyFlight() {

  }
}
