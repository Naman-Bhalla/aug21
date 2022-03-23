package designpatterns.prototype.cones;

import designpatterns.prototype.IceCream;
import designpatterns.prototype.Prototype;
import designpatterns.prototype.addons.ChocoScoop;

import java.security.InvalidParameterException;

public class ChocolateCone implements IceCream {
    private IceCream iceCream;

    public ChocolateCone() {}

    public ChocolateCone(IceCream iceCream) {
        if (iceCream == null) {
            throw new InvalidParameterException();
        }

        if (iceCream.hasIngredient()) {
            throw new InvalidParameterException();
        }

        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        int cost = ConeCosts.CHOCO_COST;

        if (this.iceCream != null) {
            cost += iceCream.getCost();
        }

        return cost;
    }

    @Override
    public String getComposition() {
        String desc = "Chocolate Cone";

        if (this.iceCream != null) {
            desc = this.iceCream.getComposition() + " " + desc;
        }

        return desc;
    }

    @Override
    public boolean hasIngredient() {
        return false;
    }

    @Override
    public Prototype clone() {
        if (this.iceCream == null) {
            return new ChocolateCone();
        } else {
            return new ChocolateCone((IceCream) this.iceCream.clone());
        }
    }
}
