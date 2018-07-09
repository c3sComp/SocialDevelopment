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

@Entity(name="salary")
public class Salary implements Serializable {

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
    private Integer month;
    @Column(nullable=false, precision=10)
    private Integer year;
    @Column(name="work_days", nullable=false, precision=10)
    private Integer workDays;
    @Column(nullable=false, length=22)
    private double salary;
    @Column(name="deserved_salary", nullable=false, length=22)
    private double deservedSalary;
    @Column(name="overtime_amount", nullable=false, length=22)
    private double overtimeAmount;
    @Column(name="absent_amount", nullable=false, length=22)
    private double absentAmount;
    @Column(name="borrow_amount", nullable=false, length=22)
    private double borrowAmount;
    @Column(name="assurance_amount", nullable=false, length=22)
    private double assuranceAmount;
    @Column(name="net_salary", nullable=false, length=22)
    private double netSalary;
    @ManyToOne(optional=false)
    @JoinColumn(name="employee_id", nullable=false)
    private Employees employees;

    /** Default constructor. */
    public Salary() {
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
     * Access method for month.
     *
     * @return the current value of month
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * Setter method for month.
     *
     * @param aMonth the new value for month
     */
    public void setMonth(Integer aMonth) {
        month = aMonth;
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
     * Access method for workDays.
     *
     * @return the current value of workDays
     */
    public Integer getWorkDays() {
        return workDays;
    }

    /**
     * Setter method for workDays.
     *
     * @param aWorkDays the new value for workDays
     */
    public void setWorkDays(Integer aWorkDays) {
        workDays = aWorkDays;
    }

    /**
     * Access method for salary.
     *
     * @return the current value of salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Setter method for salary.
     *
     * @param aSalary the new value for salary
     */
    public void setSalary(double aSalary) {
        salary = aSalary;
    }

    /**
     * Access method for deservedSalary.
     *
     * @return the current value of deservedSalary
     */
    public double getDeservedSalary() {
        return deservedSalary;
    }

    /**
     * Setter method for deservedSalary.
     *
     * @param aDeservedSalary the new value for deservedSalary
     */
    public void setDeservedSalary(double aDeservedSalary) {
        deservedSalary = aDeservedSalary;
    }

    /**
     * Access method for overtimeAmount.
     *
     * @return the current value of overtimeAmount
     */
    public double getOvertimeAmount() {
        return overtimeAmount;
    }

    /**
     * Setter method for overtimeAmount.
     *
     * @param aOvertimeAmount the new value for overtimeAmount
     */
    public void setOvertimeAmount(double aOvertimeAmount) {
        overtimeAmount = aOvertimeAmount;
    }

    /**
     * Access method for absentAmount.
     *
     * @return the current value of absentAmount
     */
    public double getAbsentAmount() {
        return absentAmount;
    }

    /**
     * Setter method for absentAmount.
     *
     * @param aAbsentAmount the new value for absentAmount
     */
    public void setAbsentAmount(double aAbsentAmount) {
        absentAmount = aAbsentAmount;
    }

    /**
     * Access method for borrowAmount.
     *
     * @return the current value of borrowAmount
     */
    public double getBorrowAmount() {
        return borrowAmount;
    }

    /**
     * Setter method for borrowAmount.
     *
     * @param aBorrowAmount the new value for borrowAmount
     */
    public void setBorrowAmount(double aBorrowAmount) {
        borrowAmount = aBorrowAmount;
    }

    /**
     * Access method for assuranceAmount.
     *
     * @return the current value of assuranceAmount
     */
    public double getAssuranceAmount() {
        return assuranceAmount;
    }

    /**
     * Setter method for assuranceAmount.
     *
     * @param aAssuranceAmount the new value for assuranceAmount
     */
    public void setAssuranceAmount(double aAssuranceAmount) {
        assuranceAmount = aAssuranceAmount;
    }

    /**
     * Access method for netSalary.
     *
     * @return the current value of netSalary
     */
    public double getNetSalary() {
        return netSalary;
    }

    /**
     * Setter method for netSalary.
     *
     * @param aNetSalary the new value for netSalary
     */
    public void setNetSalary(double aNetSalary) {
        netSalary = aNetSalary;
    }

    /**
     * Access method for employees.
     *
     * @return the current value of employees
     */
    public Employees getEmployees() {
        return employees;
    }

    /**
     * Setter method for employees.
     *
     * @param aEmployees the new value for employees
     */
    public void setEmployees(Employees aEmployees) {
        employees = aEmployees;
    }

    /**
     * Compares the key for this instance with another Salary.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Salary and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Salary)) {
            return false;
        }
        Salary that = (Salary) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Salary.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Salary)) return false;
        return this.equalKeys(other) && ((Salary)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Salary |");
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
