package ar.edu.info.unlp.ejercicio1;

import java.util.List;

public class Usuario {
    private String screenName;
    private List<Tweet> tweets;

    public Usuario(String screenName) {
        this.screenName = screenName;
    }

    public void aniadirTweet(String texto) {
        if (texto.length() > 1 && texto.length() <= 280) {
            Tweet tweet = new Tweet(texto);
            this.tweets.add(tweet);

        }

    }

    public void reTweet(Tweet tweet) {
        Tweet retweet = new Tweet(tweet);
        this.tweets.add(retweet);
    }

    public

            void removeTweet() {
        this.tweets.clear();
    }

    public String getScreenName() {
        return screenName;
    }

}
