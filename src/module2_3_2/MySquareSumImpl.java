package module2_3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;
/*
Домашнее задание к модулю 3.2
Grade: N/A
View Grade Information. Opens a dialogue
Используя Phaser и Executors реализовать класс, который бы считал сумму квадратов элементов массива параллельно в заданном количестве потоков

interface SquareSum {
    long getSquareSum(int[] values, int numberOfThreads);
}
Идея в том, чтобы разбить массив на равные части и найти сумму квадратов в каждом кусочке в отдельном потоке параллельно.
Используя Phaser, дождаться результатов всех вычислений и сложить их, получив конечный результат.
 */

public class MySquareSumImpl implements SquareSum {
    private List<Callable<Long>> tasks = new ArrayList<>();
    private List<Future<Long>> sums = new ArrayList<>();
    private final Phaser phaser = new Phaser();
    private long finalSum;

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        IntStream.range(0, numberOfThreads).forEach(i -> tasks.add(() -> {
            long sum = 0;

            phaser.register();

            int from = (i * values.length) / numberOfThreads;
            int to = ((i + 1) * values.length) / numberOfThreads;

            for (int k = from; k < to; k++) {
                sum += StrictMath.pow(values[k], 2);
            }

            phaser.arriveAndAwaitAdvance();
            phaser.arriveAndDeregister();
            return sum;
        }));

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        try {
            sums = executorService.invokeAll(tasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Future sum : sums) {
            try {
                finalSum += (long) sum.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();

        return finalSum;
    }
}


