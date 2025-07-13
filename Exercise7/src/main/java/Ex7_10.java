class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL= 100;
    final int MIN_CHANNEL = 1;

    int getChannel() {
        return channel;
    }
    void setChannel(int channel) {
        prevChannel = this.channel;
        this.channel = channel;
    }
    int getVolume() {
        return volume;
    }
    void setVolume(int volume) {
        this.volume = volume;
    }

    // 7-11
    void gotoPrevChannel() {
        int tmp = channel;
        channel = prevChannel;
        prevChannel = tmp;
    }

}

class Ex7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

//        t.setChannel(10);
//        System.out.println("CH: " + t.getChannel());
//        t.setVolume(20);
//        System.out.println("VOL: " + t.getVolume());

        // 7-11
        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("VOL: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
    }
}
