package comm.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Country {
	private String name;

	public Country(String name) {
		super();
		this.name = name;
		}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the country1
	 */
	public List<String> getCountry1() {
		return country1;
	}
	/**
	 * @param country1 the country1 to set
	 */
	public void setCountry1(List<String> country1) {
		this.country1 = country1;
	}
	/**
	 * @return the country2
	 */
	public List<String> getCountry2() {
		return country2;
	}
	/**
	 * @param country2 the country2 to set
	 */
	public void setCountry2(List<String> country2) {
		this.country2 = country2;
	}
	/**
	 * @return the country3
	 */
	public List<String> getCountry3() {
		return country3;
	}
	/**
	 * @param country3 the country3 to set
	 */
	public void setCountry3(List<String> country3) {
		this.country3 = country3;
	}

	List <String> country1=new ArrayList<String>();
	                                                        
//country1.add("AP");
//country1.add("Telangana");
//country1.add("UP");
List <String> country2=new ArrayList<String>();
//country2.add("a");
//country2.add("b");
List <String> country3=new ArrayList<String>();
//country3.add("c");
//country3.add("d");

}
