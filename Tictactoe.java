//Tic Tac Toe
//Version
//Created by:
//Date created:
//Last update:

import hsa.*;
public class Tictactoe{
  public static void main (String[] args){
    Console con = new Console(38,174);
    char chrkey;
    String strstart = ("blah");
    String strmenu = ("blah");
    String strcredits = ("blah");
    String strhow = ("blah");
    String strcontrols = ("blah");
    String str2player = ("blah");
    String str1player = ("blah");
    String strusername1;
    String strusername2;

    while(strstart.equals ("blah")){
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("                                                                                Welcome to TIC-TAC-TOE");
      con.println("                                                                                ");
      con.println("                                                                                  Click s to start");
      chrkey = con.getChar ();
      if(chrkey == 's'){
        strstart=("start");
        con.clear();
      }else{
        con.clear();
      }
    }
    while(strmenu.equals ("blah")){
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("");
      con.println("                                                                                1player PvAI (click q)");
      con.println("                                                                                2players PvP (click w)");
      con.println("                                                                                  Controls (click e)");
      con.println("                                                                                How to play (click r)");
      con.println("                                                                              Credits and info (click t)");
      chrkey = con.getChar ();
      if (chrkey == 'q'){
        con.clear();
        
      }else if(chrkey == 'w'){
        con.clear();
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("What is you username player1?");
        strusername1=con.readLine();
        con.clear();
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("");
        con.println("What is you username player2?");
        strusername2=con.readLine();
        con.clear();
      }else if(chrkey == 'e'){
        con.clear();
        while(strcontrols.equals ("blah")){
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("                                                                                   Controls");
          con.println("                                                                            -Top right (click 9)");
          con.println("                                                                            -Top middle (click 8)");
          con.println("                                                                            -Top left (click 7)");
          con.println("                                                                            -Middle right (click 6)");
          con.println("                                                                            -Middle middle (click 5)");
          con.println("                                                                            -Middle left (click 4)");
          con.println("                                                                            -Bottom right (click 3)");
          con.println("                                                                            -Bottom middle (click 2)");
          con.println("                                                                            -Bottom left (click 1)");
          con.println("          ");
          con.println("          ");
          con.println("          ");
          con.println("          ");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("                                                                                                                               (click b to go back)");
          chrkey = con.getChar ();
          if (chrkey == 'b'){
            strcontrols=("back");
            con.clear();
          }else{
            con.clear();
          }
        }
        strcontrols=("blah");
      }else if(chrkey == 'r'){
        con.clear();
        while(strhow.equals ("blah")){
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("          -The player must choose a mode to play on first");
          con.println("          -The plater then chooses a username for themself and if thy are against a player then they'll insert there username as well");
          con.println("          -A randomizer will deside who will get to choose first");
          con.println("          -There is a three by three grid that will be drawn on the center of the screen and the user that is going will have there username writen on the top left corner");
          con.println("          -The goal is to get 3 of your shape going in a line in a row, colum, or diagonal");
          con.println("          -Who ever makes it first wins the game");
          con.println("          -The game can be tied off if both players have not reached the goal of making a line thus leading the gameboard to clear and start over");
          con.println("          -The player who goes first is normally offencive while the opponent goes defencive");
          con.println("          ");
          con.println("          ");
          con.println("          ");
          con.println("          ");
          con.println("          ");
          con.println("          ");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("                                                                                                                               (click b to go back)");
          chrkey = con.getChar ();
          if (chrkey == 'b'){
            strhow=("back");
            con.clear();
          }else{
            con.clear();
          }
        }
        strhow=("blah");
      }else if(chrkey == 't'){
        con.clear();
        while(strcredits.equals ("blah")){
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("                                                                                     TIC-TAC-TOE");
          con.println("                                                                                         ");
          con.println("                                                                                    BY:Brian Kong");
          con.println("                                                                                     Version 0.01");
          con.println("                                                                                Date created:11/04/2017");
          con.println("                                                                                Date updated:12/04/2017");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("");
          con.println("                                                                                                                               (click b to go back)");
          chrkey = con.getChar ();
          if (chrkey == 'b'){
            con.clear();
            strcredits=("back");
            con.clear();
          }else{
            con.clear();
          }
        }
      strcredits=("blah");
      }
    }
  }
  public static void pause (int intMS){
    try{
      Thread.sleep(intMS);
    }catch(InterruptedException e) {
    }
  }
}
