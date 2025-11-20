/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Germán
 */
public class RankingPuntuajesPantalla extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RankingPuntuajesPantalla.class.getName());

    private Random random = new Random();
    private String[] nombres = {"Ana", "Carlos", "Luis", "Maria", "Pedro", "Germán"};

    public RankingPuntuajesPantalla() {
        initComponents();
        setLocationRelativeTo(null);
        agregarJugadoresIniciales();
        configurarClickEnNivel();
    }

    private void agregarJugadoresIniciales() {
        // Agregar datos directamente a la tabla
        agregarFila("Germán", 850, 12);
        agregarFila("Carlos", 720, 8);
        agregarFila("Luis", 650, 5);
    }

    private void agregarFila(String jugador, int puntaje, int nivel) {
        // Obtener el modelo de tabla que ya existe (configurado en Design)
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTableRanking.getModel();

        // Agregar fila
        modelo.addRow(new Object[]{jugador, puntaje, nivel});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRanking = new javax.swing.JTable();
        jButtonAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ranking de Puntajes Germán");

        jTableRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador", "Puntuaje", "Nivel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableRanking);

        jButtonAgregar.setText("Añadir Jugador");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAgregar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButtonAgregar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed

        String nombre = nombres[random.nextInt(nombres.length)];

        int puntaje = random.nextInt(1000) + 100;
        int nivel = random.nextInt(20) + 1;

        // Agregar a la tabla
        agregarFila(nombre, puntaje, nivel);

        // Mensaje simple
        JOptionPane.showMessageDialog(this,
                "Jugador agregado:\n" + nombre + " - " + puntaje + " puntos");
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void configurarClickEnNivel() {
        // Agregar MouseListener a la tabla para CLICK SIMPLE
        jTableRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                int fila = jTableRanking.rowAtPoint(evt.getPoint());
                int columna = jTableRanking.columnAtPoint(evt.getPoint());

                if (columna == 2 && fila >= 0) {
                    mostrarMejorJugador();
                }
            }
        });
    }

    private void mostrarMejorJugador() {
        // Obtener el modelo de la tabla
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTableRanking.getModel();

        // Verificar si hay jugadores en la tabla
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this,
                    "❌ No hay jugadores en la tabla.\nAgrega algunos jugadores primero.",
                    "Tabla Vacía",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Buscar el jugador con mayor nivel
        String mejorJugador = "";
        int mayorNivel = -1;
        int mejorPuntaje = 0;

        for (int i = 0; i < modelo.getRowCount(); i++) {
            String jugador = (String) modelo.getValueAt(i, 0);
            int nivel = (Integer) modelo.getValueAt(i, 2);
            int puntaje = (Integer) modelo.getValueAt(i, 1);

            if (nivel > mayorNivel) {
                mayorNivel = nivel;
                mejorJugador = jugador;
                mejorPuntaje = puntaje;
            }
        }

        // Mostrar el resultado
        String mensaje = "MEJOR JUGADOR\n"
                + "Jugador: " + mejorJugador + "\n"
                + "Nivel: " + mayorNivel + "\n"
                + "Puntaje: " + mejorPuntaje;

        JOptionPane.showMessageDialog(this,
                mensaje,
                "Mejor Jugador - Mayor Nivel",
                JOptionPane.INFORMATION_MESSAGE);
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RankingPuntuajesPantalla().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRanking;
    // End of variables declaration//GEN-END:variables
}
