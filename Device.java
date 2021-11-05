/**
 * 
 */
package org.arapp.model;

import java.util.Date;

/**
 * @author moises.alonso
 *
 */
public abstract class Device {
	double price;
	String serialNumber;
	String manufacturer;
	Date productionDate;
	String markerAR;
	String deviceType;
	
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Date getProductionDate() {
		return productionDate;
	}
	
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	
	public String getMarkerAR() {
		return markerAR;
	}
	
	public void setMarkerAR(String markerAR) {
		this.markerAR = markerAR;
	}
	
	
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return this.serialNumber;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public abstract void makePhoneCall(int phoneNumber);
	public abstract void takePic();
	public abstract void browseInInternet(String url);
	public abstract void playVideo(String fileName);
	public abstract void moveDeviceTo(int PosX, int PosY);
	
}
