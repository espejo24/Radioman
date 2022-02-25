package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {                     // no args
    }

    public Radio(int maxStation) {         // задаем кол-во станций
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {      // получаем текущую станцию
        return currentStation;
    }

    public int getCurrentVolume() {       // получаем текущую громкость
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void nextStation() {
        if (currentStation < maxStation - 1) {    // при десяти станциях 9-ая - последняя
            currentStation = currentStation + 1;
        } else currentStation = 0;
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = maxStation - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

