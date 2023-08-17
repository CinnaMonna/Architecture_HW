package DaoPattern;

/**
 * Класс UserDaoImpl имплементирует интерфейс UserDao
 * и реализует методы добавления, обновления, удаления и извлечения данных.
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void addUser(User user) {
        // логика добавления данных пользователя в базу данных

    }

    @Override
    public void updateUser(User user) {
        // логика обновления данных пользователя в базе данных
    }

    @Override
    public void deleteUser(User user) {
        // логика удаления данных пользователя из базы данных
    }

    @Override
    public User getUser(int id) {
        // логика извлечения данных пользователя из базы данных
        return null;
    }
}
