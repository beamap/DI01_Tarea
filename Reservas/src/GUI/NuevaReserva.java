package GUI;

import Datos.ConexionBaseDeDatos;
import Logica.Control;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class NuevaReserva extends javax.swing.JFrame {

    Control control = new Control();
    
    public NuevaReserva(java.awt.Frame parent, boolean modal) {
        initComponents();
        
        jDateFecha.setMinSelectableDate(new Date());
        jDateFecha.setDate(new Date());      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttongoupevento = new javax.swing.ButtonGroup();
        buttonGrouphabs = new javax.swing.ButtonGroup();
        principal = new javax.swing.JPanel();
        datosreserva = new javax.swing.JPanel();
        jLabelReserva = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelEvento = new javax.swing.JPanel();
        buttonjornada = new javax.swing.JRadioButton();
        buttonpresentacion = new javax.swing.JRadioButton();
        buttoncongreso = new javax.swing.JRadioButton();
        jLabelEvento = new javax.swing.JLabel();
        jPanelHabs = new javax.swing.JPanel();
        jLabelHabs = new javax.swing.JLabel();
        jRadioButtonSiHab = new javax.swing.JRadioButton();
        jRadioButtonNoHab = new javax.swing.JRadioButton();
        jPanelJornadas = new javax.swing.JPanel();
        jLabelJornadas = new javax.swing.JLabel();
        jSpinnerJornadas = new javax.swing.JSpinner();
        jPanelCatering = new javax.swing.JPanel();
        jLabelCatering = new javax.swing.JLabel();
        jComboBoxCatering = new javax.swing.JComboBox<>();
        jPanelFecha = new javax.swing.JPanel();
        jLabelFecha = new javax.swing.JLabel();
        jPanelCalendario = new javax.swing.JPanel();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jPanelAssis = new javax.swing.JPanel();
        jLabelAssis = new javax.swing.JLabel();
        jSpinnerAssis = new javax.swing.JSpinner();
        datoscliente = new javax.swing.JPanel();
        jLabelContacto = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldApe = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jTextFieldNom = new javax.swing.JTextField();
        botones = new javax.swing.JPanel();
        jButtonContinuar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setBackground(new java.awt.Color(255, 255, 255));

        datosreserva.setBackground(new java.awt.Color(255, 255, 255));

        jLabelReserva.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabelReserva.setForeground(new java.awt.Color(255, 153, 51));
        jLabelReserva.setText("DATOS DE LA RESERVA");

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO P.png"))); // NOI18N

        jPanelEvento.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEvento.setOpaque(false);

        buttongoupevento.add(buttonjornada);
        buttonjornada.setForeground(new java.awt.Color(255, 153, 51));
        buttonjornada.setText("Jornada");
        buttonjornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonjornadaActionPerformed(evt);
            }
        });

        buttongoupevento.add(buttonpresentacion);
        buttonpresentacion.setForeground(new java.awt.Color(255, 153, 51));
        buttonpresentacion.setText("Presentación");
        buttonpresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpresentacionActionPerformed(evt);
            }
        });

        buttongoupevento.add(buttoncongreso);
        buttoncongreso.setForeground(new java.awt.Color(255, 153, 51));
        buttoncongreso.setText("Congreso");
        buttoncongreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncongresoActionPerformed(evt);
            }
        });

        jLabelEvento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEvento.setForeground(new java.awt.Color(255, 153, 51));
        jLabelEvento.setText("Tipo de Evento");

        javax.swing.GroupLayout jPanelEventoLayout = new javax.swing.GroupLayout(jPanelEvento);
        jPanelEvento.setLayout(jPanelEventoLayout);
        jPanelEventoLayout.setHorizontalGroup(
            jPanelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonjornada)
                    .addComponent(buttonpresentacion)
                    .addComponent(buttoncongreso)
                    .addComponent(jLabelEvento))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanelEventoLayout.setVerticalGroup(
            jPanelEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEventoLayout.createSequentialGroup()
                .addComponent(jLabelEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonjornada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonpresentacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttoncongreso)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelHabs.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHabs.setEnabled(false);

        jLabelHabs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelHabs.setForeground(new java.awt.Color(255, 153, 51));
        jLabelHabs.setText("Habitaciones para asistentes");
        jLabelHabs.setEnabled(false);

        buttonGrouphabs.add(jRadioButtonSiHab);
        jRadioButtonSiHab.setText("Sí");
        jRadioButtonSiHab.setEnabled(false);
        jRadioButtonSiHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSiHabActionPerformed(evt);
            }
        });

        buttonGrouphabs.add(jRadioButtonNoHab);
        jRadioButtonNoHab.setText("No");
        jRadioButtonNoHab.setEnabled(false);
        jRadioButtonNoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNoHabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHabsLayout = new javax.swing.GroupLayout(jPanelHabs);
        jPanelHabs.setLayout(jPanelHabsLayout);
        jPanelHabsLayout.setHorizontalGroup(
            jPanelHabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHabsLayout.createSequentialGroup()
                .addGroup(jPanelHabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonSiHab)
                    .addComponent(jRadioButtonNoHab)
                    .addComponent(jLabelHabs))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanelHabsLayout.setVerticalGroup(
            jPanelHabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHabsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHabs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonSiHab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonNoHab)
                .addGap(14, 14, 14))
        );

        jPanelJornadas.setBackground(new java.awt.Color(255, 255, 255));

        jLabelJornadas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelJornadas.setForeground(new java.awt.Color(255, 153, 51));
        jLabelJornadas.setText("Número de Jornadas");
        jLabelJornadas.setEnabled(false);

        jSpinnerJornadas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        jSpinnerJornadas.setEnabled(false);

        javax.swing.GroupLayout jPanelJornadasLayout = new javax.swing.GroupLayout(jPanelJornadas);
        jPanelJornadas.setLayout(jPanelJornadasLayout);
        jPanelJornadasLayout.setHorizontalGroup(
            jPanelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJornadasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJornadas)))
        );
        jPanelJornadasLayout.setVerticalGroup(
            jPanelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJornadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJornadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinnerJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanelCatering.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCatering.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCatering.setForeground(new java.awt.Color(255, 153, 51));
        jLabelCatering.setText("Cátering");

        jComboBoxCatering.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Sin Gluten", "Vegetariano", "Vegano" }));

        javax.swing.GroupLayout jPanelCateringLayout = new javax.swing.GroupLayout(jPanelCatering);
        jPanelCatering.setLayout(jPanelCateringLayout);
        jPanelCateringLayout.setHorizontalGroup(
            jPanelCateringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCateringLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCateringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCatering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCatering))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCateringLayout.setVerticalGroup(
            jPanelCateringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCateringLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCatering)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxCatering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFecha.setBackground(new java.awt.Color(255, 255, 255));

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 153, 51));
        jLabelFecha.setText("Fecha");

        jPanelCalendario.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCalendario.setToolTipText("");
        jPanelCalendario.setOpaque(false);

        jDateFecha.setMaxSelectableDate(new java.util.Date(253370764890000L));
        jDateFecha.setMinSelectableDate(null);

        javax.swing.GroupLayout jPanelCalendarioLayout = new javax.swing.GroupLayout(jPanelCalendario);
        jPanelCalendario.setLayout(jPanelCalendarioLayout);
        jPanelCalendarioLayout.setHorizontalGroup(
            jPanelCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        );
        jPanelCalendarioLayout.setVerticalGroup(
            jPanelCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFechaLayout = new javax.swing.GroupLayout(jPanelFecha);
        jPanelFecha.setLayout(jPanelFechaLayout);
        jPanelFechaLayout.setHorizontalGroup(
            jPanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFechaLayout.createSequentialGroup()
                        .addComponent(jLabelFecha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFechaLayout.createSequentialGroup()
                        .addComponent(jPanelCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanelFechaLayout.setVerticalGroup(
            jPanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFechaLayout.createSequentialGroup()
                .addComponent(jLabelFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAssis.setBackground(new java.awt.Color(255, 255, 255));

        jLabelAssis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAssis.setForeground(new java.awt.Color(255, 153, 51));
        jLabelAssis.setText("Número Asistentes");

        jSpinnerAssis.setModel(new javax.swing.SpinnerNumberModel(5, 5, 100, 1));

        javax.swing.GroupLayout jPanelAssisLayout = new javax.swing.GroupLayout(jPanelAssis);
        jPanelAssis.setLayout(jPanelAssisLayout);
        jPanelAssisLayout.setHorizontalGroup(
            jPanelAssisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAssisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAssisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAssis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelAssisLayout.createSequentialGroup()
                        .addComponent(jSpinnerAssis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAssisLayout.setVerticalGroup(
            jPanelAssisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAssisLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabelAssis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerAssis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout datosreservaLayout = new javax.swing.GroupLayout(datosreserva);
        datosreserva.setLayout(datosreservaLayout);
        datosreservaLayout.setHorizontalGroup(
            datosreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosreservaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(datosreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosreservaLayout.createSequentialGroup()
                        .addComponent(jPanelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(datosreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datosreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosreservaLayout.createSequentialGroup()
                                    .addComponent(jLabelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(168, 168, 168)
                                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosreservaLayout.createSequentialGroup()
                                    .addGroup(datosreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelCatering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(datosreservaLayout.createSequentialGroup()
                                            .addComponent(jPanelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(86, 86, 86)
                                            .addComponent(jPanelJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(110, 110, 110)))
                            .addGroup(datosreservaLayout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(jPanelHabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(datosreservaLayout.createSequentialGroup()
                        .addComponent(jPanelAssis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(556, 556, 556))))
        );
        datosreservaLayout.setVerticalGroup(
            datosreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosreservaLayout.createSequentialGroup()
                .addGroup(datosreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosreservaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(datosreservaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLogo)))
                .addGap(18, 18, 18)
                .addGroup(datosreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datosreservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAssis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCatering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelHabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        datoscliente.setBackground(new java.awt.Color(255, 255, 255));

        jLabelContacto.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabelContacto.setForeground(new java.awt.Color(255, 153, 51));
        jLabelContacto.setText("DATOS DE CONTACTO");

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 153, 51));
        jLabelNombre.setText("Nombre");

        jLabelApellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelApellidos.setForeground(new java.awt.Color(255, 153, 51));
        jLabelApellidos.setText("Apellidos");

        jLabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(255, 153, 51));
        jLabelTelefono.setText("Teléfono");

        jTextFieldApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApeKeyTyped(evt);
            }
        });

        jTextFieldTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelKeyTyped(evt);
            }
        });

        jTextFieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomActionPerformed(evt);
            }
        });
        jTextFieldNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout datosclienteLayout = new javax.swing.GroupLayout(datoscliente);
        datoscliente.setLayout(datosclienteLayout);
        datosclienteLayout.setHorizontalGroup(
            datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosclienteLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelApellidos)
                    .addComponent(jLabelTelefono))
                .addGap(29, 29, 29)
                .addGroup(datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldApe, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosclienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        datosclienteLayout.setVerticalGroup(
            datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        botones.setBackground(new java.awt.Color(255, 255, 255));

        jButtonContinuar.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jButtonContinuar.setForeground(new java.awt.Color(255, 153, 51));
        jButtonContinuar.setText("Confirmar");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(datosreserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datoscliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datoscliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonSiHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSiHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonSiHabActionPerformed

    private void jRadioButtonNoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNoHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNoHabActionPerformed

    private void jTextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomActionPerformed

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        //Envio de datos a capa lógica
        String nombre = jTextFieldNom.getText();
        String apellido = jTextFieldApe.getText();
        String telefono = jTextFieldTel.getText();
        String catering = (String) jComboBoxCatering.getSelectedItem();
        int jornadas = (int) jSpinnerJornadas.getValue();
        int assis = (int) jSpinnerAssis.getValue();
        Date fecha = jDateFecha.getDate();
        String fechaStr = new SimpleDateFormat("dd/MM/yyyy").format(fecha);
        
        //Validación datos        
        if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || catering.isEmpty() || fecha == null || (!buttoncongreso.isSelected() && !buttonpresentacion.isSelected() && !buttonjornada.isSelected())) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        //Validación tipo de evento.
        String evento = null;
            if(buttoncongreso.isSelected()){
                evento = "Congreso";
                // Si es congreso, validar habitaciones y jornadas
                boolean habValid = jRadioButtonSiHab.isSelected() || jRadioButtonNoHab.isSelected();
                if (!habValid) {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione si se requieren habitaciones.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else if(buttonpresentacion.isSelected()){
                evento = "Presentación";
            } else if(buttonjornada.isSelected()){
                evento = "Jornada";
            }
            
        //Mostrar los campos del congreso cuando se selecciona
        if(buttoncongreso.isSelected()){
            evento = "Congreso";
        }
        if(buttonpresentacion.isSelected()){
            evento = "Presentación";
        }
        if(buttonjornada.isSelected()){
            evento = "Jornada";
        }
        String hab;
        if (jRadioButtonSiHab.isSelected()) {
                hab = "Sí";
            } else {
                hab = "No";
            }
        
        // Comprobamos si hay conexión con la BD
        if (!ConexionBaseDeDatos.probarConexion()) {
        // Si la conexión falla, muestra un mensaje de error y se detiene
        JOptionPane.showMessageDialog(this, "No se puede conectar a la base de datos. Por favor, revise su conexión y vuelva a intentarlo.", "Error de Conexión", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        //Si tenemos conexión, continú a guardar la reserva
        control.guardar(nombre, apellido, telefono, catering, evento, jornadas, assis, fecha, hab);
        
        //Mensaje confirmación con resumen
        
        String resumen = 
                "Nombre: " + nombre + " " + apellido + "\n" +
                "Telefono: " + telefono + "\n" +
                "Fecha: " + fechaStr + "\n" +
                "Tipo de evento: " + evento + "\n" +
                "Número de Asistentes: " + assis + "\n";
        JOptionPane.showMessageDialog(this, resumen + " ", "Datos de la Reserva", JOptionPane.PLAIN_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextFieldNom.setText("");
        jTextFieldApe.setText("");
        jTextFieldTel.setText("");
        jComboBoxCatering.setSelectedIndex(0);
        buttonGrouphabs.clearSelection();
        buttongoupevento.clearSelection();
        jSpinnerJornadas.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1),Integer.valueOf(1), null, Integer.valueOf(1)));
        jSpinnerAssis.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(5),Integer.valueOf(5), null, Integer.valueOf(1)));
        jDateFecha.setDate(new Date());
        jLabelJornadas.setEnabled(false);
        jSpinnerJornadas.setEnabled(false);
        jLabelHabs.setEnabled(false);
        jRadioButtonSiHab.setEnabled(false);
        jRadioButtonNoHab.setEnabled(false);
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void buttoncongresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncongresoActionPerformed
           if (buttoncongreso.isSelected()) {
        jLabelJornadas.setEnabled(true);
        jSpinnerJornadas.setEnabled(true);
        jLabelHabs.setEnabled(true);
        jRadioButtonSiHab.setEnabled(true);
        jRadioButtonNoHab.setEnabled(true);
    }
    }//GEN-LAST:event_buttoncongresoActionPerformed

    private void buttonjornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonjornadaActionPerformed
        if (buttonjornada.isSelected()) {
        jLabelJornadas.setEnabled(false);
        jSpinnerJornadas.setEnabled(false);
        jLabelHabs.setEnabled(false);
        jRadioButtonSiHab.setEnabled(false);
        jRadioButtonNoHab.setEnabled(false);
        }
    }//GEN-LAST:event_buttonjornadaActionPerformed

    private void buttonpresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpresentacionActionPerformed
        if (buttonpresentacion.isSelected()) {
        jLabelJornadas.setEnabled(false);
        jSpinnerJornadas.setEnabled(false);
        jLabelHabs.setEnabled(false);
        jRadioButtonSiHab.setEnabled(false);
        jRadioButtonNoHab.setEnabled(false);
        }
    }//GEN-LAST:event_buttonpresentacionActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
                this.dispose();
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextFieldNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomKeyTyped

        char car = evt.getKeyChar();
    if (!((car >= 'a' && car <= 'z') || (car >= 'A' && car <= 'Z') || 
        car == KeyEvent.VK_BACK_SPACE || car == KeyEvent.VK_SPACE ||
        (car == 'á' || car == 'é' || car == 'í' || car == 'ó' || car == 'ú') ||
        (car == 'Á' || car == 'É' || car == 'Í' || car == 'Ó' || car == 'Ú') ||
        (car == 'ñ' || car == 'Ñ') || (car == 'ç' || car == 'Ç'))) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se admite texto.", 
                                      "Error de entrada", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_jTextFieldNomKeyTyped

    private void jTextFieldApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApeKeyTyped
                char car = evt.getKeyChar();
    if (!((car >= 'a' && car <= 'z') || (car >= 'A' && car <= 'Z') || 
        car == KeyEvent.VK_BACK_SPACE || car == KeyEvent.VK_SPACE ||
        (car == 'á' || car == 'é' || car == 'í' || car == 'ó' || car == 'ú') ||
        (car == 'Á' || car == 'É' || car == 'Í' || car == 'Ó' || car == 'Ú') ||
        (car == 'ñ' || car == 'Ñ') || (car == 'ç' || car == 'Ç'))) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se admite texto.", 
                                      "Error de entrada", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jTextFieldApeKeyTyped

    private void jTextFieldTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelKeyTyped
    char car = evt.getKeyChar();
    JTextField textField = (JTextField) evt.getSource();
    String text = textField.getText();

    // Comprobar si es un número
    if (!(car >= '0' && car <= '9')) {
        // Si no es un número y tampoco es una acción de borrado
        if (car != KeyEvent.VK_BACK_SPACE && car != KeyEvent.VK_DELETE) {
            evt.consume(); // Evitar que el caracter no numérico sea agregado
            JOptionPane.showMessageDialog(null, "Solo se admiten números", 
                                          "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    } else if (text.length() >= 9) {
        // Si ya se alcanzó el límite de números permitidos
        evt.consume();
    }
    }//GEN-LAST:event_jTextFieldTelKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.ButtonGroup buttonGrouphabs;
    private javax.swing.JRadioButton buttoncongreso;
    private javax.swing.ButtonGroup buttongoupevento;
    private javax.swing.JRadioButton buttonjornada;
    private javax.swing.JRadioButton buttonpresentacion;
    private javax.swing.JPanel datoscliente;
    private javax.swing.JPanel datosreserva;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxCatering;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelAssis;
    private javax.swing.JLabel jLabelCatering;
    private javax.swing.JLabel jLabelContacto;
    private javax.swing.JLabel jLabelEvento;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHabs;
    private javax.swing.JLabel jLabelJornadas;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelReserva;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanelAssis;
    private javax.swing.JPanel jPanelCalendario;
    private javax.swing.JPanel jPanelCatering;
    private javax.swing.JPanel jPanelEvento;
    private javax.swing.JPanel jPanelFecha;
    private javax.swing.JPanel jPanelHabs;
    private javax.swing.JPanel jPanelJornadas;
    private javax.swing.JRadioButton jRadioButtonNoHab;
    private javax.swing.JRadioButton jRadioButtonSiHab;
    private javax.swing.JSpinner jSpinnerAssis;
    private javax.swing.JSpinner jSpinnerJornadas;
    private javax.swing.JTextField jTextFieldApe;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
