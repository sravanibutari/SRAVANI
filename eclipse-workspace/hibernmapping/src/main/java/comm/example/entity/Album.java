package comm.example.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data


public class Album {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int albumId;
	
	private String albumName;
	
	@Column(name="create_date")
	private LocalDate date;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="image_id")
	
	private Image image;
	public Album(String albumName)
	{
		super();
		this.albumName=albumName;
		date=LocalDate.now();
	}
}
