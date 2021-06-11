package osm.reallyisnt.fun.api.models;

import java.util.UUID;

public class Friend {

    private final UUID playerId;
    private final UUID friendId;
    private final FriendshipStatus status;

    public Friend(UUID playerId, UUID friendId, FriendshipStatus status) {
        this.playerId = playerId;
        this.friendId = friendId;
        this.status = status;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public UUID getFriendId() {
        return friendId;
    }

    public FriendshipStatus getStatus() {
        return status;
    }
}
