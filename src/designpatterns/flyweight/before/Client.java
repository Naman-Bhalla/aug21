package designpatterns.flyweight.before;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Bullet> bulletList = new ArrayList<>();
        for (int i = 0; i < 72000; ++i) {
            Bullet bullet = new Bullet();
            bullet.caliber = 5.5;
            bullet.current_speed = 1.2;
            bullet.damage = 123;
            bullet.image = new byte[2000];
            bulletList.add(bullet);
        }

        int ad = 3;
    }
}
