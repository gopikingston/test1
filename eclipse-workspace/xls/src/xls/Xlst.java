package xls;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xlst{

	private Pattern addressPattern = Pattern.compile(ADDRESS_PATTERN);
	private Matcher matcher;

	//Alternative
	/*private Pattern addressPattern =
		Pattern.compile(ADDRESS_PATTERN, Pattern.DOTALL);*/

	private static final String ADDRESS_PATTERN = "(?s)Address 1:\\s(.*)Address 2:";

	public static void main(String[] args) {

		String data = "Testing... \n" +
			"Address 1: 88 app 2/8\n" +
			"superman taman, puchong\n" +
			"36100, Malaysia\n" +
			"Address 2: abc" +
			"testing end";

		Xlst obj = new Xlst();
		List list = obj.getAddress1(data);

		System.out.println("Test Data : ");
		System.out.println(data + "\n");

		System.out.println("Address Resut : " + list);

	}

	private List getAddress1(String data) {
		// TODO Auto-generated method stub
		return null;
	}
	}


