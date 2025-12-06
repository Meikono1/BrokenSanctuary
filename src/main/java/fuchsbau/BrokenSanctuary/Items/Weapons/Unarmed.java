package fuchsbau.BrokenSanctuary.Items.Weapons;


import fuchsbau.BrokenSanctuary.Items.Material;

public class Unarmed extends Weapon {
    public Unarmed() {
        super(2, 100, 1, Material.stone, "Unarmed");

    }

    public Unarmed(int schaden, int zustand, int qualitaet, Material material, String text) {
        super(schaden, zustand, qualitaet, material, text);
    }


    @Override
    public String toString() {
        return "Unarmed";
    }
}
