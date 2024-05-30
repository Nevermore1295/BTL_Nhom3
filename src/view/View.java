package view;


import java.util.List;
import javax.swing.table.DefaultTableModel;
public interface View {
    <T> void showData(List<T> list, DefaultTableModel model);

}
