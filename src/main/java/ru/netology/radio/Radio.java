package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int volume;
    private int maxStation;

    public Radio() {
        this.maxStation = 10; // по умолчанию — 10
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < maxStation) {
            currentStation = station;
        }
        else {
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
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
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
}