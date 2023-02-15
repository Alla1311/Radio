package ru.netology;

public class Radio {
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void SetToMaxRadioStation() {
        currentRadioStation = 9;
    }

    public void SetToMinRadioStation() {
        currentRadioStation = 0;
    }

    public void prev(int newCurrentRadioStation) {
        if (newCurrentRadioStation <= 9) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (newCurrentRadioStation < 0) {
            currentRadioStation = 9;
        }
    }

    public void next(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            currentRadioStation = 0;
        }
        if (newCurrentRadioStation >= 0) {
            currentRadioStation = currentRadioStation + 1;
        }
    }


    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void SetToMaxVolume() {
        currentVolume = 10;
    }

    public void SetToMinVolume() {
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void IncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            currentVolume = 0;
        }
        if (newCurrentVolume >= 0) {
            currentVolume = currentVolume + 1;
        }
    }

}