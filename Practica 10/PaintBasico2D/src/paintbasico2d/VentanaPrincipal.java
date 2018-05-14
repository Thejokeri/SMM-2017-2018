/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbasico2d;

import java.awt.BasicStroke;
import java.awt.List;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ByteLookupTable;
import java.awt.image.ColorModel;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;
import java.awt.image.RescaleOp;
import java.awt.image.WritableRaster;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import sm.ftm.iu.Formas;
import sm.ftm.image.imageUtility;
import sm.image.LookupTableProducer;

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator3 = new javax.swing.JToolBar.Separator();
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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelStatus.setText("Barra de Estado");
        LabelStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(LabelStatus, java.awt.BorderLayout.PAGE_END);

        BarraHerramientasSup.setRollover(true);

        jButton1.setText("jButton1");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientasSup.add(jButton1);

        jButton2.setText("jButton2");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientasSup.add(jButton2);

        jButton3.setText("jButton3");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientasSup.add(jButton3);
        BarraHerramientasSup.add(jSeparator1);

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientasSup.add(jToggleButton1);

        jToggleButton2.setText("jToggleButton2");
        jToggleButton2.setFocusable(false);
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientasSup.add(jToggleButton2);

        jToggleButton3.setText("jToggleButton3");
        jToggleButton3.setFocusable(false);
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientasSup.add(jToggleButton3);

        jToggleButton4.setText("jToggleButton4");
        jToggleButton4.setFocusable(false);
        jToggleButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraHerramientasSup.add(jToggleButton4);
        BarraHerramientasSup.add(jSeparator2);
        BarraHerramientasSup.add(jSeparator3);

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

        jMenu1.setText("Imagen");

        jMenuItem1.setText("LookUp op");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Affine op");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        MenuBar.add(jMenu1);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaInterna vi = (VentanaInterna) (Desktop.getSelectedFrame());
        if (vi != null) {
            BufferedImage imgSource = vi.getLienzo2DImagen().getImg();
            if(imgSource!=null){
                try{
                    LookupTable lt = this.seno(180.0/255.0);
                    LookupOp lop = new LookupOp(lt, null);
                    // Imagen origen y destino iguales
                    lop.filter( imgSource , imgSource);
                    vi.repaint();
                } catch(Exception e){
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VentanaInterna vi = (VentanaInterna) (Desktop.getSelectedFrame());
        if (vi != null) {
            BufferedImage imgSource = vi.getLienzo2DImagen().getImg();
            if(imgSource!=null){
                try{
                    double r = Math.toRadians(180);
                    Point p = new Point(imgSource.getWidth()/2, imgSource.getHeight()/2);
                    AffineTransform at = AffineTransform.getRotateInstance(r,p.x,p.y);
                    AffineTransformOp atop;
                    atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
                    BufferedImage imgdest = atop.filter(imgSource, null);
                    vi.getLienzo2DImagen().setImg(imgdest);
                    vi.repaint();
                } catch(Exception e){
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed
 
    private LookupTable seno(double w)
        {
        double K = 255.0; // Cte de normalización
        // Código implementado f(x)=|sin(wx)|

        byte[] lt = new byte[256];
        for (int i = 0; i < 256; ++i)
            lt[i] = (byte)Math.abs(K / Math.sin( w * i ));

        ByteLookupTable slt = new ByteLookupTable(0, lt);
        return slt;
    }
    
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
    protected javax.swing.JToggleButton ToggleButtonNegro;
    protected javax.swing.JToggleButton ToggleButtonRojo;
    protected javax.swing.JToggleButton ToggleButtonVerde;
    private javax.swing.ButtonGroup buttonGroupColores;
    private javax.swing.ButtonGroup buttonGroupFiguras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
    private BufferedImage imgSource = null;
}