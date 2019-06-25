package com.company;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ArraysUtilswithAssertJTest {
    private ArraysUtils arraysUtils;

    @Before
    public void setUp(){
        //given
        arraysUtils = new ArraysUtils();
    }

    @Test
    public void bubbleSort(){
        //when
        int[] array = {1,5,7,3,9,10};
        arraysUtils.bubbleSort(array);
        //then
        Assertions.assertThat(array)
                .contains(1)
                .contains(7)
                .hasSize(6);
    }
}
