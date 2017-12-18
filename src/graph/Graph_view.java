package graph;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph_view extends Frame implements ActionListener,WindowListener{

	public Graph_view() {
		addWindowListener(this);
		setTitle("Graph");
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		data.addValue(300, "A", "1");
		data.addValue(400, "B", "1");
		data.addValue(320, "B", "3");
		data.addValue(500, "A", "3");
		data.addValue(120, "C", "1");
		data.addValue(200, "C", "3");


	    JFreeChart chart = ChartFactory.createLineChart("Import Volume","Volume","Number", data, PlotOrientation.VERTICAL,true,false,false);
	    //JFreeChart chart = ChartFactory.createBarChart("Import Volume","Year","Ton", data, PlotOrientation.VERTICAL,true,false,false);
	    //JFreeChart chart = ChartFactory.createAreaChart("Import Volume","Year","Ton", data, PlotOrientation.VERTICAL,true,false,false);
	    //JFreeChart chart = ChartFactory.createLineChart3D("Import Volume","Year","Ton", data, PlotOrientation.VERTICAL,true,false,false);
	    //JFreeChart chart = ChartFactory.createBarChart 3D("Import Volume","Year","Ton", data, PlotOrientation.VERTICAL,true,false,false);
	    ChartPanel cpanel = new ChartPanel(chart);
	    add(cpanel, BorderLayout.CENTER);
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
