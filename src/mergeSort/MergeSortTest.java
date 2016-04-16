package mergeSort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {
    @Test
    public void testSort() throws Exception {
        int[] arr = {2, 1, 9, 3};
        int[] correctArr = {1, 2, 3, 9};
        MergeSort mergeSort = new MergeSort();
        Assert.assertArrayEquals(correctArr, mergeSort.sort(arr));
    }

    @Test
    public void testMerge() throws Exception {
        int[] arrFirst = {2, 9, 1};
        int[] arrSecond = {8, 1, 7};

        MergeSort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(mergeSort.merge(arrFirst, arrSecond)));
    }

}

