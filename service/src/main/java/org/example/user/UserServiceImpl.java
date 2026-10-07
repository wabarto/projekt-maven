package org.example.user;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public UserDto findById(Long id) {
        // return userRepository.findById(id);
        return null;
    }
}
