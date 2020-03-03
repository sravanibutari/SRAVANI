package comm.example.spring.model;

import java.io.Serializable;

public class CDType implements Serializable {
	private static final long serialVersionUID = -8144326278648299412L;
private String title;
private String CDType;
public CDType(String title, String cDType) {
	super();
	this.title = title;
	CDType = cDType;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getCDType() {
	return CDType;
}

public void setCDType(String cDType) {
	CDType = cDType;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}

}
