package test.module2_2;

import module2_2.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExecutorImplTest {


    @Test
    public void testExecuteWithoutValidator() throws Exception {
       ExecutorImpl<Integer> executor = new ExecutorImpl<>();
        Task<Integer>[] intTasks = new IntegerTask[1];
        intTasks[0] = new IntegerTask(2);
        Executor<Number> numberExecutor = new ExecutorImpl<>();

        for (Task<Integer> intTask : intTasks) {
            numberExecutor.addTask(intTask);
        }

        numberExecutor.addTask(new LongTask(10L), new NumberValidator());
        numberExecutor.addTask(new DoubleTask(39.2389)); // if number after point % 2 == 0 than doubleNumber is ValidResult

        Assert.assertEquals(numberExecutor.getValidResults().get(1), Integer.valueOf(0));
    }


}