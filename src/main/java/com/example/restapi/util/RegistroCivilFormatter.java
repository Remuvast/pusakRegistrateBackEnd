package com.example.restapi.util;

import com.example.restapi.model.Campo;
import com.example.restapi.rc.FichaGeneral;
import com.example.restapi.rc.Institucion;
import com.example.restapi.rc.Registro;

import java.util.ArrayList;
import java.util.List;

public class RegistroCivilFormatter {

    public static List<Campo> extraerCampos(FichaGeneral fichaGeneral) {
        List<Campo> campos = new ArrayList<>();

        if (fichaGeneral != null && fichaGeneral.getInstituciones() != null) {
            for (Institucion institucion : fichaGeneral.getInstituciones()) {
                if (institucion != null && institucion.getDatosPrincipales() != null) {
                    for (Registro registro : institucion.getDatosPrincipales().getRegistros()) {
                        if (registro.getCampo() != null && registro.getValor() != null) {
                            campos.add(new Campo(registro.getCampo(), registro.getValor()));
                        }
                    }
                }
            }
        }

        return campos;
    }
}
