package designpatterns.prototype.addons;

import designpatterns.prototype.IceCream;
import designpatterns.prototype.Prototype;

import java.security.InvalidParameterException;

public class VanillaScoop implements IceCream {
    private IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        if (iceCream == null) {
            throw new InvalidParameterException();
        }
        this.iceCream = iceCream;
    }

    @Override
    public String getComposition() {
        return this.iceCream.getComposition() + " Vanilla Scoop";
    }

    @Override
    public int getCost() {
        return this.iceCream.getCost() + 20;
    }

    @Override
    public boolean hasIngredient() {
        return true;
    }

    @Override
    public Prototype clone() {
        return new VanillaScoop((IceCream) this.iceCream.clone());
    }
}
