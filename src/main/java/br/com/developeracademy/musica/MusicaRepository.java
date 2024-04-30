package br.com.developeracademy.musica;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MusicaRepository implements PanacheRepositoryBase<Musica, Long> {
}
