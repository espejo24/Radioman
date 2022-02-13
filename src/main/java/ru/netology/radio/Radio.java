package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {      // получаем текущую станцию
        return currentStation;
    }

    public int getCurrentVolume() {       // получаем текущую громкость
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {    // задаем условия для смены текущей станции
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {    // задаем условия для смены текущей громкости
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {    // увеличиваем звук на 1
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void nextStation() {    // увеличиваем станцию на 1
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else currentStation = 0;
    }

    public void decreaseVolume() {    // умньшаем звук на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void prevStation() {    // уменьшаем станцию на 1
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = 9;
    }
}

