package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Booking extends javax.swing.JFrame {

    public Booking() {
        initComponents();
        GetRooms();
        GetCustomer();
        ShowBooking();
        CostTb.setEditable(false);
    }
    Connection Con=null;
    PreparedStatement Pst=null;
    ResultSet Rs=null,Rs1=null;
    Statement St=null,St1=null;
    private void GetRooms()
    {
        try
        {
            String S="Free";
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from RoomTb1 where RStatus='"+S+"'");
            while(Rs.next())
            {
                int R=Rs.getInt("RNum");
                RoomCb.addItem(""+R);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    private void UpdateRoom()
    {
          try
          {   
          String S="Booked";
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
          PreparedStatement Save =Con.prepareStatement("update RoomTb1 set RStatus=? where RNum=?");
          Save.setInt(2, Integer.valueOf(RoomCb.getSelectedItem().toString()));
          Save.setString(1, S);
          int row=Save.executeUpdate();
          JOptionPane.showMessageDialog(this, "Room Updated!!!");
          Con.close();
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(this, e);
          }
      }
     private void UpdatetoFree()
    {
          try
          {   
          String S="Free";
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
          PreparedStatement Save =Con.prepareStatement("update RoomTb1 set RStatus=? where RNum=?");
          Save.setInt(2, R);
          Save.setString(1, S);
          int row=Save.executeUpdate();
          JOptionPane.showMessageDialog(this, "Room Updated!!!");
          Con.close();
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(this, e);
          }
      }
    int RC;
    private void GetCost()
    {
        try
        {
            St1=Con.createStatement();
            Rs1=St1.executeQuery("Select Price from RoomTb1 where RNum="+RoomCb.getSelectedItem().toString());
            Rs1.next();
            RC=Rs1.getInt(1);
            CostTb.setText(""+RC);
        }
        catch(Exception e){
        }
    }
    private void GetCustomer()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from Customer");
            while(Rs.next())
            {
                int C=Rs.getInt("CustNum");
                CustomerCb.addItem(""+C);
            }
        }
        catch(Exception e){
        }
    }
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DurationTb = new javax.swing.JTextField();
        CustomerCb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookingList = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        RoomCb = new javax.swing.JComboBox<>();
        CostTb = new javax.swing.JTextField();
        BDate = new com.toedter.calendar.JDateChooser();
        FetchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGap(171, 171, 171)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
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
        jLabel2.setText("Room's Booking");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Booking Date");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Customer");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Duration In Days");

        DurationTb.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        DurationTb.setForeground(new java.awt.Color(51, 51, 51));

        CustomerCb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N

        BookingList.setBackground(new java.awt.Color(0, 102, 102));
        BookingList.setFont(new java.awt.Font("Yu Gothic Light", 0, 12)); // NOI18N
        BookingList.setForeground(new java.awt.Color(255, 255, 255));
        BookingList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone", "Gender", "Adress", "Date Of Birth"
            }
        ));
        BookingList.setGridColor(new java.awt.Color(0, 51, 51));
        BookingList.setRowHeight(24);
        BookingList.setRowMargin(1);
        BookingList.setShowHorizontalLines(true);
        BookingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookingListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BookingList);

        AddBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        AddBtn.setText("Book");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        CancelBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Hotel Management System");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Room");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Cost");

        RoomCb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        RoomCb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RoomCbItemStateChanged(evt);
            }
        });

        CostTb.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        CostTb.setForeground(new java.awt.Color(51, 51, 51));

        FetchBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        FetchBtn.setText("Fetch");
        FetchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FetchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AddBtn)
                                        .addGap(50, 50, 50)
                                        .addComponent(CancelBtn)
                                        .addGap(65, 65, 65))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(CustomerCb, 0, 240, Short.MAX_VALUE)
                                            .addComponent(DurationTb, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(FetchBtn))
                                            .addComponent(RoomCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CostTb)
                                            .addComponent(BDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(12, 12, 12)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(347, 347, 347)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(393, 393, 393)
                                        .addComponent(jLabel2)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomCb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CustomerCb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(DurationTb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(FetchBtn))
                        .addGap(18, 18, 18)
                        .addComponent(CostTb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CancelBtn)
                            .addComponent(AddBtn))
                        .addGap(62, 62, 62))))
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

    private void RoomCbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RoomCbItemStateChanged
        GetCost();
    }//GEN-LAST:event_RoomCbItemStateChanged
    private void ShowBooking()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from BookingTb1 ");
            BookingList.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    int Bid;
    private void CountBookings()
    {
        try
        {
            St=Con.createStatement();
            Rs=St.executeQuery("select Max(BNum) from BookingTb1");
            Rs.next();
            Bid=Rs.getInt(1)+1;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
    if(RoomCb.getSelectedIndex()== -1||CustomerCb.getSelectedIndex()==-1||DurationTb.getText().isEmpty()||CostTb.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(this,"Missing Data!!!");
      }
      else{
          try
          {   
          String Bdate=BDate.getDate().toString().substring(1,14);
          CountBookings();
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
          PreparedStatement Save =Con.prepareStatement("insert into BookingTb1 values(?,?,?,?,?,?)");
          Save.setInt(1, Bid);
          Save.setInt(2,Integer.valueOf(RoomCb.getSelectedItem().toString()));
          Save.setInt(3, Integer.valueOf(CustomerCb.getSelectedItem().toString()));
          Save.setString(4, Bdate);
          Save.setInt(5, Integer.valueOf(DurationTb.getText()));
          Save.setInt(6,Integer.valueOf(CostTb.getText()));
          int row=Save.executeUpdate();
          JOptionPane.showMessageDialog(this, "Room Booked!!!");
          ShowBooking();
          UpdateRoom();
          RoomCb.removeAllItems();
          GetRooms();
          Con.close();
          }
              catch (SQLException ex) 
              {
              JOptionPane.showMessageDialog(this, ex);    
              }
      }
              // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void FetchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FetchBtnActionPerformed
           int TotAmt=RC * Integer.valueOf(DurationTb.getText().toString());
           CostTb.setText(""+TotAmt);
    }//GEN-LAST:event_FetchBtnActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Rooms().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    int Key=0;
    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        if(Key==0)
      {
          JOptionPane.showMessageDialog(this,"Select a Booking!!!");
      }
      else{
          try
          {   
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","");
          PreparedStatement Save =Con.prepareStatement("delete from BookingTb1 where BNum = ?");
          Save.setInt(1, Key);
          int row=Save.executeUpdate();
          JOptionPane.showMessageDialog(this, "Booking Deleted!!!");
          Con.close();
          ShowBooking();
          UpdatetoFree();
          RoomCb.removeAllItems();
          GetRooms();
          }
          catch (Exception ex) 
          {
          JOptionPane.showMessageDialog(this, ex);    
          }
      }
    }//GEN-LAST:event_CancelBtnActionPerformed
    int R;    
    private void BookingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingListMouseClicked
       DefaultTableModel model=(DefaultTableModel)BookingList.getModel();
        int MyIndex=BookingList.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        R=Integer.valueOf(model.getValueAt(MyIndex,1).toString());
        RoomCb.setSelectedItem(model.getValueAt(MyIndex,1).toString());
        CustomerCb.setSelectedItem(model.getValueAt(MyIndex,2).toString());
        DurationTb.setText(model.getValueAt(MyIndex,4).toString());
        CostTb.setText(model.getValueAt(MyIndex,5).toString());
    }//GEN-LAST:event_BookingListMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Booking().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Customers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private com.toedter.calendar.JDateChooser BDate;
    private javax.swing.JTable BookingList;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextField CostTb;
    private javax.swing.JComboBox<String> CustomerCb;
    private javax.swing.JTextField DurationTb;
    private javax.swing.JButton FetchBtn;
    private javax.swing.JComboBox<String> RoomCb;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
