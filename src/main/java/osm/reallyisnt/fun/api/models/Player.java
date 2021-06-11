package osm.reallyisnt.fun.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Player {

    private final UUID uuid;
    private final String username;

    private final List<Player> friends = new ArrayList<>();

    private final UUID partyId;
    private final Party party;

    private final UUID rankId;
    private final Rank rank;

    public Player(UUID uuid, String username, UUID partyId, Party party, UUID rankId, Rank rank) {
        this.uuid = uuid;
        this.username = username;
        this.partyId = partyId;
        this.party = party;
        this.rankId = rankId;
        this.rank = rank;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public List<Player> getFriends() {
        return friends;
    }

    public UUID getPartyId() {
        return partyId;
    }

    public Party getParty() {
        return party;
    }

    public UUID getRankId() {
        return rankId;
    }

    public Rank getRank() {
        return rank;
    }
}
