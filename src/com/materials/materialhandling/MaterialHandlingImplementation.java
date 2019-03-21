package com.materials.materialhandling;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.materials.materialhandling.domain.Material;

@Stateless
public class MaterialHandlingImplementation implements MaterialHandlingService {

	@Override
	public void registerMaterial(Material material) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Material> getAllMaterials() {

		Material m1 = new Material(1, "Wool", "Red", "Yes");
		Material m2 = new Material(2, "Silk", "Blue", "No");
				
		List<Material> materials = new ArrayList<Material>();
		materials.add(m1);
		materials.add(m2);
		return materials;
	}

	@Override
	public List<Material> searchByNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
