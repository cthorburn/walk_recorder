package com.colin.wrserver.rest;


/**
 * Created by Colin on 07/01/2015.
 */
public class MarkerData {
    private long id;
    private double lat;
    private double lng;
    private String tagName;
    private String tagType;
    private String tagValue;

    public MarkerData() {
    	
    }
    public MarkerData(double lat, double lng, String tagName, String tagType, String tagValue) {
        this.tagName = tagName;
        this.tagType = tagType;
        this.tagValue = tagValue;
        this.lat=lat;
        this.lng=lng;
    }

    public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    public String toQueryStringParms() {
        return "id=" + getId();
    }
}
