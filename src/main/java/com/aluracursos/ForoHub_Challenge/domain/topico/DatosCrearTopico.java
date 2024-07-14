package com.aluracursos.ForoHub_Challenge.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DatosCrearTopico(@NotNull
                               Long idUsuario,
                               @NotBlank
                               String mensaje,
                               @NotBlank
                               String nombreCurso,
                               @NotBlank
                               String titulo) {
}
