package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressedPrevButton() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.next();

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressedPrevButton3() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prev();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

   // _________________Volume________________

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        int expected = 15;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(86);
        radio.increaseVolume();

        int expected = 87;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(47);
        radio.decreaseVolume();

        int expected = 46;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}