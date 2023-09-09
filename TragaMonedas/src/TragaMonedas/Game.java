package TragaMonedas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JFrame {

    double montoApuesta;
    Iniciar inc;
    String iconos[];
    boolean suspendido = false;
    boolean mover = false;
    CasinoFrame casino = new CasinoFrame();
    ImageIcon moneda = new ImageIcon(getClass().getResource("/TragaMonedas/moneda.png"));
    double monto = 20000;

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    Porcentajes porcentajes = new Porcentajes();

    public Game() {
//        porcentajes.setGanar3(2);
//        porcentajes.setGanar2(0.5);
//        porcentajes.setPerder(0.5);
//        String json = gson.toJson(porcentajes);
//        try (FileWriter writer = new FileWriter("variables.json")) {
//            writer.write(json);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //cargar json
        try (FileReader reader = new FileReader("variables.json")) {
            porcentajes = gson.fromJson(reader, Porcentajes.class);
            System.out.println("Ganar3: " + porcentajes.getGanar3());
            System.out.println("Ganar2: " + porcentajes.getGanar2());
            System.out.println("Perder: " + porcentajes.getPerder());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No Existe el archico JSON");
        }

        initComponents();
        iconos = new String[3];
        this.inc = new Iniciar(lbl1, lbl2, lbl3);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("TRAGAMONEDAS");
        this.setIconImage(moneda.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        btnparar = new javax.swing.JButton();
        btnjugar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LabelMonto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("TRAGAMONEDAS");

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TragaMonedas/Pica.png"))); // NOI18N
        lbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TragaMonedas/Trebol.png"))); // NOI18N
        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TragaMonedas/Cereza.png"))); // NOI18N
        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnparar.setText("PARAR");
        btnparar.setEnabled(false);
        btnparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpararActionPerformed(evt);
            }
        });

        btnjugar.setText("JUGAR");
        btnjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl2)
                        .addGap(18, 18, 18)
                        .addComponent(lbl3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnjugar)
                        .addGap(45, 45, 45)
                        .addComponent(btnparar)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addComponent(jLabel1)
                    .addComponent(LabelMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2)
                    .addComponent(lbl1)
                    .addComponent(lbl3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnparar)
                    .addComponent(btnjugar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setdato(String Dato) {
        LabelMonto.setText(Dato);
        this.montoApuesta = Double.parseDouble(Dato);
    }


    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        btnjugar.setEnabled(false);
        btnparar.setEnabled(true);
        if (!suspendido) {
            hilo.start();
        } else {
            hilo.resume();
            suspendido = false;
        }
    }//GEN-LAST:event_btnjugarActionPerformed

    private void btnpararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpararActionPerformed
        double ganancia;
        double montoTotal;
        double perdida;
        btnjugar.setEnabled(true);
        btnparar.setEnabled(false);
        hilo.suspend();
        suspendido = true;
        ImageIcon l1, l2, l3;

        l1 = (ImageIcon) lbl1.getIcon();
        l2 = (ImageIcon) lbl2.getIcon();
        l3 = (ImageIcon) lbl3.getIcon();
        ImageIcon icono;
        if (l1.getDescription().compareTo(l2.getDescription()) == 0 && l1.getDescription().compareTo(l3.getDescription()) == 0) {
            icono = new ImageIcon(getClass().getResource("/TragaMonedas/Ganar.png"));
            ganancia = ((porcentajes.getGanar3() * montoApuesta) - montoApuesta);
            montoTotal = porcentajes.getGanar3() * montoApuesta;
            this.montoApuesta = montoTotal;
            JOptionPane.showMessageDialog(rootPane, "GANASTE $" + ganancia + "\nAHORA TIENES $" + montoApuesta, "FELICIDADES", JOptionPane.INFORMATION_MESSAGE, icono);
            LabelMonto.setText(Double.toString(montoApuesta));
        } else if (l1.getDescription().compareTo(l2.getDescription()) == 0 || l2.getDescription().compareTo(l3.getDescription()) == 0) {
            icono = new ImageIcon(getClass().getResource("/TragaMonedas/Ganar.png"));
            ganancia = (porcentajes.getGanar2() * montoApuesta);
            montoTotal = montoApuesta + ganancia;
            montoApuesta = montoTotal;
            JOptionPane.showMessageDialog(rootPane, "GANASTE $" + ganancia + "\nAHORA TIENES $" + montoApuesta, "FELICIDADES", JOptionPane.INFORMATION_MESSAGE, icono);
            LabelMonto.setText(Double.toString(montoApuesta));
        } else {
            icono = new ImageIcon(getClass().getResource("/TragaMonedas/Perder.png"));
            perdida = (porcentajes.getPerder() * montoApuesta);
            montoTotal = montoApuesta - perdida;
            montoApuesta = montoTotal;
            JOptionPane.showMessageDialog(rootPane, "PERDISTE $" + perdida + "\n AHORA TIENES: $" + montoApuesta, "¡LO SENTIMOS!", JOptionPane.INFORMATION_MESSAGE, icono);
            LabelMonto.setText(Double.toString(montoApuesta));
        }
    }//GEN-LAST:event_btnpararActionPerformed

    Thread hilo = new Thread() {
        public void run() {
            try {
                while (true) {
                    inc.asignar();
                    hilo.sleep(40);
                }
            } catch (InterruptedException ie) {
                JOptionPane.showMessageDialog(rootPane, ie.getMessage());
            }
        }
    };


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMonto;
    private javax.swing.JButton btnjugar;
    private javax.swing.JButton btnparar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    // End of variables declaration//GEN-END:variables
}
