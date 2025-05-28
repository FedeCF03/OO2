
import java.util.List;

import ar.edu.unlp.oo2.persitencia.PersistableUser;
import ar.edu.unlp.oo2.persitencia.Post;
import ar.edu.unlp.oo2.persitencia.PostRepository;
import ar.edu.unlp.oo2.persitencia.UserRepository;

public class ProxyUser implements PersistableUser {
    private String username;
    private List<Post> posts;
    private PersistableUser user;

    public ProxyUser(String user) {
        this.username = user;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getEmail() {
        if (this.user == null) {
            this.user = new UserRepository().findUserByUsername(this.username);
            return this.user.getEmail();
        }
        return this.user.getEmail();
    }

    @Override
    public List<Post> getPosts() {
        return new PostRepository().findPostsByUsername(username);
    }

}
