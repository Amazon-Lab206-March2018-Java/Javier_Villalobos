package com.javier.loginandregistration.services;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.javier.loginandregistration.models.User;
import com.javier.loginandregistration.repositories.RoleRepository;
import com.javier.loginandregistration.repositories.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    public UserService(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder)     {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    
    public List <User> findAll(){
    	return (List<User>) userRepository.findAll();
    }
    
    // 1
    public void saveWithUserRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(roleRepository.findByName("ROLE_USER"));
        userRepository.save(user);
    }
     
     // 2 
    public void saveUserWithAdminRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
        userRepository.save(user);
    }
    
    public void makeAdmin(User user) {
        user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
        userRepository.save(user);
    }
    
    public void updateUser(User user) {
    	userRepository.save(user);
    }
    
    // 3
    public User findByUsername(String email) {
        return userRepository.findByEmail(email);
    }
    
    
    public void deleteUser(Long id) {
    	userRepository.deleteById(id);
    }
    
    public User findById(Long id) {
    	Optional< User> user= userRepository.findById(id);
        return user.get();
    }
    
    
}
