/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JULIOCESARMARTINEZ
 */
public class JFPrincipal extends javax.swing.JFrame {

    static Cliente[] clientesArray = {
        new Cliente(1, "Julio", "Martinez", 111111, 1234, 1000000, 0),
        new Cliente(2, "Duvan", "Henao", 222222, 4321, 2000000, 0),
        new Cliente(3, "Libardo", "Gomez", 333333, 5555, 1500000, 0)
    };
    
    static List<Cliente> clientes = Arrays.asList(clientesArray);
    
    Cliente cliente;
    
    /**
     * 0: buscar
     * 1: saldo
     * 2: retiro
     * 3: cambio pin
     */
    int operacion = 0;
    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        initComponents();
        cliente = new Cliente();
        this.inicializar();
    }

    private void inicializar(){
        jLNombres.setText("");
        jTFValor.setVisible(false);
        this.habilitarTeclado(false);
        this.habilitarOpciones(false);
        this.habilitarPrint(false);
    }
    
    private void habilitarTeclado(boolean flag){
        jBUno.setVisible(flag);
        jBDos.setVisible(flag);
        jBTres.setVisible(flag);
        jBCuatro.setVisible(flag);
        jBCinco.setVisible(flag);
        jBSeis.setVisible(flag);
        jBSiete.setVisible(flag);
        jBOcho.setVisible(flag);
        jBNueve.setVisible(flag);
        jBCero.setVisible(flag);
        jBBorrar.setVisible(flag);
        jBAceptar.setVisible(flag);
        
        jPassword.setVisible(flag);
        jLMensajes.setVisible(flag);
    }
    
    private void habilitarOpciones(boolean flag){
        jBSaldo.setVisible(flag);
        jBRetirar.setVisible(flag);
        jBPin.setVisible(flag);
    }
    
    private void habilitarPrint(boolean flag){
        jLPrint.setVisible(flag);
        jBSI.setVisible(flag);
        jBNO.setVisible(flag);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNoTarjeta = new javax.swing.JTextField();
        jBIngresarTarjeta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jBUno = new javax.swing.JButton();
        jBDos = new javax.swing.JButton();
        jBTres = new javax.swing.JButton();
        jBCuatro = new javax.swing.JButton();
        jBCinco = new javax.swing.JButton();
        jBSeis = new javax.swing.JButton();
        jBSiete = new javax.swing.JButton();
        jBOcho = new javax.swing.JButton();
        jBNueve = new javax.swing.JButton();
        jBCero = new javax.swing.JButton();
        jBAceptar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTFValor = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLMensajes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBSaldo = new javax.swing.JButton();
        jBRetirar = new javax.swing.JButton();
        jBPin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLPrint = new javax.swing.JLabel();
        jBSI = new javax.swing.JButton();
        jBNO = new javax.swing.JButton();
        jLNombres = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("BIENVENIDO A TUMBANK");

        jLabel2.setFont(new java.awt.Font("Rage Italic", 0, 13)); // NOI18N
        jLabel2.setText("Te tumbamos");

        jBIngresarTarjeta.setText("INGRESAR TARJETA");
        jBIngresarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarTarjetaActionPerformed(evt);
            }
        });

        jBUno.setText("1");
        jBUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUnoActionPerformed(evt);
            }
        });

        jBDos.setText("2");
        jBDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDosActionPerformed(evt);
            }
        });

        jBTres.setText("3");
        jBTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTresActionPerformed(evt);
            }
        });

        jBCuatro.setText("4");
        jBCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCuatroActionPerformed(evt);
            }
        });

        jBCinco.setText("5");
        jBCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCincoActionPerformed(evt);
            }
        });

        jBSeis.setText("6");
        jBSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSeisActionPerformed(evt);
            }
        });

        jBSiete.setText("7");
        jBSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSieteActionPerformed(evt);
            }
        });

        jBOcho.setText("8");
        jBOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOchoActionPerformed(evt);
            }
        });

        jBNueve.setText("9");
        jBNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNueveActionPerformed(evt);
            }
        });

        jBCero.setText("0");
        jBCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCeroActionPerformed(evt);
            }
        });

        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jBBorrar.setText("<--");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBSiete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBDos, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(jBCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBOcho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jBCero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jBTres, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAceptar)
                            .addComponent(jBNueve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSeis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jBUno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jBCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTFValor.setEditable(false);

        jPassword.setEditable(false);

        jLMensajes.setText("DIGITA TU PIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFValor, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMensajes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        jBSaldo.setText("CONSULTA SALDO");
        jBSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaldoActionPerformed(evt);
            }
        });

        jBRetirar.setText("RETIRAR");

        jBPin.setText("CAMBIAR PIN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jBRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBPin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLPrint.setText("¿IMPRIMIR RECIBO?");

        jBSI.setText("SI");

        jBNO.setText("NO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPrint)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jBSI)
                        .addGap(18, 18, 18)
                        .addComponent(jBNO)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPrint)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSI)
                    .addComponent(jBNO))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jLNombres.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBIngresarTarjeta)
                        .addGap(18, 18, 18)
                        .addComponent(jLNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBIngresarTarjeta)
                    .addComponent(jLNombres))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIngresarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarTarjetaActionPerformed
        // TODO add your handling code here:
        this.inicializar();
        this.buscar();
    }//GEN-LAST:event_jBIngresarTarjetaActionPerformed

    private void jBUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUnoActionPerformed
        // TODO add your handling code here:
        setTeclado(1);
    }//GEN-LAST:event_jBUnoActionPerformed

    private void jBDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDosActionPerformed
        // TODO add your handling code here:
        setTeclado(2);
    }//GEN-LAST:event_jBDosActionPerformed

    private void jBTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTresActionPerformed
        // TODO add your handling code here:
        setTeclado(3);
    }//GEN-LAST:event_jBTresActionPerformed

    private void jBCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCuatroActionPerformed
        // TODO add your handling code here:
        setTeclado(4);
    }//GEN-LAST:event_jBCuatroActionPerformed

    private void jBCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCincoActionPerformed
        // TODO add your handling code here:
        setTeclado(5);
    }//GEN-LAST:event_jBCincoActionPerformed

    private void jBSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSeisActionPerformed
        // TODO add your handling code here:
        setTeclado(6);
    }//GEN-LAST:event_jBSeisActionPerformed

    private void jBSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSieteActionPerformed
        // TODO add your handling code here:
        setTeclado(7);
    }//GEN-LAST:event_jBSieteActionPerformed

    private void jBOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOchoActionPerformed
        // TODO add your handling code here:
        setTeclado(8);
    }//GEN-LAST:event_jBOchoActionPerformed

    private void jBNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNueveActionPerformed
        // TODO add your handling code here:
        setTeclado(9);
    }//GEN-LAST:event_jBNueveActionPerformed

    private void jBCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCeroActionPerformed
        // TODO add your handling code here:
        setTeclado(0);
    }//GEN-LAST:event_jBCeroActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        // TODO add your handling code here:
        retroceso();
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        // TODO add your handling code here:
        switch(operacion){
            case 0:
                aceptar();
                break;
            case 1:
                break;
            case 2:
                
        }
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jBSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaldoActionPerformed
        // TODO add your handling code here:
        operacion = 1;
        consultarSaldo();
    }//GEN-LAST:event_jBSaldoActionPerformed

    private void consultarSaldo(){
        inicializar();
        jLMensajes.setText("");
        jLMensajes.setVisible(true);
        jLMensajes.setText("Saldo: $" + cliente.getSaldo());
        habilitarPrint(true);
    }
    
    private void aceptar(){
        String pass = String.valueOf(jPassword.getPassword());
        if(pass.length() == 0){
            jLMensajes.setText("");
            return;
        }
        validar();
        jLMensajes.setText("");
    }
    
    private void validar(){
        jLMensajes.setVisible(false);
        if(cliente.getIntentos() >= 3){
            jLMensajes.setText("Tarjeta Bloqueada");
            jLMensajes.setVisible(true);
            return;
        }
        String pass = String.valueOf(jPassword.getPassword());
        int pin = Integer.parseInt(pass.trim());
        if(cliente.getPin() == pin){
            habilitarOpciones(true);
            jLMensajes.setVisible(false);
        }else{
            jLMensajes.setVisible(true);
            jLMensajes.setText("PIN Inválido!");
            jPassword.setVisible(true);
            cliente.setIntentos(cliente.getIntentos() + 1);
            clientes.set(cliente.getId() - 1, cliente);
        }
    }
    
    private void retroceso(){
        switch(operacion){
            case 0:
                String pass = String.valueOf(jPassword.getPassword());
                if(pass.length() > 0){
                    pass = pass.substring(0, pass.length() - 1);
                    jPassword.setText(pass);
                }else{
                    jPassword.setText("");
                }
                break;
            case 1:
                break;
            case 2:
                
        }
    }
    
    private void setTeclado(int val){
            /**
     * 0: buscar
     * 1: saldo
     * 2: retiro
     * 3: cambio pin
     */
        switch(operacion){
            case 0:
                concatenarPin(val);
                break;
            case 1:
                break;
            case 2:
                
        }
    }
    
    private void concatenarPin(int val){
        String pass = String.valueOf(jPassword.getPassword());
        if(pass.length() < 4){
            jPassword.setText(pass + val);
        }
    }
    
    private void buscar(){
        operacion = 0;
        jLMensajes.setText("");
        String cardStr = jTFNoTarjeta.getText();
        int card = Integer.parseInt(cardStr.trim());
        
        Optional<Cliente> clienteOpt =  clientes.stream()
                .filter(c -> c.getNumCard() == card)
                .findFirst();
        jLMensajes.setVisible(true);
        if(clienteOpt.isPresent()){
            jLMensajes.setText("DIGITA PIN");
            this.habilitarTeclado(true);
            jPassword.setVisible(true);
            cliente = clienteOpt.get();
            jLNombres.setText(cliente.getNombre() +" " + cliente.getApellido());
        }else{
            jLMensajes.setText("Tarjeta Erronea!");
        }
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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBCero;
    private javax.swing.JButton jBCinco;
    private javax.swing.JButton jBCuatro;
    private javax.swing.JButton jBDos;
    private javax.swing.JButton jBIngresarTarjeta;
    private javax.swing.JButton jBNO;
    private javax.swing.JButton jBNueve;
    private javax.swing.JButton jBOcho;
    private javax.swing.JButton jBPin;
    private javax.swing.JButton jBRetirar;
    private javax.swing.JButton jBSI;
    private javax.swing.JButton jBSaldo;
    private javax.swing.JButton jBSeis;
    private javax.swing.JButton jBSiete;
    private javax.swing.JButton jBTres;
    private javax.swing.JButton jBUno;
    private javax.swing.JLabel jLMensajes;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTFNoTarjeta;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}
