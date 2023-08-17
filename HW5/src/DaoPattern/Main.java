package DaoPattern;

/**
 * В классе Main представлена бизнес-логика,
 * абстрагированная от логики доступа к данным.
 * Является примером использования.
 */
public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();

        User user1 = new User(1, "Ann", 25);
        User user2 = new User(2, "Jane", 30);

        userDao.addUser(user1);
        userDao.addUser(user2);

        userDao.updateUser(user1);

        userDao.deleteUser(user2);

    }
}