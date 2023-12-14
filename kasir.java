/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class kasir extends javax.swing.JFrame {

    /**
     * Creates new form kasir
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    public kasir() {
        initComponents();
        KodeBarang();
        Total();
        Diskon();
    }

    private void Diskon() {
        txtDskn.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent de) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change
                // body of generated methods, choose Tools | Templates.
                // dsikon
                int diskon, hasildiskon;

                diskon = Integer.parseInt(txtjumlahharga.getText().replace(".", ""))
                        * Integer.parseInt(txtDskn.getText()) / 100;

                hasildiskon = Integer.parseInt(txtjumlahharga.getText().replace(".", ""))
                        - diskon;

                txthasildiskon.setText(nf.format(diskon));
                // ppn
                int hasilppn = 0;
                if (chkppn.isSelected()) {
                    hasilppn = hasildiskon / 10;
                    txthasilppn.setText(nf.format(hasilppn));
                } else {
                    hasilppn = hasildiskon * 0 / 100;
                    txthasilppn.setText(nf.format(hasilppn));
                }

                // total bersih semuanya
                int totalBersih;
                totalBersih = hasildiskon + hasilppn;
                lbljumlahharga.setText("Rp. " + nf.format(totalBersih));
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change
                // body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change
                // body of generated methods, choose Tools | Templates.
            }
        });
    }

    private void Total() {
        txtqty.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent de) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change
                // body of generated methods, choose Tools | Templates.
                try {
                    int hasil = 0;
                    if (txtqty.getText().equals("")) {
                        hasil = Integer.parseInt(txtharga.getText().replace(".", "")) * 0;
                    } else {
                        hasil = Integer.parseInt(txtharga.getText().replace(".", "")) *
                                Integer.parseInt(txtqty.getText());
                    }
                    txttotalharga.setText(nf.format(hasil));
                } catch (Exception e) {
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change
                // body of generated methods, choose Tools | Templates.
                try {
                    int hasil = 0;
                    if (txtqty.getText().equals("")) {
                        hasil = Integer.parseInt(txtharga.getText().replace(".", "")) * 0;
                    } else {
                        hasil = Integer.parseInt(txtharga.getText().replace(".", "")) *
                                Integer.parseInt(txtqty.getText());
                    }
                    txttotalharga.setText(nf.format(hasil));
                } catch (Exception e) {
                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change
                // body of generated methods, choose Tools | Templates.
            }
        });
    }

    private void KodeBarang() {
        txtkodebarang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent de) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change
                // body of generated methods, choose Tools | Templates.
                String kodeBarang;
                kodeBarang = (String) txtkodebarang.getText();

                switch (kodeBarang) {
                    case "A001":
                        txtnamabarang.setText("Gitar Akustik");
                        txtharga.setText(nf.format(1500000));
                        txtqty.grabFocus();
                        break;
                    case "A002":
                        txtnamabarang.setText("Gitar Listrik");
                        txtharga.setText(nf.format(2500000));
                        txtqty.grabFocus();
                        break;
                    case "A003":
                        txtnamabarang.setText("Keyboard");
                        txtharga.setText(nf.format(8500000));
                        txtqty.grabFocus();
                        break;
                    case "A004":
                        txtnamabarang.setText("Piano");
                        txtharga.setText(nf.format(13500000));
                        txtqty.grabFocus();
                        break;
                    case "A005":
                        txtnamabarang.setText("Saxaphone");
                        txtharga.setText(nf.format(4000000));
                        txtqty.grabFocus();
                        break;
                    case "A006":
                        txtnamabarang.setText("Biola");
                        txtharga.setText(nf.format(3000000));
                        txtqty.grabFocus();
                        break;
                    case "A007":
                        txtnamabarang.setText("Harmonika");
                        txtharga.setText(nf.format(2500000));
                        txtqty.grabFocus();
                        break;
                    case "A008":
                        txtnamabarang.setText("Terompet");
                        txtharga.setText(nf.format(4000000));
                        txtqty.grabFocus();
                        break;
                    case "A009":
                        txtnamabarang.setText("Drumb");
                        txtharga.setText(nf.format(9000000));
                        txtqty.grabFocus();
                        break;
                    case "A010":
                        txtnamabarang.setText("Harpa");
                        txtharga.setText(nf.format(1200000));
                        txtqty.grabFocus();
                        break;
                    case "A011":
                        txtnamabarang.setText("Harmonika");
                        txtharga.setText(nf.format(2000000));
                        txtqty.grabFocus();
                        break;
                    case "A012":
                        txtnamabarang.setText("Tamborine");
                        txtharga.setText(nf.format(200000));
                        txtqty.grabFocus();
                        break;
                    case "A013":
                        txtnamabarang.setText("Ukulele");
                        txtharga.setText(nf.format(600000));
                        txtqty.grabFocus();
                        break;
                    case "A014":
                        txtnamabarang.setText("Organ");
                        txtharga.setText(nf.format(10000000));
                        txtqty.grabFocus();
                        break;
                    default:
                        txtnamabarang.setText("");
                        txtharga.setText("");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change
                // body of generated methods, choose Tools | Templates.
                String kodeBarang;
                kodeBarang = (String) txtkodebarang.getText();

                switch (kodeBarang) {
                    case "A001":
                        txtnamabarang.setText("Gitar Akustik");
                        txtharga.setText(nf.format(1500000));
                        txtqty.grabFocus();
                        break;
                    case "A002":
                        txtnamabarang.setText("Gitar Listrik");
                        txtharga.setText(nf.format(2500000));
                        txtqty.grabFocus();
                        break;
                    case "A003":
                        txtnamabarang.setText("Keyboard");
                        txtharga.setText(nf.format(8500000));
                        txtqty.grabFocus();
                        break;
                    case "A004":
                        txtnamabarang.setText("Piano");
                        txtharga.setText(nf.format(13500000));
                        txtqty.grabFocus();
                        break;
                    case "A005":
                        txtnamabarang.setText("Saxaphone");
                        txtharga.setText(nf.format(4000000));
                        txtqty.grabFocus();
                        break;
                    case "A006":
                        txtnamabarang.setText("Biola");
                        txtharga.setText(nf.format(3000000));
                        txtqty.grabFocus();
                        break;
                    case "A007":
                        txtnamabarang.setText("Harmonika");
                        txtharga.setText(nf.format(2500000));
                        txtqty.grabFocus();
                        break;
                    case "A008":
                        txtnamabarang.setText("Terompet");
                        txtharga.setText(nf.format(4000000));
                        txtqty.grabFocus();
                        break;
                    case "A009":
                        txtnamabarang.setText("Drumb");
                        txtharga.setText(nf.format(9000000));
                        txtqty.grabFocus();
                        break;
                    case "A010":
                        txtnamabarang.setText("Harpa");
                        txtharga.setText(nf.format(1200000));
                        txtqty.grabFocus();
                        break;
                    case "A011":
                        txtnamabarang.setText("Harmonika");
                        txtharga.setText(nf.format(2000000));
                        txtqty.grabFocus();
                        break;
                    case "A012":
                        txtnamabarang.setText("Tamborine");
                        txtharga.setText(nf.format(200000));
                        txtqty.grabFocus();
                        break;
                    case "A013":
                        txtnamabarang.setText("Ukulele");
                        txtharga.setText(nf.format(600000));
                        txtqty.grabFocus();
                        break;
                    case "A014":
                        txtnamabarang.setText("Organ");
                        txtharga.setText(nf.format(100000000));
                        txtqty.grabFocus();
                        break;
                    default:
                        txtnamabarang.setText("");
                        txtharga.setText("");
                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods,
                                                                               // choose Tools | Templates.
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lbljumlahharga = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtfaktur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnamabarang = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        txttotalharga = new javax.swing.JTextField();
        txtkodebarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chkppn = new javax.swing.JCheckBox();
        txtjumlahharga = new javax.swing.JTextField();
        txthasildiskon = new javax.swing.JTextField();
        txtDskn = new javax.swing.JTextField();
        txthasilppn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lbljmlqty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbljumlahharga.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        lbljumlahharga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbljumlahharga.setText("Rp.");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("No. Faktur");

        txtfaktur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfakturActionPerformed(evt);
            }
        });

        jLabel3.setText("Kode Barang");

        txtnamabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamabarangActionPerformed(evt);
            }
        });

        txtharga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });

        txttotalharga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtkodebarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodebarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtfaktur, javax.swing.GroupLayout.DEFAULT_SIZE, 126,
                                                Short.MAX_VALUE)
                                        .addComponent(txtkodebarang))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 129,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtfaktur, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtkodebarang, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        tblList.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "No", "Kode Barang", "Nama Barang", "Harga", "QTY", "Total Harga"
                }));
        jScrollPane1.setViewportView(tblList);

        jLabel4.setText("Jumlah Harga");

        jLabel5.setText("Diskon %");

        chkppn.setText("PPN 10%");
        chkppn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkppnActionPerformed(evt);
            }
        });

        jLabel7.setText("Jumlah Item");

        lbljmlqty.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbljmlqty)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(txtjumlahharga,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                171,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(txtDskn,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        40,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txthasildiskon,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        124,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addComponent(chkppn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txthasilppn,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 124,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbljumlahharga)
                                                        .addComponent(jPanel1,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbljumlahharga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txtjumlahharga,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel7)
                                                .addComponent(lbljmlqty)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txthasildiskon, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDskn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txthasilppn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkppn))
                                .addGap(42, 42, 42)));

        setSize(new java.awt.Dimension(697, 402));
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void txtfakturActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void chkppnActionPerformed(java.awt.event.ActionEvent evt) {
        jmltotalharga();
    }

    private void txtkodebarangActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtnamabarangActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {
        if (txtqty.getText().equals("")) {
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) tblList.getModel();

            Object obj[] = new Object[6];
            obj[1] = txtkodebarang.getText();
            obj[2] = txtnamabarang.getText();
            obj[3] = txtharga.getText();
            obj[4] = txtqty.getText();
            obj[5] = txttotalharga.getText();

            model.addRow(obj);

            int baris = model.getRowCount();
            for (int a = 0; a < baris; a++) {
                String no = String.valueOf(a + 1);
                model.setValueAt(no + ".", a, 0);
            }
            tblList.setRowHeight(30);

            lbljmlqty.setText(String.valueOf(baris));

            jmltotalharga();
            bersih();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasir.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JCheckBox chkppn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbljmlqty;
    private javax.swing.JLabel lbljumlahharga;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtDskn;
    private javax.swing.JTextField txtfaktur;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txthasildiskon;
    private javax.swing.JTextField txthasilppn;
    private javax.swing.JTextField txtjumlahharga;
    private javax.swing.JTextField txtkodebarang;
    private javax.swing.JTextField txtnamabarang;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txttotalharga;
    // End of variables declaration

    private void jmltotalharga() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change
        // body of generated methods, choose Tools | Templates.
        int subtotal = 0;
        for (int a = 0; a < tblList.getRowCount(); a++) {
            subtotal += Integer.parseInt((String) tblList.getValueAt(a, 5).toString().replace(".", ""));
        }
        txtjumlahharga.setText(nf.format(subtotal));

        // dsikon
        int diskon, hasildiskon;

        diskon = Integer.parseInt(txtjumlahharga.getText().replace(".", ""))
                * Integer.parseInt(txtDskn.getText().replace("", "0")) / 100;

        hasildiskon = Integer.parseInt(txtjumlahharga.getText().replace(".", ""))
                - diskon;

        // ppn
        int hasilppn = 0;
        if (chkppn.isSelected()) {
            hasilppn = hasildiskon * 10 / 100;
            txthasilppn.setText(nf.format(hasilppn));
        } else {
            hasilppn = hasildiskon * 0 / 100;
            txthasilppn.setText(nf.format(hasilppn));
        }

        // total bersih semuanya
        int totalBersih;
        totalBersih = hasildiskon + hasilppn;
        lbljumlahharga.setText("Rp. " + nf.format(totalBersih));
    }

    private void bersih() {
        // throw new Unsupport9edOperationException("Not supported yet."); //To change
        // body of generated methods, choose Tools | Templates.
        txtkodebarang.setText("");
        txtkodebarang.grabFocus();
        txtqty.setText("");
        txttotalharga.setText("");
    }
}
