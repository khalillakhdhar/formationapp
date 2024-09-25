package com.elitech.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.dto.UserDto;
import com.elitech.models.entities.User;

public class UserMapper {
private static final ModelMapper modelMapper=new ModelMapper();
public static UserDto convertToDTO(User user)
{
return modelMapper.map(user,UserDto.class);	
}
public static User convertToEntity(UserDto userDto)
{
return modelMapper.map(userDto, User.class);	
}
}
