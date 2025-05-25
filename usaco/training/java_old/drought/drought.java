package usaco.training.drought;

/*
ID: luyangj1
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;

// read number of test cases
// read number of cows
// read hunger values

//if even number next to two odd, or vice versa, return -1
//cow at N cannot be fed on its own
//if N is largest number then return -1
//0 counts as the opposite parity of cow 1
//loop until all numbers are equal
    //find the first iteration of  greatest number in the list and feed

//feed(cow) function find item cow of list and hunger-1. same for cow+1

public class drought{
    public static void main (String [] args) throws IOException {
           
        // BufferedReader f = new BufferedReader(new FileReader("drought.in"));
        BufferedReader f = new BufferedReader(new FileReader("c:\\Users\\luyang\\luyangjiangca.github.io\\usaco\\training\\drought\\drought.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("c:\\Users\\luyang\\luyangjiangca.github.io\\usaco\\training\\drought\\drought.out")));
        // StringTokenizer line1 = new StringTokenizer(f.readLine());
        int tests = Integer.parseInt(f.readLine());
        for (int i=0;i<tests;i++){
            String line1String = f.readLine();
            // String line1String = line1.nextToken();
            int len = Integer.parseInt(line1String);
            int[] cowHunger = new int[len];
            StringTokenizer cowValues = new StringTokenizer(f.readLine());
            for (int x=0;x<len;x++){
                int line2String = Integer.parseInt(cowValues.nextToken());
                cowHunger[x]=line2String;
            }
            int bags = 0;
            while (true){
                int cow1 = cowHunger[0];
                int same = 0;
                for(int cow:cowHunger){
                    if (cow == cow1){
                        same += 1;
                    }else if (cow<0 || bags<0){
                        out.println(-1);
                        out.close();
                        break;
                    }
                }
                if (same == cowHunger.length){
                    out.println(bags);
                    out.close();
                    break;
                }
                else{
                    if (bags<0){
                        out.println("-1");
                        out.close();
                    }else{
                    bags = findmin(cowHunger, bags);
                    // System.out.println(bags);
                    }
                }
            }
        }
        f.close();
    }
    public static int findmin(int[] cowHungers, int bags){
        int min = cowHungers[0];
            for (int y=0;y<cowHungers.length;y++){
                if (cowHungers[y]<min){
                    min = cowHungers[y];
                }
            }
        if (min == cowHungers[0] && cowHungers.length<3){
            return -1;
        }
            for (int z = 0; z<cowHungers.length-1;z++){
                while(cowHungers[z]>min){
                    // System.out.println("BAAG IS BEEING INCREASED");
                    cowHungers[z]-=1;
                    cowHungers[z+1]-=1;
                    bags+=2;
                }
            }
            return bags;
    }
}
//     public static int feed(int[] cowHungers, int min, int bags){
//         // System.out.println("THIS IS BEING CALLED");
//         // for (int z = 0; z<cowHungers.length-1;z++){
//         //     while(cowHungers[z]>min){
//         //         // System.out.println("BAAG IS BEEING INCREASED");
//         //         cowHungers[z]-=1;
//         //         cowHungers[z+1]-=1;
//         //         return bags+2;
//         //     }
//         // }
//     }
// }

