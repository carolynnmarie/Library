import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Books")
public class BookDomain implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "GENRES")
    private List<String> genres;

    @Column(name = "DATE_PUBLISHED")
    private Date datePublished;

    public BookDomain(){
        this.name = "";
        this.author = "";
        this.genres = new ArrayList<>(Arrays.asList(""));
        this.datePublished = new Date();
    }

    public BookDomain(String name, String author, List<String> genres, Date datePublished){
        this.name = name;
        this.author = author;
        this.genres = genres;
        this.datePublished = datePublished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }
}
