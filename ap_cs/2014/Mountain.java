public class Mountain {
  public static void main(String[] args) {
    // case 1: true
    int[] array = { 1, 2, 3, 2, 1 };
    System.out.print(isMountain(array));

    // case 2: false
    int[] array = { 1, 2, 1, 2, 1 };
    System.out.print(isMountain(array));

    // case 3: false
    int[] array = { 1, 2, 3, 1, 5 };
    System.out.print(isMountain(array));

    // case 4: true
    int[] array = { 1, 4, 2, 1, 0 };
    System.out.print(isMountain(array));

    // case 5: false
    int[] array = { 9, 3, 5, 7, 5 };
    System.out.print(isMountain(array));

    // case 3: false
    int[] array = { 3, 2, 1 };
    System.out.print(isMountain(array));
  }

  public static int getPeakIndex(int[] array)// point 4
  {
    for (int i = 1; i < array.length - 1; i++) {
      if (array[i - 1] < array[i] && array[i + 1] < array[i]) {
        return i;
      }
    }
    return -1;
  }

  /**
   * 
   * @param array
   * @param stop the last index to check
   * Precondition 0<= stop < array.length
   * @return true if for each j such that 0 <= j < stop, array[j] < array[j+1]
   */
  public static boolean isIncreasing(int[] array, int stop) {

  }

  /**
   * 
   * @param array
   * @param start the first index to check
   * Precondition 0<= start < array.length - -1
   * @return true if for each j such that start <= j < array.length -1, array[j] > array[j+1]
   */
  public static boolean isDecreasing(int[] array, int start) {

  }

  public static boolean isMountain(int[] array) {
    int max = 0;
    int peak = getPeakIndex(array);
    if (peak != -1) {
      max = peak;
      for (int i = peak - 1; i > 0; i--) {
        if (array[i] < max) {
          max = array[i];
        } else {
          return false;
        }
      }
      max = peak;
      for (int i = peak + 1; i < array.length; i++) {
        if (array[i] < max) {
          max = array[i];
        } else {
          return false;
        }
      }
      return true;
    } else {
      return false;
    }
  }

}
