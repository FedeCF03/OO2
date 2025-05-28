import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.oo2.persitencia.Post;

public class FakePostRepository {
    private List<Post> posts = new ArrayList<Post>();

    public List<Post> findPostsByUsername(String aUsername) {
        return this.posts.stream().filter(post -> post.getUsername().equals(aUsername)).collect(Collectors.toList());
    }
}
