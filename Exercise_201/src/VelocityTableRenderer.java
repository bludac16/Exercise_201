
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


public class VelocityTableRenderer implements ListCellRenderer {

    /**
     *
     * @param list
     * @param o
     * @param i
     * @param isSelected
     * @param cellHasFocus
     * @return
     */
    @Override
    public Component getListCellRendererComponent(JList list, Object o, int i, boolean isSelected, boolean cellHasFocus) {
        
      Measurement m=(Measurement)o;
      JLabel label=new JLabel();
      label.setOpaque(true);
      if(m.getMeasuredSpeed()<=10){
          label.setBackground(Color.BLUE);
      }else if(m.getMeasuredSpeed()>10&&m.getMeasuredSpeed()<=20){
          label.setBackground(Color.YELLOW);
      }
            else if(m.getMeasuredSpeed()>20&&m.getMeasuredSpeed()<=30){
          label.setBackground(Color.ORANGE);
      }else if(m.getMeasuredSpeed()>30){
          label.setBackground(Color.RED);
      
      
      label.setForeground(Color.white);
      
      switch(i){
          case 0: label.setText(m.getDate().toString());break;
          case 1: label.setText(m.getTime().toString());break;
          case 2: label.setText(m.getPlate());break;
          case 3: label.setText(String.format("%d", m.getMeasuredSpeed()));break;
          case 4: label.setText(String.format("%d", m.getMaxSpeed()));
          case 4: label.setText(String.format("%d",m.getLawMisdemeanour()));
      }
      
      return label;
    }


