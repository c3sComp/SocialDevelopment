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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="employees")
public class Employees implements Serializable {

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
    @Column(nullable=false, length=100)
    private String name;
    @Column(name="emp_no", precision=10)
    private Integer empNo;
    @Column(nullable=false, length=3)
    private boolean sex;
    @Column(name="work_days", nullable=false, precision=10)
    private Integer workDays;
    @Column(nullable=false, length=22)
    private double salary;
    @Column(name="has_assuarance", nullable=false, length=3)
    private boolean hasAssuarance;
    @Column(name="contract_type", nullable=false, precision=10)
    private Integer contractType;
    @ManyToOne(optional=false)
    @JoinColumn(name="center_id", nullable=false)
    private Centers centers;
    @OneToMany(mappedBy="employees")
    private Set<Salary> salaries;
    @ManyToOne(optional=false)
    @JoinColumn(name="job_id", nullable=false)
    private Jobs jobs;

    /** Default constructor. */
    public Employees() {
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
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for empNo.
     *
     * @return the current value of empNo
     */
    public Integer getEmpNo() {
        return empNo;
    }

    /**
     * Setter method for empNo.
     *
     * @param aEmpNo the new value for empNo
     */
    public void setEmpNo(Integer aEmpNo) {
        empNo = aEmpNo;
    }

    /**
     * Access method for sex.
     *
     * @return true if and only if sex is currently true
     */
    public boolean isSex() {
        return sex;
    }

    /**
     * Setter method for sex.
     *
     * @param aSex the new value for sex
     */
    public void setSex(boolean aSex) {
        sex = aSex;
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
     * Access method for hasAssuarance.
     *
     * @return true if and only if hasAssuarance is currently true
     */
    public boolean isHasAssuarance() {
        return hasAssuarance;
    }

    /**
     * Setter method for hasAssuarance.
     *
     * @param aHasAssuarance the new value for hasAssuarance
     */
    public void setHasAssuarance(boolean aHasAssuarance) {
        hasAssuarance = aHasAssuarance;
    }

    /**
     * Access method for contractType.
     *
     * @return the current value of contractType
     */
    public Integer getContractType() {
        return contractType;
    }

    /**
     * Setter method for contractType.
     *
     * @param aContractType the new value for contractType
     */
    public void setContractType(Integer aContractType) {
        contractType = aContractType;
    }

    /**
     * Access method for centers.
     *
     * @return the current value of centers
     */
    public Centers getCenters() {
        return centers;
    }

    /**
     * Setter method for centers.
     *
     * @param aCenters the new value for centers
     */
    public void setCenters(Centers aCenters) {
        centers = aCenters;
    }

    /**
     * Access method for salary.
     *
     * @return the current value of salary
     */
    public Set<Salary> getSalaries() {
        return salaries;
    }

    /**
     * Setter method for salary.
     *
     * @param salaries the new value for salary
     */
    public void setSalaries(Set<Salary> salaries) {
        this.salaries = salaries;
    }

    /**
     * Access method for jobs.
     *
     * @return the current value of jobs
     */
    public Jobs getJobs() {
        return jobs;
    }

    /**
     * Setter method for jobs.
     *
     * @param aJobs the new value for jobs
     */
    public void setJobs(Jobs aJobs) {
        jobs = aJobs;
    }

    /**
     * Compares the key for this instance with another Employees.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Employees and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Employees)) {
            return false;
        }
        Employees that = (Employees) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Employees.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Employees)) return false;
        return this.equalKeys(other) && ((Employees)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Employees |");
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
