package fuchsbau.BrokenSanctuary.Items.Gear.Arms;

import fuchsbau.BrokenSanctuary.Items.Gear.Armor;
import fuchsbau.BrokenSanctuary.Items.Gear.Slot;

public class NoArms extends Armor {
    public NoArms() {
        super(0, 1, 100, "Bare Arms", Slot.arms);
    }

    @Override
    public String toString() {
        return "NoArms";
    }
}
