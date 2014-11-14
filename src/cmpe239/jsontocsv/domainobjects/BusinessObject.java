package cmpe239.jsontocsv.domainobjects;

import java.util.HashMap;

public class BusinessObject {
	
	//Atrributes attributes;
	String full_address;
	HashMap<String,HashMap<String,String>> hours;
	String open;
	String[] categories;
	String city;
	int review_count;
	String name;
	String[] neighborhoods;
	String longitude;
	String state;
	int stars;
	String latitude;
    String type;
	String business_id;
	
	
	public String getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}
	public String getFull_address() {
		return full_address;
	}
	public void setFull_address(String full_address) {
		this.full_address = full_address;
	}
	public HashMap<String, HashMap<String, String>> getHours() {
		return hours;
	}
	public void setHours(HashMap<String, HashMap<String, String>> hours) {
		this.hours = hours;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String[] getCategories() {
				return categories;
	}
	public void setCategories(String[] categories) {
		this.categories = categories;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getReview_count() {
		return review_count;
	}
	public void setReview_count(int review_count) {
		this.review_count = review_count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getNeighborhoods() {
		return neighborhoods;
	}
	public void setNeighborhoods(String[] neighborhoods) {
		this.neighborhoods = neighborhoods;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
//	public Atrributes getAttributes() {
//	return attributes;
//	}
//	public void setAttributes(Atrributes attributes) {
//		this.attributes = attributes;
//	}
	
//	public HashMap<String, HashMap<String, String>> getAttributes() {
//		return attributes;
//	}
//	public void setAttributes(HashMap<String, HashMap<String, String>> attributes) {
//		this.attributes = attributes;
//	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}