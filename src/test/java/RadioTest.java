import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

    @Test
    void VolumeUp() {
        Radio radioObject = new Radio();
        int expected = 1;
        radioObject.increaseVolume();
        int actual = radioObject.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void VolumeDown() {
        Radio radioObject = new Radio();
        int expected = 4;
        for (int i = 0; i < 5; i++) {
            radioObject.increaseVolume();
        }
        radioObject.decreaseVolume();
        int actual = radioObject.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void VolumeBottom() {
        Radio radioObject = new Radio();
        int expected = 0;
        radioObject.decreaseVolume();
        int actual = radioObject.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void VolumeTop() {
        Radio radioObject = new Radio();
        int expected = 10;
        for (int i = 0; i < 11; i++) {
            radioObject.increaseVolume();
        }
        int actual = radioObject.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelAvailSet() {
        Radio radioObject = new Radio();
        int expected = 1;
        int actual = radioObject.setChannel(5);
        assertEquals(expected, actual);
    }

    @Test
    void ChannelNotAvailPosSet() {
        Radio radioObject = new Radio();
        int expected = 0;
        int actual = radioObject.setChannel(10);
        assertEquals(expected, actual);
    }

    @Test
    void ChannelNotAvailNegSet() {
        Radio radioObject = new Radio();
        int expected = 0;
        int actual = radioObject.setChannel(-1);
        assertEquals(expected, actual);
    }

    @Test
    void ChannelForwardRoll() {
        Radio radioObject = new Radio();
        int expected = 0;
        radioObject.setChannel(9);
        radioObject.nextChannel();
        int actual = radioObject.getChannel();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelBackwardRoll() {
        Radio radioObject = new Radio();
        int expected = 9;
        radioObject.setChannel(0);
        radioObject.previousChannel();
        int actual = radioObject.getChannel();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelBackward() {
        Radio radioObject = new Radio();
        int expected = 7;
        radioObject.setChannel(8);
        radioObject.previousChannel();
        int actual = radioObject.getChannel();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelForward() {
        Radio radioObject = new Radio();
        int expected = 4;
        radioObject.setChannel(3);
        radioObject.nextChannel();
        int actual = radioObject.getChannel();
        assertEquals(expected, actual);
    }
}
