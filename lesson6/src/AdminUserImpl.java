abstract class AdminUserImpl extends AbstractUser implements AdminUser {

    private static final DataBase[] USERS = new DataBase[10];

    @Override
    public User createUser(String userName, boolean isAdmin) {
        setUserName(userName);
        if (this.isAdmin()) {
            setAdmin(true);
        } else {
            setAdmin(false);
        }
        return User;
    }
}