package com.example.userbackend.mapper;

import com.example.userbackend.dto.UserDto;
import com.example.userbackend.model.User;

//        private int id;
//        private String name;
//        private String email;
//        private String phone;
//        private String address;
//       private String avatar;
public class UserMapper {
    public static UserDto toUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setPhone(user.getPhone());
        userDto.setAddress(user.getAddress());
        userDto.setAvatar(user.getAvatar());


        return userDto;
    }
}
