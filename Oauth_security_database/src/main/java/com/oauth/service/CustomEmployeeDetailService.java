package com.oauth.service;

import com.oauth.Repository.EmployeeRepository;
import com.oauth.model.CustomUserDetail;
import com.oauth.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomEmployeeDetailService implements UserDetailsService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String empName) throws UsernameNotFoundException {
        Employee user = this.employeeRepository.findByEmpName(empName);
        if (user == null) {
            throw new UsernameNotFoundException("No User found!!");
        }
        return new CustomUserDetail(user);
    }

}
