package com.service;

import com.dao.Employee_Dao;

public class Employee_Service {
	public void insertData(EmployeePojo ep) throws Exception {
		Employee_Dao sd = new Employee_Dao();
		sd.insertData(ep);
	}

	public void updateData(EmployeePojo ep) throws Exception {
		Employee_Dao sd = new Employee_Dao();
		sd.updateData(ep);
	}

	public void deleteData(EmployeePojo ep) throws Exception {
		Employee_Dao sd = new Employee_Dao();
		sd.deleteData(ep);
	}

	public void fetchAllData(EmployeePojo ep) throws Exception {
		Employee_Dao sd = new Employee_Dao();
		sd.fetchAllRecord(ep);
	}
}
	