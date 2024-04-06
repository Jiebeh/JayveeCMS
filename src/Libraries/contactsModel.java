package Libraries;
import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Jiebeh
 */
public class contactsModel extends AbstractTableModel {
    
    private String[] columns;
    private Object[][] rows;
    
    public contactsModel() {}
    
    public contactsModel(String[] columns, Object[][] rows) {
        this.columns = columns;
        this.rows = rows;
    }
    
    @Override
    public Class getColumnClass(int index) {
        if (index == 8) {
            return Icon.class;
        }
        
        return getValueAt(0, index).getClass();
    }
    
    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int index) {
        return columns[index];
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) { 
        this.rows[rowIndex][columnIndex] = value;
    }
    
}
