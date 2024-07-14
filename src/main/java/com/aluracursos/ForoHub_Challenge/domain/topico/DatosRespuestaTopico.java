package com.aluracursos.ForoHub_Challenge.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosRespuestaTopico(Long id,
                                   String mensaje,
                                   String nombreCurso,
                                   String titulo,
                                   Estado estado) {
}
