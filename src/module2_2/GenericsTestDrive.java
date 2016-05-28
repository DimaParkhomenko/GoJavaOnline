package module2_2;

public class GenericsTestDrive {
    public static void main(String[] args) {
        Task<Integer>[] intTasks = new IntegerTask[5];
        intTasks[0] = new IntegerTask(25);
        intTasks[1] = new IntegerTask(32);
        intTasks[2] = new IntegerTask(47);
        intTasks[3] = new IntegerTask(19);
        intTasks[4] = new IntegerTask(48);

        Executor<Number> numberExecutor = new ExecutorImpl<>();

        for (Task<Integer> intTask : intTasks) {
            numberExecutor.addTask(intTask);
        }
        numberExecutor.addTask(new LongTask(10L), new NumberValidator());
        numberExecutor.addTask(new DoubleTask(39.2389)); // if number after point % 2 == 0 than doubleNumber is ValidResult

        numberExecutor.execute();

        System.out.println("Valid results:");
        for (Number number : numberExecutor.getValidResults()) {
            System.out.println(number);
        }
        System.out.println("Invalid results:");
        for (Number number : numberExecutor.getInvalidResults()) {
            System.out.println(number);
        }
    }
}