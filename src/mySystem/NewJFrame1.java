/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mySystem;

import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author iamAxylle
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {


        initComponents();

    }

    private org.jfree.data.xy.XYDataset createDataset() {
        final org.jfree.data.xy.XYSeries series1 = new org.jfree.data.xy.XYSeries("First");
        series1.add(1.0, 1.0);
        series1.add(2.0, 4.0);
        series1.add(3.0, 3.0);
        series1.add(4.0, 5.0);
        series1.add(5.0, 5.0);
        series1.add(6.0, 7.0);
        series1.add(7.0, 7.0);
        series1.add(8.0, 8.0);

        final org.jfree.data.xy.XYSeries series2 = new org.jfree.data.xy.XYSeries("Second");
        series2.add(1.0, 5.0);
        series2.add(2.0, 7.0);
        series2.add(3.0, 6.0);
        series2.add(4.0, 8.0);
        series2.add(5.0, 4.0);
        series2.add(6.0, 4.0);
        series2.add(7.0, 2.0);
        series2.add(8.0, 1.0);

        final org.jfree.data.xy.XYSeries series3 = new org.jfree.data.xy.XYSeries("Third");
        series3.add(3.0, 4.0);
        series3.add(4.0, 3.0);
        series3.add(5.0, 2.0);
        series3.add(6.0, 3.0);
        series3.add(7.0, 6.0);
        series3.add(8.0, 3.0);
        series3.add(9.0, 4.0);
        series3.add(10.0, 3.0);

        final org.jfree.data.xy.XYSeriesCollection dataset = new org.jfree.data.xy.XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);
        
        return dataset;
    }

        public org.jfree.chart.JFreeChart createChart(final org.jfree.data.xy.XYDataset dataset) {

        // create the chart...
        final org.jfree.chart.JFreeChart chart = org.jfree.chart.ChartFactory.createXYLineChart(
                "Line Chart Demo 6", // chart title
                "X", // x axis label
                "Y", // y axis label
                dataset, // data
                org.jfree.chart.plot.PlotOrientation.VERTICAL,
                true, // include legend
                true, // tooltips
                false // urls
                );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
        chart.setBackgroundPaint(java.awt.Color.white);

//        final StandardLegend legend = (StandardLegend) chart.getLegend();
        //      legend.setDisplaySeriesShapes(true);

        // get a reference to the plot for further customisation...
        final org.jfree.chart.plot.XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(java.awt.Color.lightGray);
        //    plot.setAxisOffset(new Spacer(Spacer.ABSOLUTE, 5.0, 5.0, 5.0, 5.0));
        plot.setDomainGridlinePaint(java.awt.Color.white);
        plot.setRangeGridlinePaint(java.awt.Color.white);

        final org.jfree.chart.renderer.xy.XYLineAndShapeRenderer renderer = new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer();
        //renderer.setSeriesLinesVisible(0, false);
        //renderer.setSeriesShapesVisible(1, false);
        //renderer.setSeriesShapesVisible(2, true);
        plot.setRenderer(renderer);

        // change the auto tick unit selection to integer units only...
        final org.jfree.chart.axis.NumberAxis rangeAxis = (org.jfree.chart.axis.NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(org.jfree.chart.axis.NumberAxis.createIntegerTickUnits());
        // OPTIONAL CUSTOMISATION COMPLETED.
        return chart;
    }

        final org.jfree.data.xy.XYDataset dataset = createDataset();
        final org.jfree.chart.JFreeChart chart = createChart(dataset);
        

        public JPanel ChartPanel2 () {
            
            return new ChartPanel(chart);
        }
        
    public JPanel BarChart2Panel() {
    org.jfree.data.category.DefaultCategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
        dataset.setValue(3800, "Marks", "January");
        dataset.setValue(1200, "Mark", "January");
        dataset.setValue(4750, "Marks", "February");
        dataset.setValue(2950, "Mark", "February");
        dataset.setValue(875, "Marks", "March");
        dataset.setValue(1950, "Mark", "March");
        
        JFreeChart chart = ChartFactory.createBarChart3D("Bar Chart Title", "Stdent Names x-axis", "Marks y-axis", dataset, org.jfree.chart.plot.PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot P = chart.getCategoryPlot();
        P.setRangeGridlinePaint(Color.black);
        return new ChartPanel(chart);
    }    
        
    public JPanel createLineChart() {
        org.jfree.data.category.DefaultCategoryDataset data2;
        data2 = new org.jfree.data.category.DefaultCategoryDataset();
        data2.setValue(0, "Marks", "");
        data2.setValue(80, "Marks", "Student1");
        data2.setValue(50, "Marks", "Student2");
        data2.setValue(75, "Marks", "Student3");
        data2.setValue(95, "Marks", "Student4");

        JFreeChart chart1 = ChartFactory.createLineChart3D("Bar Chart Title", "Stdent Names x-axis", "Marks y-axis", data2, org.jfree.chart.plot.PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot P = chart1.getCategoryPlot();
        P.setRangeGridlinePaint(Color.black);
        //ChartFrame frame = new ChartFrame("Bar Chart - Frame Title", chart);
        //frame.setVisible(true);
        //frame.setSize(450, 500);*/

        return new ChartPanel(chart1);
    }

    public JPanel createChartPanel() {
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("One", new Integer(10));
        pieDataset.setValue("Two", new Integer(20));
        pieDataset.setValue("Three", new Integer(30));
        pieDataset.setValue("Four", new Integer(10));
        pieDataset.setValue("Five", new Integer(20));
        pieDataset.setValue("Six", new Integer(10));
        JFreeChart chart = ChartFactory.createPieChart3D("3D Pie Chart", pieDataset, true, true, true);
        return new ChartPanel(chart);

    }

// By 
// Create chart panel method
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chartPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chartPanel = BarChart2Panel();
        //chartPanel = createChartPanel();
        //chartPanel = createLineChart();
        //final org.jfree.chart.ChartPanel chartPanel = new org.jfree.chart.ChartPanel(chart);
        chartPanel.setBackground(new java.awt.Color(255, 255, 255));
        chartPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout chartPanelLayout = new javax.swing.GroupLayout(chartPanel);
        chartPanel.setLayout(chartPanelLayout);
        chartPanelLayout.setHorizontalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        chartPanelLayout.setVerticalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        jPanel1.add(chartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 300, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chartPanel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
