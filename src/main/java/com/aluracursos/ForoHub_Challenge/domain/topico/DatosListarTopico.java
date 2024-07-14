package com.aluracursos.ForoHub_Challenge.domain.topico;

import com.aluracursos.ForoHub_Challenge.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DatosListarTopico(    Long id,
                                    String titulo,
                                    String mensaje,
                                    LocalDateTime fechaDeCreacion,
                                    Estado estado,
                                    String usuario,
                                    String nombreCurso) {

    public DatosListarTopico(Topico topico){
        this(topico.getId() ,topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getEstado(), topico.getUsuario().getNombre(), topico.getNombreCurso());
    }

}
