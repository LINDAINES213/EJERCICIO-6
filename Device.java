/**
 * Clase Device abstracta para heredar características a los distintos dispositivos.
 */

import java.util.Date;

/**
 * @author moises.alonso
 * Modificado por Mario Guerra y Linda Jiménez.
 */
public abstract class Device {
	/**
	 * Constructor para la clase Device.
	 */
	protected double price;
	protected String serialNumber;
	protected String manufacturer;
	protected Date productionDate;
	protected String markerAR;
	protected String deviceType;
	/**
	* Fin del constructor de la clase Device.
	*/
	
	public double getPrice() { //Método para devolver el precio del producto.
		return price;
	}
	
	public void setPrice(double price) { //Método para poner el precio del producto.
		this.price = price;
	}
	
	public Date getProductionDate() { //Método para devolver la fecha de producción.
		return productionDate;
	}
	
	public void setProductionDate(Date productionDate) { //Método para poner la fecha de producción.
		this.productionDate = productionDate;
	}
	
	public String getDeviceType() { //Método para devolver el tipo de dispositivo.
		return deviceType;
	}
	public void setDeviceType(String deviceType) { //Método para poner el tipo de dispositivo.
		this.deviceType = deviceType;
	}
	public void setSerialNumber(String serialNumber) { //Método para poner el número de serie.
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() { //Método para devolver el número de serie.
		return this.serialNumber;
	}
	
	public void setManufacturer(String manufacturer) { //Método para poner la manufactura del dispositivo.
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer() { //Método para devolver la manufactura del dispositivo.
		return this.manufacturer;
	}
	
	public abstract void makePhoneCall(int phoneNumber); //Método para hacer la llamada del dispositivo.
	public abstract void takePic(); //Método para tomar fotografías.
	public abstract void browseInInternet(String url); //Método para ingresar url para acceder a internet.
	public abstract void playVideo(String fileName); //Método para mostrar video.
}
