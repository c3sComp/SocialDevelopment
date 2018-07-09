// Generated with g9.

package com.c3s.core.model;

import java.io.Serializable;
import java.sql.Date;
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

@Entity(name="financial_document")
public class FinancialDocument implements Serializable {

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
    @Column(name="doc_no", nullable=false, precision=10)
    private Integer docNo;
    @Column(name="doc_type", nullable=false, precision=10)
    private Integer docType;
    @Column(name="doc_owner", nullable=false, length=250)
    private String docOwner;
    @Column(nullable=false, length=22)
    private double amount;
    @Column(name="doc_date", nullable=false)
    private Date docDate;
    @Column(name="payment_type", nullable=false, precision=10)
    private Integer paymentType;
    @Column(name="cheque_no", nullable=false, precision=10)
    private Integer chequeNo;
    @Column(nullable=false, length=100)
    private String section;
    @ManyToOne(optional=false)
    @JoinColumn(name="bank_id", nullable=false)
    private Banks banks;
    @ManyToOne(optional=false)
    @JoinColumn(name="funding_source_id", nullable=false)
    private FundingSources fundingSources;
    @ManyToOne(optional=false)
    @JoinColumn(name="project_id", nullable=false)
    private Projects projects;

    /** Default constructor. */
    public FinancialDocument() {
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
     * Access method for docNo.
     *
     * @return the current value of docNo
     */
    public Integer getDocNo() {
        return docNo;
    }

    /**
     * Setter method for docNo.
     *
     * @param aDocNo the new value for docNo
     */
    public void setDocNo(Integer aDocNo) {
        docNo = aDocNo;
    }

    /**
     * Access method for docType.
     *
     * @return the current value of docType
     */
    public Integer getDocType() {
        return docType;
    }

    /**
     * Setter method for docType.
     *
     * @param aDocType the new value for docType
     */
    public void setDocType(Integer aDocType) {
        docType = aDocType;
    }

    /**
     * Access method for docOwner.
     *
     * @return the current value of docOwner
     */
    public String getDocOwner() {
        return docOwner;
    }

    /**
     * Setter method for docOwner.
     *
     * @param aDocOwner the new value for docOwner
     */
    public void setDocOwner(String aDocOwner) {
        docOwner = aDocOwner;
    }

    /**
     * Access method for amount.
     *
     * @return the current value of amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Setter method for amount.
     *
     * @param aAmount the new value for amount
     */
    public void setAmount(double aAmount) {
        amount = aAmount;
    }

    /**
     * Access method for docDate.
     *
     * @return the current value of docDate
     */
    public Date getDocDate() {
        return docDate;
    }

    /**
     * Setter method for docDate.
     *
     * @param aDocDate the new value for docDate
     */
    public void setDocDate(Date aDocDate) {
        docDate = aDocDate;
    }

    /**
     * Access method for paymentType.
     *
     * @return the current value of paymentType
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * Setter method for paymentType.
     *
     * @param aPaymentType the new value for paymentType
     */
    public void setPaymentType(Integer aPaymentType) {
        paymentType = aPaymentType;
    }

    /**
     * Access method for chequeNo.
     *
     * @return the current value of chequeNo
     */
    public Integer getChequeNo() {
        return chequeNo;
    }

    /**
     * Setter method for chequeNo.
     *
     * @param aChequeNo the new value for chequeNo
     */
    public void setChequeNo(Integer aChequeNo) {
        chequeNo = aChequeNo;
    }

    /**
     * Access method for section.
     *
     * @return the current value of section
     */
    public String getSection() {
        return section;
    }

    /**
     * Setter method for section.
     *
     * @param aSection the new value for section
     */
    public void setSection(String aSection) {
        section = aSection;
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
     * Access method for fundingSources.
     *
     * @return the current value of fundingSources
     */
    public FundingSources getFundingSources() {
        return fundingSources;
    }

    /**
     * Setter method for fundingSources.
     *
     * @param aFundingSources the new value for fundingSources
     */
    public void setFundingSources(FundingSources aFundingSources) {
        fundingSources = aFundingSources;
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
     * Compares the key for this instance with another FinancialDocument.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FinancialDocument and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FinancialDocument)) {
            return false;
        }
        FinancialDocument that = (FinancialDocument) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FinancialDocument.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FinancialDocument)) return false;
        return this.equalKeys(other) && ((FinancialDocument)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[FinancialDocument |");
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
