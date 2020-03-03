package crm.mapper;

import crm.model.Customer;
import crm.model.CustomerDto;

public interface CustomerDTOImpl {
public Customer customerDtoToCustomer(CustomerDto dto);
public CustomerDto customerToCustomerDto(Customer customer);
}
