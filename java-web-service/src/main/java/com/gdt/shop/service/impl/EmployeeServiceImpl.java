package com.gdt.shop.service.impl;

import com.gdt.shop.domain.Employee;
import com.gdt.shop.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service("employeeService")
@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class,isolation=Isolation.READ_COMMITTED,readOnly=true)
public class EmployeeServiceImpl implements EmployeeService {

	private static Map<Long, Employee> allEmployees;

	/*@Autowired
	@Resource(name = "shopManager")
	private ShopManager shopManager;*/

	static {
		allEmployees = new HashMap<Long, Employee>();
		Employee e1 = new Employee(1L, "Huang Yi Ming", "huangyim@cn.ibm.com");
		Employee e2 = new Employee(2L, "Wu Dong Fei", "wudongf@cn.ibm.com");
		allEmployees.put(e1.getId(), e1);
		allEmployees.put(e2.getId(), e2);
	}

	public void add(Employee e) {
		allEmployees.put(e.getId(), e);
	}

	public Employee get(long id) {
		return allEmployees.get(id);
	}

	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public List<Employee> getAll() {
		List<Employee> employees = new ArrayList<Employee>();
		for (Iterator<Employee> it = allEmployees.values().iterator(); it.hasNext();) {
			Employee e = it.next();
			// e.setName(shopManager.getShop(1).getName());
			employees.add(e);
		}

		Map<String, Object> param1 = new HashMap<String, Object>();
		param1.put("id", new Integer(1));
		param1.put("name", "中文_中文");
		// shopManager.updateShop(new Integer(1), param1);

		Map<String, Object> param2 = new HashMap<String, Object>();
		param2.put("id", new Integer(3));
		param2.put("name", "中文_中文中文_中文");
		// shopManager.updateShop(new Integer(3), param2);

		return employees;
	}

	public void remove(long id) {
		allEmployees.remove(id);
	}

	public void update(Employee e) {
		allEmployees.put(e.getId(), e);
	}

	/*public void setShopManager(ShopManager shopManager) {
		this.shopManager = shopManager;
	}*/
}
