package fuchsbau.BrokenSanctuary.Items.Gear.UpperBody;

import fuchsbau.BrokenSanctuary.Items.Gear.Armor;
import fuchsbau.BrokenSanctuary.Items.Gear.Slot;

public class ClothChest extends Armor {

    public ClothChest() {
        super(1, 1, 100, "Cloth Chest", Slot.chest);
    }

    @Override
    public String toString() {
        return "Cloth Chest";
    }
}
