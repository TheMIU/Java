package serialization.transient_keyword;

import java.io.Serializable;

class User implements Serializable {
    private String username;
    private transient String password; // Marking password as transient

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}