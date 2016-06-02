package asgn2Simulators;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.DynamicTimeSeriesCollection;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.RefineryUtilities;



public class GUISimulator extends javax.swing.JFrame implements java.lang.Runnable
{
	private static final long serialVersionUID = 8645229832063987966L;
	
	
    private static final String BUTTONTEXT = "Show Chart";
   
    private static final float MINMAX = 1250;
    private static final float MINMAX1 = 40000;
    private static final int COUNT = 2 * 60;
    private static final int FAST = 100;
    private static final int SLOW = FAST * 5;
    private static final Random random = new Random();
    private Timer timer;
	private static final String TITLE = "Simulator Result";
	private static final String TITLE1 = "Simulator Result2";

	public GUISimulator(java.lang.String title) throws java.awt.HeadlessException
	{
		super(title);
		
        final JButton run = new JButton(BUTTONTEXT);
        final JFreeChart lineChart = ChartFactory.createLineChart(
                TITLE,
                "Day","Passenger",
                createDataset(),
                PlotOrientation.VERTICAL,
                true,true,false);
        final JFreeChart lineChart1 = ChartFactory.createLineChart(
                TITLE1,
                "Day","Passenger",
                createDataset1(),
                PlotOrientation.VERTICAL,
                true,true,false);
        
        
        final JTextArea txt = new JTextArea(4,40);
        final JComboBox combo = new JComboBox();
        combo.addItem("Result1");
        combo.addItem("Result2");
        combo.addItem("Result3");
        JPanel btnPanel = new JPanel(new FlowLayout());
        ///btnPanel.add(txt);
        btnPanel.add(combo);
        btnPanel.add(run);
        run.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = combo.getSelectedItem().toString();
               
                if(cmd.compareToIgnoreCase("Result1") == 0)
                {
                	
                	 add(new ChartPanel(lineChart),BorderLayout.CENTER);
                }
                else if(cmd.compareToIgnoreCase("Result2") == 0)
                {
                	add(new ChartPanel(lineChart1),BorderLayout.CENTER);
                }
                
            }
        });
        
       
        this.add(btnPanel, BorderLayout.SOUTH);

       
	}
	
	private float randomValue() {
        return (float) (random.nextGaussian() * MINMAX / 3);
    }

    private float[] gaussianData() {
        float[] a = new float[COUNT];
        for (int i = 0; i < a.length; i++) {
            a[i] = randomValue();
        }
        return a;
    }

    
    private DefaultCategoryDataset createDataset( )
    {
       DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
       
       String type[] = {"First","Business","Primium","Economy","Total","Empty"};
       int day[] = {1,2,8,10,12,14,16,20,22,24,26,28};
       int First[] = {12,23,67,34,56,23,56,12,7,12,26,56};
       int Business[] = {26,40,40,12,67,45,72,10,23,5,35,60};
       int Primium[] = {150,180,100,210,160,50,110,40,123,167,143,23};
       int Economy[] = {250,290,200,223,300,350,400,450,380,530,488,300};
       int Empty[] = {10,20,5,70,30,90,150,30,20,15,35,18};
      
       for(int i=0;i<=5;i++)
       {
    	   for(int j=0;j<=11;j++)
    	   {
    		   if(type[i].compareToIgnoreCase("First") == 0)
    		   {
    			   dataset.addValue( First[j] , type[i] , String.valueOf(day[j]) );
    		   }
    		   else if(type[i].compareToIgnoreCase("Business") == 0)
    		   {
    			   dataset.addValue( Business[j] , type[i] , String.valueOf(day[j]) );
    		   }
    		   else if(type[i].compareToIgnoreCase("Primium") == 0)
    		   {
    			   dataset.addValue( Primium[j] , type[i] , String.valueOf(day[j]) );
    		   }
    		   else if(type[i].compareToIgnoreCase("Economy") == 0)
    		   {
    			   dataset.addValue( Economy[j] , type[i] , String.valueOf(day[j]) );
    		   }
    		   else if(type[i].compareToIgnoreCase("Total") == 0)
    		   {
    			   dataset.addValue( Economy[j]+First[j]+Business[j]+Economy[j] , type[i] , String.valueOf(day[j]) );
    		   }
    		   else if(type[i].compareToIgnoreCase("Empty") == 0)
    		   {
    			   dataset.addValue( Empty[j] , type[i] , String.valueOf(day[j]) );
    		   }
    	   }
    	   
       }
       
       return dataset;
    }
    
    private DefaultCategoryDataset createDataset1( )
    {
       DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
       
       String type[] = {"Queue","Refused"};
       int day[] = {1,2,8,10,12,14,16,20,22,24,26,28};
       int Queue[] = {12,23,67,34,56,23,56,12,7,12,26,56};
       int Refused[] = {12,40,80,92,167,200,250,280,300,342,380,420};
       
      
       for(int i=0;i<=1;i++)
       {
    	   for(int j=0;j<=11;j++)
    	   {
    		   if(type[i].compareToIgnoreCase("Queue") == 0)
    		   {
    			   dataset.addValue( Queue[j] , type[i] , String.valueOf(day[j]) );
    		   }
    		   else if(type[i].compareToIgnoreCase("Refused") == 0)
    		   {
    			   dataset.addValue( Refused[j] , type[i] , String.valueOf(day[j]) );
    		   }
    		   
    	   }
    	   
       }
       
       return dataset;
    }
    
    
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void main(java.lang.String[] args)
	{
		EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
            	GUISimulator demo = new GUISimulator(TITLE);
                demo.pack();
                RefineryUtilities.centerFrameOnScreen(demo);
                demo.setVisible(true);
                //demo.start();
            }
        });
	}

}
