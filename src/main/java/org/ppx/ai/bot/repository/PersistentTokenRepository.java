package org.ppx.ai.bot.repository;

import java.time.LocalDate;
import java.util.List;
import org.ppx.ai.bot.domain.PersistentToken;
import org.ppx.ai.bot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link PersistentToken} entity.
 */
public interface PersistentTokenRepository extends JpaRepository<PersistentToken, String> {
    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);
}
