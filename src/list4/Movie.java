package list4;

public class Movie {

    String title;
    int releaseYear;
    int length;
    int rating;

    public Movie(String title, int releaseYear, int length){
        this.title = title;
        this.releaseYear = releaseYear;
        this.length = length;
        this.rating = 0;
    }

    public String getName(){
        return this.title;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }

    public int getLength(){
        return this.length;
    }

    public int getRating(){
        return this.rating;
    }

    public void like() {
        this.rating++;
    }

    public void dislike(){
        if ( rating != 0){
            this.rating--;
        }
    }
}
