package org.testing;

public class Desktop extends Computer {
private void desktopSize() {
System.out.println("system 2");
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopSize();
	d.computerModel();
}
}
