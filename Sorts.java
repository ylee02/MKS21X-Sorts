import java.util.Random;
import java.util.Arrays;
public class Sorts {

  public static void main(String[] args) {
    int counter = 0;
    int[] ary = new int[300];
    Random ran = new Random();
    while (counter < 300) {
      ary[counter] = ran.nextInt() % 300;
      counter++;
    }
    System.out.println(Arrays.toString(insertionSort(ary)));
  }

  public static int[] bubbleSort(int[] data) {
    for (int i = 0; i < data.length - 1; i++) {
      for (int j = 0; j < data.length - i - 1; j++) {
        if (data[j] > data[j + 1]) {
          int temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        }
      }
    }
    return data;
  }

  public static int[] selectionSort(int[] ary) {
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

  public static int[] insertionSort(int[] ary) {
    for (int i = 1; i < ary.length; i++) {
      if (ary[i - 1] > ary[i]) {
        boolean done = false;
        int y = i;
        int temp = ary[y];
        while (! done) {
          if (y == 0 || ary[y - 1] > ary[y]) {
            ary[y + 1] = ary[y];
            ary[y] = temp;
            done = true;
          }
          else {
            ary[y + 1] = ary[y];
            y--;
          }
        }
      }
    }
    return ary;
  }

}
