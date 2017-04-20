import hsa.*;
public class wassabitest{
  public static void main (String[] args){
    Console con = new Console(38,174);
    //test game board stuff
    //gameboard
    con.drawLine(400,290,1000,290);
    con.drawLine(400,490,1000,490);
    con.drawLine(600,90,600,690);
    con.drawLine(800,90,800,690);
    //7
    con.drawOval(425,115,150,150);
    //8
    con.drawOval(625,115,150,150);
    //9
    con.drawOval(825,115,150,150);
    //4
    con.drawOval(425,315,150,150);
    //5
    con.drawOval(625,315,150,150);
    //6
    con.drawOval(825,315,150,150);
    //1
    con.drawOval(425,515,150,150);
    //2
    con.drawOval(625,515,150,150);
    //3
    con.drawOval(825,515,150,150);
    //7
    con.drawLine(425,115,575,265);
    con.drawLine(575,115,425,265);
    //8
    con.drawLine(625,115,775,265);
    con.drawLine(775,115,625,265);
    //9
    con.drawLine(825,115,975,265);
    con.drawLine(975,115,825,265);
    //4
    con.drawLine(425,315,575,465);
    con.drawLine(575,315,425,465);
    //5
    con.drawLine(625,315,775,465);
    con.drawLine(775,315,625,465);
    //6
    con.drawLine(825,315,975,465);
    con.drawLine(975,315,825,465);
    //1
    con.drawLine(425,515,575,665);
    con.drawLine(575,515,425,665);
    //2
    con.drawLine(625,515,775,665);
    con.drawLine(775,515,625,665);
    //3
    con.drawLine(825,515,975,665);
    con.drawLine(975,515,825,665);
      }
  public static void pause (int intMS){
    try{
      Thread.sleep(intMS);
    }catch(InterruptedException e) {
    }
  }
}