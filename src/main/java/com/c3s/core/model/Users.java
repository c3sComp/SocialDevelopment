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
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="users", indexes={@Index(name="users_username_IX", columnList="username", unique=true)})
public class Users implements Serializable {

    /** Primary key. */
//    protected static final String PK = "id";
//
//    /**
//     * The optimistic lock. Available via standard bean get/set operations.
//     */
//    @Version
//    @Column(name="LOCK_FLAG")
//    private Integer lockFlag;
//
//    /**
//     * Access method for the lockFlag property.
//     *
//     * @return the current value of the lockFlag property
//     */
//    public Integer getLockFlag() {
//        return lockFlag;
//    }
//
//    /**
//     * Sets the value of the lockFlag property.
//     *
//     * @param aLockFlag the new value of the lockFlag property
//     */
//    public void setLockFlag(Integer aLockFlag) {
//        lockFlag = aLockFlag;
//    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private Integer id;
    @Column(unique=true, nullable=false, length=50)
    private String username;
    @Column(nullable=false, length=50)
    private String password;
    @Column(length=256)
    private String name;
//    @OneToMany(mappedBy="users")
//    private Set<UsersRoles> usersRoles;

    /** Default constructor. */
    public Users() {
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
     * Access method for username.
     *
     * @return the current value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter method for username.
     *
     * @param aUsername the new value for username
     */
    public void setUsername(String aUsername) {
        username = aUsername;
    }

    /**
     * Access method for password.
     *
     * @return the current value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for password.
     *
     * @param aPassword the new value for password
     */
    public void setPassword(String aPassword) {
        password = aPassword;
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
     * Access method for usersRoles.
     *
     * @return the current value of usersRoles
     */
//    public Set<UsersRoles> getUsersRoles() {
//        return usersRoles;
//    }

    /**
     * Setter method for usersRoles.
     *
     * @param aUsersRoles the new value for usersRoles
     */
//    public void setUsersRoles(Set<UsersRoles> aUsersRoles) {
//        usersRoles = aUsersRoles;
//    }

    /**
     * Compares the key for this instance with another Users.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Users and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Users)) {
            return false;
        }
        Users that = (Users) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Users.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Users)) return false;
        return this.equalKeys(other) && ((Users)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Users |");
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
