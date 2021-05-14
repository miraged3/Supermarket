package cn.mirage.supermarket.repository;

import cn.mirage.supermarket.entity.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @NotNull Optional<User> findById(@NotNull Long id);

}
