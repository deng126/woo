package ptit.woo.service;

import ptit.woo.model.NguoiDung;
public interface NguoiDungService {
    NguoiDung loadNguoiDungByUsername(String username);
    NguoiDung findAllNguoiDung();
    boolean deleteNguoiDungById(Long id);
    void editNguoiDungById(Long id);
}
