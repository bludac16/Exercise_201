
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class VelocityTableModel extends AbstractTableModel{
    
    private ArrayList<Measurement> measurments=new ArrayList<>();
    private static String[]colNames=
    {"Datum","Uhrzeit","Kennzeichen","Gemessen","Erlaubt","Übertretung"};

        

    
    @Override
    public String getColumnName(int column) {
       return colNames[column];
    }

    @Override
    public int getRowCount() {
        return measurments.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Measurement m=measurments.get(rowIndex);
       return m;
    }
        public void add(Measurement m){
        measurments.add(m);
        fireTableRowsInserted(measurments.size()-1,measurments.size()-1);
    }
    
}
