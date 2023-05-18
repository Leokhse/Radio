package ru.netology.radio;


public class Radio {
    private int currentStation;
    private int volume;
    private final int maxStation;


    public Radio() {
        this.maxStation = 10; // по умолчанию 10 станций
    }


    public Radio(int station) {
        this.maxStation = 10; // по умолчанию 10 станций
        setCurrentStation(station);
        this.volume = 0; // Установка начальной громкости на 0
    }


    public void setCurrentStation(int station) {
        if (station >= 0 && station < maxStation) {
            currentStation = station;
        }
    }


    public int getCurrentStation() {
        return currentStation;
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


    public void setStation(int station) {
        if (station >= 0 && station < maxStation) {
            currentStation = station;
        }
    }


    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }


    public int getVolume() {
        return volume;
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
}
