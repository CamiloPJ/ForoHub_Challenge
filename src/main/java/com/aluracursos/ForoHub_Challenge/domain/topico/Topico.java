package com.aluracursos.ForoHub_Challenge.domain.topico;

import com.aluracursos.ForoHub_Challenge.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.net.UnknownServiceException;
import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private String titulo;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @JoinColumn(name = "nombre_curso")
    private String nombreCurso;
    @Enumerated(EnumType.STRING)
    private Estado estado = Estado.SIN_SOLUCION;
    private Boolean activo;

    public Topico(DatosCrearTopico datosCrearTopico, Usuario usuario) {
        this.activo = true;
        this.usuario = usuario;
        this.mensaje = datosCrearTopico.mensaje();
        this.nombreCurso = datosCrearTopico.nombreCurso();
        this.titulo = datosCrearTopico.titulo();
    }

        public void actualizarTopico(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.estado() != null){
            this.estado = datosActualizarTopico.estado();
        }
        if (datosActualizarTopico.nombreCurso() != null){
            this.nombreCurso = datosActualizarTopico.nombreCurso();
        }
    }

    public void desactivarTopico() {
        this.activo = false;
    }
}
