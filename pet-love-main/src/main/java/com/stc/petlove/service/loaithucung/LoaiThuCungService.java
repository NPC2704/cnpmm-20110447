package com.stc.petlove.service.loaithucung;


import com.stc.petlove.dtos.loaithucung.LoaiThuCungDto;
import com.stc.petlove.entities.LoaiThuCung;
import com.stc.petlove.entities.LoaiThuCung;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

public interface LoaiThuCungService {
    Page<LoaiThuCung> filter(String search, int page, int size, String sort, String column);
    LoaiThuCung getLoaiThuCungByMaLoaiThuCung(String maLoaiThuCung);
    List<LoaiThuCung> getAllLoaiThuCung(String search);
    List<LoaiThuCung> finfAll();

    LoaiThuCung create(LoaiThuCungDto dto);

    LoaiThuCung update(String id, LoaiThuCungDto dto);


    LoaiThuCung changeStatus(String maLoaiThuCung);
}
