package concurrency.divideAndConquer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class ConcurrentNAV extends AbstractNAV {
  public double computeNetAssetValue() throws InterruptedException, ExecutionException {
    final int numberOfCores = Runtime.getRuntime().availableProcessors();
    final double blockingCoefficient = 0.9;
    final int poolSize = (int) (numberOfCores / (1 - blockingCoefficient));
    final List<Callable<Double>> partions = new ArrayList<Callable<Double>>();

    final ExecutorService executorPool = Executors.newFixedThreadPool(poolSize);
    final List<Future<Double>> valueOfStocks = executorPool.invokeAll(partions,10000, TimeUnit.SECONDS);

    double netAssetValue = 0.0;
    for(final Future<Double> valueOfAStock : valueOfStocks){
      netAssetValue += valueOfAStock.get();
    }

    executorPool.shutdown();
    return netAssetValue;
  }

  public static void main(String[] args) {
    new ConcurrentNAV().timeAndComputeValue();
  }
}
