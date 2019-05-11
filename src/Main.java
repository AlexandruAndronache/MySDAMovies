public class Main {

    public static void main(String[] args) {

        String moviesPath = "movies.txt";
        MyMoviesCollection myMoviesCollection = new MyMoviesCollection();
        myMoviesCollection.readMoviesFromFiles(moviesPath);
        myMoviesCollection.showMovies();
        myMoviesCollection.sortMoviesByYear();
        myMoviesCollection.showMovies();
        myMoviesCollection.sortMoviesByScore();
        myMoviesCollection.showMovies();
        myMoviesCollection.sortMoviesByDuration();

    }
}
