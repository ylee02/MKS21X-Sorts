public class Sorts {
  public static void selectionsort(int [] ary) { 
    int smallest = ary[0];
    for (int y = 0; y < ary.length; y++) {
      for (int i = 0; i < ary.length; i++) {
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