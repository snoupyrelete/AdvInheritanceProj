package adv.view;

import java.awt.Dimension;

import javax.swing.JFrame;

import adv.controller.InheritanceController;

public class InheritanceFrame extends JFrame {

	private InheritanceController baseController;
	private InheritancePanel inheritancePanel;
	
	public InheritanceFrame(InheritanceController baseController) {
		super();
		this.baseController = baseController;
		inheritancePanel = new InheritancePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(inheritancePanel);
		this.setTitle("Chatbot Window");
		this.setSize(new Dimension(750, 500));
		this.setVisible(true);
	}

}
