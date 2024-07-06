/* Use the slash-star style comments or the system won't see your
   identification information */
/*
ID: luyangj1
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;
// import java.lang.*;
import java.util.Map.Entry;

public class gift1 {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    // BufferedReader f = new BufferedReader(new FileReader("/Users/juwang/work/project/luyangjiang/luyangjiangca.github.io/usaco/training/gift1/gift1.in"));
    BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
    //                                               // input file name goes above
    // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/juwang/work/project/luyangjiang/luyangjiangca.github.io/usaco/training/gift1/gift1.out")));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer line1 = new StringTokenizer(f.readLine());
    String line1Str = line1.nextToken();
    int len = Integer.parseInt(line1Str);
    Map<String, Integer> hm = new HashMap<String, Integer>();
    String[] names = new String[len];//dave, 
    //init names
    for(int i = 0; i < len; i++) {
      String name = new StringTokenizer(f.readLine()).nextToken(); 
      names[i] = name;
      hm.put(name, 0);
    }

    String name;
    while( (name= f.readLine()) != null) {
      int currentMoney = hm.get(name);
      String secondLine = f.readLine();
      String[] arr = secondLine.split(" ");
      int toMoney = Integer.parseInt(arr[0]);
      int toNum = Integer.parseInt(arr[1]);
      if(toNum != 0) {
        int averageToMoney = toMoney / toNum;
        currentMoney = currentMoney - averageToMoney * toNum;
        hm.put(name, currentMoney);
        
        while( toNum > 0) {
          String toName = f.readLine();
          int toNameCurrentMoney = hm.get(toName);
          hm.put(toName, toNameCurrentMoney + averageToMoney);
          toNum--;
        }
      }

    }
    
    //output
    String ret = "";

    for(int i = 0; i < len; i++) {
      name = names[i];
      ret += name + " " + hm.get(name);
      if(i < len - 1) {
        ret += '\n';
      }
    }
    
    out.println(ret);                           // output result
    out.close();                                  // close the output file
  }
}
// class giftGiver{
//     int money;
//     int recipients;
//     String name;
//     String [] people;
//     giftGiver(int money, int recipients){
//         this.money = money;
//         this.recipients = recipients;
//         if (recipients > 0){
//             for(int i = 0; i<recipients; i++){
//                 this.name = name;
//                 people[i]= name;
//             }
//         }
//     }
// }
