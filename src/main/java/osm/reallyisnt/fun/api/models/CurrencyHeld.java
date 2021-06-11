package osm.reallyisnt.fun.api.models;

import java.util.UUID;

public class CurrencyHeld {

    private final UUID uuid;

    private final UUID currencyID;
    private final Currency currency;

    private final Number amount;

    public CurrencyHeld(UUID uuid, UUID currencyID, Currency currency, Number amount) {
        this.uuid = uuid;
        this.currencyID = currencyID;
        this.currency = currency;
        this.amount = amount;
    }

    public UUID getUuid() {
        return uuid;
    }

    public UUID getCurrencyID() {
        return currencyID;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Number getAmount() {
        return amount;
    }
}
