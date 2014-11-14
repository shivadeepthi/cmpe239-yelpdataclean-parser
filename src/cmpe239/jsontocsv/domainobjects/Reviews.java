package cmpe239.jsontocsv.domainobjects;

import java.util.HashMap;

public class Reviews {
	HashMap<String,Integer> votes;
	String user_id;
	String  review_id;
	String stars;
	String date;
	String text;
	String type;
	String business_id;
	public HashMap<String, Integer> getVotes() {
		return votes;
	}
	public void setVotes(HashMap<String, Integer> votes) {
		this.votes = votes;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getReview_id() {
		return review_id;
	}
	public void setReview_id(String review_id) {
		this.review_id = review_id;
	}
	public String getStars() {
		return stars;
	}
	public void setStars(String stars) {
		this.stars = stars;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}
	
}
