package org.anbang.realestate.transfer;


import java.util.Objects;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

import com.owlike.genson.annotation.JsonProperty;
import lombok.Getter;

@DataType
@Getter
public final class AnbangRealEstate {
    @Property
    private final String homeID;
    @Property
    private final String owner;
    @Property
    private final String address;
    @Property
    private final String price;


    public AnbangRealEstate(@JsonProperty("homeID") final String homeID, @JsonProperty("owner") final String owner, @JsonProperty("address") final String address, @JsonProperty("price") final String price) {
        this.homeID = homeID;
        this.owner = owner;
        this.address = address;
        this.price = price;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        AnbangRealEstate anbangRealEState = (AnbangRealEstate) obj;

        return Objects.deepEquals(
                new String[] {getHomeID(), getOwner(), getAddress(), getPrice()},
                new String[] {anbangRealEState.getHomeID(), anbangRealEState.getOwner(), anbangRealEState.getAddress(), anbangRealEState.getPrice()});
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHomeID(), getOwner(), getAddress(), getPrice());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " [homeID=" + homeID + ", owner=" + owner + ", address=" + address + ", price=" + price + "]";
    }

}
