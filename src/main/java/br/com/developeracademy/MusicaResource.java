package br.com.developeracademy;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/musicas")
public class MusicaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response find() {
        Musica musicaA = new Musica();
        musicaA.setId(1L);
        musicaA.setNome("Fabrício Leonard");
        musicaA.setDuracao(1.70);

        Musica musicaB = new Musica();
        musicaB.setId(2L);
        musicaB.setNome("Isadora Brom");
        musicaB.setDuracao(1.70);

        List<Musica> musicas = new ArrayList<>();

        musicas.add(musicaA);
        musicas.add(musicaB);

        return Response.ok().entity(musicas).build();
    }
}
