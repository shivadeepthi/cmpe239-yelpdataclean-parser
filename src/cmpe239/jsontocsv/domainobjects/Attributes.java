package cmpe239.jsontocsv.domainobjects;

import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonProperty;

public class Attributes {
	@JsonProperty("Take-out")
	String Takeout;
	@JsonProperty("Music")
	HashMap<String,String>  Music;
	public HashMap<String, String> getMusic() {
		return Music;
	}
	public void setMusic(HashMap<String, String> music) {
		Music = music;
	}
	@JsonProperty("Wi-Fi")
	String WiFi;
	@JsonProperty("Good For Dancing")
	String GoodForDancing;
	@JsonProperty("Good For")
	HashMap<String, String> GoodFor;
	@JsonProperty("Noise Level")
	String NoiseLevel;
	@JsonProperty("Takes Reservations")
	String TakesReservations;
	@JsonProperty("Ambience")
	HashMap<String, String> Ambience;
	@JsonProperty("Has TV")
	String HasTV;
	@JsonProperty("Delivery")
	String Delivery;
	@JsonProperty("Dogs Allowed")
	String DogsAllowed;
	@JsonProperty("Parking")
	HashMap<String, String> Parking;
	@JsonProperty("Wheelchair Accessible")
	String WheelchairAccessible;
	@JsonProperty("Outdoor Seating")
	String OutdoorSeating;
	@JsonProperty("Attire")
	String Attire;
	@JsonProperty("Alcohol")
	String Alcohol;
	@JsonProperty("Waiter Service")
	String WaiterService;
	@JsonProperty("Accepts Credit Cards")
	String AcceptsCreditCards;
	@JsonProperty("Good for Kids")
	String GoodforKids;
	@JsonProperty("Good For Groups")
	String GoodForGroups;
	@JsonProperty("Price Range")
	String PriceRange;
	@JsonProperty("By Appointment Only")
	String ByAppointmentOnly;
	@JsonProperty("Caters")
	String Caters;
	public String getCaters() {
		return Caters;
	}
	public void setCaters(String caters) {
		Caters = caters;
	}
	public String getByAppointmentOnly() {
		return ByAppointmentOnly;
	}
	public void setByAppointmentOnly(String byAppointmentOnly) {
		ByAppointmentOnly = byAppointmentOnly;
	}
	public String getTakeout() {
		return Takeout;
	}
	public void setTakeout(String takeout) {
		Takeout = takeout;
	}
	public String getWiFi() {
		return WiFi;
	}
	public void setWiFi(String wiFi) {
		WiFi = wiFi;
	}
	public HashMap<String, String> getGoodFor() {
		return GoodFor;
	}
	public void setGoodFor(HashMap<String, String> goodFor) {
		GoodFor = goodFor;
	}
	public String getNoiseLevel() {
		return NoiseLevel;
	}
	public void setNoiseLevel(String noiseLevel) {
		NoiseLevel = noiseLevel;
	}
	public String getTakesReservations() {
		return TakesReservations;
	}
	public void setTakesReservations(String takesReservations) {
		TakesReservations = takesReservations;
	}
	public HashMap<String, String> getAmbience() {
		return Ambience;
	}
	public void setAmbience(HashMap<String, String> ambience) {
		Ambience = ambience;
	}
	public String getHasTV() {
		return HasTV;
	}
	public void setHasTV(String hasTV) {
		HasTV = hasTV;
	}
	public String getDelivery() {
		return Delivery;
	}
	public void setDelivery(String delivery) {
		Delivery = delivery;
	}
	public String getDogsAllowed() {
		return DogsAllowed;
	}
	public void setDogsAllowed(String dogsAllowed) {
		DogsAllowed = dogsAllowed;
	}
	public HashMap<String, String> getParking() {
		return Parking;
	}
	public void setParking(HashMap<String, String> parking) {
		Parking = parking;
	}
	public String getWheelchairAccessible() {
		return WheelchairAccessible;
	}
	public void setWheelchairAccessible(String wheelchairAccessible) {
		WheelchairAccessible = wheelchairAccessible;
	}
	public String getOutdoorSeating() {
		return OutdoorSeating;
	}
	public void setOutdoorSeating(String outdoorSeating) {
		OutdoorSeating = outdoorSeating;
	}
	public String getAttire() {
		return Attire;
	}
	public void setAttire(String attire) {
		Attire = attire;
	}
	public String getAlcohol() {
		return Alcohol;
	}
	public void setAlcohol(String alcohol) {
		Alcohol = alcohol;
	}
	public String getWaiterService() {
		return WaiterService;
	}
	public void setWaiterService(String waiterService) {
		WaiterService = waiterService;
	}
	public String getAcceptsCreditCards() {
		return AcceptsCreditCards;
	}
	public void setAcceptsCreditCards(String acceptsCreditCards) {
		AcceptsCreditCards = acceptsCreditCards;
	}
	public String getGoodforKids() {
		return GoodforKids;
	}
	public String getGoodForDancing() {
		return GoodForDancing;
	}
	public void setGoodForDancing(String goodForDancing) {
		GoodForDancing = goodForDancing;
	}
	
	public void setGoodforKids(String goodforKids) {
		GoodforKids = goodforKids;
	}
	public String getGoodForGroups() {
		return GoodForGroups;
	}
	public void setGoodForGroups(String goodForGroups) {
		GoodForGroups = goodForGroups;
	}
	public String getPriceRange() {
		return PriceRange;
	}
	public void setPriceRange(String priceRange) {
		PriceRange = priceRange;
	}
	
	
	
}