import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

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
    void VolumeUp() {
        Radio radioObject = new Radio();
        int expected = 1;
        radioObject.increaseVolume();
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
        int expected = 100;
        for (int i = 0; i < 101; i++) {
            radioObject.increaseVolume();
        }
        int actual = radioObject.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelAvailSet() {
        Radio radioObject = new Radio(30);
        int expected = 1;
        int actual = radioObject.setChannel(25);
        assertEquals(expected, actual);
    }

    @Test
    void ChannelNotAvailPosSet() {
        Radio radioObject = new Radio(50);
        int expected = 0;
        int actual = radioObject.setChannel(100);
        assertEquals(expected, actual);
    }

    @Test
    void ChannelNotAvailNegSet() {
        Radio radioObject = new Radio(10);
        int expected = 0;
        int actual = radioObject.setChannel(-1);
        assertEquals(expected, actual);
    }

    @Test
    void ChannelForwardRoll() {
        Radio radioObject = new Radio(20);
        int expected = 0;
        radioObject.setChannel(19);
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
        Radio radioObject = new Radio(50);
        int expected = 45;
        radioObject.setChannel(46);
        radioObject.previousChannel();
        int actual = radioObject.getChannel();
        assertEquals(expected, actual);
    }

    @Test
    void ChannelForward() {
        Radio radioObject = new Radio(15);
        int expected = 14;
        radioObject.setChannel(13);
        radioObject.nextChannel();
        int actual = radioObject.getChannel();
        assertEquals(expected, actual);
    }
}
