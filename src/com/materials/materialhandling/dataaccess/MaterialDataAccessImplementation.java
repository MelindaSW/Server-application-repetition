package com.materials.materialhandling.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.materials.materialhandling.domain.Material;

@Stateless
public class MaterialDataAccessImplementation implements MaterialDataAccess {

	@Override
	public void insert(Material material) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Material> findAll() {
		
		Material m1 = new Material(1, "Wool", "Red", "Yes");
		Material m2 = new Material(2, "Silk", "Blue", "No");
		Material m3 = new Material(3, "Viscose", "Black", "Yes");
				
		List<Material> materials = new ArrayList<Material>();
		materials.add(m1);
		materials.add(m2);
		materials.add(m3);
		
		return materials;
	}

	@Override
	public List<Material> findByNumber(int number) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
