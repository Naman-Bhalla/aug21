package designpatterns.decorator.icecream.cones;

import designpatterns.decorator.icecream.IceCream;

import java.security.InvalidParameterException;

public class VanillaCone implements IceCream {
    private IceCream iceCream;

    public VanillaCone() {}

    public VanillaCone(IceCream iceCream) {
        if (iceCream == null) {
            throw new InvalidParameterException();
        }

        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        int cost = ConeCosts.VANILLA_COST;

        if (this.iceCream != null) {
            cost += iceCream.getCost();
        }

        return cost;
    }

    @Override
    public String getComposition() {
        String desc = "Vanilla Cone";

        if (this.iceCream != null) {
            desc = this.iceCream.getComposition() + " " + desc;
        }

        return desc;
    }

    @Override
    public boolean hasIngredient() {
        return false;
    }
}
