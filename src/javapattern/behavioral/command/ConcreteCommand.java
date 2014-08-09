package javapattern.behavioral.command;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class ConcreteCommand implements Command {
  private Receiver receiver;

  public ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.action();
  }
}
