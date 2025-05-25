package ap_cs.unit8_two_dimension_array;
// import java.lang.Math
public class Battlefield {
    private boolean[][] battlefieldGrid;
    public static void main (String [] args){
        //initialize your class
        Battlefield bf = new Battlefield();
        bf.battlefieldGrid = new boolean[5][4];
        double mine = 0;
        for(int x=0; x<bf.battlefieldGrid.length; x++){
            for(int y=0; y<bf.battlefieldGrid[0].length; y++){
                mine = Math.random();
                if (mine >= 0.5){
                bf.battlefieldGrid[x][y]= true;
                }else{
                bf.battlefieldGrid[x][y]=false;
                }
            }
        }
        for(int x=0; x<bf.battlefieldGrid.length; x++){
            for(int y=0; y<bf.battlefieldGrid[0].length; y++){
                System.out.print(bf.battlefieldGrid[x][y]);
            }
            System.out.println();
        }
        //test case
        for(int z = 0; z<bf.battlefieldGrid.length; z++){
        System.out.println(bf.canSafelyCross(z));
        }
            //return true if landmine, false if not 
    }
    public boolean hasMine(int row, int col){
        return this.battlefieldGrid[row][col];
        
    }
    

            //true iif can cross with no landmine, false if not
    public boolean canSafelyCross(int rowToCross){
        int i = 0;
        while (i<this.battlefieldGrid[0].length){
            if(this.hasMine(rowToCross,i)){
                return false;
                // i+=1;
                // if (i>this.battlefieldGrid[0].length){
                //     return true;
                // }
            }else{
                i+=1;
            }
        }
        return true;
    }

    }