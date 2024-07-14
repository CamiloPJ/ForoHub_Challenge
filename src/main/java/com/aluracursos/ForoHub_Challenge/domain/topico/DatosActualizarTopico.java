package com.aluracursos.ForoHub_Challenge.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull
                                    Long id,
                                    String mensaje,
                                    String nombreCurso,
                                    String titulo,
                                    Estado estado) {

}
