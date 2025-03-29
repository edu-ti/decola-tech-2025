package br.com.decolatech.decola_tech_2025.repository;


import br.com.decolatech.decola_tech_2025.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
