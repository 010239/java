package concurrency.divideAndConquer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public abstract class AbstractNAV {
  public static Map<String,Integer> readTickers() throws IOException {
    final BufferedReader reader = new BufferedReader(new FileReader("stocks.txt"));
    final Map<String,Integer> stocks = new HashMap<String, Integer>();

    String stockInfo = null;
    while ((stockInfo = reader.readLine()) != null){
      final String[] stockInfoData = stockInfo.split(",");
      final String stockTicker = stockInfoData[0];
      final Integer quantity = Integer.valueOf(stockInfoData[1]);

      stocks.put(stockTicker,quantity);
    }

    return stocks;
  }

  public void timeAndComputeValue(){

  }

  public abstract double computeNetAssetValue() throws InterruptedException, ExecutionException;
}
