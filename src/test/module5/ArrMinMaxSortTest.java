package test.module5;


import org.junit.Assert;
import org.junit.Test;

public class ArrMinMaxSortTest {

    @Test(timeout = 3000)
    public void testDoBubbleSort() throws Exception {
        final int[] arr = {1, 2, 3, 4};
        final int[] arrToDoBubbleSort = {2, 1, 4, 3};

        ArrMinMaxSortTestDrive arrMinMaxSortTestDrive = new ArrMinMaxSortTestDrive();
        final int[] resultDoBubbleSort = arrMinMaxSortTestDrive.doBubbleSort(arrToDoBubbleSort);

        Assert.assertArrayEquals(arr, resultDoBubbleSort);
    }
    @Test(timeout = 3000)
    public void testGetMaxValue() throws Exception {
        final int[] arr = {1, 2, 3, 4};
        final int max = 4;

        ArrMinMaxSortTestDrive arrMinMaxSortTestDrive = new ArrMinMaxSortTestDrive();
        final int resultMax = arrMinMaxSortTestDrive.getMaxValue(arr);

        Assert.assertEquals(max, resultMax);
    }

    @Test(timeout = 3000)
    public void testGetMinValue() throws Exception {
        final int[] arr = {1, 2, 3, 4};
        final int min = 1;

        ArrMinMaxSortTestDrive arrMinMaxSortTestDrive = new ArrMinMaxSortTestDrive();
        final int resultMin = arrMinMaxSortTestDrive.getMinValue(arr);

        Assert.assertEquals(min, resultMin);
    }
}

