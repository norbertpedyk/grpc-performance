package pl.pedyk.inventorygraphql.model;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class MmsrReport {
    UUID Id;
    String productType;
    String ReferenceTradeNumber;
}
