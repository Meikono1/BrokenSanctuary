package fuchsbau.BrokenSanctuary.Engine;


import fuchsbau.BrokenSanctuary.Items.Inventory;
import fuchsbau.BrokenSanctuary.Optionen.GameOption;

public class Game {
    private static final Game ourInstance = new Game();
    public GameOption optionen = new GameOption();
    public Inventory inventory = new Inventory();


    private Game() {

    }

    public static Game getInstance() {
        return ourInstance;
    }

    public void update() {

    }

    // TODO: 22.01.2023  Redo Save into JSON
    public String saveEverything() {
        StringBuilder builder = new StringBuilder();
        builder.append(optionen.save());
        builder.append(inventory.save());

        return builder.toString();
    }
}
