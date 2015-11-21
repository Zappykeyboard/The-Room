@@ -0,0 +1,36 @@
//Created by Edoardo D'Ambrosio 2015

import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
  System.out.println("Welcome!");
in();
}

public static void in(){
  Scanner scannerstring = new Scanner(System.in);
  System.out.println("Type -start, -help or -exit");
  String risposta = scannerstring.nextLine();
 

  switch(risposta){
    default: System.out.println("Not a valid command");
    in();
    break;

    case ("-exit"): System.out.println("Goodbye!");
    break;

    case ("-start"):
     Start start= new Start();
    start.inizio();
    break;

    case ("-help"): System.out.println("Help is coming, in the meantime, try to help yourself.");
    in();
    break;
  }
}
}
