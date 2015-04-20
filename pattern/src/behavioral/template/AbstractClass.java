package behavioral.template;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public abstract class AbstractClass {
  public void templateMothod(){
    doOperate1();

    doOperate2();

    doOperate3();
  }

  protected abstract void doOperate1();
  protected abstract void doOperate2();
  private final void doOperate3(){
    // do something
  }
}
