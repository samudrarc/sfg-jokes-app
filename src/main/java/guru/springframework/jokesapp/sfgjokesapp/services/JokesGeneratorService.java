package guru.springframework.jokesapp.sfgjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesGeneratorService {
    private final ChuckNorrisQuotes quotes;

    public JokesGeneratorService() {
        this.quotes = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
