package com.rmacedo.codility.lesson_00_demo_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution5 implements SolutionInterface {
    public int solution(int[] A) {
        Arrays.sort(A);
        List<Integer> list = new ArrayList<>();
        for(int i:A) {
            list.add(i);
        }
        int index = 1;
        while (list.contains(index)) {
            index++;
        }
        return index;
    }
}
