package designpatterns.decorator.icecream.cones;

import com.sun.jdi.request.InvalidRequestStateException;
import designpatterns.decorator.icecream.IceCream;

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
}
