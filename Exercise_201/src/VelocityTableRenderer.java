
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class VelocityTableRenderer implements ListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object o, int i, boolean isSelected, boolean cellHasFocus) {
        JLabel label = new JLabel(o.toString());
        label.setOpaque(true);
        
        
        
        
        return label;
    }

}
