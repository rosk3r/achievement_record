package ru.rosk3r.achievement_record.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rosk3r.achievement_record.model.entity.Group;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

    List<Group> getByNameLikeIgnoreCase(String name);

    List<Group> getByCourse(int course);

}
