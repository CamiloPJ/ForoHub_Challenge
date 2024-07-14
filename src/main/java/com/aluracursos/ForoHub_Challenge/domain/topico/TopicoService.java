package com.aluracursos.ForoHub_Challenge.domain.topico;

import com.aluracursos.ForoHub_Challenge.domain.usuario.Usuario;
import com.aluracursos.ForoHub_Challenge.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicoService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TopicoRepository topicoRepository;


    public Topico crearTopico(DatosCrearTopico datosRegistrarTopico){
        Usuario usuario = usuarioRepository.getReferenceById(datosRegistrarTopico.idUsuario());
        return topicoRepository.save(new Topico(datosRegistrarTopico, usuario));
    }

    public List<Topico> listarTopicos(){
        return topicoRepository.findAll();
    }

}
