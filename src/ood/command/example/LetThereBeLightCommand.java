package ood.command.example;

import java.awt.*;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class LetThereBeLightCommand extends Button implements CommandFromGod {
  private Panel p;

  public LetThereBeLightCommand(String label, Panel p) throws HeadlessException {
    super(label);
    this.p = p;
  }

  @Override
  public void execute() {
    p.setBackground(Color.white);
  }
}
