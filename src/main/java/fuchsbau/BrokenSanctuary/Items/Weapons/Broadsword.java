package fuchsbau.BrokenSanctuary.Items.Weapons;


import fuchsbau.BrokenSanctuary.Items.Material;

public class Broadsword extends Weapon {

    public Broadsword(int schaden, int zustand, int qualitaet, Material material, String text) {
        super(schaden, zustand, qualitaet, material, text);
    }
    @Override
    public String toString() {
        return "Broadsword";
    }


}
