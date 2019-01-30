package calllog.webservices.calllog_ws.detail_editpage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import javax.management.loading.ClassLoaderRepository;
@Service
public class Detail_Editpage_Service {
    private Detail_Editpage_Repository detail_editpage_Repository;

    @Autowired
    public Detail_Editpage_Service(Detail_Editpage_Repository repository) {
        this.detail_editpage_Repository = repository;
    }
  /*  public List<Detail_Editpage> retrieveHomePage(String payunit) { 
        return (List<Detail_Editpage>) detail_editpage_Repository.findHead_Editpage(payunit);


          public Customer createCustomer(Customer customer) {
        customer.setId(null);
        return customerRepository.save(customer);
    }
    }*/
    public Detail_Editpage createDetailEditpage(Detail_Editpage detail) {
      //  detail.setId(null);
        return detail_editpage_Repository.save(detail);
    }
}