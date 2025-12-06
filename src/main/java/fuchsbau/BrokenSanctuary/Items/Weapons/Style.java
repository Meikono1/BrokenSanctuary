package fuchsbau.BrokenSanctuary.Items.Weapons;

import fuchsbau.BrokenSanctuary.Scene.SceneBuilder;
import javafx.scene.text.Text;

enum Style {

    oneHanded(1, "one handed") {

    },
    twohanded(2, "two handed") {
    };

    Style(int i, String text) {
        int id = i;
        Text description = SceneBuilder.getSceneBuilder().makeText(text);
    }
}
