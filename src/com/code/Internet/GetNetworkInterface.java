package com.code.Internet;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class GetNetworkInterface {
    public static void main(String[] args) {

	Enumeration<NetworkInterface> interfaces = null;

	try {

	    interfaces = NetworkInterface.getNetworkInterfaces();

	} catch (SocketException e) {
	    e.printStackTrace();
	}

	while (interfaces.hasMoreElements()) {

	    NetworkInterface nic = interfaces.nextElement();
	    System.out.print("Interface Name : [" + nic.getDisplayName() + "]");

	    try {

		System.out.println(", is connected : [" + nic.isUp() + "]");

	    } catch (SocketException e) {
		e.printStackTrace();
	    }

	}

    }
}