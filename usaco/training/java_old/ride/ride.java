/* Use the slash-star style comments or the system won't see your
   identification information */
/*
ID: luyangj1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    // BufferedReader f = new BufferedReader(new FileReader("/Users/juwang/work/project/luyangjiang/luyangjiangca.github.io/usaco/training/ride/ride.in"));
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                  // input file name goes above
    // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/juwang/work/project/luyangjiang/luyangjiangca.github.io/usaco/training/ride/ride.out")));
     PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster

    String line1 = f.readLine();
    String line2 = f.readLine();
    int teamTotal = 1;
    int cometTotal = 1;
    String ret;
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (int i = 0; i< line1.length(); i++){
       cometTotal *= (alphabet.indexOf(line1.charAt(i))+1);
      System.out.println(cometTotal);
      System.out.println(alphabet.indexOf(line1.charAt(i))+1);
    }
    // System.out.println("done");
    for (int x = 0; x< line2.length(); x++){
       teamTotal *= (alphabet.indexOf(line2.charAt(x))+1);
      // System.out.println(teamTotal);
      // System.out.println(alphabet.indexOf(line2.charAt(x))+1);
    }
    // System.out.println(teamTotal % 47 == cometTotal % 47);
    // System.out.println(teamTotal % 47);
    // System.out.println(cometTotal % 47);
    if (teamTotal % 47 == cometTotal % 47){
      ret = "GO";
    }else{
      ret = "STAY";
    }

    out.println(ret);                           // output result
    out.close();                                  // close the output file
  }
}