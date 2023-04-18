package com.stc.petlove.entities;

import com.stc.petlove.entities.embedded.GiaDichVu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: IntelliJ IDEA
 * User      : thangpx
 * Date      : 4/11/23
 * Time      : 9:35 PM
 * Filename  : DichVu
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "dich-vu")
public class DichVu {
    @Id
    private String id;

    // mã dịch vụ không được trùng
    private String maDichVu;


    private String tenDichVu;

    // nội dung là html
    private String noiDung;

    public DichVu(String maDichVu, String tenDichVu, String noiDung, List<GiaDichVu> giaDichVus, boolean trangThai) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.noiDung = noiDung;
        this.giaDichVus = giaDichVus;
        this.trangThai = trangThai;
    }

    // Giá dịch vụ phụ thuộc vào loại thú cưng và cân nặng của thú cưng
    private List<GiaDichVu> giaDichVus = new ArrayList<>();

    private boolean trangThai = true;



}
