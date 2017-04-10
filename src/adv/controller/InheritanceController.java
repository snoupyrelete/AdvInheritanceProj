package adv.controller;

import java.util.ArrayList;

import adv.model.*;


public class InheritanceController {

	Dog cutestDogInTheWorld;
	Dog fieryPokemonDoggo;
	ArrayList<Dog> pupperList = new ArrayList<Dog>();
	
	public InheritanceController() {
		cutestDogInTheWorld = new Ridgeback();
		fieryPokemonDoggo = new Arcanine();
		
		pupperList.add(cutestDogInTheWorld);
		pupperList.add(fieryPokemonDoggo);
	}
	
	public void start() {
		System.out.println("The cutest dog in the world is:");
		System.out.println(cutestDogInTheWorld.toString());
		
		for(int i = 0; i < pupperList.size(); i++) {
			if(pupperList.get(i) instanceof Ridgeback) {
				pupperList.get(i).getFlammabilityLevel();
			} else if (pupperList.get(i) instanceof Arcanine) {
				pupperList.get(i).isDrenchedInLighterFluid();
			}
		}
	}
}
