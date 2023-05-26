package ru.netology.service;

public class Radio {
    private int volume;
    private int maxStation;
    private int minStation;
    private int currentStation = minStation;


    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
    }

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;
        this.minStation = 0;
    }

    //___________Station____________
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < this.minStation) {
            return;
        }
        if (newCurrentStation > this.maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void next() {
        int next = this.minStation;
        if (currentStation != this.maxStation) {
            currentStation++;
        } else setCurrentStation(next);
    }

    public void prev() {
        int prev = this.maxStation;
        if (currentStation != 0) {
            currentStation--;
        } else setCurrentStation(prev);
    }

    //____________Volume___________

    public int getSoundVolume() {
        return volume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }

}
