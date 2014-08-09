package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMeoryError
 *
 *
 *
 * @author DongZhukai
 * @date 14-7-23.
 */
public class HeapOOM {

  static class OOMObject{

  }

  public static void main(String[] args) {
    List<OOMObject> list = new ArrayList<OOMObject>();

    while(true){
      list.add(new OOMObject());
    }
  }
}
