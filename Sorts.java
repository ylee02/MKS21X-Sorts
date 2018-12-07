import java.util.Random;
import java.util.Arrays;
public class Sorts {

  public static void main(String[] args) {
    int counter = 0;
    int[] ary = new int[30];
    Random ran = new Random();
    while (counter < 30) {
      ary[counter] = Math.abs(ran.nextInt() % 300);
      counter++;
    }
    System.out.println(Arrays.toString(selectionsort(ary)));
  }

  public static void bubbleSort(int[] data) {
  }

  public static int[] selectionsort(int [] ary) {
    int smallest;
    for (int y = 0; y < ary.length; y++) {
      smallest = y;
      for (int i = y; i < ary.length; i++) {
        if (ary[i] < ary[smallest]) {
          smallest = i;
        }
      }
      int temp = ary[y];
      ary[y] = ary[smallest];
      ary[smallest] = temp;
    }
    return ary;
  }

}
