package ru.netology.service;

public class Radio {
    private int currentStation; // значения в пределах от 0 до 9
    private int volume; // уровень звука в пределах от 0 до 100

    //___________Station____________
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void next() {
        int next = 0;
        if (currentStation != 9) {
            currentStation++;
        } else setCurrentStation(next);
    }

    public void prev() {
        int prev = 9;
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
