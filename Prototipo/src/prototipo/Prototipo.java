/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototipo;

import static Data.Data.*;

import Gestion.JFInicioSesion;
import Gestion.JFRegister;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Prototipo {

    private static final Dimension TAMAÑOPANTALLA = Toolkit.getDefaultToolkit().getScreenSize();
    public static int posicionInicialX = (TAMAÑOPANTALLA.width - 857) / 2;
    public static int posicionInicialY = (TAMAÑOPANTALLA.height - 500) / 2;

    public static void main(String[] args) {
        cargarDataDocentes();
        login();
    }
    
    

    public static void login() {
        JFrame frmLogin = JFInicioSesion.crear();
        frmLogin.setLocation(posicionInicialX, posicionInicialY);
        frmLogin.setVisible(true);
    }

    public static void mostrarVentanaGenerador() {
        JFGenerador frm = new JFGenerador();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        //frm.setDocenteNombre(docenteLogged.getUserName());
    }
    
    public static void Register() {
        JFrame frmRegistrar = JFRegister.crear();
        frmRegistrar.setLocation(posicionInicialX, posicionInicialY);
        frmRegistrar.setVisible(true);
    }
}
