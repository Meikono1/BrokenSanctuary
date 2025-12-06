package fuchsbau.BrokenSanctuary.Engine;

import javafx.scene.Scene;

public interface Saveble {

    Scene getScene(int stage);

    void reset();
}
