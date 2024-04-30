package br.com.developeracademy.musica;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MusicaService {
    @Inject
    MusicaRepository repository;

    @Transactional
    public void create(MusicaDTO dto){
        Musica entity = new Musica();
        entity.setNome(dto.getNome());
        entity.setDuracao(dto.getDuracao());
        repository.persist(entity);
    }

    public MusicaDTO findById(Long id) {
        Musica entity = repository.findById(id);
        MusicaDTO dto = new MusicaDTO();
        dto.setNome(entity.getNome());
        dto.setDuracao(entity.getDuracao());
        return dto;
    }
}
