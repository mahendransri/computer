package org.testing;

public class desktops implements Hardware, Software {
	@Override
	public void softwareResources() {
		System.out.println("mumbai");
	}
	@Override
	public void hardwareResources() {
		System.out.println("chennai");
	}
	private void DesktopModel() {
		System.out.println("GateWay");
	}
	public static void main(String[] args) {
		desktops d = new desktops();
		d.softwareResources();
		d.hardwareResources();
		d.DesktopModel();
	}

}
