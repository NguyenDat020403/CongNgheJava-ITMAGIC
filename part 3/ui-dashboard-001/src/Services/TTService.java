package Services;

import DomainModels.ThongTinTraCuu;
import View_Model.TTViewModel;
import java.util.List;

public interface TTService {

    List<TTViewModel> getALL();

    List<TTViewModel> select(String Email, String Name);

    int creat(ThongTinTraCuu tt);

}
