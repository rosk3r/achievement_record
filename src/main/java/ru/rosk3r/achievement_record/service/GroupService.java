package ru.rosk3r.achievement_record.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rosk3r.achievement_record.model.entity.Group;
import ru.rosk3r.achievement_record.model.request.GroupRequest;
import ru.rosk3r.achievement_record.repository.GroupRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;

    public Group create(GroupRequest groupRequest) {
        Group group = Group.builder()
                .specializationId(groupRequest.getSpecializationId())
                .name(groupRequest.getName())
                .course(groupRequest.getCourse())
                .build();

        return groupRepository.save(group);
    }

    public List<Group> readAll() {
        return groupRepository.findAll();
    }

    public Group update(Group group) {
        return groupRepository.save(group);
    }

    public void delete(Long id) {
        groupRepository.deleteById(id);
    }

}
