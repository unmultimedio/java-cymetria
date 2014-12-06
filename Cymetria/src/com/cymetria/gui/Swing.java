/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cymetria.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julian
 */
public class Swing {
    
    public static void main(String args[]){
        /**
         * Swing
         */
    	createAndShowGUI();
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                createAndShowGUI();
//            }
//        });
    }
    

    private static void createAndShowGUI() {
        //JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Prueba de un frame");
        ventana.setVisible(true);
        ventana.setSize(400, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Selected:"+e.getActionCommand());
			}
		};
        
        JMenuBar myMenuBar = new JMenuBar();
        
        JMenu myMenu = new JMenu("Menu Principal");
        myMenu.addActionListener(listener);
        JMenuItem item1 = new JMenuItem("Item 1");
        item1.addActionListener(listener);
        JMenuItem item2 = new JMenuItem("Item 2");
        item2.addActionListener(listener);
        JMenuItem item3 = new JMenuItem("Item 3");
        item3.addActionListener(listener);
        JMenuItem item4 = new JMenuItem("Item 4");
        item4.addActionListener(listener);
        
        myMenu.add(item1);
        myMenu.add(item2);
        myMenu.add(item3);
        myMenu.add(item4);
        
        JMenu myMenu2 = new JMenu("Segundo Menú", true);
        myMenu2.addActionListener(listener);
        JMenuItem item5 = new JCheckBoxMenuItem("Un checbox encendido",true);
        item5.addActionListener(listener);
        JMenuItem item6 = new JCheckBoxMenuItem("Un checbox apagado",false);
        item6.addActionListener(listener);
        
        myMenu2.add(item5);
        myMenu2.add(item6);
        
        JMenu myMenu3 = new JMenu("Primer Submenú");
        myMenu3.addActionListener(listener);
        JMenuItem item7 = new JMenuItem("Item 7");
        item7.addActionListener(listener);
        JMenuItem item8 = new JMenuItem("Item 8");
        item8.addActionListener(listener);
        
        myMenu3.add(item7);
        myMenu3.add(item8);
        
        myMenu2.add(myMenu3);
        
        myMenuBar.add(myMenu);
        myMenuBar.add(myMenu2);
        
        ventana.setJMenuBar(myMenuBar);
        
        ventana.setLayout(new GridLayout(2, 3, 10, 10));
        final JLabel miLabel = new JLabel("Un label");
        
        ventana.add(miLabel);
        
        final JList<String> miLista = new JList<>(new String[]{"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"});
        
        JScrollPane scroll = new JScrollPane(miLista);
        ventana.add(scroll);
        
        miLista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                cambiarDesdeLista(miLista, miLabel);
            }
        });
        
        final JButton btn = new JButton("mi botón");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarDesdeBoton(btn, miLabel);
            }
        });
        
        btn.setSize(10, 10);
        ventana.add(btn);
        
        final JComboBox<String> combo = new JComboBox<String>(new String[]{"uno", "dos", "tres"});
        combo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarDesdeCombo(combo, miLabel);
            }
        });
        
        ventana.add(combo);
        
        final JSlider slider = new JSlider(JSlider.HORIZONTAL, -20, 30, 5);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider s = (JSlider)(e.getSource());
                miLabel.setText(String.valueOf(s.getValue()));
            }
        });
        
        ventana.add(slider);


        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("col1");
        modelo.addColumn("col2");
        modelo.addColumn("col3");
        modelo.addColumn("col4");
        modelo.addRow(new String[]{"A1", "B1", "C1", "D1"});
        modelo.addRow(new String[]{"A2", "B2", "C2", "D2"});
        modelo.addRow(new String[]{"A3", "B3", "C3", "D3"});
        modelo.addRow(new String[]{"A4", "B4", "C4", "D4"});
        modelo.addRow(new String[]{"A4", "B4", "C4", "D4"});
        modelo.addRow(new String[]{"A4", "B4", "C4", "D4"});
        modelo.addRow(new String[]{"A4", "B4", "C4", "D4"});
        modelo.addRow(new String[]{"A4", "B4", "C4", "D4"});
        modelo.addRow(new String[]{"A4", "B4", "C4", "D4"});
        modelo.addRow(new String[]{"A4", "B4", "C4", "D4"});
        JTable tabla = new JTable(modelo);

        JScrollPane scrollpane = new JScrollPane(tabla);

        ventana.add(scrollpane);


        modelo.setValueAt("Nuevo", 1, 2);
    }

    public static void cambiarDesdeLista(JList<String> miLista, JLabel miLabel) {
        String s = "";
        //*/
        int min = miLista.getMinSelectionIndex();
        int max = miLista.getMaxSelectionIndex();
        for (int i = min; i <= max; i++) {
            if (miLista.isSelectedIndex(i)) {
                s += "(" + i + ")";
            }
        }
        /*/
        int[] indices = miLista.getSelectedIndices();
        for(int i = 0; i<indices.length; i++){
            s += "("+i+")";
        }
        //*/
        miLabel.setText(s);

    }
    
    public static void cambiarDesdeBoton(JButton miBoton, JLabel miLabel){
        miLabel.setText(miBoton.getText());
    }
    
    public static void cambiarDesdeCombo(JComboBox<String> miCombo, JLabel miLabel){
        miLabel.setText(miCombo.getItemAt(miCombo.getSelectedIndex()).toString());
    }
}
