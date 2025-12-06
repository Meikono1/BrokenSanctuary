package fuchsbau.BrokenSanctuary.Items.Gear.Boots;


import fuchsbau.BrokenSanctuary.Items.Gear.Armor;
import fuchsbau.BrokenSanctuary.Items.Gear.Slot;

public class NoShoos extends Armor {
    public NoShoos() {
        super(0, 0, 100, "Bare Foot", Slot.boots);
    }

    @Override
    public String toString() {
        return "NoShoos";
    }
}
