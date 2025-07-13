// 7-4) 단일 상속

class Tv2 {
    boolean power;
    int channel;

    void power()        { power = !power; }
    void channelUp()    { ++channel; }
    void channelDown()  { --channel; }
}

class DVD {
    boolean power;
    int counter = 0;

    void power()    { power = !power; }
    void play()     {}
    void stop()     {}
    void rew()      {}
    void ff()       {}
}

class TvDVD extends Tv2 {
    DVD dvd = new DVD();

    void play() {
        dvd.play();
    }

    void stop() {
        dvd.stop();
    }

    void rew() {
        dvd.rew();
    }

    void ff() {
        dvd.ff();
    }
}
