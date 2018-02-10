
package com.gz.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * An Address following the convention of http://microformats.org/wiki/hcard
 * 
 */
public class Address {

    @SerializedName("post-office-box")
    @Expose
    private String postOfficeBox;
    @SerializedName("extended-address")
    @Expose
    private String extendedAddress;
    @SerializedName("street-address")
    @Expose
    private String streetAddress;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("locality")
    @Expose
    private String locality;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("postal-code")
    @Expose
    private String postalCode;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("country-name")
    @Expose
    private String countryName;

    public String getPostOfficeBox() {
        return postOfficeBox;
    }

    public void setPostOfficeBox(String postOfficeBox) {
        this.postOfficeBox = postOfficeBox;
    }

    public String getExtendedAddress() {
        return extendedAddress;
    }

    public void setExtendedAddress(String extendedAddress) {
        this.extendedAddress = extendedAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getLocality() {
        return locality;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getRegion() {
        return region;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("postOfficeBox", postOfficeBox).append("extendedAddress", extendedAddress).append("streetAddress", streetAddress).append("locality", locality).append("region", region).append("postalCode", postalCode).append("countryName", countryName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(postOfficeBox).append(streetAddress).append(postalCode).append(locality).append(countryName).append(extendedAddress).append(region).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder().append(postOfficeBox, rhs.postOfficeBox).append(streetAddress, rhs.streetAddress).append(postalCode, rhs.postalCode).append(locality, rhs.locality).append(countryName, rhs.countryName).append(extendedAddress, rhs.extendedAddress).append(region, rhs.region).isEquals();
    }

}
