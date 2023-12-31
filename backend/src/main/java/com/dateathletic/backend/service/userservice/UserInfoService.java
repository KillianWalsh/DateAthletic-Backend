package com.dateathletic.backend.service.userservice;

import com.dateathletic.backend.domain.User;
import com.dateathletic.backend.domain.UserInfo;
import com.dateathletic.backend.repo.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserInfoService {
    private final UserInfoRepository userInfoRepository;

    public Optional<UserInfo> getUserByFirstname(String firstname){
        return userInfoRepository.findUserByFirstname(firstname);
    }

    public Optional<UserInfo> getUserByLastname(String lastname){
        return userInfoRepository.findUserByLastname(lastname);
    }

    public String getUserByInterests(String interests){
        return userInfoRepository.findUserByInterests(interests);
    }

    public String getUserByDoB(String doB){
        return userInfoRepository.findUserByDoB(doB);
    }

    public List<Optional<User>> getUserByGender(String genderPreference){
        return userInfoRepository.findUserByGender(genderPreference);
    }

    public String getUserByCity(String city){
        return userInfoRepository.findUserByCity(city);
    }

}
