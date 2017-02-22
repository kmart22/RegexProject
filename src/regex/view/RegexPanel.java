package regex.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
import regex.controller.RegexController;

public class RegexPanel extends JPanel
{
	private String regex;
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneNumberLabel;
	private JLabel emailLabel;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField phoneNumberField;
	private JTextField emailField;
	private JButton enterButton;
	
	public RegexPanel(RegexController baseController)
	{	
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.firstNameLabel = new JLabel ("First Name:");
		this.lastNameLabel = new JLabel ("Last Name:");
		this.phoneNumberLabel = new JLabel ("Phone Number:");
		this.emailLabel = new JLabel ("Email:");
		this.firstNameField = new JTextField("First");
		this.lastNameField = new JTextField("Last");
		this.phoneNumberField = new JTextField("Phone");
		this.emailField = new JTextField("Email");
		this.enterButton = new JButton("Enter");
		baseLayout.putConstraint(SpringLayout.NORTH, enterButton, 77, SpringLayout.SOUTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.WEST, enterButton, 0, SpringLayout.WEST, firstNameLabel);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.DARK_GRAY);
		this.add(firstNameLabel);
		this.add(lastNameLabel);
		this.add(phoneNumberLabel);
		this.add(emailLabel);
		this.add(firstNameField);
		this.add(lastNameField);
		this.add(phoneNumberField);
		this.add(emailField);
		this.add(enterButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameLabel, 52, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameLabel, 30, SpringLayout.SOUTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumberLabel, 40, SpringLayout.SOUTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumberLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameField, -5, SpringLayout.NORTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameField, 75, SpringLayout.EAST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameField, -5, SpringLayout.NORTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, lastNameField, 0, SpringLayout.EAST, firstNameField);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumberField, -5, SpringLayout.NORTH, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumberField, 0, SpringLayout.WEST, firstNameField);
		baseLayout.putConstraint(SpringLayout.NORTH, emailField, 40, SpringLayout.SOUTH, phoneNumberField);
		baseLayout.putConstraint(SpringLayout.WEST, emailField, 0, SpringLayout.WEST, firstNameField);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, emailLabel, 5, SpringLayout.NORTH, emailField);
	}
	
	private void setupListeners()
	{
		
	}
	
}
