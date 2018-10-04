
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class VelocityTableModel extends AbstractListModel<Measurement>{
    
    private ArrayList<Measurement> measurments=new ArrayList<>();
    
        public void add(Measurement m) {
        measurments.add(m);
        fireIntervalAdded(this, measurments.size() - 1, measurments.size() - 1);
    }
        
    @Override
    public int getSize() {
        return measurments.size();
    }

    @Override
    public Measurement getElementAt(int index) {
      return measurments.get(index);
    }
    
}
