package com.stc.petlove.service.User;

import com.stc.petlove.dtos.user.SigupDto;
import com.stc.petlove.dtos.user.UpdateUserDto;
import com.stc.petlove.entities.TaiKhoan;
import org.springframework.data.domain.Page;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

public interface UserService {

    Page<TaiKhoan> filter(String search,
                      int page, int size, String sort, String column);

    List<TaiKhoan> finAll();

    TaiKhoan getUser(String id);

    void deleteById(String id);
    TaiKhoan getUserByEmail(String email);

    TaiKhoan create(SigupDto dto, Principal principal);

    //TaiKhoan update(String id, UserDto dto, Principal principal);

    TaiKhoan update(String id, UpdateUserDto dto, Principal principal);

    TaiKhoan changeStatus(String id);
}
