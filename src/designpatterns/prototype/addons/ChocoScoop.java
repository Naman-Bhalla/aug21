package designpatterns.prototype.addons;

import designpatterns.prototype.IceCream;
import designpatterns.prototype.Prototype;

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

    @Override
    public Prototype clone() {
        return new ChocoScoop((IceCream) this.iceCream.clone());
    }
}
