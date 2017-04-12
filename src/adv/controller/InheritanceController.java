package adv.controller;

import java.util.ArrayList;

import adv.model.*;
import adv.view.*;

public class InheritanceController {

	private Dog cutestDogInTheWorld;
	private Dog fieryPokemonDoggo;
	private Mustang kadensDumbCar;
	
	private ArrayList<Flammable> fireList = new ArrayList<Flammable>();
	private InheritanceFrame inheritanceFrame;
	
	public InheritanceController() {
		inheritanceFrame = new InheritanceFrame(this);
		cutestDogInTheWorld = new Ridgeback();
		fieryPokemonDoggo = new Arcanine();
		kadensDumbCar = new Mustang();
		
		
		fireList.add(cutestDogInTheWorld);
		fireList.add(fieryPokemonDoggo);
		fireList.add(kadensDumbCar);
	}
	
	public void start() {

	}
	
	public String useFlammableList() {
		System.out.println("The cutest dog in the world is:");
		System.out.println(cutestDogInTheWorld.toString());
		
		String results = "";
		for(Flammable currentFlammable: fireList) {
			results += currentFlammable.toString();
			results += currentFlammable.getFlammabilityLevel() + " ";
			results += currentFlammable.isDrenchedInLighterFluid() + " ";
			results += currentFlammable.isFlameRetardant() + " ";
			results += currentFlammable.getFlammabilityLevel() + " ";
			currentFlammable.setFlammabilityLevel(666);
			
				if(currentFlammable instanceof Dog) {
					results += "Dog was made by Dylan";	
				}
			results += "\n";
		}
		return results;
	}
}
