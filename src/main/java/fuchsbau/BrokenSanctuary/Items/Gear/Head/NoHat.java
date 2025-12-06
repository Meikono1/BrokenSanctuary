package fuchsbau.BrokenSanctuary.Items.Gear.Head;


import fuchsbau.BrokenSanctuary.Items.Gear.Armor;
import fuchsbau.BrokenSanctuary.Items.Gear.Slot;

public class NoHat extends Armor {
    public NoHat() {
        super(0, 0, 100, "No Head", Slot.head);
    }

    @Override
    public String toString() {
        return "NoHat";
    }
}
