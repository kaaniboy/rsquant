package command;

import utils.GEUtils;

import static org.osbot.rs07.api.GrandExchange.Box;

public class OpenBuyScreenCommand extends Command {

    @Override
    public boolean execute() {
        Box box = GEUtils.getFirstAvailableBox();
        if (box == null) {
            return false;
        }

        return script.getGrandExchange().buyItems(box);
    }
}