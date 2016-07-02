package some;


import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
new Test().test();
    }
        public void test () {
            ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            System.out.println("Task scheduled");
            executorService.scheduleAtFixedRate(() -> System.out.println("Task executed"), 1, 1, TimeUnit.SECONDS);
        }
    }
