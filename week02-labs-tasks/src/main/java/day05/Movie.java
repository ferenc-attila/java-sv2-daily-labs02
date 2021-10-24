package day05;

public class Movie {

    private String title;
    private int year;
    private int numberOfRatings;
    private int sumOfRatings;
    private double avgRating;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void addEvaluation(int rating) {
        if (rating > 0 && rating <= 5) {
            sumOfRatings += rating;
            numberOfRatings++;
        } else {
            System.out.println("Invalid value.");
        }
        this.avgRating = sumOfRatings * 1.0 / numberOfRatings;
    }

    public String getTitle() {
        return title;
    }

    public double getAvgRating() {
        return avgRating;
    }
}
