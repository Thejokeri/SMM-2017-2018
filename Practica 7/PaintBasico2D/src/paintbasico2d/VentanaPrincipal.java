/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbasico2d;

/**
 *
 * @author thejoker
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
        this.setTitle("Paint Básico 2D");
        this.setSize(625, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupColores = new javax.swing.ButtonGroup();
        buttonGroupFiguras = new javax.swing.ButtonGroup();
        LabelStatus = new javax.swing.JLabel();
        BarraHerramientasSup = new javax.swing.JToolBar();
        ToggleButtonPuntos = new javax.swing.JToggleButton();
        ToggleButtonLinea = new javax.swing.JToggleButton();
        ToggleButtonRect = new javax.swing.JToggleButton();
        ToggleButtonElip = new javax.swing.JToggleButton();
        jPanel = new javax.swing.JPanel();
        BarraHerramientasInf = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        ToggleButtonNegro = new javax.swing.JToggleButton();
        ToggleButtonRojo = new javax.swing.JToggleButton();
        ToggleButtonAzul = new javax.swing.JToggleButton();
        ToggleButtonBlanco = new javax.swing.JToggleButton();
        ToggleButtonAmarillo = new javax.swing.JToggleButton();
        ToggleButtonVerde = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        SpinnerGrosor = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        CheckBoxRelleno = new javax.swing.JCheckBox();
        CheckBoxTrans = new javax.swing.JCheckBox();
        CheckBoxAlisar = new javax.swing.JCheckBox();
        CheckBoxEditar = new javax.swing.JCheckBox();
        Desktop = new javax.swing.JDesktopPane();
        MenuBar = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        MenuItemNuevo = new javax.swing.JMenuItem();
        MenuItemAbrir = new javax.swing.JMenuItem();
        MenuItemGuardar = new javax.swing.JMenuItem();
        MenuEdicion = new javax.swing.JMenu();
        CheckBoxMenuItemBarraEstado = new javax.swing.JCheckBoxMenuItem();
        CheckBoxMenuItemBarraForma = new javax.swing.JCheckBoxMenuItem();
        CheckBoxMenuItemBarraAtrib = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelStatus.setText("Puntos");
        LabelStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(LabelStatus, java.awt.BorderLayout.PAGE_END);

        BarraHerramientasSup.setRollover(true);

        buttonGroupFiguras.add(ToggleButtonPuntos);
        ToggleButtonPuntos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        ToggleButtonPuntos.setFocusable(false);
        ToggleButtonPuntos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToggleButtonPuntos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientasSup.add(ToggleButtonPuntos);

        buttonGroupFiguras.add(ToggleButtonLinea);
        ToggleButtonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        ToggleButtonLinea.setFocusable(false);
        ToggleButtonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToggleButtonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientasSup.add(ToggleButtonLinea);

        buttonGroupFiguras.add(ToggleButtonRect);
        ToggleButtonRect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        ToggleButtonRect.setFocusable(false);
        ToggleButtonRect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToggleButtonRect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientasSup.add(ToggleButtonRect);

        buttonGroupFiguras.add(ToggleButtonElip);
        ToggleButtonElip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        ToggleButtonElip.setFocusable(false);
        ToggleButtonElip.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToggleButtonElip.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientasSup.add(ToggleButtonElip);

        getContentPane().add(BarraHerramientasSup, java.awt.BorderLayout.PAGE_START);

        jPanel.setPreferredSize(new java.awt.Dimension(125, 75));
        jPanel.setLayout(new java.awt.BorderLayout());

        BarraHerramientasInf.setRollover(true);
        BarraHerramientasInf.setPreferredSize(new java.awt.Dimension(125, 100));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Color", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.setBounds(new java.awt.Rectangle(0, 0, 10, 10));
        jPanel1.setPreferredSize(new java.awt.Dimension(105, 80));

        ToggleButtonNegro.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupColores.add(ToggleButtonNegro);
        ToggleButtonNegro.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ToggleButtonNegro.setPreferredSize(new java.awt.Dimension(25, 20));
        jPanel1.add(ToggleButtonNegro);

        ToggleButtonRojo.setBackground(new java.awt.Color(255, 51, 51));
        buttonGroupColores.add(ToggleButtonRojo);
        ToggleButtonRojo.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ToggleButtonRojo.setPreferredSize(new java.awt.Dimension(25, 20));
        jPanel1.add(ToggleButtonRojo);

        ToggleButtonAzul.setBackground(new java.awt.Color(0, 51, 255));
        buttonGroupColores.add(ToggleButtonAzul);
        ToggleButtonAzul.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ToggleButtonAzul.setPreferredSize(new java.awt.Dimension(25, 20));
        jPanel1.add(ToggleButtonAzul);

        ToggleButtonBlanco.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColores.add(ToggleButtonBlanco);
        ToggleButtonBlanco.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ToggleButtonBlanco.setPreferredSize(new java.awt.Dimension(25, 20));
        jPanel1.add(ToggleButtonBlanco);

        ToggleButtonAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroupColores.add(ToggleButtonAmarillo);
        ToggleButtonAmarillo.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ToggleButtonAmarillo.setPreferredSize(new java.awt.Dimension(25, 20));
        jPanel1.add(ToggleButtonAmarillo);

        ToggleButtonVerde.setBackground(new java.awt.Color(51, 255, 51));
        buttonGroupColores.add(ToggleButtonVerde);
        ToggleButtonVerde.setPreferredSize(new java.awt.Dimension(25, 20));
        jPanel1.add(ToggleButtonVerde);

        BarraHerramientasInf.add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Grosor", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel2.setPreferredSize(new java.awt.Dimension(60, 80));

        SpinnerGrosor.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        jPanel2.add(SpinnerGrosor);

        BarraHerramientasInf.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), " ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel3.setPreferredSize(new java.awt.Dimension(234, 80));

        CheckBoxRelleno.setText("Relleno");
        CheckBoxRelleno.setMinimumSize(new java.awt.Dimension(130, 23));
        CheckBoxRelleno.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel3.add(CheckBoxRelleno);

        CheckBoxTrans.setText("Transparencia");
        CheckBoxTrans.setPreferredSize(new java.awt.Dimension(110, 20));
        jPanel3.add(CheckBoxTrans);

        CheckBoxAlisar.setText("Alisar");
        CheckBoxAlisar.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel3.add(CheckBoxAlisar);

        CheckBoxEditar.setText("Editar");
        CheckBoxEditar.setPreferredSize(new java.awt.Dimension(110, 20));
        jPanel3.add(CheckBoxEditar);

        BarraHerramientasInf.add(jPanel3);

        jPanel.add(BarraHerramientasInf, java.awt.BorderLayout.PAGE_END);

        Desktop.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel.add(Desktop, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel, java.awt.BorderLayout.CENTER);

        MenuArchivo.setText("Archivo");

        MenuItemNuevo.setText("Nuevo");
        MenuArchivo.add(MenuItemNuevo);

        MenuItemAbrir.setText("Abrir");
        MenuArchivo.add(MenuItemAbrir);

        MenuItemGuardar.setText("Guardar");
        MenuArchivo.add(MenuItemGuardar);

        MenuBar.add(MenuArchivo);

        MenuEdicion.setText("Edición");

        CheckBoxMenuItemBarraEstado.setSelected(true);
        CheckBoxMenuItemBarraEstado.setText("Ver barra de estado");
        MenuEdicion.add(CheckBoxMenuItemBarraEstado);

        CheckBoxMenuItemBarraForma.setSelected(true);
        CheckBoxMenuItemBarraForma.setText("Ver barra de formas");
        MenuEdicion.add(CheckBoxMenuItemBarraForma);

        CheckBoxMenuItemBarraAtrib.setSelected(true);
        CheckBoxMenuItemBarraAtrib.setText("Ver barra de atributos");
        MenuEdicion.add(CheckBoxMenuItemBarraAtrib);

        MenuBar.add(MenuEdicion);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraHerramientasInf;
    private javax.swing.JToolBar BarraHerramientasSup;
    private javax.swing.JCheckBox CheckBoxAlisar;
    private javax.swing.JCheckBox CheckBoxEditar;
    private javax.swing.JCheckBoxMenuItem CheckBoxMenuItemBarraAtrib;
    private javax.swing.JCheckBoxMenuItem CheckBoxMenuItemBarraEstado;
    private javax.swing.JCheckBoxMenuItem CheckBoxMenuItemBarraForma;
    private javax.swing.JCheckBox CheckBoxRelleno;
    private javax.swing.JCheckBox CheckBoxTrans;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JLabel LabelStatus;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuEdicion;
    private javax.swing.JMenuItem MenuItemAbrir;
    private javax.swing.JMenuItem MenuItemGuardar;
    private javax.swing.JMenuItem MenuItemNuevo;
    private javax.swing.JSpinner SpinnerGrosor;
    private javax.swing.JToggleButton ToggleButtonAmarillo;
    private javax.swing.JToggleButton ToggleButtonAzul;
    private javax.swing.JToggleButton ToggleButtonBlanco;
    private javax.swing.JToggleButton ToggleButtonElip;
    private javax.swing.JToggleButton ToggleButtonLinea;
    private javax.swing.JToggleButton ToggleButtonNegro;
    private javax.swing.JToggleButton ToggleButtonPuntos;
    private javax.swing.JToggleButton ToggleButtonRect;
    private javax.swing.JToggleButton ToggleButtonRojo;
    private javax.swing.JToggleButton ToggleButtonVerde;
    private javax.swing.ButtonGroup buttonGroupColores;
    private javax.swing.ButtonGroup buttonGroupFiguras;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
