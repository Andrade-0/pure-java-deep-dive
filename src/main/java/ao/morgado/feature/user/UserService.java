package ao.morgado.feature.user;

import ao.morgado.bootstrapper.db.Repository;

import java.util.List;

public class UserService implements Repository<UserData, String> {

    @Override
    public UserData findById(String id) {
        return null;
    }

    @Override
    public List<UserData> findAll() {
        return null;
    }

    @Override
    public UserData save(UserData entity) {
        return null;
    }

    @Override
    public void deleteById(String id) {}
}