package entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class OrderItemPK implements Serializable {
    private int product;
    private int order;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + order;
        result = prime * result + product;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderItemPK other = (OrderItemPK) obj;
        if (order != other.order)
            return false;
        if (product != other.product)
            return false;
        return true;
    }
}
