package osm.reallyisnt.fun.api.models;

import java.util.List;
import java.util.UUID;

public class Currency {

    private final UUID uuid;

    private final String nameId;
    private final String prefix;
    private final String postfix;

    private final List<CurrencyConversionRatio> convertionRatios;

    public Currency(UUID uuid, String nameId, String prefix, String postfix, List<CurrencyConversionRatio> convertionRatios) {
        this.uuid = uuid;
        this.nameId = nameId;
        this.prefix = prefix;
        this.postfix = postfix;
        this.convertionRatios = convertionRatios;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getNameId() {
        return nameId;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getPostfix() {
        return postfix;
    }

    public List<CurrencyConversionRatio> getConvertionRatios() {
        return convertionRatios;
    }
}
