package techmaster.demo.service;

import techmaster.demo.model.Employee;
import java.util.List;
public interface EmployeeService {
     List<Employee> findAll();

    void save(Employee employee);

    Employee findById(int id);

    void update(int id, Employee product);

    void remove(int id);
}
