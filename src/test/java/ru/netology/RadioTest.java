package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radoiman = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = "/userChoise.csv")
    public void shouldStation(String test, int userInstallation, int expected) {

        radoiman.setCurrentStation(userInstallation);
        int actual = radoiman.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/nextStation.csv")
    public void shouldNextStation(String test, int currentStation, int expected) {

        radoiman.setCurrentStation(currentStation);
        radoiman.nextStation();
        int actual = radoiman.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prevStation.csv")
    public void shouldPrevStation(String test, int currentStation, int expected) {

        radoiman.setCurrentStation(currentStation);
        radoiman.prevStation();
        int actual = radoiman.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/increaseVolume.csv")
    public void shouldIncreaseVolume(String test, int volume, int expected) {

        radoiman.setVolume(volume);
        radoiman.increaseVolume();
        int actual = radoiman.getVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/lowVolume.csv")
    public void shouldLowVolume(String test, int volume, int expected) {

        radoiman.setVolume(volume);
        radoiman.lowVolume();
        int actual = radoiman.getVolume();

        assertEquals(expected, actual);
    }
}