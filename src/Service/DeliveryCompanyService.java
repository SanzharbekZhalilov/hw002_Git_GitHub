package Service;

import entities.DeliveryCompany;

import java.util.List;

public class DeliveryCompanyService {

    List<DeliveryCompany> deliveryCompanies;

    public DeliveryCompanyService(List<DeliveryCompany> deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    public void acceptOrder() {

    }

    @Override
    public String toString() {
        return "DeliveryCompanyService{" +
                "deliveryCompanies=" + deliveryCompanies +
                '}';
    }
}
