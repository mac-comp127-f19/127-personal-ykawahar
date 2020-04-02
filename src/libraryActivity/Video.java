package libraryActivity;

public class Video implements Media {
    private String title, director;
    private int numberOfCopies, numberInStock;

    public Video(String title, String director, int numberOfCopies) {
        this.title = title;
        this.director = director;
        this.numberOfCopies = numberOfCopies;
        numberInStock = numberOfCopies;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public boolean checkOut() {
        if (numberInStock > 0) {
            numberInStock --;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIn() {
        if (numberInStock < numberOfCopies) {
            numberInStock ++;
            return true;
        } else {
            return false;
        }
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Video{" +
                "Title: '" + title + '\'' +
                ", Director: '" + director + '\'' +
                ", In Stock: " + numberInStock +
                '}';
    }
}
