package designpatterns.prototype;

import designpatterns.prototype.addons.ChocoScoop;
import designpatterns.prototype.addons.VanillaScoop;
import designpatterns.prototype.cones.ChocolateCone;
import designpatterns.prototype.cones.OrangeCone;
import designpatterns.prototype.cones.VanillaCone;

public class Client {
    public static void main(String[] args) {
        IceCreamRegistry iceCreamRegistry = new IceCreamRegistry();

        IceCream chocoVanillaOrangeChoco =
                new ChocoScoop(
                    new VanillaScoop(
                        new OrangeCone(
                                new ChocolateCone()
                        )
                    )
                );

        IceCream chocoVanillaChocoOrangeVanilla = new ChocoScoop(
                new VanillaScoop(
                        new ChocolateCone(
                                new OrangeCone(
                                        new VanillaCone()
                                )
                        )
                )
        );

        iceCreamRegistry.put(IceCreamMenu.YUMMY, chocoVanillaOrangeChoco);
        iceCreamRegistry.put(IceCreamMenu.WOW, chocoVanillaChocoOrangeVanilla);

        IceCream clone = iceCreamRegistry.get(IceCreamMenu.YUMMY);

        IceCream order = new ChocoScoop(clone);

        System.out.println(order);


    }
}


