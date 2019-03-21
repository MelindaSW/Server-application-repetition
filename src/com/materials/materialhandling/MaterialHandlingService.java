package com.materials.materialhandling;

import java.util.List;

import javax.ejb.Remote;

import com.materials.materialhandling.domain.Material;

@Remote
public interface MaterialHandlingService {

	public void registerMaterial(Material material);
	public List<Material> getAllMaterials();
	public List<Material> searchByNumber();
	
}
