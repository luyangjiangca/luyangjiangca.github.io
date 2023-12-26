package ap_cs.unit8_two_dimension_array;

public class Unit8_Two_Dimension_Array {
    public static void main(String []args) {
        int[][] a = new int[2][3];//2 rows, 3 col
        /*[
            [1,2,3],
            [4,5,6],
        ]*/
        //put 1-6 into array a
        int start = 1;
        // for(int r = 0; r< 2; r++) {
        //     for(int c = 0; c< 3; c++) {
        //         a[r][c] = start;
        //         start++;     
        //     }
        // }

        for(int r = 0; r< 2; r++) {
            for(int c = 0; c< 3; c++) {
                System.out.print(a[r][c]); 
            }
            System.out.println();
        }

    }
}
