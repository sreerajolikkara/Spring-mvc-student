package com.raj;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//import com.sun.istack.internal.NotNull;
//import javax.validation.constraints.NotNull;;

public class Customer {

	private LinkedHashMap<String,String>countryList;
	private LinkedHashMap<String,String>favCuisineList;
	
	@NotBlank(message="Required Field")
	@Size(min=3,message="The name should have min3 characters")
	@Pattern(regexp="[a-zA-Z ]+",message="Name  cannot have any special character")
	@Pattern(regexp="^\\S+$",message="Name field cannot be empty.")
	public String name;
	public String country;
	public String favCuisine;
	@NotEmpty(message="Select atleast one book")
	private String[] books;
	@NotNull
	@Min(value=0,message="cannot be less than 0")
	@Max(value=10,message="cannot be larger than 10")
	private int discountCoupons;
	
	
	public int getDiscountCoupons() {
		return discountCoupons;
	}


	public void setDiscountCoupons(int discountCoupons) {
		this.discountCoupons = discountCoupons;
	}


	public String[] getBooks() {
		return books;
	}


	public void setBooks(String[] books) {
		this.books = books;
	}


	public String getFavCuisine() {
		return favCuisine;
	}


	public void setFavCuisine(String favCuisine) {
		this.favCuisine = favCuisine;
	}

	public Customer()
	{
		countryList=new LinkedHashMap<String,String>();
		countryList.put("IN","India");
		countryList.put("US","USA");
		countryList.put("FR","France");
		countryList.put("AUS","Australia");
		countryList.put("JP","Japan");
		favCuisineList=new LinkedHashMap<String, String>();
		favCuisineList.put("Italian","Italian");
		favCuisineList.put("French","French");
		favCuisineList.put("Chinese","Chinese");
		favCuisineList.put("Arabic","Arabic");
		
	}

	public LinkedHashMap<String, String> getFavCuisineList() {
		return favCuisineList;
	}


	public void setFavCuisineList(LinkedHashMap<String, String> favCuisineList) {
		this.favCuisineList = favCuisineList;
	}


	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public void setCountryList(LinkedHashMap<String, String> countryList) {
		this.countryList = countryList;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
