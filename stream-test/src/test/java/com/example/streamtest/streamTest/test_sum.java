package com.example.streamtest.streamTest;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class test_sum {
    
    @Test
    void sum_integer() {
        List<Integer> list = Arrays.asList(3, 2, 1, 5, 4);
        
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println("sum = " + sum);

        int sum1 = list.stream().mapToInt(o -> o).sum();
        System.out.println("sum1 = " + sum1);
    }

    @Test
    void sum_long() {
        List<Long> list = Arrays.asList(3L, 2L, 1L, 5L, 4L);

        Long sum = list.stream().reduce(0L, Long::sum);
        System.out.println("sum = " + sum);

        long sum1 = list.stream().mapToLong(o -> o).sum();
        System.out.println("sum1 = " + sum1);
    }

    @Test
    void sum_float() {
        List<Float> list = Arrays.asList(1f, 2f, 3f, 4f, 5f);

        Float sum = list.stream().reduce(0f, Float::sum);
        System.out.println("sum = " + sum);

        double sum1 = list.stream().mapToDouble(o -> o).sum();
        System.out.println("sum1 = " + sum1);
    }

    @Test
    void sum_double() {
        List<Double> list = Arrays.asList(1d, 2d, 3d, 4d, 5d);

        Double sum = list.stream().reduce(0d, Double::sum);
        System.out.println("sum = " + sum);

        double sum1 = list.stream().mapToDouble(o -> o).sum();
        System.out.println("sum1 = " + sum1);
    }

    @Test
    void sum_BigInteger() {
        List<BigInteger> list = Arrays.asList(
                BigInteger.valueOf(1),
                BigInteger.valueOf(2),
                BigInteger.valueOf(3),
                BigInteger.valueOf(4),
                BigInteger.valueOf(5)
        );

        BigInteger sum = list.stream().reduce(BigInteger.ZERO, BigInteger::add);
        System.out.println("sum = " + sum);
    }

    @Test
    void sum_BigDecimal() {
        List<BigDecimal> list = Arrays.asList(
                BigDecimal.valueOf(1),
                BigDecimal.valueOf(2),
                BigDecimal.valueOf(3),
                BigDecimal.valueOf(4),
                BigDecimal.valueOf(5)
        );

        BigDecimal sum = list.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("sum = " + sum);
    }
}
