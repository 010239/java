package myenum;

/**
 * @author DongZhukai
 * @date 14-7-31.
 */
public class Test_Week {
  public static void main(String[] args) {
    //获取枚举类型中的全部枚举值
    Week[] days = Week.values();
    for(Week day : days) {
      //返回枚举常量的名称
      String name = day.name();
      //返回枚举常量的序数（常量在枚举声明中的位置，从0开始）
      int ordinal = day.ordinal();
      String toString = day.toString();
      Class declaringClass = day.getDeclaringClass();
      Class superClass = declaringClass.getSuperclass();
      System.out.println(
              "Name: " + name
                      + "\n"
                      + "Ordinal: " + ordinal
                      + "\n"
                      + "ToString: " + toString
                      + "\n"
                      + "DeclaringClass: " + declaringClass
                      + "\n"
                      + "SuperClass: " + superClass
                      + "\n"
      );
    }

    //创建枚举变量
    //直接创建枚举常量
    Week mon = Week.MONDAY;
    //使用Enum的valueOf()静态方法创建枚举常量
    Week tues = Enum.valueOf(Week.class, "TUESDAY");
    //使用枚举类型的valueOf()静态方法创建枚举常量
    Week wed = Week.valueOf("WEDNESDAY");

    //比较枚举变量，实际上是比较它们序数的大小
    System.out.println(mon.compareTo(tues));
    System.out.println(tues.compareTo(wed));
    System.out.println(wed.compareTo(mon));
  }

}
