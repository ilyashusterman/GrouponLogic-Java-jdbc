package gui;

import javax.swing.JFrame;

import exceptions.FacadeException;
import facadedb.CompanyFacadeDB;

public class CompanyDetails extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private CompanyFacadeDB company;
private javax.swing.JTextPane compDetail;
private javax.swing.JLabel jLabel1;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JButton ok;
private static CompanyDetails companyDetails;

public static CompanyDetails getCompanyDetails(CompanyFacadeDB company) {
	if (companyDetails == null) {
		return companyDetails = new CompanyDetails(company);
	} else {
		companyDetails.dispose();
		return companyDetails = new CompanyDetails(company);
	}

}
private CompanyDetails(CompanyFacadeDB company){
	this.company=company;
	try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(CompanyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(CompanyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(CompanyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(CompanyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
	setDefaultCloseOperation(EXIT_ON_CLOSE);
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
    compDetail = new javax.swing.JTextPane();
    ok = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    try {
		compDetail.setText("The Company details are: "+company.getTheCompany());
	} catch (FacadeException e) {
		new ErrorHandle().showEventDemo(e.getMessage());  
	}
    jScrollPane1.setViewportView(compDetail);

    ok.setText("Ok ! ");
    ok.setActionCommand("");
    ok.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            okActionPerformed(evt);
        }
    });

    jLabel1.setText("***Company Details***");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(jLabel1)))
            .addContainerGap(58, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addComponent(jLabel1)
            .addGap(42, 42, 42)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
            .addComponent(ok)
            .addGap(42, 42, 42))
    );

    pack();
}// </editor-fold>                        

private void okActionPerformed(java.awt.event.ActionEvent evt) {                                   
   dispose();
}                                  


// Variables declaration - do not modify                     

// End of variables declaration                   
}
