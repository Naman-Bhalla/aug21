package designpatterns.decorator.icecream.addons;

import designpatterns.decorator.icecream.IceCream;
import designpatterns.decorator.icecream.cones.ChocolateCone;

import java.security.InvalidParameterException;

public class ChocoScoop implements IceCream {
    private IceCream iceCream;

    public ChocoScoop(IceCream iceCream) {
        if (iceCream == null) {
            throw new InvalidParameterException();
        }

        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return this.iceCream.getCost() + 30;
    }

    @Override
    public String getComposition() {
        return this.iceCream.getComposition() + " Choco Scoop";
    }

    @Override
    public boolean hasIngredient() {
        return true;
    }
}
