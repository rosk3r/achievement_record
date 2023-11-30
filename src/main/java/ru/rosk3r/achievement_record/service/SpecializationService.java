package ru.rosk3r.achievement_record.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rosk3r.achievement_record.model.entity.Specialization;
import ru.rosk3r.achievement_record.model.request.SpecializationRequest;
import ru.rosk3r.achievement_record.repository.SpecializationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SpecializationService {

    private final SpecializationRepository specializationRepository;

    public Specialization create(SpecializationRequest specializationRequest) {
        Specialization specialization = Specialization.builder()
                .name(specializationRequest.getName())
                .build();

        return specializationRepository.save(specialization);
    }

    public List<Specialization> readAll() {
        return specializationRepository.findAll();
    }

    public Specialization update(Specialization specialization) {
        return specializationRepository.save(specialization);
    }

    public void delete(Long id) {
        specializationRepository.deleteById(id);
    }

    public List<Specialization> getByName(String name) {
        return specializationRepository.getByNameLikeIgnoreCase(name);
    }

}
