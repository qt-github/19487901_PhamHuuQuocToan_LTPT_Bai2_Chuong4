package entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class StockPK implements Serializable {
    private int product;
    private int store;
    public StockPK() {
        super();
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + product;
        result = prime * result + store;
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
        StockPK other = (StockPK) obj;
        if (product != other.product)
            return false;
        if (store != other.store)
            return false;
        return true;
    }
}
