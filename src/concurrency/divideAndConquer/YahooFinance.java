package concurrency.divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class YahooFinance {
  public static double getPrice(final String ticker) throws IOException{
    final URL url = new URL("http://ichart.finance.yahoo.com/table.csv?s=" + ticker);

    final BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));


    return 0;
  }
}
