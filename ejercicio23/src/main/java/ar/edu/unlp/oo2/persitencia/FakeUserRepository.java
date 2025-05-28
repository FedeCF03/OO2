import java.util.List;

import ar.edu.unlp.oo2.persitencia.PersistableUser;

public class FakeUserRepository {
    public PersistableUser findUserByUsername(String aUsername, List<PersistableUser> users) {
        return users.stream().filter(user -> user.getUsername().equals(aUsername)).findFirst()
                .orElse(null);

    }
}
