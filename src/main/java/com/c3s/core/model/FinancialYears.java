// Generated with g9.

package com.c3s.core.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="financial_years")
public class FinancialYears implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private Integer id;
    @Column(nullable=false, precision=10)
    private Integer year;
    @Column(nullable=false, length=3)
    private boolean opened;
    @OneToMany(mappedBy="financialYears")
    private Set<Finance> finance;

    /** Default constructor. */
    public FinancialYears() {
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
     * Access method for year.
     *
     * @return the current value of year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Setter method for year.
     *
     * @param aYear the new value for year
     */
    public void setYear(Integer aYear) {
        year = aYear;
    }

    /**
     * Access method for opened.
     *
     * @return true if and only if opened is currently true
     */
    public boolean isOpened() {
        return opened;
    }

    /**
     * Setter method for opened.
     *
     * @param aOpened the new value for opened
     */
    public void setOpened(boolean aOpened) {
        opened = aOpened;
    }

    /**
     * Access method for finance.
     *
     * @return the current value of finance
     */
    public Set<Finance> getFinance() {
        return finance;
    }

    /**
     * Setter method for finance.
     *
     * @param aFinance the new value for finance
     */
    public void setFinance(Set<Finance> aFinance) {
        finance = aFinance;
    }

    /**
     * Compares the key for this instance with another FinancialYears.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FinancialYears and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FinancialYears)) {
            return false;
        }
        FinancialYears that = (FinancialYears) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FinancialYears.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FinancialYears)) return false;
        return this.equalKeys(other) && ((FinancialYears)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[FinancialYears |");
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
