package com.capgemini.springcore.beans;

public class Mobile {
	private String brandName;
	private int displaySize;
	private int resolution;
	private MobileDisplay mobileDisplay;
	
	
	public MobileDisplay getMobileDisplay() {
		return mobileDisplay;
	}
	public void setMobileDisplay(MobileDisplay mobileDisplay) {
		this.mobileDisplay = mobileDisplay;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(int displaySize) {
		this.displaySize = displaySize;
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	
}
