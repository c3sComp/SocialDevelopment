// Generated with g9.

package com.c3s.core.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;


@Entity(name="accounts")
public class Accounts implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private Integer id;
    @Column(nullable=false, length=100)
    private String iban;
    @ManyToOne(optional=false)
    @JoinColumn(name="bank_id", nullable=false)
    private Banks banks;

    /** Default constructor. */
    public Accounts() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(Integer aId) {
        id = aId;
    }

    /**
     * Access method for iban.
     *
     * @return the current value of iban
     */
    public String getIban() {
        return iban;
    }

    /**
     * Setter method for iban.
     *
     * @param aIban the new value for iban
     */
    public void setIban(String aIban) {
        iban = aIban;
    }

    /**
     * Access method for banks.
     *
     * @return the current value of banks
     */
    public Banks getBanks() {
        return banks;
    }

    /**
     * Setter method for banks.
     *
     * @param aBanks the new value for banks
     */
    public void setBanks(Banks aBanks) {
        banks = aBanks;
    }

    /**
     * Compares the key for this instance with another Accounts.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Accounts and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Accounts)) {
            return false;
        }
        Accounts that = (Accounts) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Accounts.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Accounts)) return false;
        return this.equalKeys(other) && ((Accounts)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getId() == null) {
            i = 0;
        } else {
            i = getId().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Accounts |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", getId());
        return ret;
    }

}
