package fuchsbau.BrokenSanctuary.Items.Gear.UpperBody;


import fuchsbau.BrokenSanctuary.Items.Gear.Armor;
import fuchsbau.BrokenSanctuary.Items.Gear.Slot;

public class NoChest extends Armor {
    public NoChest() {
        super(0, 0, 100, "Bare Chest", Slot.chest);
    }

    @Override
    public String toString() {
        return "NoChest";
    }
}
