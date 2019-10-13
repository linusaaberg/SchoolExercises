package list4;

public class MovieMain {

    public static void main(String[] args) {

        Movie IT = new Movie("IT", 2019, 260);

        for ( int i = 0; i < 100; i++){
            IT.like();
        }

        IT.dislike();

        System.out.println(IT.getName() + " was released " + IT.getReleaseYear() + ". The movie has a rating of " + IT.getRating() + " and is " + IT.getLength() + " minutes long.");
    }
}
