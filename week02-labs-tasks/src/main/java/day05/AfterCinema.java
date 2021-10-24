package day05;

public class AfterCinema {

    public static void main(String[] args) {

        Movie movie = new Movie("Star Wars", 1987);
        Viewer firstViewer = new Viewer();
        Viewer secondViewer = new Viewer();
        Viewer thirdViewer = new Viewer();
        Viewer fourthViewer = new Viewer();
        Viewer fifthViewer = new Viewer();

        firstViewer.WatchMovie(movie, 5);
        secondViewer.WatchMovie(movie, 4);
        thirdViewer.WatchMovie(movie, 5);
        fourthViewer.WatchMovie(movie, 3);
        fifthViewer.WatchMovie(movie, 5);

        System.out.println("The average rating of " + movie.getTitle() + ": " + movie.getAvgRating());
    }
}
