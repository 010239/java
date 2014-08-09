package javapattern.behavioral.template;


/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class ConcreteClass extends AbstractClass {
  @Override
  protected void doOperate1() {
    System.out.println("doOperate 1");
  }

  @Override
  protected void doOperate2() {
    System.out.println("doOperate 2");
  }
}
