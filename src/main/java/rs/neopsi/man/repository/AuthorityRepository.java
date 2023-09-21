package rs.neopsi.man.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.neopsi.man.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
