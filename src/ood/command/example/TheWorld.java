package ood.command.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class TheWorld extends Frame implements ActionListener {
  private LetThereBeLandCommand btnLand;
  private LetThereBeLightCommand btnLight;
  private Panel p;

  public TheWorld() throws HeadlessException {
    super("This is the world, and God syas ...");
    p = new Panel();
    p.setBackground(Color.black);

    add(p);
    btnLand = new LetThereBeLandCommand("Let there be land", p);
    btnLight = new LetThereBeLightCommand("Let there be light", p);
    p.add(btnLand);
    p.add(btnLight);
    btnLight.addActionListener(this);
    btnLand.addActionListener(this);
    setBounds(100,100,400,200);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    CommandFromGod cmd = (CommandFromGod) e.getSource();
    cmd.execute();
  }

  public static void main(String[] args) {
    new TheWorld();
  }
}
