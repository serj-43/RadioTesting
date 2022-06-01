public class Radio {
    private int currentVolume;
    private int currentChannel;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextChannel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
    }

    public void previousChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = 9;
        }
    }

    public int setChannel(int presetStation) {
        if ((presetStation < 10) && (presetStation >= 0)) {
            currentChannel = presetStation;
            return 1;
        } else {
            return 0;
        }
    }

    public int getChannel(){
        return currentChannel;
    }

    public int getVolume(){
        return currentVolume;
    }
}
