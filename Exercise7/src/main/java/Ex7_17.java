public class Ex7_17 {
}

class Unit {
    int x, y;
    void move(int x, int y) {}
    void stop() {}
}

class Marine extends Unit {
    void stimPack() {}
}

class Tank extends Unit {
    void changeMode() {}
}

class DropShip extends Unit {
    void load() {}
    void unload() {}
}
