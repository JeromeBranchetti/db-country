package countries;

import java.sql.Date;


public class Country {
	private int country_id;
	private String name;
	private int area;
	private Date national_day;
	private String country_code2;
	private String country_code3;
	private int region_id;

	public Country(int country_id, String name, int area, Date national_day, String country_code2,
			String country_code3, int region_id) {
		super();
		this.country_id = country_id;
		this.name = name;
		this.area = area;
		this.national_day = national_day;
		this.country_code2 = country_code2;
		this.country_code3 = country_code3;
		this.region_id = region_id;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public Date getNational_day() {
		return national_day;
	}

	public void setNational_day(Date national_day) {
		this.national_day = national_day;
	}

	public String getCountry_code2() {
		return country_code2;
	}

	public void setCountry_code2(String country_code2) {
		this.country_code2 = country_code2;
	}

	public String getCountry_code3() {
		return country_code3;
	}

	public void setCountry_code3(String country_code3) {
		this.country_code3 = country_code3;
	}

	public int getRegion_id() {
		return region_id;
	}

	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	

}
