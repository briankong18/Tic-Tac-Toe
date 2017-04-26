//Tic Tac Toe
//Version 1
//Created by: Brian Konng
//Date created: 11/04/2017
//Last update: 25/04/2017

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
    String strusername;
    String strusername1;
    String strusername2;
    String strcheatcode = ("blah");
    int intrandturn = 0;
    int intrandai = 0;
    char chrkey1;
    char chrkey2;
    char chrkey3;
    int intchecklight7 = 0;
    int intchecklight8 = 0;
    int intchecklight9 = 0;
    int intchecklight4 = 0;
    int intchecklight5 = 0;
    int intchecklight6 = 0;
    int intchecklight1 = 0;
    int intchecklight2 = 0;
    int intchecklight3 = 0;
    String strplayer1check = ("blah");
    String strplayer2check = ("blah");
    String strplayercheck = ("blah");
    String straicheck = ("blah");
    String str2playergameloop1 = ("blah");
    String str2playergameloop2 = ("blah");
    String str1playergameloop1 = ("blah");
    String str1playergameloop2 = ("blah");
    int intscorep1 = 0;
    int intscorep2 = 0;
    int intscorep = 0;
    int intscoreai = 0;
    String strrestartgame2p = ("restart");
    String strrestartgame2ploop = ("blah");
    String strrestartgame1p = ("restart");
    String strrestartgame1ploop = ("blah");
    
    
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
        strrestartgame1ploop= ("blah");
        strrestartgame1p = ("restart");
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
        con.println("What is you username player? (your o)");
        strusername=con.readLine();
        while (strrestartgame1p.equals("restart")){
          strrestartgame1ploop= ("blah");
          strrestartgame1p = ("restart");
          con.clear();
          intrandturn = (int) (Math.random()*2+1);
          if (intrandturn == 1){
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
            con.println("                                                                        "+strusername+"'s turn (your o)");
            pause(2000);
            
            
            
            con.clear();
            con.println("Turn "+strusername+"  O");
            con.drawLine(400,290,1000,290);
            con.drawLine(400,490,1000,490);
            con.drawLine(600,90,600,690);
            con.drawLine(800,90,800,690);
            chrkey3 = con.getChar ();
            while (str1playergameloop1.equals("blah")){
              while (strplayercheck.equals("blah")){
                if (chrkey3 == '7'){
                  if (intchecklight7 == 0){
                    intchecklight7 = 1;
                    strplayercheck = ("exit");
                  }else{
                    chrkey3 = con.getChar ();
                  }
                  
                }else if (chrkey3 == '8'){
                  if (intchecklight8 == 0){
                    intchecklight8 = 1;
                    strplayercheck = ("exit");
                  }else{
                    chrkey3 = con.getChar ();
                  }
                  
                }else if (chrkey3 == '9'){
                  if (intchecklight9 == 0){
                    intchecklight9 = 1;
                    strplayercheck = ("exit");
                  }else{
                    chrkey3 = con.getChar ();
                  }
                  
                }else if (chrkey3 == '4'){
                  if (intchecklight4 == 0){
                    intchecklight4 = 1;
                    strplayercheck = ("exit");
                  }else{
                    chrkey3 = con.getChar ();
                  }
                  
                }else if (chrkey3 == '5'){
                  if (intchecklight5 == 0){
                    intchecklight5 = 1;
                    strplayercheck = ("exit");
                  }else{
                    chrkey3 = con.getChar ();
                  }
                  
                }else if (chrkey3 == '6'){
                  if (intchecklight6 == 0){
                    intchecklight6 = 1;
                    strplayercheck = ("exit");
                  }else{
                    chrkey3 = con.getChar ();
                  }
                  
                }else if (chrkey3 == '1'){
                  if (intchecklight1 == 0){
                    intchecklight1 = 1;
                    strplayercheck = ("exit");
                  }else{
                    chrkey3 = con.getChar ();
                  }
                  
                }else if (chrkey3 == '2'){
                  if (intchecklight2 == 0){
                    intchecklight2 = 1;
                    strplayercheck = ("exit");
                  }else{
                    chrkey3 = con.getChar ();
                  }
                  
                }else if (chrkey3 == '3'){
                  if (intchecklight3== 0){
                    intchecklight3 = 1;
                    strplayercheck = ("exit");
                  }else{
                    chrkey3 = con.getChar ();
                  }
                }
              }
              strplayercheck= ("blah");
              
              con.clear();
              con.println("Turn AI  X");
              con.drawLine(400,290,1000,290);
              con.drawLine(400,490,1000,490);
              con.drawLine(600,90,600,690);
              con.drawLine(800,90,800,690);
              
              if (intchecklight7 == 1){
                con.drawOval(425,115,150,150);
              }
              if (intchecklight8 == 1){
                con.drawOval(625,115,150,150);
              } 
              if (intchecklight9 == 1){
                con.drawOval(825,115,150,150);
              }
              if (intchecklight4 == 1){
                con.drawOval(425,315,150,150);
              }
              if (intchecklight5 == 1){
                con.drawOval(625,315,150,150);
              }
              if (intchecklight6 == 1){
                con.drawOval(825,315,150,150);
              }
              if (intchecklight1 == 1){
                con.drawOval(425,515,150,150);
              }
              if (intchecklight2 == 1){
                con.drawOval(625,515,150,150);
              }
              if (intchecklight3 == 1){
                con.drawOval(825,515,150,150);
              }
              
              
              
              if (intchecklight7 == 2){
                con.drawLine(425,115,575,265);
                con.drawLine(575,115,425,265);
              }
              if (intchecklight8 == 2){
                con.drawLine(625,115,775,265);
                con.drawLine(775,115,625,265);
              } 
              if (intchecklight9 == 2){
                con.drawLine(825,115,975,265);
                con.drawLine(975,115,825,265);
              }
              if (intchecklight4 == 2){
                con.drawLine(425,315,575,465);
                con.drawLine(575,315,425,465);
              }
              if (intchecklight5 == 2){
                con.drawLine(625,315,775,465);
                con.drawLine(775,315,625,465);
              }
              if (intchecklight6 == 2){
                con.drawLine(825,315,975,465);
                con.drawLine(975,315,825,465);
              }
              if (intchecklight1 == 2){
                con.drawLine(425,515,575,665);
                con.drawLine(575,515,425,665);
              }
              if (intchecklight2 == 2){
                con.drawLine(625,515,775,665);
                con.drawLine(775,515,625,665);
              }
              if (intchecklight3 == 2){
                con.drawLine(825,515,975,665);
                con.drawLine(975,515,825,665);
              }
              
              
              
              if (intchecklight7 == 1&& intchecklight8 == 1 &&intchecklight9 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop1=("end game");
              }else if (intchecklight4 == 1&& intchecklight5 == 1 &&intchecklight6 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop1=("end game");
              }else if (intchecklight1 == 1&& intchecklight2 == 1 &&intchecklight3 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop1=("end game");
              }else if (intchecklight7 == 1&& intchecklight4 == 1 &&intchecklight1 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop1=("end game");
              }else if (intchecklight8 == 1&& intchecklight5 == 1 &&intchecklight2 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop1=("end game");
              }else if (intchecklight9 == 1&& intchecklight6 == 1 &&intchecklight3 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop1=("end game");
              }else if (intchecklight7 == 1&& intchecklight5 == 1 &&intchecklight3 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop1=("end game");
              }else if (intchecklight9 == 1&& intchecklight5 == 1 &&intchecklight1 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop1=("end game");
              }else if (intchecklight7 == 2&& intchecklight8 == 2 &&intchecklight9 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop1=("end game");
              }else if (intchecklight4 == 2&& intchecklight5 == 2 &&intchecklight6 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop1=("end game");
              }else if (intchecklight1 == 2&& intchecklight2 == 2 &&intchecklight3 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop1=("end game");
              }else if (intchecklight7 == 2&& intchecklight4 == 2 &&intchecklight1 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop1=("end game");
              }else if (intchecklight8 == 2&& intchecklight5 == 2 &&intchecklight2 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop1=("end game");
              }else if (intchecklight9 == 2&& intchecklight6 == 2 &&intchecklight3 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop1=("end game");
              }else if (intchecklight7 == 2&& intchecklight5 == 2 &&intchecklight3 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop1=("end game");
              }else if (intchecklight9 == 2&& intchecklight5 == 2 &&intchecklight1 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop1=("end game");
              }else if (intchecklight7 != 0&& intchecklight8 != 0 &&intchecklight9 != 0&&intchecklight4 != 0&& intchecklight5 != 0 &&intchecklight6 != 0&&intchecklight1 != 0&& intchecklight2 != 0 &&intchecklight3 != 0){
                pause(5000);
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
                con.println("                                                                                    Tie");
                str1playergameloop1=("end game");
              }else{
                
                
                
                
                intrandai = (int) (Math.random()*9+1);
                
                
                while (straicheck.equals("blah")){
                  if (intrandai == 7){
                    if (intchecklight7 == 0){
                      intchecklight7 = 2;
                      straicheck = ("exit");
                    }else{
                      intrandai = (int) (Math.random()*9+1);
                    }
                    
                  }else if (intrandai == 8){
                    if (intchecklight8 == 0){
                      intchecklight8 = 2;
                      straicheck = ("exit");
                    }else{
                      intrandai = (int) (Math.random()*9+1);
                    }
                    
                  }else if (intrandai == 9){
                    if (intchecklight9 == 0){
                      intchecklight9 = 2;
                      straicheck = ("exit");
                    }else{
                      intrandai = (int) (Math.random()*9+1);
                    }
                    
                  }else if (intrandai == 4){
                    if (intchecklight4 == 0){
                      intchecklight4 = 2;
                      straicheck = ("exit");
                    }else{
                      intrandai = (int) (Math.random()*9+1);
                    }
                    
                  }else if (intrandai == 5){
                    if (intchecklight5 == 0){
                      intchecklight5 = 2;
                      straicheck = ("exit");
                    }else{
                      intrandai = (int) (Math.random()*9+1);
                    }
                    
                  }else if (intrandai == 6){
                    if (intchecklight6 == 0){
                      intchecklight6 = 2;
                      straicheck = ("exit");
                    }else{
                      intrandai = (int) (Math.random()*9+1);
                    }
                    
                  }else if (intrandai == 1){
                    if (intchecklight1 == 0){
                      intchecklight1 = 2;
                      straicheck = ("exit");
                    }else{
                      intrandai = (int) (Math.random()*9+1);
                    }
                    
                  }else if (intrandai == 2){
                    if (intchecklight2 == 0){
                      intchecklight2 = 2;
                      straicheck = ("exit");
                    }else{
                      intrandai = (int) (Math.random()*9+1);
                    }
                    
                  }else if (intrandai == 3){
                    if (intchecklight3== 0){
                      intchecklight3 = 2;
                      straicheck = ("exit");
                    }else{
                      intrandai = (int) (Math.random()*9+1);
                    }
                  }
                }
                straicheck= ("blah");
                
                con.clear();
                con.println("Turn "+strusername+"  O");
                con.drawLine(400,290,1000,290);
                con.drawLine(400,490,1000,490);
                con.drawLine(600,90,600,690);
                con.drawLine(800,90,800,690);
                
                if (intchecklight7 == 1){
                  con.drawOval(425,115,150,150);
                }
                if (intchecklight8 == 1){
                  con.drawOval(625,115,150,150);
                } 
                if (intchecklight9 == 1){
                  con.drawOval(825,115,150,150);
                }
                if (intchecklight4 == 1){
                  con.drawOval(425,315,150,150);
                }
                if (intchecklight5 == 1){
                  con.drawOval(625,315,150,150);
                }
                if (intchecklight6 == 1){
                  con.drawOval(825,315,150,150);
                }
                if (intchecklight1 == 1){
                  con.drawOval(425,515,150,150);  
                }
                if (intchecklight2 == 1){
                  con.drawOval(625,515,150,150);
                }
                if (intchecklight3 == 1){
                  con.drawOval(825,515,150,150);
                }
                
                
                
                if (intchecklight7 == 2){
                  con.drawLine(425,115,575,265);
                  con.drawLine(575,115,425,265);
                }
                if (intchecklight8 == 2){
                  con.drawLine(625,115,775,265);
                  con.drawLine(775,115,625,265);
                } 
                if (intchecklight9 == 2){
                  con.drawLine(825,115,975,265);
                  con.drawLine(975,115,825,265);
                }
                if (intchecklight4 == 2){
                  con.drawLine(425,315,575,465);
                  con.drawLine(575,315,425,465);
                }
                if (intchecklight5 == 2){
                  con.drawLine(625,315,775,465);
                  con.drawLine(775,315,625,465);
                }
                if (intchecklight6 == 2){
                  con.drawLine(825,315,975,465);
                  con.drawLine(975,315,825,465);
                }
                if (intchecklight1 == 2){
                  con.drawLine(425,515,575,665);
                  con.drawLine(575,515,425,665);
                }
                if (intchecklight2 == 2){
                  con.drawLine(625,515,775,665);
                  con.drawLine(775,515,625,665);
                }
                if (intchecklight3 == 2){
                  con.drawLine(825,515,975,665);
                  con.drawLine(975,515,825,665);
                }
                
                
                
                
                if (intchecklight7 == 1&& intchecklight8 == 1 &&intchecklight9 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop1=("end game");
                }else if (intchecklight4 == 1&& intchecklight5 == 1 &&intchecklight6 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop1=("end game");
                }else if (intchecklight1 == 1&& intchecklight2 == 1 &&intchecklight3 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop1=("end game");
                }else if (intchecklight7 == 1&& intchecklight4 == 1 &&intchecklight1 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop1=("end game");
                }else if (intchecklight8 == 1&& intchecklight5 == 1 &&intchecklight2 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop1=("end game");
                }else if (intchecklight9 == 1&& intchecklight6 == 1 &&intchecklight3 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop1=("end game");
                }else if (intchecklight7 == 1&& intchecklight5 == 1 &&intchecklight3 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop1=("end game");
                }else if (intchecklight9 == 1&& intchecklight5 == 1 &&intchecklight1 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop1=("end game");
                }else if (intchecklight7 == 2&& intchecklight8 == 2 &&intchecklight9 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop1=("end game");
                }else if (intchecklight4 == 2&& intchecklight5 == 2 &&intchecklight6 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop1=("end game");
                }else if (intchecklight1 == 2&& intchecklight2 == 2 &&intchecklight3 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop1=("end game");
                }else if (intchecklight7 == 2&& intchecklight4 == 2 &&intchecklight1 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop1=("end game");
                }else if (intchecklight8 == 2&& intchecklight5 == 2 &&intchecklight2 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop1=("end game");
                }else if (intchecklight9 == 2&& intchecklight6 == 2 &&intchecklight3 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop1=("end game");
                }else if (intchecklight7 == 2&& intchecklight5 == 2 &&intchecklight3 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop1=("end game");
                }else if (intchecklight9 == 2&& intchecklight5 == 2 &&intchecklight1 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop1=("end game");
                }else if (intchecklight7 != 0&& intchecklight8 != 0 &&intchecklight9 != 0&&intchecklight4 != 0&& intchecklight5 != 0 &&intchecklight6 != 0&&intchecklight1 != 0&& intchecklight2 != 0 &&intchecklight3 != 0){
                  pause(5000);
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
                  con.println("                                                                                    Tie");
                  str1playergameloop1=("end game");
                }else{
                  chrkey3 = con.getChar ();
                }
              }
            }
          }else if(intrandturn == 2){
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
            con.println("                                                                               AI's turn (your x)");
            pause(2000);
            con.clear();
            con.println("Turn AI  X");
            con.drawLine(400,290,1000,290);
            con.drawLine(400,490,1000,490);
            con.drawLine(600,90,600,690); 
            con.drawLine(800,90,800,690);
            intrandai = (int) (Math.random()*9+1);
            
            while (str1playergameloop2.equals("blah")){
              while (straicheck.equals("blah")){
                if (intrandai == 7){
                  if (intchecklight7 == 0){
                    intchecklight7 = 2;
                    straicheck = ("exit");
                  }else{
                    intrandai = (int) (Math.random()*9+1);
                  }
                  
                }else if (intrandai == 8){
                  if (intchecklight8 == 0){
                    intchecklight8 = 2;
                    straicheck = ("exit");
                  }else{
                    intrandai = (int) (Math.random()*9+1);
                  }
                  
                }else if (intrandai == 9){
                  if (intchecklight9 == 0){
                    intchecklight9 = 2;
                    straicheck = ("exit");
                  }else{
                    intrandai = (int) (Math.random()*9+1);
                  }
                  
                }else if (intrandai == 4){
                  if (intchecklight4 == 0){
                    intchecklight4 = 2;
                    straicheck = ("exit");
                  }else{
                    intrandai = (int) (Math.random()*9+1);
                  }
                  
                }else if (intrandai == 5){
                  if (intchecklight5 == 0){
                    intchecklight5 = 2;
                    straicheck = ("exit");
                  }else{
                    intrandai = (int) (Math.random()*9+1);
                  }
                  
                }else if (intrandai == 6){
                  if (intchecklight6 == 0){
                    intchecklight6 = 2;
                    straicheck = ("exit");
                  }else{
                    intrandai = (int) (Math.random()*9+1);
                  }
                  
                }else if (intrandai == 1){
                  if (intchecklight1 == 0){
                    intchecklight1 = 2;
                    straicheck = ("exit");
                  }else{
                    intrandai = (int) (Math.random()*9+1);
                  }
                  
                }else if (intrandai == 2){
                  if (intchecklight2 == 0){
                    intchecklight2 = 2;
                    straicheck = ("exit");
                  }else{
                    intrandai = (int) (Math.random()*9+1);
                  }
                  
                }else if (intrandai == 3){
                  if (intchecklight3== 0){
                    intchecklight3 = 2;
                    straicheck = ("exit");
                  }else{
                    intrandai = (int) (Math.random()*9+1);
                  }
                }
              }
              straicheck= ("blah");
              
              con.clear();
              con.println("Turn "+strusername+"  O");
              con.drawLine(400,290,1000,290);
              con.drawLine(400,490,1000,490);
              con.drawLine(600,90,600,690);
              con.drawLine(800,90,800,690);
              
              if (intchecklight7 == 1){
                con.drawOval(425,115,150,150);
              }
              if (intchecklight8 == 1){
                con.drawOval(625,115,150,150);
              } 
              if (intchecklight9 == 1){
                con.drawOval(825,115,150,150);
              }
              if (intchecklight4 == 1){
                con.drawOval(425,315,150,150);
              }
              if (intchecklight5 == 1){
                con.drawOval(625,315,150,150);
              }
              if (intchecklight6 == 1){
                con.drawOval(825,315,150,150);
              }
              if (intchecklight1 == 1){
                con.drawOval(425,515,150,150);
              }
              if (intchecklight2 == 1){
                con.drawOval(625,515,150,150);
              }
              if (intchecklight3 == 1){
                con.drawOval(825,515,150,150);
              }
              
              
              
              if (intchecklight7 == 2){
                con.drawLine(425,115,575,265);
                con.drawLine(575,115,425,265);
              }
              if (intchecklight8 == 2){
                con.drawLine(625,115,775,265);
                con.drawLine(775,115,625,265);
              } 
              if (intchecklight9 == 2){
                con.drawLine(825,115,975,265);
                con.drawLine(975,115,825,265);
              }
              if (intchecklight4 == 2){
                con.drawLine(425,315,575,465);
                con.drawLine(575,315,425,465);
              }
              if (intchecklight5 == 2){
                con.drawLine(625,315,775,465);
                con.drawLine(775,315,625,465);
              }
              if (intchecklight6 == 2){
                con.drawLine(825,315,975,465);
                con.drawLine(975,315,825,465);
              }
              if (intchecklight1 == 2){
                con.drawLine(425,515,575,665);
                con.drawLine(575,515,425,665);
              }
              if (intchecklight2 == 2){
                con.drawLine(625,515,775,665);
                con.drawLine(775,515,625,665);
              }
              if (intchecklight3 == 2){
                con.drawLine(825,515,975,665);
                con.drawLine(975,515,825,665);
              }
              
              
              
              if (intchecklight7 == 1&& intchecklight8 == 1 &&intchecklight9 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop2=("end game");
              }else if (intchecklight4 == 1&& intchecklight5 == 1 &&intchecklight6 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop2=("end game");
              }else if (intchecklight1 == 1&& intchecklight2 == 1 &&intchecklight3 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop2=("end game");
              }else if (intchecklight7 == 1&& intchecklight4 == 1 &&intchecklight1 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop2=("end game");
              }else if (intchecklight8 == 1&& intchecklight5 == 1 &&intchecklight2 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop2=("end game");
              }else if (intchecklight9 == 1&& intchecklight6 == 1 &&intchecklight3 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop2=("end game");
              }else if (intchecklight7 == 1&& intchecklight5 == 1 &&intchecklight3 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop2=("end game");
              }else if (intchecklight9 == 1&& intchecklight5 == 1 &&intchecklight1 == 1){
                intscorep=intscorep+1;
                pause(5000);
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
                con.println("                                                                        "+strusername+" win");
                con.println("                                                                             score: "+intscorep);
                str1playergameloop2=("end game");
              }else if (intchecklight7 == 2&& intchecklight8 == 2 &&intchecklight9 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop2=("end game");
              }else if (intchecklight4 == 2&& intchecklight5 == 2 &&intchecklight6 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop2=("end game");
              }else if (intchecklight1 == 2&& intchecklight2 == 2 &&intchecklight3 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop2=("end game");
              }else if (intchecklight7 == 2&& intchecklight4 == 2 &&intchecklight1 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop2=("end game");
              }else if (intchecklight8 == 2&& intchecklight5 == 2 &&intchecklight2 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop2=("end game");
              }else if (intchecklight9 == 2&& intchecklight6 == 2 &&intchecklight3 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop2=("end game");
              }else if (intchecklight7 == 2&& intchecklight5 == 2 &&intchecklight3 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop2=("end game");
              }else if (intchecklight9 == 2&& intchecklight5 == 2 &&intchecklight1 == 2){
                intscoreai=intscoreai+1;
                pause(5000);
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
                con.println("                                                                                   AI win");
                con.println("                                                                             score: "+intscoreai);
                str1playergameloop2=("end game");
              }else if (intchecklight7 != 0&& intchecklight8 != 0 &&intchecklight9 != 0&&intchecklight4 != 0&& intchecklight5 != 0 &&intchecklight6 != 0&&intchecklight1 != 0&& intchecklight2 != 0 &&intchecklight3 != 0){
                pause(5000);
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
                con.println("                                                                                    Tie");
                str1playergameloop2=("end game");
              }else{
                
                
                
                
                chrkey3 = con.getChar ();
                
                
                while (strplayercheck.equals("blah")){
                  if (chrkey3 == '7'){
                    if (intchecklight7 == 0){
                      intchecklight7 = 1;
                      strplayercheck = ("exit");
                    }else{
                      chrkey3 = con.getChar ();
                    }
                    
                  }else if (chrkey3 == '8'){
                    if (intchecklight8 == 0){
                      intchecklight8 = 1;
                      strplayercheck = ("exit");
                    }else{
                      chrkey3 = con.getChar ();
                    }
                    
                  }else if (chrkey3 == '9'){
                    if (intchecklight9 == 0){
                      intchecklight9 = 1;
                      strplayercheck = ("exit");
                    }else{
                      chrkey3 = con.getChar ();
                    }
                    
                  }else if (chrkey3 == '4'){
                    if (intchecklight4 == 0){
                      intchecklight4 = 1;
                      strplayercheck = ("exit");
                    }else{
                      chrkey3 = con.getChar ();
                    }
                    
                  }else if (chrkey3 == '5'){
                    if (intchecklight5 == 0){
                      intchecklight5 = 1;
                      strplayercheck = ("exit");
                    }else{
                      chrkey3 = con.getChar ();
                    }
                    
                  }else if (chrkey3 == '6'){
                    if (intchecklight6 == 0){
                      intchecklight6 = 1;
                      strplayercheck = ("exit");
                    }else{
                      chrkey3 = con.getChar ();
                    }
                    
                  }else if (chrkey3 == '1'){
                    if (intchecklight1 == 0){
                      intchecklight1 = 1;
                      strplayercheck = ("exit");
                    }else{
                      chrkey3 = con.getChar ();
                    }
                    
                  }else if (chrkey3 == '2'){
                    if (intchecklight2 == 0){
                      intchecklight2 = 1;
                      strplayercheck = ("exit");
                    }else{
                      chrkey3 = con.getChar ();
                    }
                    
                  }else if (chrkey3 == '3'){
                    if (intchecklight3== 0){
                      intchecklight3 = 1;
                      strplayercheck = ("exit");
                    }else{
                      chrkey3 = con.getChar ();
                    }
                  }
                }
                strplayercheck= ("blah");
                
                con.clear();
                con.println("Turn AI  X");
                con.drawLine(400,290,1000,290);
                con.drawLine(400,490,1000,490);
                con.drawLine(600,90,600,690);
                con.drawLine(800,90,800,690);
                
                if (intchecklight7 == 1){
                  con.drawOval(425,115,150,150);
                }
                if (intchecklight8 == 1){
                  con.drawOval(625,115,150,150);
                } 
                if (intchecklight9 == 1){
                  con.drawOval(825,115,150,150);
                }
                if (intchecklight4 == 1){
                  con.drawOval(425,315,150,150);
                }
                if (intchecklight5 == 1){
                  con.drawOval(625,315,150,150);
                }
                if (intchecklight6 == 1){
                  con.drawOval(825,315,150,150);
                }
                if (intchecklight1 == 1){
                  con.drawOval(425,515,150,150);  
                }
                if (intchecklight2 == 1){
                  con.drawOval(625,515,150,150);
                }
                if (intchecklight3 == 1){
                  con.drawOval(825,515,150,150);
                }
                
                
                
                if (intchecklight7 == 2){
                  con.drawLine(425,115,575,265);
                  con.drawLine(575,115,425,265);
                }
                if (intchecklight8 == 2){
                  con.drawLine(625,115,775,265);
                  con.drawLine(775,115,625,265);
                } 
                if (intchecklight9 == 2){
                  con.drawLine(825,115,975,265);
                  con.drawLine(975,115,825,265);
                }
                if (intchecklight4 == 2){
                  con.drawLine(425,315,575,465);
                  con.drawLine(575,315,425,465);
                }
                if (intchecklight5 == 2){
                  con.drawLine(625,315,775,465);
                  con.drawLine(775,315,625,465);
                }
                if (intchecklight6 == 2){
                  con.drawLine(825,315,975,465);
                  con.drawLine(975,315,825,465);
                }
                if (intchecklight1 == 2){
                  con.drawLine(425,515,575,665);
                  con.drawLine(575,515,425,665);
                }
                if (intchecklight2 == 2){
                  con.drawLine(625,515,775,665);
                  con.drawLine(775,515,625,665);
                }
                if (intchecklight3 == 2){
                  con.drawLine(825,515,975,665);
                  con.drawLine(975,515,825,665);
                }
                
                
                
                
                if (intchecklight7 == 1&& intchecklight8 == 1 &&intchecklight9 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop2=("end game");
                }else if (intchecklight4 == 1&& intchecklight5 == 1 &&intchecklight6 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop2=("end game");
                }else if (intchecklight1 == 1&& intchecklight2 == 1 &&intchecklight3 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop2=("end game");
                }else if (intchecklight7 == 1&& intchecklight4 == 1 &&intchecklight1 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop2=("end game");
                }else if (intchecklight8 == 1&& intchecklight5 == 1 &&intchecklight2 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop2=("end game");
                }else if (intchecklight9 == 1&& intchecklight6 == 1 &&intchecklight3 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop2=("end game");
                }else if (intchecklight7 == 1&& intchecklight5 == 1 &&intchecklight3 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop2=("end game");
                }else if (intchecklight9 == 1&& intchecklight5 == 1 &&intchecklight1 == 1){
                  intscorep=intscorep+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername+" win");
                  con.println("                                                                             score: "+intscorep);
                  str1playergameloop2=("end game");
                }else if (intchecklight7 == 2&& intchecklight8 == 2 &&intchecklight9 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop2=("end game");
                }else if (intchecklight4 == 2&& intchecklight5 == 2 &&intchecklight6 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop2=("end game");
                }else if (intchecklight1 == 2&& intchecklight2 == 2 &&intchecklight3 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop2=("end game");
                }else if (intchecklight7 == 2&& intchecklight4 == 2 &&intchecklight1 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop2=("end game");
                }else if (intchecklight8 == 2&& intchecklight5 == 2 &&intchecklight2 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop2=("end game");
                }else if (intchecklight9 == 2&& intchecklight6 == 2 &&intchecklight3 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop2=("end game");
                }else if (intchecklight7 == 2&& intchecklight5 == 2 &&intchecklight3 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop2=("end game");
                }else if (intchecklight9 == 2&& intchecklight5 == 2 &&intchecklight1 == 2){
                  intscoreai=intscoreai+1;
                  pause(5000);
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
                  con.println("                                                                                   AI win");
                  con.println("                                                                             score: "+intscoreai);
                  str1playergameloop2=("end game");
                }else if (intchecklight7 != 0&& intchecklight8 != 0 &&intchecklight9 != 0&&intchecklight4 != 0&& intchecklight5 != 0 &&intchecklight6 != 0&&intchecklight1 != 0&& intchecklight2 != 0 &&intchecklight3 != 0){
                  pause(5000);
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
                  con.println("                                                                                    Tie");
                  str1playergameloop2=("end game");
                }else{
                  intrandai = (int) (Math.random()*9+1);
                }
              }
            }
            
          }
          pause(5000);
          while (strrestartgame1ploop.equals ("blah")){
            strplayercheck= ("blah");
            straicheck= ("blah");
            str1playergameloop1=("blah");
            str1playergameloop2=("blah");
            intchecklight7=0;
            intchecklight8=0;
            intchecklight9=0;
            intchecklight4=0;
            intchecklight5=0;
            intchecklight6=0;
            intchecklight1=0;
            intchecklight2=0;
            intchecklight3=0;
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
            con.println("                                                                                       click k to play again");
            con.println("                                                                                     click b to go backto menu");
            chrkey = con.getChar ();
            if (chrkey == 'k'){
              strrestartgame1p = ("restart");
              strrestartgame1ploop= ("end");
            }else if (chrkey== 'b'){
              strrestartgame1p = ("blah");
              strrestartgame1ploop= ("end");
              intscorep=0;
              intscoreai=0; 
            } 
          }
        }

        
      } else if(chrkey == 'w'){
        strrestartgame2ploop= ("blah");
        strrestartgame2p = ("restart");
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
        con.println("What is you username player1? (your o)");
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
        con.println("What is you username player2? (your x)");
        strusername2=con.readLine();
        while (strrestartgame2p.equals("restart")){
          strrestartgame2ploop= ("blah");
          strrestartgame2p = ("restart");
          con.clear();
          intrandturn = (int) (Math.random()*2+1);
          if (intrandturn == 1){
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
            con.println("                                                                        "+strusername1+"'s turn (your o)");
            pause(2000);
            
            
            
            con.clear();
            con.println("Turn "+strusername1+"  O");
            con.drawLine(400,290,1000,290);
            con.drawLine(400,490,1000,490);
            con.drawLine(600,90,600,690);
            con.drawLine(800,90,800,690);
            chrkey1 = con.getChar ();
            while (str2playergameloop1.equals("blah")){
              while (strplayer1check.equals("blah")){
                if (chrkey1 == '7'){
                  if (intchecklight7 == 0){
                    intchecklight7 = 1;
                    strplayer1check = ("exit");
                  }else{
                    chrkey1 = con.getChar ();
                  }
                  
                }else if (chrkey1 == '8'){
                  if (intchecklight8 == 0){
                    intchecklight8 = 1;
                    strplayer1check = ("exit");
                  }else{
                    chrkey1 = con.getChar ();
                  }
                  
                }else if (chrkey1 == '9'){
                  if (intchecklight9 == 0){
                    intchecklight9 = 1;
                    strplayer1check = ("exit");
                  }else{
                    chrkey1 = con.getChar ();
                  }
                  
                }else if (chrkey1 == '4'){
                  if (intchecklight4 == 0){
                    intchecklight4 = 1;
                    strplayer1check = ("exit");
                  }else{
                    chrkey1 = con.getChar ();
                  }
                  
                }else if (chrkey1 == '5'){
                  if (intchecklight5 == 0){
                    intchecklight5 = 1;
                    strplayer1check = ("exit");
                  }else{
                    chrkey1 = con.getChar ();
                  }
                  
                }else if (chrkey1 == '6'){
                  if (intchecklight6 == 0){
                    intchecklight6 = 1;
                    strplayer1check = ("exit");
                  }else{
                    chrkey1 = con.getChar ();
                  }
                  
                }else if (chrkey1 == '1'){
                  if (intchecklight1 == 0){
                    intchecklight1 = 1;
                    strplayer1check = ("exit");
                  }else{
                    chrkey1 = con.getChar ();
                  }
                  
                }else if (chrkey1 == '2'){
                  if (intchecklight2 == 0){
                    intchecklight2 = 1;
                    strplayer1check = ("exit");
                  }else{
                    chrkey1 = con.getChar ();
                  }
                  
                }else if (chrkey1 == '3'){
                  if (intchecklight3== 0){
                    intchecklight3 = 1;
                    strplayer1check = ("exit");
                  }else{
                    chrkey1 = con.getChar ();
                  }
                }
              }
              strplayer1check= ("blah");
              
              con.clear();
              con.println("Turn "+strusername2+"  X");
              con.drawLine(400,290,1000,290);
              con.drawLine(400,490,1000,490);
              con.drawLine(600,90,600,690);
              con.drawLine(800,90,800,690);
              
              if (intchecklight7 == 1){
                con.drawOval(425,115,150,150);
              }
              if (intchecklight8 == 1){
                con.drawOval(625,115,150,150);
              } 
              if (intchecklight9 == 1){
                con.drawOval(825,115,150,150);
              }
              if (intchecklight4 == 1){
                con.drawOval(425,315,150,150);
              }
              if (intchecklight5 == 1){
                con.drawOval(625,315,150,150);
              }
              if (intchecklight6 == 1){
                con.drawOval(825,315,150,150);
              }
              if (intchecklight1 == 1){
                con.drawOval(425,515,150,150);
              }
              if (intchecklight2 == 1){
                con.drawOval(625,515,150,150);
              }
              if (intchecklight3 == 1){
                con.drawOval(825,515,150,150);
              }
              
              
              
              if (intchecklight7 == 2){
                con.drawLine(425,115,575,265);
                con.drawLine(575,115,425,265);
              }
              if (intchecklight8 == 2){
                con.drawLine(625,115,775,265);
                con.drawLine(775,115,625,265);
              } 
              if (intchecklight9 == 2){
                con.drawLine(825,115,975,265);
                con.drawLine(975,115,825,265);
              }
              if (intchecklight4 == 2){
                con.drawLine(425,315,575,465);
                con.drawLine(575,315,425,465);
              }
              if (intchecklight5 == 2){
                con.drawLine(625,315,775,465);
                con.drawLine(775,315,625,465);
              }
              if (intchecklight6 == 2){
                con.drawLine(825,315,975,465);
                con.drawLine(975,315,825,465);
              }
              if (intchecklight1 == 2){
                con.drawLine(425,515,575,665);
                con.drawLine(575,515,425,665);
              }
              if (intchecklight2 == 2){
                con.drawLine(625,515,775,665);
                con.drawLine(775,515,625,665);
              }
              if (intchecklight3 == 2){
                con.drawLine(825,515,975,665);
                con.drawLine(975,515,825,665);
              }
              
              
              
              if (intchecklight7 == 1&& intchecklight8 == 1 &&intchecklight9 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop1=("end game");
              }else if (intchecklight4 == 1&& intchecklight5 == 1 &&intchecklight6 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop1=("end game");
              }else if (intchecklight1 == 1&& intchecklight2 == 1 &&intchecklight3 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop1=("end game");
              }else if (intchecklight7 == 1&& intchecklight4 == 1 &&intchecklight1 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop1=("end game");
              }else if (intchecklight8 == 1&& intchecklight5 == 1 &&intchecklight2 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop1=("end game");
              }else if (intchecklight9 == 1&& intchecklight6 == 1 &&intchecklight3 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop1=("end game");
              }else if (intchecklight7 == 1&& intchecklight5 == 1 &&intchecklight3 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop1=("end game");
              }else if (intchecklight9 == 1&& intchecklight5 == 1 &&intchecklight1 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop1=("end game");
              }else if (intchecklight7 == 2&& intchecklight8 == 2 &&intchecklight9 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop1=("end game");
              }else if (intchecklight4 == 2&& intchecklight5 == 2 &&intchecklight6 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop1=("end game");
              }else if (intchecklight1 == 2&& intchecklight2 == 2 &&intchecklight3 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop1=("end game");
              }else if (intchecklight7 == 2&& intchecklight4 == 2 &&intchecklight1 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop1=("end game");
              }else if (intchecklight8 == 2&& intchecklight5 == 2 &&intchecklight2 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop1=("end game");
              }else if (intchecklight9 == 2&& intchecklight6 == 2 &&intchecklight3 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop1=("end game");
              }else if (intchecklight7 == 2&& intchecklight5 == 2 &&intchecklight3 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop1=("end game");
              }else if (intchecklight9 == 2&& intchecklight5 == 2 &&intchecklight1 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop1=("end game");
              }else if (intchecklight7 != 0&& intchecklight8 != 0 &&intchecklight9 != 0&&intchecklight4 != 0&& intchecklight5 != 0 &&intchecklight6 != 0&&intchecklight1 != 0&& intchecklight2 != 0 &&intchecklight3 != 0){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                                    Tie");
                str2playergameloop1=("end game");
              }else{
                
                
                
                
                chrkey2 = con.getChar ();
                
                
                while (strplayer2check.equals("blah")){
                  if (chrkey2 == '7'){
                    if (intchecklight7 == 0){
                      intchecklight7 = 2;
                      strplayer2check = ("exit");
                    }else{
                      chrkey2 = con.getChar ();
                    }
                    
                  }else if (chrkey2 == '8'){
                    if (intchecklight8 == 0){
                      intchecklight8 = 2;
                      strplayer2check = ("exit");
                    }else{
                      chrkey2 = con.getChar ();
                    }
                    
                  }else if (chrkey2 == '9'){
                    if (intchecklight9 == 0){
                      intchecklight9 = 2;
                      strplayer2check = ("exit");
                    }else{
                      chrkey2 = con.getChar ();
                    }
                    
                  }else if (chrkey2 == '4'){
                    if (intchecklight4 == 0){
                      intchecklight4 = 2;
                      strplayer2check = ("exit");
                    }else{
                      chrkey2 = con.getChar ();
                    }
                    
                  }else if (chrkey2 == '5'){
                    if (intchecklight5 == 0){
                      intchecklight5 = 2;
                      strplayer2check = ("exit");
                    }else{
                      chrkey2 = con.getChar ();
                    }
                    
                  }else if (chrkey2 == '6'){
                    if (intchecklight6 == 0){
                      intchecklight6 = 2;
                      strplayer2check = ("exit");
                    }else{
                      chrkey2 = con.getChar ();
                    }
                    
                  }else if (chrkey2 == '1'){
                    if (intchecklight1 == 0){
                      intchecklight1 = 2;
                      strplayer2check = ("exit");
                    }else{
                      chrkey2 = con.getChar ();
                    }
                    
                  }else if (chrkey2 == '2'){
                    if (intchecklight2 == 0){
                      intchecklight2 = 2;
                      strplayer2check = ("exit");
                    }else{
                      chrkey2 = con.getChar ();
                    }
                    
                  }else if (chrkey2 == '3'){
                    if (intchecklight3== 0){
                      intchecklight3 = 2;
                      strplayer2check = ("exit");
                    }else{
                      chrkey2 = con.getChar ();
                    }
                  }
                }
                strplayer2check= ("blah");
                
                con.clear();
                con.println("Turn "+strusername1+"  O");
                con.drawLine(400,290,1000,290);
                con.drawLine(400,490,1000,490);
                con.drawLine(600,90,600,690);
                con.drawLine(800,90,800,690);
                
                if (intchecklight7 == 1){
                  con.drawOval(425,115,150,150);
                }
                if (intchecklight8 == 1){
                  con.drawOval(625,115,150,150);
                } 
                if (intchecklight9 == 1){
                  con.drawOval(825,115,150,150);
                }
                if (intchecklight4 == 1){
                  con.drawOval(425,315,150,150);
                }
                if (intchecklight5 == 1){
                  con.drawOval(625,315,150,150);
                }
                if (intchecklight6 == 1){
                  con.drawOval(825,315,150,150);
                }
                if (intchecklight1 == 1){
                  con.drawOval(425,515,150,150);  
                }
                if (intchecklight2 == 1){
                  con.drawOval(625,515,150,150);
                }
                if (intchecklight3 == 1){
                  con.drawOval(825,515,150,150);
                }
                
                
                
                if (intchecklight7 == 2){
                  con.drawLine(425,115,575,265);
                  con.drawLine(575,115,425,265);
                }
                if (intchecklight8 == 2){
                  con.drawLine(625,115,775,265);
                  con.drawLine(775,115,625,265);
                } 
                if (intchecklight9 == 2){
                  con.drawLine(825,115,975,265);
                  con.drawLine(975,115,825,265);
                }
                if (intchecklight4 == 2){
                  con.drawLine(425,315,575,465);
                  con.drawLine(575,315,425,465);
                }
                if (intchecklight5 == 2){
                  con.drawLine(625,315,775,465);
                  con.drawLine(775,315,625,465);
                }
                if (intchecklight6 == 2){
                  con.drawLine(825,315,975,465);
                  con.drawLine(975,315,825,465);
                }
                if (intchecklight1 == 2){
                  con.drawLine(425,515,575,665);
                  con.drawLine(575,515,425,665);
                }
                if (intchecklight2 == 2){
                  con.drawLine(625,515,775,665);
                  con.drawLine(775,515,625,665);
                }
                if (intchecklight3 == 2){
                  con.drawLine(825,515,975,665);
                  con.drawLine(975,515,825,665);
                }
                
                
                
                
                if (intchecklight7 == 1&& intchecklight8 == 1 &&intchecklight9 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight4 == 1&& intchecklight5 == 1 &&intchecklight6 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight1 == 1&& intchecklight2 == 1 &&intchecklight3 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 == 1&& intchecklight4 == 1 &&intchecklight1 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight8 == 1&& intchecklight5 == 1 &&intchecklight2 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight9 == 1&& intchecklight6 == 1 &&intchecklight3 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 == 1&& intchecklight5 == 1 &&intchecklight3 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight9 == 1&& intchecklight5 == 1 &&intchecklight1 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 == 2&& intchecklight8 == 2 &&intchecklight9 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight4 == 2&& intchecklight5 == 2 &&intchecklight6 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight1 == 2&& intchecklight2 == 2 &&intchecklight3 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 == 2&& intchecklight4 == 2 &&intchecklight1 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight8 == 2&& intchecklight5 == 2 &&intchecklight2 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight9 == 2&& intchecklight6 == 2 &&intchecklight3 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 == 2&& intchecklight5 == 2 &&intchecklight3 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight9 == 2&& intchecklight5 == 2 &&intchecklight1 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 != 0&& intchecklight8 != 0 &&intchecklight9 != 0&&intchecklight4 != 0&& intchecklight5 != 0 &&intchecklight6 != 0&&intchecklight1 != 0&& intchecklight2 != 0 &&intchecklight3 != 0){
                  pause(5000);
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
                  con.println("                                                                                    Tie");
                  str2playergameloop1=("end game");
                }else{
                  chrkey1 = con.getChar ();
                }
              }
            }
          }else if(intrandturn == 2){
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
            con.println("                                                                        "+strusername2+"'s turn (your x)");
            pause(2000);
            con.clear();
            con.println("Turn "+strusername2+"  X");
            con.drawLine(400,290,1000,290);
            con.drawLine(400,490,1000,490);
            con.drawLine(600,90,600,690); 
            con.drawLine(800,90,800,690);
            chrkey2 = con.getChar ();
            while (str2playergameloop2.equals("blah")){
              while (strplayer2check.equals("blah")){
                if (chrkey2 == '7'){
                  if (intchecklight7 == 0){
                    intchecklight7 = 2;
                    strplayer2check = ("exit");
                  }else{
                    chrkey2 = con.getChar ();
                  }
                  
                }else if (chrkey2 == '8'){
                  if (intchecklight8 == 0){
                    intchecklight8 = 2;
                    strplayer2check = ("exit");
                  }else{
                    chrkey2 = con.getChar ();
                  }
                  
                }else if (chrkey2 == '9'){
                  if (intchecklight9 == 0){
                    intchecklight9 = 2;
                    strplayer2check = ("exit");
                  }else{
                    chrkey2 = con.getChar ();
                  }
                  
                }else if (chrkey2 == '4'){
                  if (intchecklight4 == 0){
                    intchecklight4 = 2;
                    strplayer2check = ("exit");
                  }else{
                    chrkey2 = con.getChar ();
                  }
                  
                }else if (chrkey2 == '5'){
                  if (intchecklight5 == 0){
                    intchecklight5 = 2;
                    strplayer2check = ("exit");
                  }else{
                    chrkey2 = con.getChar ();
                  }
                  
                }else if (chrkey2 == '6'){
                  if (intchecklight6 == 0){
                    intchecklight6 = 2;
                    strplayer2check = ("exit");
                  }else{
                    chrkey2 = con.getChar ();
                  }
                  
                }else if (chrkey2 == '1'){
                  if (intchecklight1 == 0){
                    intchecklight1 = 2;
                    strplayer2check = ("exit");
                  }else{
                    chrkey2 = con.getChar ();
                  }
                  
                }else if (chrkey2 == '2'){
                  if (intchecklight2 == 0){
                    intchecklight2 = 2;
                    strplayer2check = ("exit");
                  }else{
                    chrkey2 = con.getChar ();
                  }
                  
                }else if (chrkey2 == '3'){
                  if (intchecklight3== 0){
                    intchecklight3 = 2;
                    strplayer2check = ("exit");
                  }else{
                    chrkey2 = con.getChar ();
                  }
                }
              }
              strplayer2check= ("blah");
              
              con.clear();
              con.println("Turn "+strusername1+"  O");
              con.drawLine(400,290,1000,290);
              con.drawLine(400,490,1000,490);
              con.drawLine(600,90,600,690);
              con.drawLine(800,90,800,690);
              
              if (intchecklight7 == 1){
                con.drawOval(425,115,150,150);
              }
              if (intchecklight8 == 1){
                con.drawOval(625,115,150,150);
              } 
              if (intchecklight9 == 1){
                con.drawOval(825,115,150,150);
              }
              if (intchecklight4 == 1){
                con.drawOval(425,315,150,150);
              }
              if (intchecklight5 == 1){
                con.drawOval(625,315,150,150);
              }
              if (intchecklight6 == 1){
                con.drawOval(825,315,150,150);
              }
              if (intchecklight1 == 1){
                con.drawOval(425,515,150,150);
              }
              if (intchecklight2 == 1){
                con.drawOval(625,515,150,150);
              }
              if (intchecklight3 == 1){
                con.drawOval(825,515,150,150);
              }
              
              
              
              if (intchecklight7 == 2){
                con.drawLine(425,115,575,265);
                con.drawLine(575,115,425,265);
              }
              if (intchecklight8 == 2){
                con.drawLine(625,115,775,265);
                con.drawLine(775,115,625,265);
              } 
              if (intchecklight9 == 2){
                con.drawLine(825,115,975,265);
                con.drawLine(975,115,825,265);
              }
              if (intchecklight4 == 2){
                con.drawLine(425,315,575,465);
                con.drawLine(575,315,425,465);
              }
              if (intchecklight5 == 2){
                con.drawLine(625,315,775,465);
                con.drawLine(775,315,625,465);
              }
              if (intchecklight6 == 2){
                con.drawLine(825,315,975,465);
                con.drawLine(975,315,825,465);
              }
              if (intchecklight1 == 2){
                con.drawLine(425,515,575,665);
                con.drawLine(575,515,425,665);
              }
              if (intchecklight2 == 2){
                con.drawLine(625,515,775,665);
                con.drawLine(775,515,625,665);
              }
              if (intchecklight3 == 2){
                con.drawLine(825,515,975,665);
                con.drawLine(975,515,825,665);
              }
              
              
              
              if (intchecklight7 == 1&& intchecklight8 == 1 &&intchecklight9 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop2=("end game");
              }else if (intchecklight4 == 1&& intchecklight5 == 1 &&intchecklight6 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop2=("end game");
              }else if (intchecklight1 == 1&& intchecklight2 == 1 &&intchecklight3 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop2=("end game");
              }else if (intchecklight7 == 1&& intchecklight4 == 1 &&intchecklight1 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop2=("end game");
              }else if (intchecklight8 == 1&& intchecklight5 == 1 &&intchecklight2 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop2=("end game");
              }else if (intchecklight9 == 1&& intchecklight6 == 1 &&intchecklight3 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop2=("end game");
              }else if (intchecklight7 == 1&& intchecklight5 == 1 &&intchecklight3 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop2=("end game");
              }else if (intchecklight9 == 1&& intchecklight5 == 1 &&intchecklight1 == 1){
                intscorep1=intscorep1+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop2=("end game");
              }else if (intchecklight7 == 2&& intchecklight8 == 2 &&intchecklight9 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop2=("end game");
              }else if (intchecklight4 == 2&& intchecklight5 == 2 &&intchecklight6 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop2=("end game");
              }else if (intchecklight1 == 2&& intchecklight2 == 2 &&intchecklight3 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop2=("end game");
              }else if (intchecklight7 == 2&& intchecklight4 == 2 &&intchecklight1 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop2=("end game");
              }else if (intchecklight8 == 2&& intchecklight5 == 2 &&intchecklight2 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername1+" win");
                con.println("                                                                             score: "+intscorep1);
                str2playergameloop2=("end game");
              }else if (intchecklight9 == 2&& intchecklight6 == 2 &&intchecklight3 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop2=("end game");
              }else if (intchecklight7 == 2&& intchecklight5 == 2 &&intchecklight3 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop2=("end game");
              }else if (intchecklight9 == 2&& intchecklight5 == 2 &&intchecklight1 == 2){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                        "+strusername2+" win");
                con.println("                                                                             score: "+intscorep2);
                str2playergameloop2=("end game");
              }else if (intchecklight7 != 0&& intchecklight8 != 0 &&intchecklight9 != 0&&intchecklight4 != 0&& intchecklight5 != 0 &&intchecklight6 != 0&&intchecklight1 != 0&& intchecklight2 != 0 &&intchecklight3 != 0){
                intscorep2=intscorep2+1;
                pause(5000);
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
                con.println("                                                                                    Tie");
                str2playergameloop2=("end game");
              }else{
                
                
                
                
                chrkey1 = con.getChar ();
                
                
                while (strplayer1check.equals("blah")){
                  if (chrkey1 == '7'){
                    if (intchecklight7 == 0){
                      intchecklight7 = 1;
                      strplayer1check = ("exit");
                    }else{
                      chrkey1 = con.getChar ();
                    }
                    
                  }else if (chrkey1 == '8'){
                    if (intchecklight8 == 0){
                      intchecklight8 = 1;
                      strplayer1check = ("exit");
                    }else{
                      chrkey1 = con.getChar ();
                    }
                    
                  }else if (chrkey1 == '9'){
                    if (intchecklight9 == 0){
                      intchecklight9 = 1;
                      strplayer1check = ("exit");
                    }else{
                      chrkey1 = con.getChar ();
                    }
                    
                  }else if (chrkey1 == '4'){
                    if (intchecklight4 == 0){
                      intchecklight4 = 1;
                      strplayer1check = ("exit");
                    }else{
                      chrkey1 = con.getChar ();
                    }
                    
                  }else if (chrkey1 == '5'){
                    if (intchecklight5 == 0){
                      intchecklight5 = 1;
                      strplayer1check = ("exit");
                    }else{
                      chrkey1 = con.getChar ();
                    }
                    
                  }else if (chrkey1 == '6'){
                    if (intchecklight6 == 0){
                      intchecklight6 = 1;
                      strplayer1check = ("exit");
                    }else{
                      chrkey1 = con.getChar ();
                    }
                    
                  }else if (chrkey1 == '1'){
                    if (intchecklight1 == 0){
                      intchecklight1 = 1;
                      strplayer1check = ("exit");
                    }else{
                      chrkey1 = con.getChar ();
                    }
                    
                  }else if (chrkey1 == '2'){
                    if (intchecklight2 == 0){
                      intchecklight2 = 1;
                      strplayer1check = ("exit");
                    }else{
                      chrkey1 = con.getChar ();
                    }
                    
                  }else if (chrkey1 == '3'){
                    if (intchecklight3== 0){
                      intchecklight3 = 1;
                      strplayer1check = ("exit");
                    }else{
                      chrkey1 = con.getChar ();
                    }
                  }
                }
                strplayer1check= ("blah");
                
                con.clear();
                con.println("Turn "+strusername2+"  X");
                con.drawLine(400,290,1000,290);
                con.drawLine(400,490,1000,490);
                con.drawLine(600,90,600,690);
                con.drawLine(800,90,800,690);
                
                if (intchecklight7 == 1){
                  con.drawOval(425,115,150,150);
                }
                if (intchecklight8 == 1){
                  con.drawOval(625,115,150,150);
                } 
                if (intchecklight9 == 1){
                  con.drawOval(825,115,150,150);
                }
                if (intchecklight4 == 1){
                  con.drawOval(425,315,150,150);
                }
                if (intchecklight5 == 1){
                  con.drawOval(625,315,150,150);
                }
                if (intchecklight6 == 1){
                  con.drawOval(825,315,150,150);
                }
                if (intchecklight1 == 1){
                  con.drawOval(425,515,150,150);  
                }
                if (intchecklight2 == 1){
                  con.drawOval(625,515,150,150);
                }
                if (intchecklight3 == 1){
                  con.drawOval(825,515,150,150);
                }
                
                
                
                if (intchecklight7 == 2){
                  con.drawLine(425,115,575,265);
                  con.drawLine(575,115,425,265);
                }
                if (intchecklight8 == 2){
                  con.drawLine(625,115,775,265);
                  con.drawLine(775,115,625,265);
                } 
                if (intchecklight9 == 2){
                  con.drawLine(825,115,975,265);
                  con.drawLine(975,115,825,265);
                }
                if (intchecklight4 == 2){
                  con.drawLine(425,315,575,465);
                  con.drawLine(575,315,425,465);
                }
                if (intchecklight5 == 2){
                  con.drawLine(625,315,775,465);
                  con.drawLine(775,315,625,465);
                }
                if (intchecklight6 == 2){
                  con.drawLine(825,315,975,465);
                  con.drawLine(975,315,825,465);
                }
                if (intchecklight1 == 2){
                  con.drawLine(425,515,575,665);
                  con.drawLine(575,515,425,665);
                }
                if (intchecklight2 == 2){
                  con.drawLine(625,515,775,665);
                  con.drawLine(775,515,625,665);
                }
                if (intchecklight3 == 2){
                  con.drawLine(825,515,975,665);
                  con.drawLine(975,515,825,665);
                }
                
                
                
                
                if (intchecklight7 == 1&& intchecklight8 == 1 &&intchecklight9 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight4 == 1&& intchecklight5 == 1 &&intchecklight6 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight1 == 1&& intchecklight2 == 1 &&intchecklight3 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 == 1&& intchecklight4 == 1 &&intchecklight1 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight8 == 1&& intchecklight5 == 1 &&intchecklight2 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight9 == 1&& intchecklight6 == 1 &&intchecklight3 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 == 1&& intchecklight5 == 1 &&intchecklight3 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight9 == 1&& intchecklight5 == 1 &&intchecklight1 == 1){
                  intscorep1=intscorep1+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 == 2&& intchecklight8 == 2 &&intchecklight9 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight4 == 2&& intchecklight5 == 2 &&intchecklight6 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight1 == 2&& intchecklight2 == 2 &&intchecklight3 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 == 2&& intchecklight4 == 2 &&intchecklight1 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight8 == 2&& intchecklight5 == 2 &&intchecklight2 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername1+" win");
                  con.println("                                                                             score: "+intscorep1);
                  str2playergameloop1=("end game");
                }else if (intchecklight9 == 2&& intchecklight6 == 2 &&intchecklight3 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 == 2&& intchecklight5 == 2 &&intchecklight3 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight9 == 2&& intchecklight5 == 2 &&intchecklight1 == 2){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                        "+strusername2+" win");
                  con.println("                                                                             score: "+intscorep2);
                  str2playergameloop1=("end game");
                }else if (intchecklight7 != 0&& intchecklight8 != 0 &&intchecklight9 != 0&&intchecklight4 != 0&& intchecklight5 != 0 &&intchecklight6 != 0&&intchecklight1 != 0&& intchecklight2 != 0 &&intchecklight3 != 0){
                  intscorep2=intscorep2+1;
                  pause(5000);
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
                  con.println("                                                                                    Tie");
                  str2playergameloop1=("end game");
                }else{
                  chrkey2 = con.getChar ();
                }
              }
            }
            
          }
          pause(5000);
          while (strrestartgame2ploop.equals ("blah")){
            strplayer1check= ("blah");
            strplayer2check= ("blah");
            str2playergameloop1=("blah");
            str2playergameloop2=("blah");
            intchecklight7=0;
            intchecklight8=0;
            intchecklight9=0;
            intchecklight4=0;
            intchecklight5=0;
            intchecklight6=0;
            intchecklight1=0;
            intchecklight2=0;
            intchecklight3=0;
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
            con.println("                                                                                       click k to play again");
            con.println("                                                                                     click b to go backto menu");
            chrkey = con.getChar ();
            if (chrkey == 'k'){
              strrestartgame2p = ("restart");
              strrestartgame2ploop= ("end");
            }else if (chrkey== 'b'){
              strrestartgame2p = ("blah");
              strrestartgame2ploop= ("end");
              intscorep1=0;
              intscorep2=0; 
            } 
          }
        }

        
        
        
        
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
          con.println("          -The player then chooses a username for themself and if they are against a player then they'll insert there username as well");
          con.println("          -A randomizer will deside who will get to choose first");
          con.println("          -There is a three by three grid that will be drawn on the center of the screen and the user that is going will have there username writen on the top left corner");
          con.println("          -The goal is to get 3 of your shape going in a line in a row, column, or diagonal");
          con.println("          -Who ever makes it first wins the game");
          con.println("          -The game can be tied off if both players have not reached the goal of making a line thus leading the game board to clear and start over");
          con.println("          -The player who goes first is normally offensive while the opponent goes defensive");
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
          strcheatcode=("blah");
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
          con.println("                                                                                      Version 1");
          con.println("                                                                                Date created:11/04/2017");
          con.println("                                                                                Date updated:25/04/2017");
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
          }else if (chrkey =='c'){
            while(strcheatcode.equals ("blah")){
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
              con.println("");
              con.println("");
              con.println("What is the cheat code (use numberpad arrow keys)(click b enter to go back)");
              strcheatcode=con.readLine();
              if (strcheatcode.equals ("88224646abstart")){
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
                con.println("");
                con.println("");
                con.println("                                                                           Whoever you are, you win");
                strcredits=("end");
                strmenu=("end");
                strcheatcode=("end");
              }else if(strcheatcode.equals ("b")){
                strcheatcode=("back");
                con.clear();
              }else{
                strcheatcode=("blah");
                con.clear();
              }
            }
          }else{
            strcheatcode=("blah");
            con.clear();
          }
        }
        strcredits=("blah");
      }
      con.clear();
    }
  }
  public static void pause (int intMS){
    try{
      Thread.sleep(intMS);
    }catch(InterruptedException e) {
    }
  }
}