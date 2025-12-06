package fuchsbau.BrokenSanctuary.Items.Gear.LowerBody;

import fuchsbau.BrokenSanctuary.Items.Gear.Armor;
import fuchsbau.BrokenSanctuary.Items.Gear.Slot;

public class NoPants extends Armor {
    public NoPants() {
        super(0, 0, 100, "No Pants", Slot.pants);
    }

    @Override
    public String toString() {
        return "NoPants";
    }
}
