package com.springmvcweb.java.sample;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import javax.swing.JFrame;

public class TestMain {

  public static void main(String[] args) throws IOException {
    // readConsole();
    openFile();
  }
  
  private static void openFile() {
    File file = new File("C:/Users/ravip/Pictures/weldon.jpg");
    if(null != file && file.isFile()){
      System.out.println("This is a file");
      if(file.canExecute()){
        System.out.println("This file can be executed");
        JFrame jf = new JFrame();
        Container container = jf.getContentPane();

        //container.add(, constraints);
      }
    }
  }

  private void readConsole() {
    System.out.println("Hello World !!");
    /*int is = System.in.read();
    System.out.println("is: "+is);
    */System.out.print("give an input: ");
    //Reader r = System.in.reader();
    //if(null != r){
      
      String str;
      Scanner scanner = new Scanner(System.in);
      while(scanner.hasNextLine()){
        str = scanner.nextLine();
        if(str.equals("quit")){
          break;
        } else if (str.trim().startsWith("add")){
          System.out.println("Add values: ");
          if(scanner.hasNext()){
            int one = Integer.parseInt(scanner.next());
            System.out.println("add what? "+one);
          }
        }
        System.out.println("line read: "+str);
      }
    //}
  }
}
