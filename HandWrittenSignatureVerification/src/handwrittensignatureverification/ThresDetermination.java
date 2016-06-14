/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handwrittensignatureverification;

import database.ConnectionFunction;
import database.EnrollDatatype;
import database.ThresholdDatatype;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author NguyenVanDung
 */
public class ThresDetermination extends javax.swing.JFrame {

    String genuineSet = "F:\\IT\\0-CAC MON HOC\\0-KI DANG HOC\\Do An Tot Nghiep\\Base line slant angle\\thres_determination_genuine";
    String forgerySet = "F:\\IT\\0-CAC MON HOC\\0-KI DANG HOC\\Do An Tot Nghiep\\Base line slant angle\\thres_determination_forgery";

    /**
     * Creates new form Enrollment
     */
    public ThresDetermination() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Threshold determination");

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\NguyenVanDung\\Documents\\GitHub\\HandWrittenSignatureVerification\\HandWrittenSignatureVerification\\resource\\icon\\1_navigation_back.png")); // NOI18N
        jButton3.setToolTipText("Back to main screen");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("ID :");

        jTextField1.setToolTipText("Identity Card Number");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Genuine Set :");

        jTextField2.setToolTipText("Signature set path");

        jButton1.setText("...");
        jButton1.setToolTipText("Navigate to signature image");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Genuine Set :");

        jTextField3.setToolTipText("Signature set path");

        jButton5.setText("...");
        jButton5.setToolTipText("Navigate to signature image");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String url1;
        JFileChooser choose = new JFileChooser();
        choose.setCurrentDirectory(new File(forgerySet));
        int option = choose.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            // File file = choose.getSelectedFile();
            url1 = choose.getCurrentDirectory().getAbsolutePath();
            jTextField3.setText(url1);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.setVisible(false);
        new Verification().setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // Xac dinh nguong tu bo chu ky xac dinh nguong
        String identity = jTextField1.getText();
        String genuineSet = jTextField2.getText();
        String forgerySet = jTextField3.getText();
        //Xac dinh nguong
        thresholDermination(genuineSet, forgerySet, identity);
        // Test ứng dụng
        // Chú ý đổi lại đường link đến bộ ảnh test
        //Test(genuineSet, identity);
        //Test(forgerySet, identity);


    }//GEN-LAST:event_jButton2MouseClicked
    // Xác đinh kết quả test ứng dụng 

    private void Test(String folderName, String identity) {
        File folder = new File(folderName);
        File[] files = folder.listFiles();
        ConnectionFunction func = new ConnectionFunction();
        func.getConnection();
        ArrayList<double[]> re = func.getEnrollData(identity);

        double[] dis = new double[files.length];
        for (int i = 0; i < files.length; i++) {
            dis[i] = getAverateRate(re, files[i].toString());
        }

        ArrayList<ThresholdDatatype> threshold = func.getThresholdData(identity);
        double[] thres = new double[3];
        thres[0] = threshold.get(0).getThreshold1();
        thres[1] = threshold.get(0).getThreshold2();
        thres[2] = threshold.get(0).getThreshold3();

        System.out.println("Verification result : ");
        for (int j = 0; j < 3; j++) {
            int acceptCount = 0;
            System.out.print(" Thres" + (j + 1) + " : ");
            for (int i = 0; i < dis.length; i++) {
                if (dis[i] < thres[j]) {
                    acceptCount++;
                }
            }
            System.out.print(" Accept : " + acceptCount);
            System.out.print(" --- Reject : " + (dis.length - acceptCount));
            System.out.println("");
        }

        System.out.println("");

    }
//Xác định ngưỡng thres1, thres2, thres3

    private void thresholDermination(String genuineSet, String forgerySet, String identity) {
        double thres1 = 0;
        double thres2 = 0;
        double thres3 = 0;
        double epxilon = 0.0001;
        double[] genuine = calDistance(genuineSet, identity);
        double[] forgery = calDistance(forgerySet, identity);
        int n = genuine.length;
        int m = forgery.length;
        if (genuine[n - 1] <= forgery[0]) {
            thres1 = genuine[n - 1] + epxilon;
            thres2 = thres1;
            thres3 = thres2;
        } else {
            thres1 = genuine[n - 1] + epxilon;
            thres2 = forgery[0] - epxilon;
            //Tinh thres3
            double minGenuinCorrectRate = 100000;
            int minGenuinPos = 0;
            for (int i = 0; i < n; i++) {
                double tmpRate = 0;
                for (int j = 0; j < m; j++) {
                    tmpRate = (double) (n - i - 1 + m) / (m + n);
                    if (genuine[i] < forgery[j]) {
                        tmpRate = (n - i - 1) + j;
                        tmpRate = tmpRate / (m + n);
                        break;
                    }
                }
                if (tmpRate < minGenuinCorrectRate) {
                    minGenuinCorrectRate = tmpRate;
                    minGenuinPos = i;
                }
            }

            double minForgeryCorrectRate = 1000000;
            int minForPos = 0;
            for (int i = 0; i < m; i++) {
                double tmpRate = 0;
                for (int j = n - 1; j >= 0; j--) {
                    tmpRate = (double) (i + n) / (m + n);
                    if (forgery[i] > genuine[j]) {
                        tmpRate = i + (n - j - 1);
                        tmpRate = tmpRate / (m + n);
                    }
                }
                if (tmpRate < minForgeryCorrectRate) {
                    minForgeryCorrectRate = tmpRate;
                    minForPos = i;
                }
            }

            thres3 = minGenuinCorrectRate <= minForgeryCorrectRate ? genuine[minGenuinPos] + epxilon : (double) forgery[minForPos] - (double) epxilon;
        }
        //Luu vao trong co so du lieu
        ConnectionFunction func = new ConnectionFunction();
        func.getConnection();
        ThresholdDatatype tt = new ThresholdDatatype(1, identity, thres1, thres2, thres3);
        boolean re = func.writeThresholdData(tt);
        if (re) {
            thres1 = (int) (10000 * thres1);
            thres1 = thres1 / 10000;
            thres2 = (int) (10000 * thres2);
            thres2 = thres2 / 10000;
            thres3 = (int) (10000 * thres3);
            thres3 = thres3 / 10000;
            System.out.println("Threshold : " + thres1 + " " + thres2 + " " + thres3);
        }
    }
//Xác định khoảng cách từ các vector đặc trưng ảnh chữ ký trong bộ ảnh chữ ký đến vector đặc trưng trung bình

    private double[] calDistance(String sigSet, String identity) {
        // Tinh khoang cach tu vector chu ki xac dinh nguong den vector trung binh cua tap
        // anh dang ky
        ConnectionFunction func = new ConnectionFunction();
        func.getConnection();
        ArrayList<double[]> re = func.getEnrollData(identity);
        File folder = new File(sigSet);
        File[] files = folder.listFiles();
        double[] distance = new double[files.length];
        for (int i = 0; i < files.length; i++) {
            distance[i] = getAverateRate(re, files[i].getAbsolutePath());

        }
        distance = SelectionSort(distance);

        System.out.print("Threshold determination : ");
        for (int i = 0; i < distance.length; i++) {
            int tmp = (int) (10000 * distance[i]);
            System.out.print((float) tmp / 10000 + " ");
        }
        System.out.println("");

        return distance;
    }

    // Tinh ti so hay khoang cach tu cua hai vector dac trung la vector cua anh chu ky can xac thuc
    // va vector dac trung trung binh cua bo anh chu ky
    public double getAverateRate(ArrayList<double[]> re, String link) {
        if (re != null) {
            int S = re.size();
            if (S != 0) {
                int L = re.get(0).length;
                //Tinh vector trung binh
                double[] mean = new double[L];
                for (int i = 0; i < S; i++) {
                    for (int j = 0; j < L; j++) {
                        mean[j] += re.get(i)[j];
                    }
                }
                for (int i = 0; i < L; i++) {
                    mean[i] = mean[i] / S;
                }
                //Tinh vector do lech chuan
                double[] diviation = new double[L];
                for (int i = 0; i < S; i++) {
                    for (int j = 0; j < L; j++) {
                        diviation[j] += (mean[j] - re.get(i)[j]) * (mean[j] - re.get(i)[j]);
                    }
                }
                for (int i = 0; i < L; i++) {
                    diviation[i] = Math.sqrt(diviation[i] / S);
                }

                //Tinh vector dac trung
                int[][] binImage = new Preprocessing(link).getBinaryImage();
                double[] fetureVector = new FeatureExtraction().getFeatureVector(binImage);

                //Tinh trung binh ti so khoang cach va do lech giua hai vector dac trung va trung binh
                double rate = 0;
                for (int i = 0; i < L; i++) {
                    if (diviation[i] != 0) {
                        double tmp = (fetureVector[i] - mean[i]) / diviation[i];
                        rate += tmp * tmp;
                    }
                }
                //Neu tim duoc thuat toan baseline slant angle thi doi thanh 8
                rate = rate / L;
                return rate;
            }
        }
        return -1;
    }
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        String url1;
        JFileChooser choose = new JFileChooser();
        choose.setCurrentDirectory(new File(genuineSet));
        int option = choose.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            // File file = choose.getSelectedFile();
            url1 = choose.getCurrentDirectory().getAbsolutePath();
            jTextField2.setText(url1);
        }
    }//GEN-LAST:event_jButton5MouseClicked
    private double[] SelectionSort(double[] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            double tmp = A[min];
            A[min] = A[i];
            A[i] = tmp;
        }

        return A;
    }

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
            java.util.logging.Logger.getLogger(ThresDetermination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThresDetermination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThresDetermination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThresDetermination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThresDetermination().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
