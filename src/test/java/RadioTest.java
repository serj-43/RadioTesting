import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

    @Test
    void VolumeDown() {
        Radio radioObject = new Radio();
        int expected = 4;
        radioObject.setCurrentVolume(5);
        radioObject.decreaseVolume();
        int actual = radioObject.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void VolumeUp() {
        Radio radioObject = new Radio();
        int expected = 1;
        radioObject.increaseVolume();
        int actual = radioObject.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void VolumeBottom() {
        Radio radioObject = new Radio();
        int expected = 0;
        radioObject.decreaseVolume();
        int actual = radioObject.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void VolumeTop() {
        Radio radioObject = new Radio();
        int expected = 100;
        radioObject.setCurrentVolume(100);
        radioObject.increaseVolume();
        int actual = radioObject.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelAvailSet() {
        Radio radioObject = new Radio(30);
        int expected = 25;
        radioObject.setCurrentChannel(25);
        int actual = radioObject.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelNotAvailPosSet() {
        Radio radioObject = new Radio(50);
        int expected = 0;
        radioObject.setCurrentChannel(100);
        int actual = radioObject.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelNotAvailNegSet() {
        Radio radioObject = new Radio(10);
        int expected = 0;
        radioObject.setCurrentChannel(-1);
        int actual = radioObject.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelForwardRoll() {
        Radio radioObject = new Radio(20);
        int expected = 0;
        radioObject.setCurrentChannel(19);
        radioObject.nextChannel();
        int actual = radioObject.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelBackwardRoll() {
        Radio radioObject = new Radio();
        int expected = 9;
        radioObject.setCurrentChannel(0);
        radioObject.previousChannel();
        int actual = radioObject.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelBackward() {
        Radio radioObject = new Radio(50);
        int expected = 45;
        radioObject.setCurrentChannel(46);
        radioObject.previousChannel();
        int actual = radioObject.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelForward() {
        Radio radioObject = new Radio(15);
        int expected = 14;
        radioObject.setCurrentChannel(13);
        radioObject.nextChannel();
        int actual = radioObject.getCurrentChannel();
        assertEquals(expected, actual);
    }
}
