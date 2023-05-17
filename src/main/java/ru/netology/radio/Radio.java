package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int volume;
    private final int maxStation;
    private final int maxVolume;

    public Radio() {
        this.maxStation = 10; // значение по умолчанию
        this.maxVolume = 100; // значение по умолчанию
    }

    public Radio(int maxStation, int maxVolume) {
        this.maxStation = maxStation;
        this.maxVolume = maxVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < maxStation) {
            currentStation = station;
        } else {
            currentStation = 0; // Переключение на первую станцию
        }
    }

    public void nextStation() {
        if (currentStation == maxStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation - 1;
        } else {
            currentStation--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= maxVolume) {
            this.volume = volume;
        }
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }
}