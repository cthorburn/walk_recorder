package com.colin.wrserver.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name="Marker")
@XmlRootElement
public class MarkerJPA {

	@Id 
	@Column(name="ID")
    @GeneratedValue(generator="MarkerSeq") 
    @SequenceGenerator(name="MarkerSeq",sequenceName="MARKER_SEQ", initialValue=1, allocationSize=50 ) 
	private Long id;
	
	@Column(name="LAT", precision = 38, scale = 2)
	private double  lat;
	
	@Column(name="LNG", precision = 38, scale = 2)
	private double lng;
	
	@Column(name="TAG_NAME", length=64)
	private String tagName;
	
	@Column(name="TAG_TYPE", length=64)
	private String tagType;
	
	@Column(name="TAG_VALUE", length=64)
	private String tagValue;
	
	public String getTagName() {
		return tagName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
}
