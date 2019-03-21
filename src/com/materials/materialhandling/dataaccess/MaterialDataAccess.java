package com.materials.materialhandling.dataaccess;

import java.util.List;

import javax.ejb.Local;

import com.materials.materialhandling.domain.Material;

@Local
public interface MaterialDataAccess {

	public void insert(Material material);
	public List<Material> findAll();
	public List<Material> findByNumber(int number);
	
}
