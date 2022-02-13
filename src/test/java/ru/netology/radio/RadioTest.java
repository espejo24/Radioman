package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldFindCurrentStation() {      // проверили, что радио показывает текущую станцию
        Radio radio = new Radio();
        radio.getCurrentStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCurrentVolume() {    // проверили, что радио показывает текущую громкость
        Radio radio = new Radio();
        radio.getCurrentVolume();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeCurrentStation() {    // проверили, что можем менять текущую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(12);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeCurrentVolume() {    // проверили, что можем менять текущую громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeCurrentStationFalse() {    // проверили, что можем менять текущую станцию при недопустимом значении
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeCurrentVolumeFalse() {    // проверили, что можем менять текущую громкость при недопустимом значении
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldChangeCurrentStationTrue() {    // проверили, что сеттер работает на выбор допустимого значания станции
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeCurrentVolumeTrue() {    // проверили, что сеттер работает на выбор допустимого значания громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {    // проверили, что можем увеличить на 1 громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {    // проверили, что можем увеличить на 1 станцию
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {    // проверили, что после 9-ой станции 0-ая
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStation() {    // проверили, что после 0-ой станции 9-ая
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldNextVolume() {    // проверили, что после 10-ой громкости ничего
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevVolume() {    // проверили, что после 0-ой громкости ничего
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {    // проверили, что можем уменьшить на 1 громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {    // проверили, что можем уменьшить на 1 станцию
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prevStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
}


