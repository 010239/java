package creational.builder;

/**
 * @author DongZhukai
 * @date 14-7-28.
 */
public abstract class Builder {
  public abstract void buildPart1();

  public abstract void buildPart2();

  public abstract Product retrieveResult();
}
