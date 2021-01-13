package guru.springframework.jokesapp.sfgjokesapp.services;

import org.springframework.stereotype.Service;

@Service
public class JokesGeneratorService {
    private ChuckNorrisQuotes quotes;

    public JokesGeneratorService(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
