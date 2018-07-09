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

@Entity(name="finance")
public class Finance implements Serializable {

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
    @Column(name="ministry_credit", nullable=false, length=22)
    private double ministryCredit;
    @Column(name="people_credit", nullable=false, length=22)
    private double peopleCredit;
    @Column(name="other_credit", nullable=false, length=22)
    private double otherCredit;
    @ManyToOne(optional=false)
    @JoinColumn(name="financial_year_id", nullable=false)
    private FinancialYears financialYears;
    @ManyToOne(optional=false)
    @JoinColumn(name="project_id", nullable=false)
    private Projects projects;
    @ManyToOne(optional=false)
    @JoinColumn(name="social_category_id", nullable=false)
    private SocialCategory socialCategory;

    /** Default constructor. */
    public Finance() {
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
     * Access method for ministryCredit.
     *
     * @return the current value of ministryCredit
     */
    public double getMinistryCredit() {
        return ministryCredit;
    }

    /**
     * Setter method for ministryCredit.
     *
     * @param aMinistryCredit the new value for ministryCredit
     */
    public void setMinistryCredit(double aMinistryCredit) {
        ministryCredit = aMinistryCredit;
    }

    /**
     * Access method for peopleCredit.
     *
     * @return the current value of peopleCredit
     */
    public double getPeopleCredit() {
        return peopleCredit;
    }

    /**
     * Setter method for peopleCredit.
     *
     * @param aPeopleCredit the new value for peopleCredit
     */
    public void setPeopleCredit(double aPeopleCredit) {
        peopleCredit = aPeopleCredit;
    }

    /**
     * Access method for otherCredit.
     *
     * @return the current value of otherCredit
     */
    public double getOtherCredit() {
        return otherCredit;
    }

    /**
     * Setter method for otherCredit.
     *
     * @param aOtherCredit the new value for otherCredit
     */
    public void setOtherCredit(double aOtherCredit) {
        otherCredit = aOtherCredit;
    }

    /**
     * Access method for financialYears.
     *
     * @return the current value of financialYears
     */
    public FinancialYears getFinancialYears() {
        return financialYears;
    }

    /**
     * Setter method for financialYears.
     *
     * @param aFinancialYears the new value for financialYears
     */
    public void setFinancialYears(FinancialYears aFinancialYears) {
        financialYears = aFinancialYears;
    }

    /**
     * Access method for projects.
     *
     * @return the current value of projects
     */
    public Projects getProjects() {
        return projects;
    }

    /**
     * Setter method for projects.
     *
     * @param aProjects the new value for projects
     */
    public void setProjects(Projects aProjects) {
        projects = aProjects;
    }

    /**
     * Access method for socialCategory.
     *
     * @return the current value of socialCategory
     */
    public SocialCategory getSocialCategory() {
        return socialCategory;
    }

    /**
     * Setter method for socialCategory.
     *
     * @param aSocialCategory the new value for socialCategory
     */
    public void setSocialCategory(SocialCategory aSocialCategory) {
        socialCategory = aSocialCategory;
    }

    /**
     * Compares the key for this instance with another Finance.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Finance and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Finance)) {
            return false;
        }
        Finance that = (Finance) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Finance.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Finance)) return false;
        return this.equalKeys(other) && ((Finance)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Finance |");
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
