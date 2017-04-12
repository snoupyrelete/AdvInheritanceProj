package adv.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import adv.controller.InheritanceController;

public class InheritancePanel extends JPanel  {

	private InheritanceController baseController;
	private SpringLayout baseLayout;
	private JTextArea textArea;
	private JButton showNextItem;
	
	public InheritancePanel(InheritanceController baseController) {
		super();
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		textArea = new JTextArea("");
		
		showNextItem = new JButton("Next");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel() {
		this.setLayout(baseLayout);
		this.add(textArea);
		this.add(showNextItem);
	}
	
	private void setupLayout() {
		baseLayout.putConstraint(SpringLayout.WEST, showNextItem, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, showNextItem, -26, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textArea, -75, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, -50, SpringLayout.EAST, this);
	}
	
	private void setupListeners() {
		showNextItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent selection)
			{
				String response = baseController.useFlammableList();
				textArea.setText(response);
			}
		});
	}
}
