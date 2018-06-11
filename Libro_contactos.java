package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Libro_contactos {
    public JPanel panel1;
    public JButton btnModificar;
    private JPanel ToolBar;
    private JButton btnManual;
    private JButton btnAcerca;
    private JButton btnSalir;
    private JButton btnAgregar;
    private JPanel BtnsBar;
    private JButton btnEliminar;
    private JButton btnVer;
    public JFrame frameNuevoContacto;

    public Libro_contactos() {
        btnAcerca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent){
                JOptionPane.showMessageDialog(null, "Autor: Gerald Calvo Portilla.\nFecha de Creación: Del 30/06/2018 al 17/06/2018.\nNombre: Libro_contactos\nVersión: 1.0");
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Nuevo();
            }
        });
    }

    private void Nuevo() {

        frameNuevoContacto=new JFrame("Contacto Nuevo");
        frameNuevoContacto.setContentPane(new Nuevo_Contacto().pnlNuevo);
        frameNuevoContacto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameNuevoContacto.pack();
        frameNuevoContacto.setVisible(true);
    }
}
