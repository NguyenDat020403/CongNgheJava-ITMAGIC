package Responsitories;

import DomainModels.User;
import View_Model.UserViewModel;
import java.util.List;

/**
 *
 * @author admin xu li chuc nang, phuong thuc
 */
public interface UserResponsitory {

    List<UserViewModel> getALL();

    int creat(User user);

    int delete(String MaUser );

    int update(User user, String MaUser);
    
    
    User getOne(String FTK);
    List<UserViewModel> select(String Name);
    List<UserViewModel> SortName(String Nam1, String Nam2);
  
}
