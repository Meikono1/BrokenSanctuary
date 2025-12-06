package fuchsbau.BrokenSanctuary.Items.Gear.Head;

import fuchsbau.BrokenSanctuary.Items.Gear.Armor;
import fuchsbau.BrokenSanctuary.Items.Gear.Slot;

public class ClothHelm extends Armor {
    public ClothHelm() {
        super(1, 1, 100, "Cloth hat", Slot.head);
    }

    @Override
    public String toString() {
        return "Cloth Helm";
    }
}
