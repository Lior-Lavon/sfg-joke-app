package guru.springframework.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class GetAJoke implements JokeService{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public GetAJoke(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @java.lang.Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
