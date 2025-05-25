public class MultiplicationTable{

      public static void main(String []args){
         renderTable(8, 5);
          }
       
       private static int multiplyNumbers(int num1, int num2){
          int ans=0;
         for(int i = 0; i<num1;i++)
          {
             ans+=num2;
          }
          return ans;
       }
       private static void renderTable(int xDim, int yDim){
         System.out.print("x ");
         for (int z=1;z<=xDim;z++){
            System.out.print(z+" ");
         }
         System.out.println();
         for (int y=1; y<=yDim; y++){
            System.out.print(y+" ");
            for (int x=1; x<=xDim; x++){
            System.out.print(multiplyNumbers(y, x)+" ");
         }
         System.out.println();
         }
      }
   }