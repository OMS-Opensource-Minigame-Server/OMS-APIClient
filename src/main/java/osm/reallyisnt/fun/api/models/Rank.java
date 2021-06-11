package osm.reallyisnt.fun.api.models;

import java.util.UUID;

public class Rank {

    private final UUID uuid;
    private final String name;
    private final String colour;
    private final String title;

    public Rank(UUID uuid, String name, String colour, String title) {
        this.uuid = uuid;
        this.name = name;
        this.colour = colour;
        this.title = title;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getTitle() {
        return title;
    }
}
