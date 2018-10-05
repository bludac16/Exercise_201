
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.table.TableCellRenderer;

public class VelocityTableRenderer implements TableCellRenderer {



    @Override
    public Component getTableCellRendererComponent(JTable table, Object o, boolean isSelected, boolean hasFocus, int row, int i) {
              Measurement m = (Measurement) o;
        JLabel label = new JLabel();
        label.setOpaque(true);
        if(i==5){
        if (m.getLawMisdemeanour() <= 10) {
            label.setBackground(Color.BLUE);
        } else if (m.getLawMisdemeanour() > 10 && m.getLawMisdemeanour() <= 20) {
            label.setBackground(Color.YELLOW);
        } else if (m.getLawMisdemeanour() > 20 && m.getLawMisdemeanour() <= 30) {
            label.setBackground(Color.ORANGE);
        } else if (m.getLawMisdemeanour() > 30) {
            label.setBackground(Color.RED);}
        

        }

            switch (i) {
                case 0:
                    label.setText(m.getDate().toString());
                    break;
                case 1:
                    label.setText(m.getTime().toString());
                    break;
                case 2:
                    label.setText(m.getPlate());
                    break;
                case 3:
                    label.setText(String.format("%d", m.getMeasuredSpeed()));
                    break;
                case 4:
                    label.setText(String.format("%d", m.getMaxSpeed()));
                    break;
                case 5:
                    label.setText(String.format("%d", m.getLawMisdemeanour()));
                    break;
            }

           
         
        return label;  
    }
}
