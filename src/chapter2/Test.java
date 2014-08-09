package chapter2;

/**
 * @author DongZhukai
 * @date 14-7-29.
 */
public class Test {
  public static int cal(int x){
    if(x < 0){
      return 0;
    }else{
      return x + cal(x);
    }
  }

  public static void main(String[] args) {
    int i = cal(5);
    System.out.println(i);
  }
}
