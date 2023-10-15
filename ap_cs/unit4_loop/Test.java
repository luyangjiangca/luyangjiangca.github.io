public class Test{
//    public static void main(String []args){
//       int[] a = new int[]{6};
//       System.out.println(highestNumber(a));
//    }
//    public static int highestNumber(int[] numbers){
//       int max=numbers[0];
//       for(int num=0; num<numbers.length; num++){
//          if (numbers[num]>max){
//             max = numbers[num];
//          }
//       }
//       return max;
//    }
public static void main(String []args){
      double[] a = new double[]{};
      System.out.println(averageNumber(a));
   }
   public static double averageNumber(double[] numbers){
      if(numbers.length>0){
      double total = 0;
      for(double num: numbers){
         total+=num;
      }
      return (total/numbers.length);
   }else{
      return 0;
   }
   }
} 