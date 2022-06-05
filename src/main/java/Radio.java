import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Radio {
    private int currentVolume;
    private int currentChannel;

    private int numberOfStations = 10;

    private int maxVolume = 100;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextChannel() {
        if (currentChannel < numberOfStations - 1) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
    }

    public void previousChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = numberOfStations - 1;
        }
    }

    public int setCurrentChannel(int presetStation) {
        if ((presetStation < (numberOfStations)) && (presetStation >= 0)) {
            currentChannel = presetStation;
            return 1;
        } else {
            return 0;
        }
    }

}
