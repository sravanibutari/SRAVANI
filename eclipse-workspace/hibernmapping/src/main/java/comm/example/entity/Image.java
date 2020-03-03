package comm.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "image_id")
	private int imageId;
	
	@Column(name="image_url")
	private String imageURL;

	@OneToMany(mappedBy = "image", cascade = CascadeType.ALL)
    private Album album;

	public Image(String imageURL)
	{
		super();
		this.imageURL=imageURL;
	}
}
