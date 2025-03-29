package br.com.decolatech.decola_tech_2025.service;

import br.com.decolatech.decola_tech_2025.model.User;

public interface UserService {

    User findById(long id);

    User create(User userToCreate);
}
