package entities.concretes;

public class UserAuthority {
    private int userAuthorityId;
    private Authority authority;
    private User user;

    public UserAuthority() {
    }

    public UserAuthority(int userAuthorityId, Authority authority, User user) {
        this.userAuthorityId = userAuthorityId;
        this.authority = authority;
        this.user = user;
    }

    public int getUserAuthorityId() {
        return userAuthorityId;
    }

    public void setUserAuthorityId(int userAuthorityId) {
        this.userAuthorityId = userAuthorityId;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
