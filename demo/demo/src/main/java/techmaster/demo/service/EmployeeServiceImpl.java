//package techmaster.demo.service;
//import techmaster.demo.model.Employee;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//public class EmployeeServiceImpl implements EmployeeService {
//    private static Map<Integer, Employee> employee;
//
//    static {
//        employee = new HashMap<>();
//        employee.put(1, new Employee(1, "A", "A@gmail.com", "IT"));
//        employee.put(1, new Employee(1, "A", "A@gmail.com", "IT"));
//        employee.put(1, new Employee(1, "A", "A@gmail.com", "IT"));
//        employee.put(1, new Employee(1, "A", "A@gmail.com", "IT"));
//        employee.put(1, new Employee(1, "A", "A@gmail.com", "IT"));
//
//    }
//
//    @Override
//    public List<Employee> findAll() {
//        return new ArrayList<>(employee.values());
//    }
//
//    @Override
//    public void save(Employee employee) {
//
//    }
//
//    @Override
//    public void save(Employee employee) {
//        employee.put(employee.getId(), employee);
//    }
//
//    @Override
//    public Employee findById(int id) {
//        return products.get(id);
//    }
//
//    @Override
//    public void update(int id, Employee product) {
//
//    }
//
//    @Override
//    public void update(int id, Product product) {
//        products.put(id, product);
//    }
//
//    @Override
//    public void remove(int id) {
//        products.remove(id);
//    }
//}
