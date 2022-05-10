package ru.netology;

public class Radio {

    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //переключение на следующую станцию
    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
        return;
//        if (currentStation >= 0 && currentStation < 9) {
//            currentStation++;
//        } else {
//            currentStation = 0;
//        }
//        return;
    }

    //переключения не предыдущую станцию
    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
        return;
//        if (currentStation > 0 && currentStation <= 9) {
//            currentStation = currentStation - 1;
//        } else {
//            currentStation = 9;
//        }
//        return;
    }

    //увеличение громкости
    public void increaseVolume() {
        if (volume >= 0 && volume < 10) {
            volume++;
            return;
        }
        if (volume == 10) {
            volume = volume;
            return;
        } else {
            volume = 0;
            return;
        }
    }

    // уменьшение громкости
    public void lowVolume() {
        if (volume <= 10 && volume > 0) {
            volume = volume - 1;
            return;
        }
        if (volume == 0) {
            volume = volume;
            return;
        } else
            volume = 0;
        return;
    }
}
