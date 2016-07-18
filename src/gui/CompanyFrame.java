package gui;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;

import exceptions.CouponSystemException;
import exceptions.ErrorType;
import exceptions.FacadeException;
import facadedb.CompanyFacadeDB;
import javax.swing.JTextField;
import servicebeans.Company;
import servicebeans.Coupon;
import servicebeans.CouponType;

@SuppressWarnings({"unused", "unchecked", "rawtypes"})
public class CompanyFrame extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private CompanyFacadeDB company;
    String regex = "[0-9]+";
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable TableQuery;
    private javax.swing.JButton addCoupon;
    private javax.swing.JTextField datetxt;
    private javax.swing.JTextField datetxt1;
    private javax.swing.JTextField datetxt2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton removeCoupon;
    private javax.swing.JButton showCompanyDetails;
    private javax.swing.JButton showCoupons;
    private javax.swing.JButton showCouponsByDate;
    private javax.swing.JButton showCouponsByPrice;
    private javax.swing.JButton showCouponsByType;
    private javax.swing.JTextField typeTxt;
    private javax.swing.JButton updateCoupon;
    private javax.swing.JList<String> couponTypes;

    public CompanyFrame(CompanyFacadeDB company) {
        super("Company Account");
        this.company = company;
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompanyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompanyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompanyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompanyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableQuery = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        showCompanyDetails = new javax.swing.JButton();
        showCoupons = new javax.swing.JButton();
        showCouponsByType = new javax.swing.JButton();
        showCouponsByPrice = new javax.swing.JButton();
        priceTxt = new javax.swing.JTextField();
        showCouponsByDate = new javax.swing.JButton();
        typeTxt = new javax.swing.JTextField();
        addCoupon = new javax.swing.JButton();
        removeCoupon = new javax.swing.JButton();
        updateCoupon = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        datetxt = new javax.swing.JTextField();
        couponTypes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        datetxt1 = new javax.swing.JTextField();
        datetxt2 = new javax.swing.JTextField();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableQuery.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        TableQuery.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "Title", "Start_date", "End_date", "Amount", "Coupon Type", "Massage", "Price",
                    "Image"}) {
            /**
             *
             */
            private static final long serialVersionUID = 1L;
            Class[] types = new Class[]{java.lang.Long.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
                java.lang.Double.class, java.lang.String.class};

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableQuery);

        jLabel1.setText("***Company Account***");

        showCompanyDetails.setText("Show this company details");
        showCompanyDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCompanyDetailsActionPerformed(evt);
            }
        });

        showCoupons.setText("Show this Company Coupons ");
        showCoupons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCouponsActionPerformed(evt);
            }
        });

        showCouponsByType.setText("Show this Company Coupons by type ");
        showCouponsByType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCouponsByTypeActionPerformed(evt);
            }
        });

        showCouponsByPrice.setText("Show this Company Coupons up to price :");
        showCouponsByPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCouponsByPriceActionPerformed(evt);
            }
        });

        priceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTxtActionPerformed(evt);
            }
        });

        showCouponsByDate.setText("Show this Company Coupons up toDate:");
        showCouponsByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCouponsByDateActionPerformed(evt);
            }
        });

        addCoupon.setText("Add Coupon");
        addCoupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCouponActionPerformed(evt);
            }
        });

        removeCoupon.setText("Remove Coupon");
        removeCoupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCouponActionPerformed(evt);
            }
        });

        updateCoupon.setText("Update Coupon");
        updateCoupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCouponActionPerformed(evt);
            }
        });

        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
         datetxt.setText("Day");
        datetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetxtActionPerformed(evt);
            }
        });
                datetxt1.setText("Year");
        datetxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        datetxt2.setText("Month");
        datetxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        couponTypes.setModel(new javax.swing.AbstractListModel<String>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;
            String[] strings = {String.valueOf(CouponType.CAMPING),
                String.valueOf(CouponType.ELECTRICITY), String.valueOf(CouponType.FOOD),
                String.valueOf(CouponType.HEALTH), String.valueOf(CouponType.RESTURANTS),
                String.valueOf(CouponType.SPORTS), String.valueOf(CouponType.TRAVELING)};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane2.setViewportView(couponTypes);

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateCoupon, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(addCoupon)
                                .addGap(18, 18, 18)
                                .addComponent(removeCoupon)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(showCompanyDetails)
                        .addGap(18, 18, 18)
                        .addComponent(showCoupons, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showCouponsByDate)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(showCouponsByPrice)
                                    .addComponent(showCouponsByType))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 42, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(datetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(datetxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showCouponsByType)
                            .addComponent(showCoupons)
                            .addComponent(showCompanyDetails))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addCoupon)
                            .addComponent(removeCoupon))
                        .addGap(34, 34, 34)
                        .addComponent(updateCoupon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showCouponsByPrice)
                            .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(showCouponsByDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datetxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void showCompanyDetailsActionPerformed(java.awt.event.ActionEvent evt) {
        CompanyDetails.getCompanyDetails(company);
    }

    private void showCouponsActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            List<Coupon> couponsQuery = (List<Coupon>) company.getCouponsOfCompany();
            int i = 0;
            if (couponsQuery.get(0) != null) {

                Object service[][] = new Object[couponsQuery.size()][9];
                for (Coupon coupon : couponsQuery) {
                    service[i][0] = coupon.getId();
                    service[i][1] = coupon.getTitle();
                    service[i][2] = coupon.getStartDate();
                    service[i][3] = coupon.getEndDate();
                    service[i][4] = coupon.getAmount();
                    service[i][5] = String.valueOf(coupon.getType());
                    service[i][6] = coupon.getMassage();
                    service[i][7] = coupon.getPrice();
                    service[i][8] = coupon.getImgPath();
                    i++;
                }
                TableQuery.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                TableQuery.setModel(new javax.swing.table.DefaultTableModel(service, new String[]{"ID", "Title",
                    "Start_date", "End_date", "Amount", "Coupon Type", "Massage", "Price", "Image"}) {
                    /**
                     *
                     */
                    private static final long serialVersionUID = 1L;
                    Class[] types = new Class[]{java.lang.Long.class, java.lang.String.class, java.sql.Date.class,
                        java.lang.String.class, java.lang.Integer.class, java.lang.String.class,
                        java.lang.String.class, java.lang.Double.class, java.lang.String.class};

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }
                });
                jScrollPane1.setViewportView(TableQuery);
            }
        } catch (FacadeException e) {
            new ErrorHandle().showEventDemo(e.getMessage());
        }
    }

    private void showCouponsByTypeActionPerformed(java.awt.event.ActionEvent evt) {
        if (!couponTypes.isSelectionEmpty() && couponTypes.getSelectedValue() != null) {
            CouponType type = CouponType.valueOf(couponTypes.getSelectedValue());
            try {
                List<Coupon> couponsQuery = (List<Coupon>) company.getCouponByType(type);
                int i = 0;
                if (couponsQuery.get(0) != null) {

                    Object service[][] = new Object[couponsQuery.size()][9];
                    for (Coupon coupon : couponsQuery) {
                        service[i][0] = coupon.getId();
                        service[i][1] = coupon.getTitle();
                        service[i][2] = coupon.getStartDate();
                        service[i][3] = coupon.getEndDate();
                        service[i][4] = coupon.getAmount();
                        service[i][5] = String.valueOf(coupon.getType());
                        service[i][6] = coupon.getMassage();
                        service[i][7] = coupon.getPrice();
                        service[i][8] = coupon.getImgPath();
                        i++;
                    }
                    TableQuery.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                    TableQuery.setModel(new javax.swing.table.DefaultTableModel(service, new String[]{"ID", "Title",
                        "Start_date", "End_date", "Amount", "Coupon Type", "Massage", "Price", "Image"}) {
                        /**
                         *
                         */
                        private static final long serialVersionUID = 1L;
                        Class[] types = new Class[]{java.lang.Long.class, java.lang.String.class, java.sql.Date.class,
                            java.lang.String.class, java.lang.Integer.class, java.lang.String.class,
                            java.lang.String.class, java.lang.Double.class, java.lang.String.class};

                        public Class getColumnClass(int columnIndex) {
                            return types[columnIndex];
                        }
                    });
                    jScrollPane1.setViewportView(TableQuery);
                }
            } catch (FacadeException e) {
                new ErrorHandle().showEventDemo(e.getMessage());
            }
        }
    }

    private void showCouponsByPriceActionPerformed(java.awt.event.ActionEvent evt) {
        if (!priceTxt.getText().equals("") && priceTxt.getText().matches(regex)) {
            double price = Double.valueOf(priceTxt.getText()).doubleValue();
            try {
                List<Coupon> couponsQuery = (List<Coupon>) company.getCouponUpToPrice(price);
                int i = 0;
                if (couponsQuery.get(0) != null) {

                    Object service[][] = new Object[couponsQuery.size()][9];
                    for (Coupon coupon : couponsQuery) {
                        service[i][0] = coupon.getId();
                        service[i][1] = coupon.getTitle();
                        service[i][2] = coupon.getStartDate();
                        service[i][3] = coupon.getEndDate();
                        service[i][4] = coupon.getAmount();
                        service[i][5] = String.valueOf(coupon.getType());
                        service[i][6] = coupon.getMassage();
                        service[i][7] = coupon.getPrice();
                        service[i][8] = coupon.getImgPath();
                        i++;
                    }
                    TableQuery.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                    TableQuery.setModel(new javax.swing.table.DefaultTableModel(service, new String[]{"ID", "Title",
                        "Start_date", "End_date", "Amount", "Coupon Type", "Massage", "Price", "Image"}) {
                        /**
                         *
                         */
                        private static final long serialVersionUID = 1L;
                        Class[] types = new Class[]{java.lang.Long.class, java.lang.String.class, java.sql.Date.class,
                            java.lang.String.class, java.lang.Integer.class, java.lang.String.class,
                            java.lang.String.class, java.lang.Double.class, java.lang.String.class};

                        public Class getColumnClass(int columnIndex) {
                            return types[columnIndex];
                        }
                    });
                    jScrollPane1.setViewportView(TableQuery);
                }
            } catch (FacadeException e) {
                new ErrorHandle().showEventDemo(e.getMessage());
            }
        }
    }

    private void priceTxtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void showCouponsByDateActionPerformed(java.awt.event.ActionEvent evt) {
        if (checkDate(datetxt,datetxt1,datetxt2)) {
            Timestamp date = Timestamp.valueOf(datetxt1.getText()+"-"+datetxt2.getText()+"-"+datetxt.getText()
            +" 00:00:00");
            try {
                List<Coupon> couponsQuery = (List<Coupon>) company.getCouponByDate(date);
                int i = 0;
                if (couponsQuery.get(0) != null) {

                    Object service[][] = new Object[couponsQuery.size()][9];
                    for (Coupon coupon : couponsQuery) {
                        service[i][0] = coupon.getId();
                        service[i][1] = coupon.getTitle();
                        service[i][2] = coupon.getStartDate();
                        service[i][3] = coupon.getEndDate();
                        service[i][4] = coupon.getAmount();
                        service[i][5] = String.valueOf(coupon.getType());
                        service[i][6] = coupon.getMassage();
                        service[i][7] = coupon.getPrice();
                        service[i][8] = coupon.getImgPath();
                        i++;
                    }
                    TableQuery.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
                    TableQuery.setModel(new javax.swing.table.DefaultTableModel(service,
                            new String[]{"ID", "Title", "Start_date", "End_date", "Amount", "Coupon Type",
                                "Massage", "Price", "Image"}) {
                        /**
                         *
                         */
                        private static final long serialVersionUID = 1L;
                        Class[] types = new Class[]{java.lang.Long.class, java.lang.String.class,
                            java.sql.Date.class, java.lang.String.class, java.lang.Integer.class,
                            java.lang.String.class, java.lang.String.class, java.lang.Double.class,
                            java.lang.String.class};

                        public Class getColumnClass(int columnIndex) {
                            return types[columnIndex];
                        }
                    });
                    jScrollPane1.setViewportView(TableQuery);
                }
            } catch (FacadeException e) {
                new ErrorHandle().showEventDemo(e.getMessage());
            }
        }
        else{
        	new ErrorHandle().showEventDemo(ErrorType.DATE_VALUES_INSERTED_ARE_NOT_VALID.toString());
        }
    }

    private void addCouponActionPerformed(java.awt.event.ActionEvent evt) {
        AddCoupon.getAddCoupon(company);
    }

    private void removeCouponActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int selectedRowIndex = TableQuery.getSelectedRow();
            if (selectedRowIndex >= 0) {
                Object id = (Object) TableQuery.getModel().getValueAt(selectedRowIndex, 0);
                long theid = (Long) id;

                try {
                    company.removeCoupon(theid);
                } catch (FacadeException e) {
                    new ErrorHandle().showEventDemo(e.getMessage());
                }

            }
        } catch (NullPointerException e) {
            System.out.println("did not choose on table or ParseException" + e.getMessage());
        }
    }

    private void updateCouponActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int selectedRowIndex = TableQuery.getSelectedRow();
            if (selectedRowIndex >= 0) {
                Long id = (Long) TableQuery.getModel().getValueAt(selectedRowIndex, 0);
                String End_date = (String) TableQuery.getModel().getValueAt(selectedRowIndex, 3);
                Timestamp sqlENDDate = Timestamp.valueOf(End_date);
                double price = (Double) TableQuery.getModel().getValueAt(selectedRowIndex, 7);

                try {
                    company.updateCoupon(id, sqlENDDate, price);
                } catch (FacadeException e) {
                    new ErrorHandle().showEventDemo(e.getMessage());
                }

            }
        } catch (NullPointerException e) {
            System.out.println("did not choose on table or ParsExecption" + e.getMessage());
        }
    }

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {
        new login();
        dispose();
    }

    private void datetxtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    // End of variables declaration

    public static boolean checkDate(JTextField datetxt, JTextField datetxt1, JTextField datetxt2) {
        if(!datetxt.equals("")&&!datetxt.equals("Year")&&!datetxt1.equals("")&&!datetxt1.equals("Month")
               && !datetxt2.equals("")&&!datetxt2.equals("Day")){
            try {
   int year=Integer.parseInt(datetxt.getText());
   int month=Integer.parseInt(datetxt1.getText());
   int day=Integer.parseInt(datetxt2.getText());
//   return year>0&&year<9999&&month>0&&month<13&&day>0&&day<32;
   return true;
}
catch (NumberFormatException e) {
     return false;
}
        }
        return false;
    }
}
