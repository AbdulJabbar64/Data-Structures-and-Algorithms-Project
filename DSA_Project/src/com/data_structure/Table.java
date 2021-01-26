
package com.data_structure;

import com.data_model.ChallanBean;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Table extends javax.swing.JFrame {

    ArrayList<ChallanBean> array=Working.getAllEntey();
    int size=array.size();
    public Table() {
        initComponents();
        this.getAllRows();
    }
    private void getAllRows() {
        try{
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            Object[] row=new Object[17];
            for(int i=0;i<size;i++){
                row[0]=array.get(i).getChanllanNo();
                row[1]=array.get(i).getName();
                row[2]=array.get(i).getFname();
                row[3]=array.get(i).getId();
                row[4]=array.get(i).getCnic();
                row[5]=array.get(i).getEmail();
                row[6]=array.get(i).getPhone();
                row[7]=array.get(i).getCategory();
                row[8]=array.get(i).getDept();
                row[9]=array.get(i).getBatch();
                row[10]=array.get(i).getDate();
                row[11]=array.get(i).getFees();
                row[12]=array.get(i).getBankName();
                row[13]=array.get(i).getBankAccount();
                row[14]=array.get(i).getDepositerName();
                row[15]=array.get(i).getDepositerCNIC();
                row[16]=array.get(i).getStudentSign();
                model.addRow(row);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "challan No", "Name", "father Name", "Student ID", "CNIC", "Email", "Phone No", "Category", "Dept", "Batch", "Date", "fees", "Bank Name", "Bank Acc", "Depositer Name", "Depositer CNIC", "Student Sign"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    */
    /* Create and display the form 
    Table t= new Table();
    t.setVisible(true);
    
}*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}