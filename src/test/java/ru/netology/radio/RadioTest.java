package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentStation_ValidStation_SetsCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStation_InvalidStation_DoesNotChangeCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStation_CurrentStationNot9_SwitchesToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void nextStation_CurrentStationIs9_SwitchesToStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStation_CurrentStationNot0_SwitchesToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void prevStation_CurrentStationIs0_SwitchesToStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void setVolume_ValidVolume_SetsVolume() {
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
        radio.setVolume(70);
        radio.increaseVolume();
        Assertions.assertEquals(71, radio.getVolume());
    }

    @Test
    public void increaseVolume_VolumeIsMax_DoesNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void decreaseVolume_VolumeNotMin_DecreasesVolumeByOne() {
        Radio radio = new Radio();
        radio.setVolume(30);
        radio.decreaseVolume();
        Assertions.assertEquals(29, radio.getVolume());
    }

    @Test
    public void decreaseVolume_VolumeIsMin_DoesNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }
    @Test
    public void nextStation_CurrentStationIsNot9_SwitchesToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void prevStation_CurrentStationIsNot0_SwitchesToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();
        Assertions.assertEquals(6, radio.getCurrentStation());
    }
    @Test
    public void setVolumeValidVolume_SetsVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        Assertions.assertEquals(50, radio.getVolume());
    }

    @Test
    public void setVolumeInvalidVolume_DoesNotChangeVolume() {
        Radio radio = new Radio();
        radio.setVolume(120);
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void increaseVolumeVolumeNotMax_IncreasesVolumeByOne() {
        Radio radio = new Radio();
        radio.setVolume(70);
        radio.increaseVolume();
        Assertions.assertEquals(71, radio.getVolume());
    }

    @Test
    public void decreaseVolumeVolumeNotMin_DecreasesVolumeByOne() {
        Radio radio = new Radio();
        radio.setVolume(30);
        radio.decreaseVolume();
        Assertions.assertEquals(29, radio.getVolume());
    }
    @Test
    public void setCurrentStation_NegativeStation_DoesNotChangeCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStation_StationGreaterThanMax_DoesNotChangeCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void nextStation_CurrentStationIsMax_SwitchesToStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStation_CurrentStationIsMin_SwitchesToStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void setVolume_MaxVolume_SetsVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void setVolumeInvalidVolumeDoesNotChangeVolume() {
        Radio radio = new Radio();
        radio.setVolume(120);
        Assertions.assertEquals(0, radio.getVolume());
    }
    @Test
    public void setCurrentStation_InvalidStation_DoesNotChangeCurrentStationOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void setStation_shouldSetCurrentStationIfNumberIsWithinRange() {
        Radio radio = new Radio();

        radio.setStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());

        radio.setStation(0);
        Assertions.assertEquals(0, radio.getCurrentStation());

        radio.setStation(9);
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void setStation_shouldNotSetCurrentStationIfNumberIsLessThanZero() {
        Radio radio = new Radio();

        radio.setStation(-1);
        Assertions.assertNotEquals(-1, radio.getCurrentStation());

        radio.setStation(-10);
        Assertions.assertNotEquals(-10, radio.getCurrentStation());
    }

    @Test
    void setStation_shouldNotSetCurrentStationIfNumberIsGreaterThanNine() {
        Radio radio = new Radio();

        radio.setStation(10);
        Assertions.assertNotEquals(10, radio.getCurrentStation());

        radio.setStation(15);
        Assertions.assertNotEquals(15, radio.getCurrentStation());
    }
    @Test
    void setVolume_shouldSetVolumeIfValueIsWithinRange() {
        Radio radio = new Radio();

        radio.setVolume(50);
        Assertions.assertEquals(50, radio.getVolume());

        radio.setVolume(0);
        Assertions.assertEquals(0, radio.getVolume());

        radio.setVolume(100);
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    void setVolume_shouldNotSetVolumeIfValueIsLessThanZero() {
        Radio radio = new Radio();

        radio.setVolume(-1);
        Assertions.assertNotEquals(-1, radio.getVolume());

        radio.setVolume(-10);
        Assertions.assertNotEquals(-10, radio.getVolume());
    }

    @Test
    void setVolume_shouldNotSetVolumeIfValueIsGreaterThanHundred() {
        Radio radio = new Radio();

        radio.setVolume(101);
        Assertions.assertNotEquals(101, radio.getVolume());

        radio.setVolume(200);
        Assertions.assertNotEquals(200, radio.getVolume());
    }
}
