package ru.rosk3r.achievement_record.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rosk3r.achievement_record.model.entity.Achievement;

@Repository
public interface AchievementRepository extends JpaRepository<Achievement, Long> {



}
