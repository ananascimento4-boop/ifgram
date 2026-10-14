package br.edu.ifpb.ifgram.repository;

import br.edu.ifpb.ifgram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    // o Spring Data implementa a partir do nome do metodo
    boolean existsByEmail(String email);


    Optional<User> findByEmail(String Email);

    List<User> findByNomeContainingIgnoreCase(String trecho);

    // quando o nome do metodo nao basta, JPQL ecplicito
     @Query ("select u from User u where u.email like concat('%' , :dominio)")
     List<User> doDominio(String dominio);

}
