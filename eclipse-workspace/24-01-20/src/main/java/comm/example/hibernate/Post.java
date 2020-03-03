package comm.example.hibernate;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="post")
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int postid;
	
	private String postedby;
	
	@Column(name="image_url")
	private String imageURL;

	@Column(name="date")
	private LocalDate creationdate;
	
@OneToMany(cascade=CascadeType.ALL)
	
	
	private Commitment commitment;

	public Post(String postedby, String imageURL, LocalDate creationdate) {
		super();
		this.postedby = postedby;
		this.imageURL = imageURL;
		this.creationdate = creationdate;
	}
	
	
}
