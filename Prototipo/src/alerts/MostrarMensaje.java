/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alerts;

import enums.EnumPaths;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class MostrarMensaje {
    public static void error(String message){
        JOptionPane.showMessageDialog(null,
                message,
                "Ha ocurrido un error",
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(MostrarMensaje.class.getResource(EnumPaths.ICON_ERROR.getRuta()))
        );
    }
    
    public static void confirm(String message){
        JOptionPane.showMessageDialog(null,
                message,
                "Proceso completado",
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(MostrarMensaje.class.getResource(EnumPaths.ICON_CONFIRM.getRuta()))
        );
    }
    
    public static void alert(String message){
        JOptionPane.showMessageDialog(null,
                message,
                "Advertencia",
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(MostrarMensaje.class.getResource(EnumPaths.ICON_ALERT.getRuta()))
        );
    }
}
