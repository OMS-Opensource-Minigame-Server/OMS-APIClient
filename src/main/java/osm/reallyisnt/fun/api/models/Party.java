package osm.reallyisnt.fun.api.models;

import java.util.List;
import java.util.UUID;

public class Party {

    private final UUID uuid;
    private final String name;

    private final List<Player> players;

    public Party(UUID uuid, String name, List<Player> players) {
        this.uuid = uuid;
        this.name = name;
        this.players = players;
    }
}
