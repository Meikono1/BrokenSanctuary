module fuchsbau.brokensantuary {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.logging;

    opens fuchsbau.BrokenSanctuary to javafx.fxml;
    exports fuchsbau.BrokenSanctuary;
    exports fuchsbau.BrokenSanctuary.Engine;
    opens fuchsbau.BrokenSanctuary.Engine to javafx.fxml;
}