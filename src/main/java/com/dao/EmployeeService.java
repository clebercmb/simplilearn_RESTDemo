package com.dao;

import com.to.Employee;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

@Path("/EmployeeService")
public class EmployeeService {

    private static final String SUCCESS_RESULT = "<result>success</result>";
    private static final String FAILURE_RESULT = "<result>failure</result>";

    EmployeeServiceImpl els = new EmployeeServiceImpl();

    @GET
    @Path("/employees")
    @Produces(MediaType.APPLICATION_XML)
    public List<Employee> getEmployees(){
        return els.getEmployees();
    }

    @GET
    @Path("/employees/(empid)")
    @Produces(MediaType.APPLICATION_XML)
    public Employee getEmployee(@PathParam("empid") int eid){
        return els.getEmployee(eid);
    }

    @POST
    @Path("/employees")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String createUser(@FormParam("empid") int empid,
                             @FormParam("name") String name,
                             @FormParam("age") int age,
                             @FormParam("password") String password) throws IOException {

        Employee e = new Employee(empid, name, age, password);
        System.out.println("####createUser=" + e);

        int result = els.addEmployee(e);
        if(result == 1) {
            return "<html><body>"+ SUCCESS_RESULT + "</body></html>";
        }
        return FAILURE_RESULT;
    }

}
