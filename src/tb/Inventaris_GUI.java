package tb;

import javax.swing.JOptionPane;

public class Inventaris_GUI extends javax.swing.JFrame {
public Inventaris_GUI() {
        initComponents();
        JumlahKondisiSarana.setVisible(false);
        Lingkungan.setVisible(false);
        Kebersihan.setVisible(false);
        Kenyamanan.setVisible(false);
        Keamanan.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kebersihan = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        Udara = new javax.swing.JComboBox();
        jLabel45 = new javax.swing.JLabel();
        Pencahayaan = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        Suhu = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        Kelembapan = new javax.swing.JTextField();
        Next3 = new javax.swing.JButton();
        Lingkungan = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Lantai = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        Dinding = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        Atap = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        Pintu = new javax.swing.JComboBox();
        jLabel42 = new javax.swing.JLabel();
        Jendela = new javax.swing.JComboBox();
        Next2 = new javax.swing.JButton();
        JumlahKondisiSarana = new javax.swing.JPanel();
        JKS = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JumlahStopKontak = new javax.swing.JComboBox();
        PosisiStopKontak = new javax.swing.JComboBox();
        KondisiStopKontak = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        JumlahLCD = new javax.swing.JComboBox();
        KondisiLCD = new javax.swing.JComboBox();
        PosisiLCD = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        JumlahLampu = new javax.swing.JComboBox();
        KondisiLampu = new javax.swing.JComboBox();
        PosisiLampu = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        JumlahKipasAngin = new javax.swing.JComboBox();
        KondisiKipasAngin = new javax.swing.JComboBox();
        PosisiKipasAngin = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        JumlahAC = new javax.swing.JComboBox();
        KondisiAC = new javax.swing.JComboBox();
        PosisiAC = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        JumlahCCTV = new javax.swing.JComboBox();
        KondisiCCTV = new javax.swing.JComboBox();
        PosisiCCTV = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        SSID = new javax.swing.JComboBox();
        Bandwidth = new javax.swing.JComboBox();
        Next1 = new javax.swing.JButton();
        Identitas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NamaRuang = new javax.swing.JTextField();
        Next = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Panjang = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Lebar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JumlahPintu = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JumlahKursi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JumlahJendela = new javax.swing.JTextField();
        GKB = new javax.swing.JComboBox();
        Jurusan = new javax.swing.JComboBox();
        Kenyamanan = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        Keausan = new javax.swing.JComboBox();
        Kebisingan = new javax.swing.JComboBox();
        Bau = new javax.swing.JComboBox();
        Kebocoran = new javax.swing.JComboBox();
        Kerusakan = new javax.swing.JComboBox();
        Next4 = new javax.swing.JButton();
        Keamanan = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        Bahaya = new javax.swing.JComboBox();
        Kekokohan = new javax.swing.JComboBox();
        KunciPintuJendela = new javax.swing.JComboBox();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Kebersihan.setMinimumSize(new java.awt.Dimension(388, 700));
        Kebersihan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel43.setText("KEBERSIHAN");
        Kebersihan.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 11, 252, -1));

        jLabel44.setText("Nilai Suhu              :");
        Kebersihan.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 20));

        Udara.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Lancar", "Kurang Lancar" }));
        Udara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UdaraActionPerformed(evt);
            }
        });
        Kebersihan.add(Udara, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel45.setText("Sirkulasi Udara  :");
        Kebersihan.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 20));
        Kebersihan.add(Pencahayaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, 20));

        jLabel46.setText("Nilai Pencahayaan :");
        Kebersihan.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 20));
        Kebersihan.add(Suhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 100, -1));

        jLabel47.setText("Nilai Kelembapan   :");
        Kebersihan.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 20));
        Kebersihan.add(Kelembapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 100, -1));

        Next3.setText("Next");
        Next3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next3ActionPerformed(evt);
            }
        });
        Kebersihan.add(Next3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        getContentPane().add(Kebersihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 700));

        Lingkungan.setPreferredSize(new java.awt.Dimension(388, 700));
        Lingkungan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel37.setText("LINGKUNGAN");
        Lingkungan.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, 266, 45));

        jLabel38.setText("Kondisi Lantai      :");
        Lingkungan.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 20));

        Lantai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Bersih", "Kotor" }));
        Lantai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LantaiActionPerformed(evt);
            }
        });
        Lingkungan.add(Lantai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 74, -1));

        jLabel39.setText("Kondisi Dinding    :");
        Lingkungan.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 20));

        Dinding.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Bersih", "Kotor" }));
        Dinding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DindingActionPerformed(evt);
            }
        });
        Lingkungan.add(Dinding, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 74, -1));

        jLabel40.setText("Kondisi Atap        :");
        Lingkungan.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 20));

        Atap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Bersih", "Kotor" }));
        Atap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtapActionPerformed(evt);
            }
        });
        Lingkungan.add(Atap, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 74, -1));

        jLabel41.setText("Kondisi Pintu        :");
        Lingkungan.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 130, 20));

        Pintu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Bersih", "Kotor" }));
        Pintu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PintuActionPerformed(evt);
            }
        });
        Lingkungan.add(Pintu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 74, -1));

        jLabel42.setText("Kondisi Jendela    :");
        Lingkungan.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 20));

        Jendela.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Bersih", "Kotor" }));
        Jendela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JendelaActionPerformed(evt);
            }
        });
        Lingkungan.add(Jendela, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 74, -1));

        Next2.setText("Next");
        Next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next2ActionPerformed(evt);
            }
        });
        Lingkungan.add(Next2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, 30));

        getContentPane().add(Lingkungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 700));

        JumlahKondisiSarana.setMinimumSize(new java.awt.Dimension(388, 700));
        JumlahKondisiSarana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JKS.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        JKS.setText("JUMLAH, KONDISI, dan SARANA");
        JumlahKondisiSarana.add(JKS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 340, 60));

        jLabel12.setText("1. Stop Kontak  =>  ");
        JumlahKondisiSarana.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, -1, 79));

        jLabel13.setText("Jumlah :");
        JumlahKondisiSarana.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 90, 20));

        jLabel14.setText("Kondisi : ");
        JumlahKondisiSarana.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 90, 16));

        jLabel15.setText("Posisi   :");
        JumlahKondisiSarana.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, 23));

        JumlahStopKontak.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banyaknya", "1", "2", "3", "4", "5" }));
        JumlahStopKontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahStopKontakActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(JumlahStopKontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 140, -1));

        PosisiStopKontak.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Posisi", "Depan", "Belakang" }));
        PosisiStopKontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosisiStopKontakActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(PosisiStopKontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 140, -1));

        KondisiStopKontak.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Kondisi", "Baik", "Kurang Baik" }));
        KondisiStopKontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KondisiStopKontakActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(KondisiStopKontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 140, -1));

        jLabel16.setText("2. Kabel LCD     =>");
        JumlahKondisiSarana.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 169, 110, 82));

        jLabel17.setText("Jumlah :");
        JumlahKondisiSarana.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 90, 25));

        jLabel18.setText("Kondisi :");
        JumlahKondisiSarana.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 90, 20));

        jLabel19.setText("Posisi   :");
        JumlahKondisiSarana.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, 20));

        JumlahLCD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banyaknya", "1", "2", "3", "4", "5" }));
        JumlahLCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahLCDActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(JumlahLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 140, -1));

        KondisiLCD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Kondisi", "Baik", "Kurang Baik" }));
        KondisiLCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KondisiLCDActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(KondisiLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 140, -1));

        PosisiLCD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Posisi", "Depan", "Belakang" }));
        PosisiLCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosisiLCDActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(PosisiLCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 140, -1));

        jLabel20.setText("4. Kipas Angin  =>");
        JumlahKondisiSarana.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, 77));

        jLabel21.setText("Jumlah :");
        JumlahKondisiSarana.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 90, 25));

        jLabel22.setText("Kondisi :");
        JumlahKondisiSarana.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 90, 20));

        jLabel23.setText("Posisi   :");
        JumlahKondisiSarana.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 90, 20));

        JumlahLampu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banyaknya", "1", "2", "3", "4", "5" }));
        JumlahLampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahLampuActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(JumlahLampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 140, 23));

        KondisiLampu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Kondisi", "Baik", "Kurang Baik" }));
        KondisiLampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KondisiLampuActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(KondisiLampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 140, -1));

        PosisiLampu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Posisi", "Atas", "Samping" }));
        PosisiLampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosisiLampuActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(PosisiLampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 140, -1));

        jLabel24.setText("3. Lampu          =>");
        JumlahKondisiSarana.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 257, 99, 77));

        jLabel25.setText("Jumlah :");
        JumlahKondisiSarana.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 90, 25));

        jLabel26.setText("Kondisi :");
        JumlahKondisiSarana.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 90, 20));

        jLabel27.setText("Posisi   :");
        JumlahKondisiSarana.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 90, 20));

        JumlahKipasAngin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banyaknya", "1", "2", "3", "4", "5" }));
        JumlahKipasAngin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahKipasAnginActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(JumlahKipasAngin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 140, 20));

        KondisiKipasAngin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Kondisi", "Baik", "Kurang Baik" }));
        KondisiKipasAngin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KondisiKipasAnginActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(KondisiKipasAngin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 140, -1));

        PosisiKipasAngin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Posisi", "Atas", "Samping" }));
        PosisiKipasAngin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosisiKipasAnginActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(PosisiKipasAngin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 140, -1));

        jLabel28.setText("5. AC                =>");
        JumlahKondisiSarana.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, 77));

        jLabel29.setText("Jumlah :");
        JumlahKondisiSarana.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 90, 25));

        jLabel30.setText("Kondisi :");
        JumlahKondisiSarana.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 90, 20));

        jLabel31.setText("Posisi   :");
        JumlahKondisiSarana.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 90, 20));

        JumlahAC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banyaknya", "-", "1", "2", "3", " " }));
        JumlahAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahACActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(JumlahAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 140, 20));

        KondisiAC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Kondisi", "Baik", "Kurang Baik" }));
        KondisiAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KondisiACActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(KondisiAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 140, -1));

        PosisiAC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Posisi", "Atas", "Samping" }));
        PosisiAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosisiACActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(PosisiAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 140, -1));

        jLabel32.setText("7. SSID             =>");
        JumlahKondisiSarana.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 100, 77));

        jLabel33.setText("Jumlah :");
        JumlahKondisiSarana.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 90, 25));

        jLabel34.setText("Kondisi :");
        JumlahKondisiSarana.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 90, 20));

        jLabel35.setText("Posisi   :");
        JumlahKondisiSarana.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 90, 20));

        JumlahCCTV.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banyaknya", "-", "1", "2", "3", " " }));
        JumlahCCTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahCCTVActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(JumlahCCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 140, 20));

        KondisiCCTV.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Kondisi", "Baik", "Kurang Baik" }));
        KondisiCCTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KondisiCCTVActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(KondisiCCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 140, -1));

        PosisiCCTV.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Posisi", "Atas", "Samping" }));
        PosisiCCTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosisiCCTVActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(PosisiCCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 140, -1));

        jLabel36.setText("6. CCTV            =>");
        JumlahKondisiSarana.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 100, 77));

        SSID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih SSID", "UMM Hotspot", "UMM Premium", "Rektorat" }));
        SSID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSIDActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(SSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 630, 80, -1));

        Bandwidth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bandwidth", "50", "100", "150" }));
        Bandwidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BandwidthActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(Bandwidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 90, -1));

        Next1.setText("Next");
        Next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next1ActionPerformed(evt);
            }
        });
        JumlahKondisiSarana.add(Next1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 670, -1, -1));

        getContentPane().add(JumlahKondisiSarana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 700));

        Identitas.setMinimumSize(new java.awt.Dimension(388, 700));
        Identitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("IDENTITAS KELAS");
        Identitas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 270, 60));

        jLabel2.setText("Nama Ruangan : ");
        Identitas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 98, 38));
        Identitas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 90, -1, -1));

        jLabel4.setText("Lokasi Ruangan : ");
        Identitas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 34));

        jLabel5.setText("Nama Jurusan :");
        Identitas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 30));

        NamaRuang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaRuangActionPerformed(evt);
            }
        });
        Identitas.add(NamaRuang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, 30));

        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        Identitas.add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 90, 30));

        jLabel7.setText("Panjang :");
        Identitas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 30));

        Panjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanjangActionPerformed(evt);
            }
        });
        Identitas.add(Panjang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 140, 30));

        jLabel8.setText("Lebar :");
        Identitas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 70, 40));

        Lebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LebarActionPerformed(evt);
            }
        });
        Identitas.add(Lebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 140, 30));

        jLabel9.setText("Jumlah Pintu :");
        Identitas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, 40));
        Identitas.add(JumlahPintu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, 30));

        jLabel10.setText("Jumlah Kursi :");
        Identitas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 130, 40));
        Identitas.add(JumlahKursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 140, 30));

        jLabel11.setText("Jumlah Jendela : ");
        Identitas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 30));
        Identitas.add(JumlahJendela, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 140, 30));

        GKB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GKB", "GKB1", "GKB2", "GKB3" }));
        GKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GKBActionPerformed(evt);
            }
        });
        Identitas.add(GKB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 140, 30));

        Jurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jurusan", "Informatika", "Mesin", "Industri", "Sipil", "Elektro" }));
        Identitas.add(Jurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 140, 30));

        getContentPane().add(Identitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 700));

        Kenyamanan.setPreferredSize(new java.awt.Dimension(388, 700));
        Kenyamanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel48.setText("KENYAMANAN");
        Kenyamanan.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 269, -1));

        jLabel49.setText("Keausan        :");
        Kenyamanan.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 30));

        jLabel50.setText("Kebisingan     :");
        Kenyamanan.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 30));

        jLabel51.setText("Bau                :");
        Kenyamanan.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 30));

        jLabel52.setText("Kebocoran     :");
        Kenyamanan.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 30));

        jLabel53.setText("Kerusakan     :");
        Kenyamanan.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 30));

        Keausan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Aus", "Tidak Aus" }));
        Kenyamanan.add(Keausan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 80, 30));

        Kebisingan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Bising", "Tidak Bising" }));
        Kebisingan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KebisinganActionPerformed(evt);
            }
        });
        Kenyamanan.add(Kebisingan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 80, 30));

        Bau.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Bau", "Tidak Bau" }));
        Kenyamanan.add(Bau, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 80, 30));

        Kebocoran.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Bocor", "Tidak Bocor" }));
        Kenyamanan.add(Kebocoran, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 80, 30));

        Kerusakan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Rusak", "Tidak Rusak" }));
        Kenyamanan.add(Kerusakan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 80, 30));

        Next4.setText("Next");
        Next4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next4ActionPerformed(evt);
            }
        });
        Kenyamanan.add(Next4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 60, 30));

        getContentPane().add(Kenyamanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Keamanan.setMinimumSize(new java.awt.Dimension(388, 700));
        Keamanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel54.setText("KEAMANAN");
        Keamanan.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 266, -1));

        jLabel55.setText("Bahaya :");
        Keamanan.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 30));

        jLabel56.setText("Kekokohan :");
        Keamanan.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 30));

        jLabel57.setText("Kunci Pintu & Jendela :");
        Keamanan.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 30));

        Bahaya.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Bahaya", "Tidak Bahaya" }));
        Keamanan.add(Bahaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 100, 30));

        Kekokohan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Kokoh", "Tidak Kokoh" }));
        Keamanan.add(Kekokohan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 100, 30));

        KunciPintuJendela.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Ada", "Tidak Ada" }));
        Keamanan.add(KunciPintuJendela, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 100, 30));

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        Keamanan.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        getContentPane().add(Keamanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamaRuangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaRuangActionPerformed
        
    }//GEN-LAST:event_NamaRuangActionPerformed
    
    IdentitasKelas id = new IdentitasKelas();
    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        id.setNamaRuangan(NamaRuang.getText());
        id.setLokasiRuangan(GKB.getSelectedItem().toString());
        id.setJurusan(Jurusan.getSelectedItem().toString());
        id.setPanjang(Integer.parseInt(Panjang.getText()));
        id.setLebar(Integer.parseInt(Lebar.getText()));
        id.setJumlahPintu(Integer.parseInt(JumlahPintu.getText()));
        id.setJumlahKursi(Integer.parseInt(JumlahKursi.getText()));
        id.setJumlahJendela(Integer.parseInt(JumlahJendela.getText()));
        id.View();
        id.Luas();
        id.RasioLuas();
        id.cetakData();
        id.Save();
        
        JumlahKondisiSarana.setVisible(true);
        Identitas.setVisible(false);
            
    }//GEN-LAST:event_NextActionPerformed
         
    private void KondisiLCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KondisiLCDActionPerformed
        
    }//GEN-LAST:event_KondisiLCDActionPerformed

    private void KondisiLampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KondisiLampuActionPerformed
        
    }//GEN-LAST:event_KondisiLampuActionPerformed

    private void KondisiKipasAnginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KondisiKipasAnginActionPerformed
        
    }//GEN-LAST:event_KondisiKipasAnginActionPerformed

    private void KondisiACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KondisiACActionPerformed
        
    }//GEN-LAST:event_KondisiACActionPerformed

    private void KondisiCCTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KondisiCCTVActionPerformed

    }//GEN-LAST:event_KondisiCCTVActionPerformed

    private void LebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LebarActionPerformed
        
    }//GEN-LAST:event_LebarActionPerformed
    
    AC ace = new AC();
    CCTV cctv = new CCTV();
    KabelLCD lcd = new KabelLCD();
    KipasAngin kpas = new KipasAngin();
    Lampu lamp = new Lampu();
    StopKontak stop = new StopKontak();
    Internet net = new Internet();
    private void Next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next1ActionPerformed
        stop.setJumlah(Integer.parseInt(JumlahStopKontak.getSelectedItem().toString()));
        stop.setKondisi(KondisiStopKontak.getSelectedItem().toString());
        stop.setPosisi(PosisiStopKontak.getSelectedItem().toString());
        stop.analisisJumlah();
        stop.analisisKondisi();
        stop.analisisPosisi();
        stop.tampil();
        stop.simpan();
        
        lcd.setJumlah(Integer.parseInt(JumlahLCD.getSelectedItem().toString()));
        lcd.setKondisi(KondisiLCD.getSelectedItem().toString());
        lcd.setPosisi(PosisiLCD.getSelectedItem().toString());
        lcd.analisisJumlah();
        lcd.analisisKondisi();
        lcd.analisisPosisi();
        lcd.Tampil();
        lcd.Simpan();
       
        kpas.setJumlah(Integer.parseInt(JumlahKipasAngin.getSelectedItem().toString()));
        kpas.setKondisi(KondisiKipasAngin.getSelectedItem().toString());
        kpas.setPosisi(PosisiKipasAngin.getSelectedItem().toString());
        kpas.analisisJumlah();
        kpas.analisisKondisi();
        kpas.analisisPosisi();
        kpas.Tampil();
        kpas.simpan();
        
        lamp.setJumlah(Integer.parseInt(JumlahLampu.getSelectedItem().toString()));
        lamp.setKondisi(KondisiLampu.getSelectedItem().toString());
        lamp.setPosisi(PosisiLampu.getSelectedItem().toString());
        lamp.analisisJumlah();
        lamp.analisisKondisi();
        lamp.analisisPosisi();
        lamp.tampil();
        lamp.simpan();
        
        ace.setJumlah(Integer.parseInt(JumlahAC.getSelectedItem().toString()));
        ace.setKondisi(KondisiAC.getSelectedItem().toString());
        ace.setPosisi(PosisiAC.getSelectedItem().toString());
        ace.analisisJumlah();
        ace.analisisKondisi();
        ace.analisisPosisi();
        ace.tampilan();
        ace.save();
        
        cctv.setJumlah(Integer.parseInt(JumlahCCTV.getSelectedItem().toString()));
        cctv.setKondisi(KondisiCCTV.getSelectedItem().toString());
        cctv.setPosisi(PosisiCCTV.getSelectedItem().toString());
        cctv.analisisJumlah();
        cctv.analisisKondisi();
        cctv.analisisPosisi();
        cctv.tampil();
        cctv.simpan();
        
        net.setSSID(SSID.getSelectedItem().toString());
        net.setBandwidth(Integer.parseInt(Bandwidth.getSelectedItem().toString()));
        net.View();
        net.Analisa();
        net.Save();
        
        Lingkungan.setVisible(true);
        JumlahKondisiSarana.setVisible(false);
    }//GEN-LAST:event_Next1ActionPerformed
    
    LingkunganKelas lingkung = new LingkunganKelas();
    private void Next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next2ActionPerformed
        lingkung.setLantai(Lantai.getSelectedItem().toString());
        lingkung.setDinding(Dinding.getSelectedItem().toString());
        lingkung.setAtap(Atap.getSelectedItem().toString());
        lingkung.setPintu(Pintu.getSelectedItem().toString());
        lingkung.setJendela(Jendela.getSelectedItem().toString());
        lingkung.View();
        lingkung.Analisa();
        lingkung.Save();
        
        Kebersihan.setVisible(true);
        Lingkungan.setVisible(false);
    }//GEN-LAST:event_Next2ActionPerformed
    
    KebersihanKelas bersih = new KebersihanKelas();
    private void Next3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next3ActionPerformed
        bersih.setSirkulasiUdara(Udara.getSelectedItem().toString());
        bersih.setPencahayaan(Integer.parseInt(Pencahayaan.getText()));
        bersih.setKelembapan(Integer.parseInt(Kelembapan.getText()));
        bersih.setSuhuCel(Integer.parseInt(Suhu.getText()));
        bersih.View();
        bersih.Analisa();
        bersih.Save();
        
        Kenyamanan.setVisible(true);
        Kebersihan.setVisible(false);
    }//GEN-LAST:event_Next3ActionPerformed
    
    KenyamananKelas enak = new KenyamananKelas();
    private void Next4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next4ActionPerformed
        enak.setKebisingan(Kebisingan.getSelectedItem().toString());
        enak.setBau(Bau.getSelectedItem().toString());
        enak.setKebocoran(Kebocoran.getSelectedItem().toString());
        enak.setKerusakan(Kerusakan.getSelectedItem().toString());
        enak.setKeausan(Keausan.getSelectedItem().toString());
        enak.View();
        enak.Analisa();
        enak.Save();
        
        Keamanan.setVisible(true);
        Kenyamanan.setVisible(false);
    }//GEN-LAST:event_Next4ActionPerformed
    
    KeamananKelas aman = new KeamananKelas();
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        aman.setKekokohan(Kekokohan.getSelectedItem().toString());
        aman.setKunciPintuJendela(KunciPintuJendela.getSelectedItem().toString());
        aman.setBahaya(Bahaya.getSelectedItem().toString());
        aman.View();
        aman.Analisa();
        aman.Save();
        JOptionPane.showMessageDialog(null, "Data Telah Tersimpan");
        
        Keamanan.setVisible(false);
    }//GEN-LAST:event_SaveActionPerformed

    private void JumlahLCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahLCDActionPerformed
        
    }//GEN-LAST:event_JumlahLCDActionPerformed

    private void JumlahStopKontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahStopKontakActionPerformed
        
    }//GEN-LAST:event_JumlahStopKontakActionPerformed

    private void KondisiStopKontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KondisiStopKontakActionPerformed
        
        
    }//GEN-LAST:event_KondisiStopKontakActionPerformed

    private void GKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GKBActionPerformed
        
    }//GEN-LAST:event_GKBActionPerformed

    private void PosisiStopKontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosisiStopKontakActionPerformed
        
    }//GEN-LAST:event_PosisiStopKontakActionPerformed

    private void PosisiLCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosisiLCDActionPerformed
        
    }//GEN-LAST:event_PosisiLCDActionPerformed

    private void JumlahLampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahLampuActionPerformed
        
    }//GEN-LAST:event_JumlahLampuActionPerformed

    private void PosisiLampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosisiLampuActionPerformed
        
    }//GEN-LAST:event_PosisiLampuActionPerformed

    private void JumlahKipasAnginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahKipasAnginActionPerformed
        
    }//GEN-LAST:event_JumlahKipasAnginActionPerformed

    private void PosisiKipasAnginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosisiKipasAnginActionPerformed
        
    }//GEN-LAST:event_PosisiKipasAnginActionPerformed

    private void JumlahACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahACActionPerformed
        
    }//GEN-LAST:event_JumlahACActionPerformed

    private void PosisiACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosisiACActionPerformed
        
    }//GEN-LAST:event_PosisiACActionPerformed

    private void JumlahCCTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahCCTVActionPerformed
        
    }//GEN-LAST:event_JumlahCCTVActionPerformed

    private void PosisiCCTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosisiCCTVActionPerformed
        
    }//GEN-LAST:event_PosisiCCTVActionPerformed

    private void SSIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSIDActionPerformed
        
    }//GEN-LAST:event_SSIDActionPerformed

    private void BandwidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BandwidthActionPerformed
        
    }//GEN-LAST:event_BandwidthActionPerformed
        
    private void LantaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LantaiActionPerformed
        
    }//GEN-LAST:event_LantaiActionPerformed

    private void PintuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PintuActionPerformed
        
    }//GEN-LAST:event_PintuActionPerformed

    private void DindingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DindingActionPerformed
        
    }//GEN-LAST:event_DindingActionPerformed

    private void AtapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtapActionPerformed
        
    }//GEN-LAST:event_AtapActionPerformed

    private void JendelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JendelaActionPerformed
        
    }//GEN-LAST:event_JendelaActionPerformed
    
    private void UdaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UdaraActionPerformed
        
    }//GEN-LAST:event_UdaraActionPerformed

    private void PanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanjangActionPerformed
        
    }//GEN-LAST:event_PanjangActionPerformed

    private void KebisinganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KebisinganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KebisinganActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventaris_GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Atap;
    private javax.swing.JComboBox Bahaya;
    private javax.swing.JComboBox Bandwidth;
    private javax.swing.JComboBox Bau;
    private javax.swing.JComboBox Dinding;
    private javax.swing.JComboBox GKB;
    private javax.swing.JPanel Identitas;
    private javax.swing.JLabel JKS;
    private javax.swing.JComboBox Jendela;
    private javax.swing.JComboBox JumlahAC;
    private javax.swing.JComboBox JumlahCCTV;
    private javax.swing.JTextField JumlahJendela;
    private javax.swing.JComboBox JumlahKipasAngin;
    private javax.swing.JPanel JumlahKondisiSarana;
    private javax.swing.JTextField JumlahKursi;
    private javax.swing.JComboBox JumlahLCD;
    private javax.swing.JComboBox JumlahLampu;
    private javax.swing.JTextField JumlahPintu;
    private javax.swing.JComboBox JumlahStopKontak;
    private javax.swing.JComboBox Jurusan;
    private javax.swing.JPanel Keamanan;
    private javax.swing.JComboBox Keausan;
    private javax.swing.JPanel Kebersihan;
    private javax.swing.JComboBox Kebisingan;
    private javax.swing.JComboBox Kebocoran;
    private javax.swing.JComboBox Kekokohan;
    private javax.swing.JTextField Kelembapan;
    private javax.swing.JPanel Kenyamanan;
    private javax.swing.JComboBox Kerusakan;
    private javax.swing.JComboBox KondisiAC;
    private javax.swing.JComboBox KondisiCCTV;
    private javax.swing.JComboBox KondisiKipasAngin;
    private javax.swing.JComboBox KondisiLCD;
    private javax.swing.JComboBox KondisiLampu;
    private javax.swing.JComboBox KondisiStopKontak;
    private javax.swing.JComboBox KunciPintuJendela;
    private javax.swing.JComboBox Lantai;
    private javax.swing.JTextField Lebar;
    private javax.swing.JPanel Lingkungan;
    private javax.swing.JTextField NamaRuang;
    private javax.swing.JButton Next;
    private javax.swing.JButton Next1;
    private javax.swing.JButton Next2;
    private javax.swing.JButton Next3;
    private javax.swing.JButton Next4;
    private javax.swing.JTextField Panjang;
    private javax.swing.JTextField Pencahayaan;
    private javax.swing.JComboBox Pintu;
    private javax.swing.JComboBox PosisiAC;
    private javax.swing.JComboBox PosisiCCTV;
    private javax.swing.JComboBox PosisiKipasAngin;
    private javax.swing.JComboBox PosisiLCD;
    private javax.swing.JComboBox PosisiLampu;
    private javax.swing.JComboBox PosisiStopKontak;
    private javax.swing.JComboBox SSID;
    private javax.swing.JButton Save;
    private javax.swing.JTextField Suhu;
    private javax.swing.JComboBox Udara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
