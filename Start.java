@@ -0,0 +1,148 @@
//Created by Edoardo D'Ambrosio 2015

import java.util.Scanner;

public class Start{

private static boolean hasRead=false;
private static boolean hasKey=false;
private static boolean safeIsOpen=false;
private static Scanner sc = new Scanner(System.in);


public static void inizio(){
  System.out.println("You are in a room. There is a note on a candle-lit table,\na safe on the wall\nand a door behind you.");
lookAraound();

}

public static void lookAraound(){
  
  System.out.println("What do you do?\nUse -look to look around or -look at + the item you want to look at.\nYou may also type -exit to quit now.");

  String s = sc.nextLine();


switch (s){
  default: System.out.println("Please use a valid command.");
  lookAraound();
  break;

  case ("-exit"): System.out.println("Goodbye!");
  break;

  case ("-look"): System.out.println("It's a small, cramped study room. There are faded photos on the walls,\n and an old chair in the middle.");
  System.out.println("What now?");
  lookAraound();
  break;

  case ("-look at table"): System.out.println("On the table, there is a blank note, a lit candle, and some dust. On closer inspection, the table has two drawers.");
  drawer();
  break;

  case ("-look at note"): if (hasRead==false){
    System.out.println("The note is blank. Just a white piece of paper");
    lookAraound();
  }
  else note();
  break;

case ("-look at safe"): if(safeIsOpen==true){System.out.println("The safe is now empty");
lookAraound();
} else {System.out.println("There is a number pad on the safe.");
safe();
}
break;

case("-look at door"): if(hasKey==true){
  System.out.println("You use the key to open the door, sweet freedom!\nYOU WIN!");
  exit();
}
else{
  System.out.println("A wooden door. It's closed, but maybe there is a key around here...");
lookAraound();
}break;

}
  }

public static void safe(){

  System.out.println("Enter the code or type -back to go back.");
  String s=sc.nextLine();



switch (s){
  default: System.out.println("Please use a valid command.");
  safe();
  break;

  case("-back"): lookAraound();
  break;

  case("534623"): 
  safeIsOpen=true;
  hasKey=true;
  System.out.println("The safe opens, there is a key inside.");
  lookAraound();
  break;

}
}

public static void drawer(){
  System.out.println("Which one do you open?Type -left or -right to open a drawer, or -back to go back.");

  String s = sc.nextLine();

  switch(s){
    default: System.out.println("Please use a valid command.");
    drawer();
    break;
    case("-left"): System.out.println("There is a note: '534623', on the back: 'use the light' ");
    hasRead=true;
    drawer();
    case("-right"): System.out.println("Looks like there's just a family of spiders inside.");
    drawer();
    break;
    case("-back"): lookAraound();
    break;
  }
}

public static void note(){
  System.out.println("The note is blank, but maybe you can use the candle? Type -combine to use the candle with the note, or -back to go back.");

  String s = sc.nextLine();

  switch(s){
    default: System.out.println("Please use a valid command.");
    note();
    break;
    case ("-back"): lookAraound();
    break;
    case("-combine"): System.out.println("You see some letters apearing on the note:\nD\nI\nC\nK\nB\nU\nT\nT.\nYou feel enlightened.");
    lookAraound();
    break;
  }
}

public static void exit(){
  System.out.println("Type -exit to quit or -restart to start again");
  
  String s= sc.nextLine();
  switch(s){
  default: System.out.println("Please use a valid command.");
  exit();
  break;

  case ("-exit"): System.out.println("Goodbye!");
  break;

  case("-restart"): Main.in();
  break;
}
}

}
