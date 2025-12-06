package fuchsbau.BrokenSanctuary.Items.Gear.LowerBody;


import fuchsbau.BrokenSanctuary.Items.Gear.Armor;
import fuchsbau.BrokenSanctuary.Items.Gear.Slot;

public class ClothPants extends Armor {
    public ClothPants() {
        super(1, 1, 100, "Cloth Pants", Slot.pants);
    }

    @Override
    public String toString() {
        return "Clothpants";
    }
}
