/**
 * 
 */
package org.arapp.model;

/**
 * @author moises.alonso
 *
 */
public class SmartPhone extends Device {

	@Override
	public void makePhoneCall(int phoneNumber) {
		System.out.println("Llamando al numero: " + phoneNumber + " desde mi: " + this.deviceType + " " + this.getManufacturer());

	}

	@Override
	public void takePic() {
		// TODO Auto-generated method stub

	}

	@Override
	public void browseInInternet(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playVideo(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveDeviceTo(int PosX, int PosY) {
		// TODO Auto-generated method stub

	}

}
