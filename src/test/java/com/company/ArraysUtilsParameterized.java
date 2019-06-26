package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArraysUtilsParameterized {
    private int[] unsortedArray;
    private int[] sortedArray;
    private int numberToCheck;
    private int position;

    public ArraysUtilsParameterized(int[] unsortedArray, int[] sortedArray, int numberToCheck, int position) {
        this.unsortedArray = unsortedArray;
        this.sortedArray = sortedArray;
        this.numberToCheck = numberToCheck;
        this.position = position;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{4,3,5},new int[]{3,4,5},4,1},
                        {new int[]{2,3,1,-1},new int[]{-1,1,2,3},4,-5},
                        {new int[]{4,-1},new int[]{-1,4},-1,0},
                }
        );
    }

    @Test
    public void bubbleSearchTest(){
        //given
        ArraysUtils arraysUtils = new ArraysUtils();
        //when
        arraysUtils.bubbleSort(unsortedArray);
        Assert.assertArrayEquals(unsortedArray,sortedArray);
    }
    
    @Test
    public void binarySearchTest(){
        //given
        ArraysUtils arraysUtils = new ArraysUtils();
        //when
        int result=arraysUtils.binarySearch(sortedArray,numberToCheck);
        Assert.assertEquals(position,result);
    }
}
