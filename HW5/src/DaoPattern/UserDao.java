package DaoPattern;

/**
 * Интерфейс UserDAO определяет операции для взаимодействия с данными.
 * Объявляет методы добавления, обновления, удаления и извлечения данных.
 *
 */
public interface UserDao {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User getUser(int id);
}
