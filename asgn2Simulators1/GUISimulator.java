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
import javax.swing.Timer;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
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
	
	
    private static final String BUTTONTEXT = "BOOK";
   
    private static final float MINMAX = 400;
    private static final int COUNT = 2 * 60;
    private static final int FAST = 100;
    private static final int SLOW = FAST * 5;
    private static final Random random = new Random();
    private Timer timer;
	private static final String TITLE = "Booking System";

	public GUISimulator(java.lang.String title) throws java.awt.HeadlessException
	{
		super(title);
        final DynamicTimeSeriesCollection dataset =
            new DynamicTimeSeriesCollection(4, COUNT, new Second());
        dataset.setTimeBase(new Second(0, 0, 0, 1, 1, 2011));
        dataset.addSeries(gaussianData(), 0, "First");
        dataset.addSeries(gaussianData(), 1, "Business");
        dataset.addSeries(gaussianData(), 2, "Primium");
        dataset.addSeries(gaussianData(), 3, "Economy");
        JFreeChart chart = createChart(dataset);

        final JButton run = new JButton(BUTTONTEXT);
        run.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                
            }
        });

        final JComboBox<String> combo = new JComboBox<String>();
        combo.addItem("First");
        combo.addItem("Business");
        combo.addItem("Primium");
        combo.addItem("Economy");
        combo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        this.add(new ChartPanel(chart), BorderLayout.CENTER);
        JPanel btnPanel = new JPanel(new FlowLayout());
        btnPanel.add(run);
        btnPanel.add(combo);
        this.add(btnPanel, BorderLayout.SOUTH);

        timer = new Timer(FAST, new ActionListener() {

            float[] newData = new float[2];

            @Override
            public void actionPerformed(ActionEvent e) {
            	newData[0] = randomValue();
                newData[1] = randomValue();
                dataset.advanceTime();
                dataset.appendData(newData);
            }
        });
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

    private JFreeChart createChart(final XYDataset dataset) {
        final JFreeChart result = ChartFactory.createTimeSeriesChart(
            TITLE, "Week", "Passenger", dataset, true, true, false);
        final XYPlot plot = result.getXYPlot();
        ValueAxis domain = plot.getDomainAxis();
        domain.setRange(1, 7);
        domain.setTickMarkOutsideLength(1);
        
        ValueAxis range = plot.getRangeAxis();
        range.setRange(0, MINMAX);
        return result;
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
