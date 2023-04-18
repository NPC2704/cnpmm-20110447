package com.stc.petlove.dtos.dichvu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: IntelliJ IDEA
 * User      : thangpx
 * Date      : 3/15/23
 * Time      : 9:07 AM
 * Filename  : UserDto
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DichVuDto {
    private String maDichVu;

    private String tenDichVu;

    private String noiDung;

    //private List<String> giaDichVus = new ArrayList<>();
}
