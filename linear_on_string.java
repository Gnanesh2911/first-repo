public class linear_on_string{
  public static void main(String[] args) {
    int[] arr = {29, 35, 18, 05, 54};
    int num = 100;
    System.out.println(linear(arr, num));
    
  }
  static int linear(int[] arr, int key)
  {
    if(arr.length == 0)
    {
      return -1;
    }
    for(int i =0; i<arr.length; i++)
    {
      if(arr[i] == key)
      {
        return i;
      }
    }
    return -1;
  }
}