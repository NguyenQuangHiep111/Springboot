package techmaster.demo.controller;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import techmaster.demo.service.EmployeeService;
import techmaster.demo.service.EmployeeServiceImpl;
import vn.techmaster.crud_rest.dto.BookRequest;
import vn.techmaster.crud_rest.dto.JobRequest;
import vn.techmaster.crud_rest.model.Book;
import vn.techmaster.crud_rest.model.Job;
public class EmployeeController {
    @Controller
    public class EmployeeController {
        private EmployeeService employeeService = new EmployeeServiceImpl();

        @GetMapping("/")
        public String index(Model model, RedirectAttributes redirect) {
            model.addAttribute("employee", EmployeeService.findAll());
            redirect.addFlashAttribute("success", "");
            return "index";
        }

        @GetMapping("/product/create")
        public String create(Model model) {
            model.addAttribute("product", new Product());
            return "create";
        }

        @PostMapping("/product/save")
        public String save(Product product, RedirectAttributes redirect) {
            product.setId((int)(Math.random() * 10000));
            productService.save(product);
            redirect.addFlashAttribute("success", "Saved product successfully!");
            return "redirect:/";
        }

        @GetMapping("/product/{id}/edit")
        public String edit(@PathVariable int id, Model model) {
            model.addAttribute("product", productService.findById(id));
            return "edit";
        }

        @PostMapping("/product/update")
        public String update(Product product, RedirectAttributes redirect) {
            productService.update(product.getId(), product);
            redirect.addFlashAttribute("success", "Modified product successfully!");
            return "redirect:/";
        }

        @GetMapping("/product/{id}/delete")
        public String delete(@PathVariable int id, Model model) {
            model.addAttribute("product", productService.findById(id));
            return "delete";
        }

        @PostMapping("/product/delete")
        public String delete(Product product, RedirectAttributes redirect) {
            productService.remove(product.getId());
            redirect.addFlashAttribute("success", "Removed product successfully!");
            return "redirect:/";
        }

        @GetMapping("/product/{id}/view")
        public String view(@PathVariable int id, Model model) {
            model.addAttribute("product", productService.findById(id));
            return "view";
        }
}
