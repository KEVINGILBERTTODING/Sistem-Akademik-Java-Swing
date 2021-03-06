/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS02832;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author XXIVKVNGLRT
 */
public class FrmMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form FrmDosen
     */
    public FrmMahasiswa() {
        initComponents();
        
        //menanambahkan title icon
         ImageIcon icon = new ImageIcon("assets/btn_student.png");
setIconImage(icon.getImage());
        
     
    }
    
    //filtehuruf
    void filterhuruf(KeyEvent a){
        char karakter = a.getKeyChar();
        if(!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_ENTER) || (karakter == KeyEvent.VK_DELETE)))){
            getToolkit().beep();
            a.consume();
            JOptionPane.showMessageDialog(null, "Inputan hanya Angka saja", "Peringatan",1);
        }
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtNim = new javax.swing.JTextField();
        TxtNama = new javax.swing.JTextField();
        CmbProgramStudi = new javax.swing.JComboBox<>();
        TxtTelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAlamat = new javax.swing.JTextArea();
        BtnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        RadioLaki = new javax.swing.JRadioButton();
        RadioPerempuan = new javax.swing.JRadioButton();
        BtnHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblMhs = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        BtnAdd = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Mahasiswa");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\Mata Kuliah\\Semester 3\\Pemprograman Object Oriented 1\\Tugas\\Uas\\UAS02832\\assets\\student1.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BIODATA MAHASISWA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(402, 402, 402))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Biodata Mahasiswa"));

        jLabel3.setText("NIM");

        jLabel4.setText("Nama Lengkap");

        jLabel7.setText("No. Telp");

        jLabel8.setText("Alamat");

        jLabel9.setText("Jurusan");

        TxtNim.setEnabled(false);
        TxtNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNimActionPerformed(evt);
            }
        });
        TxtNim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNimKeyTyped(evt);
            }
        });

        TxtNama.setEnabled(false);
        TxtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaActionPerformed(evt);
            }
        });

        CmbProgramStudi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Program Studi--", "Teknik Informatika", "Sistem Informasi", "DKV", "Arstitek", "Hukum", "Teknik Sipil", "Sastra Indonesia", "Sastra Inggris" }));
        CmbProgramStudi.setEnabled(false);
        CmbProgramStudi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CmbProgramStudiMouseClicked(evt);
            }
        });
        CmbProgramStudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbProgramStudiActionPerformed(evt);
            }
        });

        TxtTelp.setEnabled(false);
        TxtTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelpActionPerformed(evt);
            }
        });
        TxtTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTelpKeyTyped(evt);
            }
        });

        TxtAlamat.setColumns(20);
        TxtAlamat.setRows(5);
        TxtAlamat.setEnabled(false);
        TxtAlamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtAlamatKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(TxtAlamat);

        BtnSave.setText("Save");
        BtnSave.setEnabled(false);
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        jLabel5.setText("Jenis Kelamin");

        btngroup.add(RadioLaki);
        RadioLaki.setText("Laki-laki");
        RadioLaki.setEnabled(false);
        RadioLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioLakiActionPerformed(evt);
            }
        });

        btngroup.add(RadioPerempuan);
        RadioPerempuan.setText("Perempuan");
        RadioPerempuan.setEnabled(false);
        RadioPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioPerempuanActionPerformed(evt);
            }
        });

        BtnHapus.setText("Delete");
        BtnHapus.setEnabled(false);
        BtnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnHapusMouseClicked(evt);
            }
        });
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        TblMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama Lengkap", "Jenis Kelamin", "Jurusan", "No. Telp", "Alamat"
            }
        ));
        jScrollPane3.setViewportView(TblMhs);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(RadioLaki)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RadioPerempuan))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(CmbProgramStudi, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnSave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnHapus, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(RadioPerempuan))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(RadioLaki)
                        .addGap(3, 3, 3)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbProgramStudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSave)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnHapus)
                .addGap(343, 343, 343))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnReset.setText("Reset");
        BtnReset.setEnabled(false);
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        BtnCancel.setText("Cancel");
        BtnCancel.setEnabled(false);
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnAdd)
                .addGap(18, 18, 18)
                .addComponent(BtnReset)
                .addGap(18, 18, 18)
                .addComponent(BtnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnExit)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdd)
                    .addComponent(BtnReset)
                    .addComponent(BtnCancel)
                    .addComponent(BtnExit))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        TxtNim.setEnabled(true);
        TxtNim.requestFocus();
        BtnAdd.setEnabled(false);
        BtnCancel.setEnabled(true);
        
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        // TODO add your handling code here:
         String ObjButtons[] = {"Yes","No"};
        int pilihan = JOptionPane.showOptionDialog(null,"Apakah Anda Yakin Ingin keluar ?","Message",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,ObjButtons,ObjButtons[1]);
        if(pilihan == 0){
        this.dispose();
        }
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        // TODO add your handling code here:
        
        //membersihkan inputan
        
        TxtNama.setText("");
        TxtNim.setText("");
        btngroup.clearSelection();
        CmbProgramStudi.setSelectedIndex(0);
        TxtTelp.setText("");
        TxtAlamat.setText("");
        
        
        //menonaktifkan inputan txt
        
        TxtNim.setEnabled(true);
        TxtNama.setEnabled(false);
        RadioLaki.setEnabled(false);
        RadioPerempuan.setEnabled(false);
        CmbProgramStudi.setEnabled(false);
        TxtTelp.setEnabled(false);
        BtnSave.setEnabled(false);
        BtnReset.setEnabled(false);
        BtnHapus.setEnabled(false);
        TxtAlamat.setEnabled(false);
        
         DefaultTableModel dataModel = (DefaultTableModel) TblMhs.getModel();    
            if (TblMhs.getRowCount() > 0) {
                for (int i = TblMhs.getRowCount() - 1; i >= 0; i--) {
                    dataModel.removeRow(i);
                }
            }
            
        TxtNim.requestFocus();
                
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        // TODO add your handling code here:
           //membersihkan inputan
        
        TxtNama.setText("");
        TxtNim.setText("");
        btngroup.clearSelection();
        CmbProgramStudi.setSelectedIndex(0);
        TxtTelp.setText("");
        TxtAlamat.setText("");
        
        
        // mematikan inputa
        
        TxtNim.setEnabled(false);
        TxtNama.setEnabled(false);
        RadioLaki.setEnabled(false);
        RadioPerempuan.setEnabled(false);
        CmbProgramStudi.setEnabled(false);
        TxtTelp.setEnabled(false);
        TxtAlamat.setEnabled(false);
        BtnReset.setEnabled(false);
        BtnSave.setEnabled(false);
        BtnHapus.setEnabled(false);
        BtnCancel.setEnabled(false);
        BtnAdd.setEnabled(true);
        
         DefaultTableModel dataModel = (DefaultTableModel) TblMhs.getModel();    
            if (TblMhs.getRowCount() > 0) {
                for (int i = TblMhs.getRowCount() - 1; i >= 0; i--) {
                    dataModel.removeRow(i);
                }
            }
            
         BtnAdd.requestFocus();
            
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        int brs =0 , jmlbaris=0;

        DefaultTableModel dataModel = (DefaultTableModel) TblMhs.getModel();
        brs = TblMhs.getSelectedRow();

        if (brs>=0) {
            int opsi = JOptionPane.showConfirmDialog(null, "Yakin dihapus?", "Peringatan", JOptionPane.YES_NO_OPTION);
            if (opsi == JOptionPane.YES_NO_OPTION) {
                //menghapus satu baris dalam tabel

                dataModel.removeRow(brs);
                jmlbaris = dataModel.getRowCount();

            }
        }
       
        BtnReset.setEnabled(false);
        TxtNim.requestFocus();

    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHapusMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnHapusMouseClicked

    private void RadioPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioPerempuanActionPerformed
        // TODO add your handling code here:
        CmbProgramStudi.setEnabled(true);
        CmbProgramStudi.requestFocus();

    }//GEN-LAST:event_RadioPerempuanActionPerformed

    private void RadioLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioLakiActionPerformed
        // TODO add your handling code here:
        CmbProgramStudi.setEnabled(true);
        CmbProgramStudi.requestFocus();

    }//GEN-LAST:event_RadioLakiActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:

        DefaultTableModel datamodel = (DefaultTableModel) TblMhs.getModel();
        List list = new ArrayList<>();
        TblMhs.setAutoCreateColumnsFromModel(true);
        list.add( TxtNim.getText());
        list.add(TxtNama.getText());
        if (RadioLaki.isSelected()) {
            list.add(RadioLaki.getText());
        } else {
            list.add(RadioPerempuan.getText());
        }

        list.add( CmbProgramStudi.getSelectedItem());
        list.add( TxtTelp.getText());
        list.add( TxtAlamat.getText());
        datamodel.addRow(list.toArray());

        //Membersihkan data
        TxtNim.setText("");
        TxtNama.setText("");
        btngroup.clearSelection();
        CmbProgramStudi.setSelectedIndex(0);
        TxtTelp.setText("");
        BtnSave.setEnabled(false);
        TxtAlamat.setText("");

        //Menonaktifkan inputan
        TxtNim.setEnabled(true);
        TxtNama.setEnabled(false);
        RadioLaki.setEnabled(false);
        RadioPerempuan.setEnabled(false);
        CmbProgramStudi.setEnabled(false);
        TxtTelp.setEnabled(false);
        TxtAlamat.setEnabled(false);
        BtnHapus.setEnabled(true);

        TxtNim.requestFocus();

    }//GEN-LAST:event_BtnSaveActionPerformed

    private void TxtAlamatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAlamatKeyTyped
        // TODO add your handling code here:
        BtnSave.setEnabled(true);

    }//GEN-LAST:event_TxtAlamatKeyTyped

    private void TxtTelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelpKeyTyped
        // TODO add your handling code here:
        filterhuruf(evt);
    }//GEN-LAST:event_TxtTelpKeyTyped

    private void TxtTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelpActionPerformed
        // TODO add your handling code here:
        TxtAlamat.setEnabled(true);
        TxtAlamat.requestFocus();

    }//GEN-LAST:event_TxtTelpActionPerformed

    private void CmbProgramStudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbProgramStudiActionPerformed
        // TODO add your handling code here:
        TxtTelp.setEnabled(true);
        TxtTelp.requestFocus();

    }//GEN-LAST:event_CmbProgramStudiActionPerformed

    private void CmbProgramStudiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CmbProgramStudiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbProgramStudiMouseClicked

    private void TxtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaActionPerformed
        // TODO add your handling code here:

        RadioLaki.setEnabled(true);
        RadioPerempuan.setEnabled(true);

    }//GEN-LAST:event_TxtNamaActionPerformed

    private void TxtNimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNimKeyTyped
        // TODO add your handling code here:
        BtnReset.setEnabled(true);
        BtnCancel.setEnabled(true);
    }//GEN-LAST:event_TxtNimKeyTyped

    private void TxtNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNimActionPerformed
        // TODO add your handling code here:
        TxtNama.setEnabled(true);
        TxtNama.requestFocus();
    }//GEN-LAST:event_TxtNimActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnSave;
    private javax.swing.JComboBox<String> CmbProgramStudi;
    private javax.swing.JRadioButton RadioLaki;
    private javax.swing.JRadioButton RadioPerempuan;
    private javax.swing.JTable TblMhs;
    private javax.swing.JTextArea TxtAlamat;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtNim;
    private javax.swing.JTextField TxtTelp;
    private javax.swing.ButtonGroup btngroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
