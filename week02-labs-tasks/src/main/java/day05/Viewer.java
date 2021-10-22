package day05;

public class Viewer {

    public void WatcMovie(Movie movie, int rating) {
        System.out.println("The rate of the movie is: " + movie.addEvaluation(rating));
    }

    public static void main(String[] args) {

        Movie movie = new Movie("Star Wars", 1987);
        Viewer viewer = new Viewer();

        viewer.WatcMovie(movie, 5);
        viewer.WatcMovie(movie, 4);
        viewer.WatcMovie(movie, 5);
        viewer.WatcMovie(movie, 3);
    }
}


