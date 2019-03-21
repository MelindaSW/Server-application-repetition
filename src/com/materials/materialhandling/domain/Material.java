package com.materials.materialhandling.domain;

import java.io.Serializable;

public class Material implements Serializable {
	
	private int number;
	private String material;
	private String color;
	private String inStock;

	public Material(int number, String material, String color, String inStock) {
		this.number = number;
		this.material = material;
		this.color = color;
		this.inStock = inStock;
	}
	
	@Override
	public String toString() {
		return number + " " + material;
	}
}
