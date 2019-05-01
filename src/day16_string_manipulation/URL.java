package day16_string_manipulation;

import java.util.*;

public class URL {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url: ");
		String url = scan.next();
		String domain = "";
		String extension = "";
		// www.amazon.com
		// com, net, edu, org, gov
		// check that it starts with www.
		// check it contains the ending do,
		// assign String domain and String extension
		// print them
		// "Domain:" amazon "Extension:" com

		switch (extension) {
		case "com":
			System.out.println("Valid url - extension is present");
			break;
		case "net":
			System.out.println("Valid url - extension is present");
			break;
		case "edu":
			System.out.println("Valid url - extension is present");
			break;
		case "org":
			System.out.println("Valid url - extension is present");
			break;
		case "gov":
			System.out.println("Valid url - extension is present");
			break;
		default:
			System.out.println("Invalid extension");
		}

		if (url.startsWith("www.")) {
			System.out.println("Valid url - www. is present");
		} else {
			System.out.println("Invalid url format  - www. is missing");
			return;
		}
		if (url.endsWith(extension)) {
			System.out.println("Valid url - extension is present");
		} else {
			System.out.println("Invalid url extension");
			return;
		}
		// check . is there right before extension
		// find out the length of url
		// do -4 and using charAt get the character
		// compare if it is '.'
		// www.etsy.com => 12
		// url.length() - 4;
		// url.lastIndexOf(".")
		// if(url.charAt(ur.length() -4) == '.') {

		int dotIndex = url.length() - 4;

		if (url.charAt(dotIndex) == '.') {
			System.out.println(". is present");
		} else {
			System.out.println(". might be misplaced");
		}

		// get domain and extension
		// www.yahoo.com

		domain = url.substring(4, dotIndex);// used to print domain
		System.out.println("Domain:" + domain);
		extension = url.substring(dotIndex + 1, url.length());// used to print extension
		System.out.println("Extension: " + extension);

	}
}
