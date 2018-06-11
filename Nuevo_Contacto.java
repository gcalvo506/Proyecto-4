package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import static com.sun.javafx.fxml.expression.Expression.not;

public class Nuevo_Contacto {
    public JPanel pnlNuevo;
    private JLabel LblMovilNum;
    private JTextField EntMovilNum;
    private JPanel pnlTeléfonos;
    private JPanel pnlNombre;
    private JLabel LblTrabajoNum;
    private JTextField EntTrabajoNum;
    private JLabel LblNombre;
    private JTextField EntryNombre;
    private JLabel LblCasaNum;
    private JTextField EntCasaNum;
    private JLabel LblFax;
    private JTextField EntFaxNum;
    private JLabel LblOtro;
    private JLabel LblImagen;
    private JPanel pnlCorreos;
    private JLabel LblCorreo1;
    private JTextField EntCorreo1;
    private JLabel LblCorreo2;
    private JTextField EntCorreo2;
    private JLabel LblCorreo3;
    private JTextField EntCorreo3;
    private JPanel pnlDireccion;
    private JLabel LblDirCasa;
    private JTextField EntDirCasa;
    private JLabel LblDirTrabajo;
    private JTextField EntDirTrabajo;
    private JLabel LblCumple;
    private JPanel pnlFechas;
    private JTextField EntCumple;
    private JLabel LblMatrimonio;
    private JTextField EntMatrimonio;
    private JTextField EntTrabajo;
    private JLabel LblTrabajo;
    private JPanel pnlVarios;
    private JLabel LblFamilia;
    private JLabel LblProfesion;
    private JTextField EntFamilia;
    private JTextField EntProfesión;
    private JTextField EntNotas;
    private JLabel LblNotas;
    private JButton BtnGuardar;
    private JTextField EntOtro;
    private JLabel LblEstudio;
    private JTextField EntEstudio;
    private JButton Cancelar;
    public JFrame frameNuevoContacto;
    private Boolean Ind_Error;

    public Nuevo_Contacto() {
        BtnGuardar.addActionListener(new ActionListener() {
            Contactos objeto=new Contactos();
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Ind_Error=true;
                if (EntryNombre.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Debe escribir un nombre de contacto");
                    Ind_Error=false;
                }else{
                    objeto.Nombre_de_Contacto=EntryNombre.getText();
                }
                if (EntMovilNum.getText().isEmpty()==false){
                    try {
                        objeto.telefonoMovil = Integer.parseInt(EntMovilNum.getText());
                    }catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Teléfono Móvil inválido");
                        Ind_Error=false;
                    }
                }
                if (EntTrabajoNum.getText().isEmpty()==false) {
                    try {
                        objeto.telefonoTrabajo = Integer.parseInt(EntTrabajoNum.getText());
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "Teléfono Trabajo inválido");
                        Ind_Error=false;
                    }
                }
                if (EntFaxNum.getText().isEmpty()==false) {
                    try {
                        objeto.telefonoFax = Integer.parseInt(EntFaxNum.getText());
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "Teléfono Fax inválido");
                        Ind_Error=false;
                    }
                }
                if (EntCasaNum.getText().isEmpty()==false) {
                    try {
                        objeto.telefonoCasa = Integer.parseInt(EntCasaNum.getText());
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "Teléfono Casa inválido");
                        Ind_Error=false;
                    }
                }
                if (EntOtro.getText().isEmpty()==false) {
                    try {
                        objeto.telefonoOtro = Integer.parseInt(EntOtro.getText());
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "Teléfono Otro inválido");
                        Ind_Error=false;
                    }
                }
                String correo = EntCorreo1.getText();
                if(!(correo.isEmpty())){
                    if(correo.indexOf("@")==-1){
                        JOptionPane.showMessageDialog(null, "Correo 1 inválido");
                        Ind_Error=false;
                    }else{
                        objeto.correo1=correo;
                    }
                }
                correo=EntCorreo2.getText();
                if(!(correo.isEmpty())){
                    if(correo.indexOf("@")==-1){
                        JOptionPane.showMessageDialog(null, "Correo 2 inválido");
                        Ind_Error=false;
                    }else{
                        objeto.correo2=correo;
                    }
                }
                correo=EntCorreo3.getText();
                if(!(correo.isEmpty())){
                    if(correo.indexOf("@")==-1){
                        JOptionPane.showMessageDialog(null, "Correo 3 inválido");
                        Ind_Error=false;
                    }else{
                        objeto.correo3=correo;
                    }
                }
                objeto.direccionCasa=EntDirCasa.getText();
                objeto.direccionTrabajo=EntDirTrabajo.getText();
                objeto.lugarEstudio=EntEstudio.getText();
                objeto.Profesion=EntProfesión.getText();
                objeto.FechaTrabajo=EntTrabajo.getText();
                objeto.FechaMatrimonio=EntMatrimonio.getText();
                objeto.FechaCumple=EntCumple.getText();
                objeto.notas=EntNotas.getText();
                objeto.familia=EntFamilia.getText();
                if (Ind_Error) {
                    Json(objeto);
                }
            }
        });
        Cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frameNuevoContacto.dispose();
            }
        });
    }
    public static void Json(Contactos contacto) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("c:\\contactos.json"), contacto);
            System.out.print("Exitoso");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
