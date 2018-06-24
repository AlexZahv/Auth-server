package com.zahv.alex.buisiness.service;

import com.zahv.alex.buisiness.persistance.repository.UserRepository;
import com.zahv.alex.buisiness.persistance.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@Component
public class UserService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = this.userRepository.findByEmail(username);

    if (user == null) throw new UsernameNotFoundException(String.format("No user found with username '%s'", username));
    return user;
  }
}
