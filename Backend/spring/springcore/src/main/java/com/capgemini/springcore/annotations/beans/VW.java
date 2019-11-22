package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Engine;

public class VW implements Engine {

	@Override
	public int getCC() {
		return 1500;
	}

	@Override
	public String getType() {
		return "ABC";
	}

}
