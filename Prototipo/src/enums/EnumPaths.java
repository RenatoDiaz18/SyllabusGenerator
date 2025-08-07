/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author USUARIO
 */
public enum EnumPaths {
    ICON("/img/Icon_Ventana.png"),
    ICON_ALERT("/img/Icons/Icon_AtencionVentana.png"),
    ICON_PERFIL_MAN("/img/Icons/Icon_Perfil_Man.png"),
    ICON_PERFIL_WOMAN("/img/Icons/Icon_Perfil_Woman.png"),
    ICON_ERROR("/img/Icons/Icon_Error.png"),
    ICON_CONFIRM("/img/Icons/Icon_Confirmar.png"),
    DATA_DOCENTES("src/Data/Usuarios/DataDocentes.txt");

    private final String ruta;

    EnumPaths(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }
}
