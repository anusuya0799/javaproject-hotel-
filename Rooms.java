package hotel;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Rooms extends javax.swing.JFrame {
  
    public Rooms() {
        initComponents();
        ShowRooms();
    }
    Connection Con=null;
    PreparedStatement Pst=null;
    ResultSet Rs=null;
    Statement St=null;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RNameTb1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        CategoryCb = new javax.swing.JComboBox<>();
        StatusCb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        RoomsList = new javax.swing.JTable();
        AbbBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CategoryFilter = new javax.swing.JComboBox<>();
        StatusFilter = new javax.swing.JComboBox<>();
        RefreshBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rooms");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Booking");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Yu Gothic Light", 2, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dashboard");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setFont(new java.awt.Font("Yu Gothic Light", 2, 24)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Manage Rooms");

        RNameTb1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        RNameTb1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Status");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Categories");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Price");

        PriceTb.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(51, 51, 51));

        CategoryCb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        CategoryCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Double Bed", "Sigle Bed", "family" }));

        StatusCb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        StatusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free", "Booked" }));

        RoomsList.setBackground(new java.awt.Color(0, 102, 102));
        RoomsList.setFont(new java.awt.Font("Yu Gothic Light", 0, 12)); // NOI18N
        RoomsList.setForeground(new java.awt.Color(255, 255, 255));
        RoomsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Number", "Name", "Type", "Status", "Price"
            }
        ));
        RoomsList.setGridColor(new java.awt.Color(0, 51, 51));
        RoomsList.setRowHeight(29);
        RoomsList.setRowMargin(1);
        RoomsList.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                RoomsListComponentAdded(evt);
            }
        });
        RoomsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RoomsList);

        AbbBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        AbbBtn.setText("Add");
        AbbBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbbBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Name");

        CategoryFilter.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        CategoryFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Double Bed", "Sigle Bed", "family" }));
        CategoryFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CategoryFilterItemStateChanged(evt);
            }
        });
        CategoryFilter.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                CategoryFilterCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        CategoryFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryFilterActionPerformed(evt);
            }
        });

        StatusFilter.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        StatusFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free", "Booked" }));
        StatusFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StatusFilterItemStateChanged(evt);
            }
        });
        StatusFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusFilterActionPerformed(evt);
            }
        });

        RefreshBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Refresh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(RNameTb1)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(PriceTb)
                                        .addComponent(CategoryCb, 0, 240, Short.MAX_VALUE)
                                        .addComponent(StatusCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AbbBtn)
                                        .addGap(36, 36, 36)
                                        .addComponent(EditBtn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(DeleteBtn)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(300, 300, 300))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(CategoryFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(StatusFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoryFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RNameTb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CategoryCb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AbbBtn)
                            .addComponent(EditBtn))
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
      new Login().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked
    private void ShowRooms()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from RoomTb1");
            RoomsList.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
     private void FilterByCat()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from RoomTb1 where RType = '"+CategoryFilter.getSelectedItem().toString()+"'");
            RoomsList.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e)
        {
        }
    }
      private void FilterByStatus()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from RoomTb1 where RStatus ='"+StatusFilter.getSelectedItem().toString()+"'");
            RoomsList.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    int Rid;
    private void CountRooms()
    {
        try
        {
            St=Con.createStatement();
            Rs=St.executeQuery("select Max(RNum) from RoomTb1");
            Rs.next();
            Rid=Rs.getInt(1)+1;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    int Key=0;
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
       if(Key==0)
      {
          JOptionPane.showMessageDialog(this,"Select a Room!!!");
      }
      else{
          try
          {   
          CountRooms();
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
          PreparedStatement Save =Con.prepareStatement("delete from RoomTb1 where RNum = ?");
          Save.setInt(1, Key);
          int row=Save.executeUpdate();
          JOptionPane.showMessageDialog(this, "Room Deleted");
          ShowRooms();
          Con.close();
               
          }
              catch (Exception ex) 
              {
              JOptionPane.showMessageDialog(this, ex);    
              }
      }
      
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AbbBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbbBtnActionPerformed
    
      if(RNameTb1.getText().isEmpty()||CategoryCb.getSelectedIndex()==-1||StatusCb.getSelectedIndex()==-1||PriceTb.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(this,"Missing Data!!!");
      }
      else{
          try
          {   
          CountRooms();
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
          PreparedStatement Save =Con.prepareStatement("insert into RoomTb1 values(?,?,?,?,?)");
          Save.setInt(1, Rid);
          Save.setString(2, RNameTb1.getText().toString());
          Save.setString(3, CategoryCb.getSelectedItem().toString());
          Save.setString(4, StatusCb.getSelectedItem().toString());
          Save.setInt(5,Integer.valueOf(PriceTb.getText().toString()));
          int row=Save.executeUpdate();
          JOptionPane.showMessageDialog(this, "Room Added");
          ShowRooms();
          Con.close();
               
          }
              catch (Exception ex) 
              {
              JOptionPane.showMessageDialog(this, ex);    
              }
      }
                     
    }//GEN-LAST:event_AbbBtnActionPerformed

    private void RoomsListComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_RoomsListComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomsListComponentAdded

    private void RoomsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomsListMouseClicked
        DefaultTableModel model=(DefaultTableModel)RoomsList.getModel();
        int MyIndex=RoomsList.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        RNameTb1.setText(model.getValueAt(MyIndex,1).toString());
        CategoryCb.setSelectedItem(model.getValueAt(MyIndex,2).toString());
        StatusCb.setSelectedItem(model.getValueAt(MyIndex,3).toString());
        PriceTb.setText(model.getValueAt(MyIndex,4).toString());
    }//GEN-LAST:event_RoomsListMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(RNameTb1.getText().isEmpty()||CategoryCb.getSelectedIndex()==-1||StatusCb.getSelectedIndex()==-1||PriceTb.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(this,"Missing Data!!!");
      }
      else{
          try
          {   
          CountRooms();
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
          PreparedStatement Save =Con.prepareStatement("update RoomTb1 set RName=?,RType=?,RStatus=?,Price=? where RNum=?");
          Save.setInt(5, Key);
          Save.setString(1, RNameTb1.getText().toString());
          Save.setString(2, CategoryCb.getSelectedItem().toString());
          Save.setString(3, StatusCb.getSelectedItem().toString());
          Save.setInt(4,Integer.valueOf(PriceTb.getText().toString()));
          int row=Save.executeUpdate();
          JOptionPane.showMessageDialog(this, "Room Updated!!!");
          ShowRooms();
          Con.close();
          }
              catch (Exception ex) 
              {
              JOptionPane.showMessageDialog(this, ex);    
              }
      }
     
    }//GEN-LAST:event_EditBtnMouseClicked

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        ShowRooms();
        CategoryFilter.setSelectedIndex(0);
        StatusFilter.setSelectedIndex(0);
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void CategoryFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryFilterActionPerformed
       
        
    }//GEN-LAST:event_CategoryFilterActionPerformed

    private void CategoryFilterCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_CategoryFilterCaretPositionChanged
         
    }//GEN-LAST:event_CategoryFilterCaretPositionChanged

    private void CategoryFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CategoryFilterItemStateChanged
         FilterByCat();
    }//GEN-LAST:event_CategoryFilterItemStateChanged

    private void StatusFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusFilterActionPerformed
        
    }//GEN-LAST:event_StatusFilterActionPerformed

    private void StatusFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StatusFilterItemStateChanged
        FilterByStatus();
    }//GEN-LAST:event_StatusFilterItemStateChanged

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Rooms().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Customers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Booking().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbbBtn;
    private javax.swing.JComboBox<String> CategoryCb;
    private javax.swing.JComboBox<String> CategoryFilter;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTextField RNameTb1;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JTable RoomsList;
    private javax.swing.JComboBox<String> StatusCb;
    private javax.swing.JComboBox<String> StatusFilter;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    // End of variables declaration//GEN-END:variables
}