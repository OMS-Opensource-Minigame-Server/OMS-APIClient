package osm.reallyisnt.fun.api.models;

import java.util.UUID;

public class CurrencyName {

    private final UUID uuid;

    private final String singular;
    private final String plural;

    public CurrencyName(UUID uuid, String singular, String plural) {
        this.uuid = uuid;
        this.singular = singular;
        this.plural = plural;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getSingular() {
        return singular;
    }

    public String getPlural() {
        return plural;
    }
}
