package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void constructor_DefaultValues_CreatesRadioWithDefaultValues() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getMaxStation());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void constructor_CustomMaxStationAndMaxVolume_CreatesRadioWithCustomMaxStationAndMaxVolume() {
        int maxStation = 5;
        int maxVolume = 50;
        Radio radio = new Radio(maxStation, maxVolume);
        Assertions.assertEquals(maxStation, radio.getMaxStation());
        Assertions.assertEquals(maxVolume, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void setCurrentStation_ValidStation_ChangesCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStation_InvalidStation_DoesNotChangeCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStation_CurrentStationIsNotMax_SwitchesToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.nextStation();
        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void nextStation_CurrentStationIsMax_SwitchesToFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation() - 1);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStation_CurrentStationIsNotMin_SwitchesToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prevStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void prevStation_CurrentStationIsMin_SwitchesToLastStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(radio.getMaxStation() - 1, radio.getCurrentStation());
    }

    @Test
    public void setVolume_ValidVolume_ChangesVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        Assertions.assertEquals(50, radio.getVolume());
    }

    @Test
    public void setVolume_InvalidVolume_DoesNotChangeVolume() {
        Radio radio = new Radio();
        radio.setVolume(120);
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void increaseVolume_VolumeNotMax_IncreasesVolumeByOne() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.increaseVolume();
        Assertions.assertEquals(51, radio.getVolume());
    }

    @Test
    public void increaseVolume_VolumeIsMax_DoesNotChangeVolume() {
        Radio radio = new Radio();
        radio.setVolume(radio.getMaxVolume());
        radio.increaseVolume();
        Assertions.assertEquals(radio.getMaxVolume(), radio.getVolume());
    }
    @Test
    public void decreaseVolume_VolumeNotMin_DecreasesVolumeByOne() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.decreaseVolume();
        Assertions.assertEquals(49, radio.getVolume());
    }

    @Test
    public void decreaseVolume_VolumeIsMin_DoesNotChangeVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }
}