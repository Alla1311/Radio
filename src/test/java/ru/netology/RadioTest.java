package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextTestRadioStation(){
        Radio radio = new Radio(20);
        radio.setMaxRadioStation(16);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(15);
        radio.nextCurrentRadioStation();
        Assertions.assertEquals(16, radio.getCurrentRadioStation());
    }
    @Test
    public void prevTestRadioStation(){
        Radio radio = new Radio(20);
        radio.setMaxRadioStation(18);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(19);
        radio.prevCurrentRadioStation();
        Assertions.assertEquals(18, radio.getCurrentRadioStation());
    }

    @Test
    public void nextCurrentStationTestNormalRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(6);
        radio.nextCurrentRadioStation();
        Assertions.assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void nextCurrentStationTestMaxBorderRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(9);
        radio.nextCurrentRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevCurrentStationTestNormalRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(5);
        radio.prevCurrentRadioStation();
        Assertions.assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void prevCurrentStationTestMinBorderRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(0);
        radio.prevCurrentRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void remoteCurrentStationTestNormalRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(6);
        radio.remoteCurrentRadioStation(6);
        Assertions.assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void remoteCurrentStationTestOverMaxRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(5);
        radio.remoteCurrentRadioStation(10);
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void remoteCurrentStationTestUndereMinRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(7);
        radio.remoteCurrentRadioStation(-1);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextCurrentVolumeTestNormalVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        radio.nextCurrentVolume();
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeTestMaxBorderVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.nextCurrentVolume();
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestNormalVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        radio.prevCurrentVolume();
        Assertions.assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestMinBorderVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.prevCurrentVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMaxRadioStationTest() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        Assertions.assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void setMinRadioStationTest() {
        Radio radio = new Radio();
        radio.setMinRadioStation(0);
        Assertions.assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void setCurrentStationTestOverMaxRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(80);
        Assertions.assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentStationTestUnderMinRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(7);
        radio.setCurrentRadioStation(-1);
        Assertions.assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void setMaxVolumeTest() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setMinVolumeTest() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        Assertions.assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setCurrentVolumeTestOverMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(8);
        radio.setCurrentVolume(500);
        Assertions.assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(20);
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(20, radio.getCurrentVolume());
    }

}


