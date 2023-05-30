package com.Cibertec.CL2_DAWII_PazFalcon.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseAl {
    private boolean respuesta;
    private String mensaje;
}
