package Responsitories;

import DomainModels.QuanLy;
import View_Model.QuanLyViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public interface QuanLyResponsitory {

    List<QuanLyViewModel> getALL();

    int creat(QuanLy quanLy);

    int update(QuanLy quanLy, String MaQL);

    int delete(String MaQL);
}
