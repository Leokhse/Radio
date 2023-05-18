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
    public void nextStation_CurrentStationNotMax_SwitchesToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }


    @Test
    public void nextStation_CurrentStationIsMax_SwitchesToStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void prevStation_CurrentStationNotMin_SwitchesToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();
        Assertions.assertEquals(6, radio.getCurrentStation());
    }


    @Test
    public void prevStation_CurrentStationIsMin_SwitchesToStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void setStation_ValidStation_SetsCurrentStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }


    @Test
    public void setStation_InvalidStation_DoesNotChangeCurrentStation() {
        Radio radio = new Radio();
        radio.setStation(15);
        Assertions.assertEquals(0, radio.getCurrentStation());
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
    public void getCurrentStation_Initially_ReturnsZero() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void getVolume_Initially_ReturnsZero() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getVolume());
    }


    @Test
    public void Radio_ConstructorWithValidStation_SetsCurrentStation() {
        Radio radio = new Radio(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }
    @Test
    public void Radio_ConstructorWithInvalidStation_SetsCurrentStationToZero() {
        Radio radio = new Radio(15);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void Radio_ConstructorWithValidVolume_SetsVolume() {
        Radio radio = new Radio(50);
        Assertions.assertEquals(0, radio.getVolume());
    }


    @Test
    public void Radio_ConstructorWithInvalidVolume_SetsVolumeToZero() {
        Radio radio = new Radio(120);
        Assertions.assertEquals(0, radio.getVolume());
    }
    @Test
    public void setCurrentStation_NegativeValue_DoesNotChangeCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void setCurrentStation_ValueExceedsMaxStation_DoesNotChangeCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void setStation_NegativeValue_DoesNotChangeCurrentStation() {
        Radio radio = new Radio();
        radio.setStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void setStation_ValueExceedsMaxStation_DoesNotChangeCurrentStation() {
        Radio radio = new Radio();
        radio.setStation(11);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void setVolume_NegativeValue_DoesNotChangeVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        Assertions.assertEquals(0, radio.getVolume());
    }
    @Test
    public void setVolume_ValueExceedsMaxVolume_DoesNotChangeVolume() {
        Radio radio = new Radio();
        radio.setVolume(101);
        Assertions.assertEquals(0, radio.getVolume());
    }

}
