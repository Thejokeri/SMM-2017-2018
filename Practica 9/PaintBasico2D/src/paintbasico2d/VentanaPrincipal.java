/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbasico2d;

import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.RescaleOp;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import sm.ftm.iu.Formas;

/**
 *
 * @author thejoker
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    private VentanaInterna vi;

    public VentanaPrincipal() {
        initComponents();

        this.setTitle("Paint Básico 2D");
        this.setSize(775, 650);
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
        menuRescaleOp = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        sliderBrillo = new javax.swing.JSlider();
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

        LabelStatus.setText("Barra de Estado");
        LabelStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(LabelStatus, java.awt.BorderLayout.PAGE_END);

        BarraHerramientasSup.setRollover(true);

        buttonGroupFiguras.add(ToggleButtonPuntos);
        ToggleButtonPuntos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        ToggleButtonPuntos.setSelected(true);
        ToggleButtonPuntos.setFocusable(false);
        ToggleButtonPuntos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToggleButtonPuntos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToggleButtonPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonPuntosActionPerformed(evt);
            }
        });
        BarraHerramientasSup.add(ToggleButtonPuntos);

        buttonGroupFiguras.add(ToggleButtonLinea);
        ToggleButtonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        ToggleButtonLinea.setFocusable(false);
        ToggleButtonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToggleButtonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToggleButtonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonLineaActionPerformed(evt);
            }
        });
        BarraHerramientasSup.add(ToggleButtonLinea);

        buttonGroupFiguras.add(ToggleButtonRect);
        ToggleButtonRect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        ToggleButtonRect.setFocusable(false);
        ToggleButtonRect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToggleButtonRect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToggleButtonRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonRectActionPerformed(evt);
            }
        });
        BarraHerramientasSup.add(ToggleButtonRect);

        buttonGroupFiguras.add(ToggleButtonElip);
        ToggleButtonElip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        ToggleButtonElip.setFocusable(false);
        ToggleButtonElip.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ToggleButtonElip.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToggleButtonElip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonElipActionPerformed(evt);
            }
        });
        BarraHerramientasSup.add(ToggleButtonElip);

        getContentPane().add(BarraHerramientasSup, java.awt.BorderLayout.PAGE_START);

        jPanel.setPreferredSize(new java.awt.Dimension(125, 75));
        jPanel.setLayout(new java.awt.BorderLayout());

        BarraHerramientasInf.setRollover(true);
        BarraHerramientasInf.setPreferredSize(new java.awt.Dimension(150, 100));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Color", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.setPreferredSize(new java.awt.Dimension(105, 80));

        ToggleButtonNegro.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupColores.add(ToggleButtonNegro);
        ToggleButtonNegro.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ToggleButtonNegro.setPreferredSize(new java.awt.Dimension(25, 20));
        ToggleButtonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonNegroActionPerformed(evt);
            }
        });
        jPanel1.add(ToggleButtonNegro);

        ToggleButtonRojo.setBackground(new java.awt.Color(255, 51, 51));
        buttonGroupColores.add(ToggleButtonRojo);
        ToggleButtonRojo.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ToggleButtonRojo.setPreferredSize(new java.awt.Dimension(25, 20));
        ToggleButtonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonRojoActionPerformed(evt);
            }
        });
        jPanel1.add(ToggleButtonRojo);

        ToggleButtonAzul.setBackground(new java.awt.Color(0, 51, 255));
        buttonGroupColores.add(ToggleButtonAzul);
        ToggleButtonAzul.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ToggleButtonAzul.setPreferredSize(new java.awt.Dimension(25, 20));
        ToggleButtonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonAzulActionPerformed(evt);
            }
        });
        jPanel1.add(ToggleButtonAzul);

        ToggleButtonBlanco.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupColores.add(ToggleButtonBlanco);
        ToggleButtonBlanco.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ToggleButtonBlanco.setPreferredSize(new java.awt.Dimension(25, 20));
        ToggleButtonBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonBlancoActionPerformed(evt);
            }
        });
        jPanel1.add(ToggleButtonBlanco);

        ToggleButtonAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroupColores.add(ToggleButtonAmarillo);
        ToggleButtonAmarillo.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ToggleButtonAmarillo.setPreferredSize(new java.awt.Dimension(25, 20));
        ToggleButtonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonAmarilloActionPerformed(evt);
            }
        });
        jPanel1.add(ToggleButtonAmarillo);

        ToggleButtonVerde.setBackground(new java.awt.Color(51, 255, 51));
        buttonGroupColores.add(ToggleButtonVerde);
        ToggleButtonVerde.setPreferredSize(new java.awt.Dimension(25, 20));
        ToggleButtonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonVerdeActionPerformed(evt);
            }
        });
        jPanel1.add(ToggleButtonVerde);

        BarraHerramientasInf.add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), "Grosor", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel2.setPreferredSize(new java.awt.Dimension(70, 80));

        SpinnerGrosor.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        SpinnerGrosor.setPreferredSize(new java.awt.Dimension(50, 26));
        SpinnerGrosor.setSize(new java.awt.Dimension(35, 26));
        SpinnerGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerGrosorStateChanged(evt);
            }
        });
        jPanel2.add(SpinnerGrosor);

        BarraHerramientasInf.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray), " ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel3.setPreferredSize(new java.awt.Dimension(234, 80));

        CheckBoxRelleno.setText("Relleno");
        CheckBoxRelleno.setMinimumSize(new java.awt.Dimension(130, 23));
        CheckBoxRelleno.setPreferredSize(new java.awt.Dimension(100, 20));
        CheckBoxRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxRellenoActionPerformed(evt);
            }
        });
        jPanel3.add(CheckBoxRelleno);

        CheckBoxTrans.setText("Transparencia");
        CheckBoxTrans.setPreferredSize(new java.awt.Dimension(110, 20));
        CheckBoxTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxTransActionPerformed(evt);
            }
        });
        jPanel3.add(CheckBoxTrans);

        CheckBoxAlisar.setText("Alisar");
        CheckBoxAlisar.setPreferredSize(new java.awt.Dimension(100, 20));
        CheckBoxAlisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxAlisarActionPerformed(evt);
            }
        });
        jPanel3.add(CheckBoxAlisar);

        CheckBoxEditar.setText("Editar");
        CheckBoxEditar.setPreferredSize(new java.awt.Dimension(110, 20));
        CheckBoxEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxEditarActionPerformed(evt);
            }
        });
        jPanel3.add(CheckBoxEditar);

        BarraHerramientasInf.add(jPanel3);

        menuRescaleOp.setText("Rescale");
        menuRescaleOp.setFocusable(false);
        menuRescaleOp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuRescaleOp.setPreferredSize(new java.awt.Dimension(55, 30));
        menuRescaleOp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuRescaleOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRescaleOpActionPerformed(evt);
            }
        });
        BarraHerramientasInf.add(menuRescaleOp);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(100, 27));
        BarraHerramientasInf.add(jComboBox1);

        sliderBrillo.setMaximum(255);
        sliderBrillo.setMinimum(-255);
        sliderBrillo.setValue(0);
        sliderBrillo.setPreferredSize(new java.awt.Dimension(100, 29));
        sliderBrillo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBrilloStateChanged(evt);
            }
        });
        sliderBrillo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sliderBrilloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sliderBrilloFocusLost(evt);
            }
        });
        BarraHerramientasInf.add(sliderBrillo);

        jPanel.add(BarraHerramientasInf, java.awt.BorderLayout.PAGE_END);

        Desktop.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel.add(Desktop, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel, java.awt.BorderLayout.CENTER);

        MenuArchivo.setText("Archivo");

        MenuItemNuevo.setText("Nuevo");
        MenuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevoActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuItemNuevo);

        MenuItemAbrir.setText("Abrir");
        MenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAbrirActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuItemAbrir);

        MenuItemGuardar.setText("Guardar");
        MenuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGuardarActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuItemGuardar);

        MenuBar.add(MenuArchivo);

        MenuEdicion.setText("Edición");

        CheckBoxMenuItemBarraEstado.setSelected(true);
        CheckBoxMenuItemBarraEstado.setText("Ver barra de estado");
        CheckBoxMenuItemBarraEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxMenuItemBarraEstadoActionPerformed(evt);
            }
        });
        MenuEdicion.add(CheckBoxMenuItemBarraEstado);

        CheckBoxMenuItemBarraForma.setSelected(true);
        CheckBoxMenuItemBarraForma.setText("Ver barra de formas");
        CheckBoxMenuItemBarraForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxMenuItemBarraFormaActionPerformed(evt);
            }
        });
        MenuEdicion.add(CheckBoxMenuItemBarraForma);

        CheckBoxMenuItemBarraAtrib.setSelected(true);
        CheckBoxMenuItemBarraAtrib.setText("Ver barra de atributos");
        CheckBoxMenuItemBarraAtrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxMenuItemBarraAtribActionPerformed(evt);
            }
        });
        MenuEdicion.add(CheckBoxMenuItemBarraAtrib);

        MenuBar.add(MenuEdicion);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public VentanaInterna getSelectedInternalWindow() {
        vi = (VentanaInterna) Desktop.getSelectedFrame();
        return vi;
    }

    private void MenuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevoActionPerformed
        VentanaInterna vi = new VentanaInterna(this);
        
        if(Desktop.getSelectedFrame() != null)
            vi.setLocation(Desktop.getSelectedFrame().getLocation().x + 10, Desktop.getSelectedFrame().getLocation().y + 10);
        
        Desktop.add(vi);
        vi.setVisible(true);
        
        BufferedImage img;
        img = new BufferedImage(300,300,BufferedImage.TYPE_INT_RGB);
        vi.getLienzo2DImagen().setImg(img);
    }//GEN-LAST:event_MenuItemNuevoActionPerformed

    private void MenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAbrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
        try{
            File f = dlg.getSelectedFile();
            BufferedImage img = ImageIO.read(f);
            VentanaInterna vi = new VentanaInterna(this);
            vi.getLienzo2DImagen().setImg(img);
            this.Desktop.add(vi);
            vi.setTitle(f.getName());
            vi.setVisible(true);
        }catch(Exception ex){
            System.err.println("Error al leer la imagen");
        }
}
    }//GEN-LAST:event_MenuItemAbrirActionPerformed

    private void MenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGuardarActionPerformed
        VentanaInterna vi=(VentanaInterna) Desktop.getSelectedFrame();
        
        if (vi != null) {
            JFileChooser dlg = new JFileChooser();
            int resp = dlg.showSaveDialog(this);
            if (resp == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedImage img = vi.getLienzo2DImagen().getImg(true);
                    if (img != null) {
                        File f = dlg.getSelectedFile();
                        ImageIO.write(img, "jpg", f);
                        vi.setTitle(f.getName());
                    }
                }catch (Exception ex) {
                    System.err.println("Error al guardar la imagen");
                }
            }
        }
    }//GEN-LAST:event_MenuItemGuardarActionPerformed

    private void CheckBoxMenuItemBarraEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxMenuItemBarraEstadoActionPerformed
        this.LabelStatus.setVisible(this.CheckBoxMenuItemBarraEstado.isSelected());
    }//GEN-LAST:event_CheckBoxMenuItemBarraEstadoActionPerformed

    private void CheckBoxMenuItemBarraFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxMenuItemBarraFormaActionPerformed
        this.BarraHerramientasSup.setVisible(this.CheckBoxMenuItemBarraForma.isSelected());
    }//GEN-LAST:event_CheckBoxMenuItemBarraFormaActionPerformed

    private void CheckBoxMenuItemBarraAtribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxMenuItemBarraAtribActionPerformed
        this.BarraHerramientasInf.setVisible(this.CheckBoxMenuItemBarraAtrib.isSelected());
    }//GEN-LAST:event_CheckBoxMenuItemBarraAtribActionPerformed

    private void ToggleButtonPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonPuntosActionPerformed
        this.LabelStatus.setText("Puntos");
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setForma(Formas.Punto);
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_ToggleButtonPuntosActionPerformed

    private void ToggleButtonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonLineaActionPerformed
        this.LabelStatus.setText("Línea");
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setForma(Formas.Linea);
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_ToggleButtonLineaActionPerformed

    private void ToggleButtonRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonRectActionPerformed
        this.LabelStatus.setText("Rectangulo");
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setForma(Formas.Rectangulo);
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_ToggleButtonRectActionPerformed

    private void ToggleButtonElipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonElipActionPerformed
        this.LabelStatus.setText("Elipse");
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setForma(Formas.Elipse);
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_ToggleButtonElipActionPerformed

    private void ToggleButtonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonNegroActionPerformed
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setColor(this.ToggleButtonNegro.getBackground());
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_ToggleButtonNegroActionPerformed

    private void ToggleButtonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonRojoActionPerformed
        if(this.getSelectedInternalWindow() != null){
           this.getSelectedInternalWindow().getLienzo2DImagen().setColor(this.ToggleButtonRojo.getBackground());
           this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_ToggleButtonRojoActionPerformed

    private void ToggleButtonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonAzulActionPerformed
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setColor(this.ToggleButtonAzul.getBackground());
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_ToggleButtonAzulActionPerformed

    private void ToggleButtonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonBlancoActionPerformed
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setColor(this.ToggleButtonBlanco.getBackground());
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_ToggleButtonBlancoActionPerformed

    private void ToggleButtonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonAmarilloActionPerformed
        if(this.getSelectedInternalWindow() != null){   
            this.getSelectedInternalWindow().getLienzo2DImagen().setColor(this.ToggleButtonAmarillo.getBackground());
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_ToggleButtonAmarilloActionPerformed

    private void ToggleButtonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonVerdeActionPerformed
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setColor(this.ToggleButtonVerde.getBackground());
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_ToggleButtonVerdeActionPerformed
        
    private void CheckBoxRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxRellenoActionPerformed
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setRelleno(CheckBoxRelleno.isSelected());
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_CheckBoxRellenoActionPerformed

    private void CheckBoxAlisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxAlisarActionPerformed
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setAlisar(CheckBoxAlisar.isSelected());
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_CheckBoxAlisarActionPerformed

    private void CheckBoxTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxTransActionPerformed
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setTransparencia(CheckBoxTrans.isSelected());
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_CheckBoxTransActionPerformed

    private void CheckBoxEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxEditarActionPerformed
        if(this.getSelectedInternalWindow() != null){
            this.getSelectedInternalWindow().getLienzo2DImagen().setEditar(CheckBoxEditar.isSelected());
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }    
    }//GEN-LAST:event_CheckBoxEditarActionPerformed

    private void SpinnerGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerGrosorStateChanged
        if(this.getSelectedInternalWindow() != null){
            int grosor = (int) this.SpinnerGrosor.getValue();
            this.getSelectedInternalWindow().getLienzo2DImagen().setStroke(grosor);
            this.getSelectedInternalWindow().getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_SpinnerGrosorStateChanged

    private void menuRescaleOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRescaleOpActionPerformed
        VentanaInterna vi = (VentanaInterna) (Desktop.getSelectedFrame());
        if (vi != null) {
            BufferedImage imgSource = vi.getLienzo2DImagen().getImg(false);
            if(imgSource!=null){
                try{
                    RescaleOp rop = new RescaleOp(1.0F, 100.0F, null);
                    BufferedImage imgdest = rop.filter(imgSource, null);
                    vi.getLienzo2DImagen().setImg(imgdest);
                    vi.getLienzo2DImagen().repaint();
                } catch(IllegalArgumentException e){
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_menuRescaleOpActionPerformed

    private void sliderBrilloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderBrilloFocusGained
        VentanaInterna vi = (VentanaInterna)(Desktop.getSelectedFrame());
        if(vi!=null){
            RescaleOp rop = new RescaleOp(1.0F, this.sliderBrillo.getValue(), null);
            ColorModel cm = vi.getLienzo2DImagen().getImg(false).getColorModel();
            WritableRaster raster = vi.getLienzo2DImagen().getImg(false).copyData(null);
            boolean alfaPre = vi.getLienzo2DImagen().getImg(false).isAlphaPremultiplied();
            imgSource = new BufferedImage(cm,raster,alfaPre,null);
            rop.filter(imgSource, vi.getLienzo2DImagen().getImg(false));
            
        }
    }//GEN-LAST:event_sliderBrilloFocusGained

    private void sliderBrilloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderBrilloFocusLost
        imgSource = null;
    }//GEN-LAST:event_sliderBrilloFocusLost

    private void sliderBrilloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBrilloStateChanged
        VentanaInterna vi = (VentanaInterna)(Desktop.getSelectedFrame());
        if(vi!=null){
            vi.getLienzo2DImagen().repaint();
        }
    }//GEN-LAST:event_sliderBrilloStateChanged

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraHerramientasInf;
    private javax.swing.JToolBar BarraHerramientasSup;
    protected javax.swing.JCheckBox CheckBoxAlisar;
    protected javax.swing.JCheckBox CheckBoxEditar;
    private javax.swing.JCheckBoxMenuItem CheckBoxMenuItemBarraAtrib;
    private javax.swing.JCheckBoxMenuItem CheckBoxMenuItemBarraEstado;
    private javax.swing.JCheckBoxMenuItem CheckBoxMenuItemBarraForma;
    protected javax.swing.JCheckBox CheckBoxRelleno;
    protected javax.swing.JCheckBox CheckBoxTrans;
    private javax.swing.JDesktopPane Desktop;
    protected javax.swing.JLabel LabelStatus;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuEdicion;
    private javax.swing.JMenuItem MenuItemAbrir;
    private javax.swing.JMenuItem MenuItemGuardar;
    private javax.swing.JMenuItem MenuItemNuevo;
    protected javax.swing.JSpinner SpinnerGrosor;
    protected javax.swing.JToggleButton ToggleButtonAmarillo;
    protected javax.swing.JToggleButton ToggleButtonAzul;
    protected javax.swing.JToggleButton ToggleButtonBlanco;
    protected javax.swing.JToggleButton ToggleButtonElip;
    protected javax.swing.JToggleButton ToggleButtonLinea;
    protected javax.swing.JToggleButton ToggleButtonNegro;
    protected javax.swing.JToggleButton ToggleButtonPuntos;
    protected javax.swing.JToggleButton ToggleButtonRect;
    protected javax.swing.JToggleButton ToggleButtonRojo;
    protected javax.swing.JToggleButton ToggleButtonVerde;
    private javax.swing.ButtonGroup buttonGroupColores;
    private javax.swing.ButtonGroup buttonGroupFiguras;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton menuRescaleOp;
    private javax.swing.JSlider sliderBrillo;
    // End of variables declaration//GEN-END:variables
    private BufferedImage imgSource = null;
}
