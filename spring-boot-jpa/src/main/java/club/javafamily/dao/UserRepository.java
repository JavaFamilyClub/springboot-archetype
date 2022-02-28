package club.javafamily.dao;

import club.javafamily.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Jack Li
 */
public interface UserRepository extends JpaRepository<UserEntity, Long>,
   JpaSpecificationExecutor<UserEntity>
{
}
