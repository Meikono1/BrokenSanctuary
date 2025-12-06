package fuchsbau.BrokenSanctuary.Items.Gear.Boots;

import fuchsbau.BrokenSanctuary.Items.Gear.Armor;
import fuchsbau.BrokenSanctuary.Items.Gear.Slot;

public class ClothBoots extends Armor {
    public ClothBoots() {
        super(1, 1, 100, "Cloth Boots", Slot.boots);
    }

    @Override
    public String toString() {
        return "ClothBoots";
    }
}
