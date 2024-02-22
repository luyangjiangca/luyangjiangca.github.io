/* Online Java Compiler and Editor */
public class HelloWorld{

  public static void main(String []args){
     BlackAndWhitePicture a = new BlackAndWhitePicture();
     a.whiteBorder();
  }
 
}
class BlackAndWhitePicture
{

 private int[][] picture = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};;

 /* returns the two-dimensional width of this picture instance */
 public int getPictureWidth()
 {
     return picture.length;
 }

 /* returns the two-dimensional height of this picture instance */
 public int getPictureHeight()
 {
     return picture[0].length;
 }    

 /* Returns a new two-dimensional picture instance that is 
    identical to the two-dimensional picture represented in 
    this instance, but with an added 1 pixel white border.
    Postcondition: the two-dimensional picture instance that 
              is represented in this instance should not be 
              modified.
 */ 
 public void whiteBorder() {
         int[][] p = this.picture;
         for (int row = 0; row < p.length; row++) {
             for (int col = 0; col < p[row].length; col++) {
                 System.out.print(p[row][col]);
             }
             System.out.println("");
         }
         int l = this.getPictureHeight() + 2;
         int w = this.getPictureWidth() + 2;
         int[][] p2 = new int[l][w];
         for (int y = 1; y < p2.length-1; y++) {
             for (int x = 1; x < p2[0].length-1; x++) {
                //  if(y<p.length+1&&x<p[0].length+1){
                //  p2[y][x] = p[y-1][x-1];
                //  }
                p2[y][x] = p[y-1][x-1];
             }
         }
         for(int z =0; z<5; z++){
             for(int a =0; a<5; a++){
                 System.out.print(p2[z][a]);
             }
             System.out.println("");
         }
 }

}