package kr.ac.knu.knutechtalkarenaserver.domain.event;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventJpaRepository extends JpaRepository<EventJpaEntity, Long> {

    boolean existsByTitle(String title);
}
