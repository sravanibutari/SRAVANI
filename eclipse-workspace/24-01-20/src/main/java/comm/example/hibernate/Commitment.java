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
@Table(name="commitment")
public class Commitment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int commitid;
	
	private String committest;
	
	private LocalDate dateoftime;
	
	@OneToMany(mappedBy = "image", cascade = CascadeType.ALL)
	private Post post;

	public Commitment(String postedby, String imageURL, LocalDate creationdate,String committest, LocalDate dateoftime) {
		super();
		this.committest = committest;
		this.dateoftime = dateoftime;
	}

	 
	
}
