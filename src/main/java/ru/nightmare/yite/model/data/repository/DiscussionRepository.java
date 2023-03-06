package ru.nightmare.yite.model.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nightmare.yite.model.data.entity.Discussion;

import java.util.UUID;
@Repository
public interface DiscussionRepository extends JpaRepository<Discussion, UUID> {
}