package com.stc.petlove.service.dichvu;

import com.stc.petlove.dtos.dichvu.DichVuDto;

import com.stc.petlove.entities.DichVu;
import com.stc.petlove.entities.embedded.GiaDichVu;
import org.springframework.data.domain.Page;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

public interface DichVuService {
    Page<DichVu> filter(String search, int page, int size, String sort, String column);
    DichVu getDichVuByMaDichVu(String maDichVu);
    List<DichVu> getAllDichVu(String search);
    List<DichVu> finfAll();
    DichVu addGiaDV(String maDichVu, GiaDichVu giaDichVu);
    DichVu create(DichVuDto dto, Principal principal);

    DichVu update(String id, DichVuDto dto, Principal principal);

    DichVu changeStatus(String maDichVu);
}
