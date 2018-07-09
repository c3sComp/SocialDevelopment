// Generated with g9.

package com.c3s.core.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="users_roles", indexes={@Index(name="usersRolesRolesFk", columnList="role_id"), @Index(name="usersRolesUsersFk", columnList="user_id")})
public class UsersRoles implements Serializable {

    /** Primary key. */
    protected static final String PK = "UsersRolesPrimary";

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

    @ManyToOne(optional=false)
    @JoinColumn(name="role_id", nullable=false)
    private Roles roles;
    @ManyToOne(optional=false)
    @JoinColumn(name="user_id", nullable=false)
    private Users users;

    /** Default constructor. */
    public UsersRoles() {
        super();
    }

    /**
     * Access method for roles.
     *
     * @return the current value of roles
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Setter method for roles.
     *
     * @param aRoles the new value for roles
     */
    public void setRoles(Roles aRoles) {
        roles = aRoles;
    }

    /**
     * Access method for users.
     *
     * @return the current value of users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Setter method for users.
     *
     * @param aUsers the new value for users
     */
    public void setUsers(Users aUsers) {
        users = aUsers;
    }

    /** Temporary value holder for group key fragment usersId */
    private transient Integer tempUsersId;

    /**
     * Gets the key fragment id for member users.
     * If this.users is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setUsersId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Users
     */
    public Integer getUsersId() {
        return (getUsers() == null ? tempUsersId : getUsers().getId());
    }

    /**
     * Sets the key fragment id from member users.
     * If this.users is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getUsersId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aId New value for the key fragment
     * @see Users
     */
    public void setUsersId(Integer aId) {
        if (getUsers() == null) {
            tempUsersId = aId;
        } else {
            getUsers().setId(aId);
        }
    }

    /** Temporary value holder for group key fragment rolesId */
    private transient Integer tempRolesId;

    /**
     * Gets the key fragment id for member roles.
     * If this.roles is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setRolesId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Roles
     */
    public Integer getRolesId() {
        return (getRoles() == null ? tempRolesId : getRoles().getId());
    }

    /**
     * Sets the key fragment id from member roles.
     * If this.roles is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getRolesId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aId New value for the key fragment
     * @see Roles
     */
    public void setRolesId(Integer aId) {
        if (getRoles() == null) {
            tempRolesId = aId;
        } else {
            getRoles().setId(aId);
        }
    }

    /**
     * Compares the key for this instance with another UsersRoles.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UsersRoles and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UsersRoles)) {
            return false;
        }
        UsersRoles that = (UsersRoles) other;
        Object myUsersId = this.getUsersId();
        Object yourUsersId = that.getUsersId();
        if (myUsersId==null ? yourUsersId!=null : !myUsersId.equals(yourUsersId)) {
            return false;
        }
        Object myRolesId = this.getRolesId();
        Object yourRolesId = that.getRolesId();
        if (myRolesId==null ? yourRolesId!=null : !myRolesId.equals(yourRolesId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UsersRoles.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UsersRoles)) return false;
        return this.equalKeys(other) && ((UsersRoles)other).equalKeys(this);
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
        if (getUsersId() == null) {
            i = 0;
        } else {
            i = getUsersId().hashCode();
        }
        result = 37*result + i;
        if (getRolesId() == null) {
            i = 0;
        } else {
            i = getRolesId().hashCode();
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
        StringBuffer sb = new StringBuffer("[UsersRoles |");
        sb.append(" usersId=").append(getUsersId());
        sb.append(" rolesId=").append(getRolesId());
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
        ret.put("usersId", getUsersId());
        ret.put("rolesId", getRolesId());
        return ret;
    }

}
