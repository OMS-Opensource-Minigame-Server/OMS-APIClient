package osm.reallyisnt.fun.api.models;

import java.util.UUID;

public class CurrencyConversionRatio {

    private final UUID uuid;

    private final UUID currencyid;
    private final Currency currency;

    private final UUID finalCurrencyID;
    private final Currency finalCurrency;

    private final Number conversionRatio;

    public CurrencyConversionRatio(UUID uuid, UUID currencyid, Currency currency, UUID finalCurrencyID, Currency finalCurrency, Number conversionRatio) {
        this.uuid = uuid;
        this.currencyid = currencyid;
        this.currency = currency;
        this.finalCurrencyID = finalCurrencyID;
        this.finalCurrency = finalCurrency;
        this.conversionRatio = conversionRatio;
    }

    public UUID getUuid() {
        return uuid;
    }

    public UUID getCurrencyid() {
        return currencyid;
    }

    public Currency getCurrency() {
        return currency;
    }

    public UUID getFinalCurrencyID() {
        return finalCurrencyID;
    }

    public Currency getFinalCurrency() {
        return finalCurrency;
    }

    public Number getConversionRatio() {
        return conversionRatio;
    }
}
