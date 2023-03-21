package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerTest {
    @Test
    public void test1() {
        Freelancer service = new Freelancer();

        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void test2() {
        Freelancer service = new Freelancer();

        int actual = service.calculate(100000, 60000, 150000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);


    }
}