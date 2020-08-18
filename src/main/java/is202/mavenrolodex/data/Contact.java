package is202.mavenrolodex.data;

import java.util.Objects;


/**
 * This is the application's only data class. It is very simple: Only a name,
 * and email address.
 *
 * It implements the Comparable interface, to make it easier to sort lists of
 * Contacts.
 *
 * @author evenal
 */
public class Contact implements Comparable<Contact> {

    private String name; // "primary" key
    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * hashCode() is used by HashMap and some other library classes. This code
     * is generated by Netbeans. That is usually the best way to create it.
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

    /**
     * The equals() method defines what it means for two objects to be like each
     * other. Equals can also be difficult to write, so it is usually a good
     * idea to let netbeans create it for you.
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.name, other.name))
            return false;
        return true;
    }

    /**
     * Compare two objects to decide which comes first in sorted order
     *
     * @param that
     * @return -1 if this object comes first, -1 if the other object comes
     * first, and zero if they are equal (in that case equals() should return
     * true.
     */
    @Override
    public int compareTo(Contact that) {
        return this.name.compareTo(that.name);
    }
}
