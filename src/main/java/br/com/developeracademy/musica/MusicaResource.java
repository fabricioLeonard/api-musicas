package br.com.developeracademy.musica;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/musicas")
public class MusicaResource {

    @Inject
    MusicaService service;

    List<Musica> musicas = new ArrayList<>();

    @DELETE
    @Path("/{id}")
    public Response delete(Long id) {
        Musica musicaExcluir = new Musica();
        for (Musica m : musicas) {
            if (m.getId() == id) {
                musicaExcluir = m;
                break;
            }
        }
        musicas.remove(musicaExcluir);
        return Response.status(200).entity("Música excluída com sucesso").build();
    }

    @PUT
    @Path("/{id}")
    public Response update(Long id, Musica musica) {

        for (Musica m : musicas) {
            if (m.getId() == id) {
                m.setNome(musica.getNome());
                m.setDuracao(musica.getDuracao());
            }
        }

        return Response.status(200).entity("Música atualizada com sucesso").build();
    }

    @POST
    public Response create(MusicaDTO musica) {
        service.create(musica);
        return Response.status(201).entity("Música inserida com sucesso").build();
    }

    @GET
    @Path("/{id}")
    public Response findById(Long id) {
        MusicaDTO dto = service.findById(id);
        return Response.ok().entity(dto).build();
    }

    //Exercicio 01:
    //Criar o método para recuperar uma música pelo ID.

}
