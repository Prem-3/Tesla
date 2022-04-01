package com.springboot.workers.jdbcexample.controller;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.workers.jdbcexample.model.Worker;
import com.springboot.workers.jdbcexample.repository.WorkerRepo;

@RestController
@RequestMapping("/worker")
public class WorkerController {



@Autowired
private WorkerRepo workerRepo;



@GetMapping("/showWorker")
public Worker getWorker() {
try {
return workerRepo.getWorker(1);
}
catch(SQLException e)
{
System.out.println(e);
return null;
}
}
@GetMapping("/all/showWorkers")
public List<Worker> getWorkers(){
try {
return workerRepo.getWorkers();
}
catch(SQLException e)
{
System.out.println(e);
return null;
}
}
@GetMapping("/create")
public String create() throws SQLException {
workerRepo.add(new Worker(419, "Tesla", "Prem", "Aeronautical", 700000.0, "tesla@gmail.com"));
return "Record Created Successfully";
}
@GetMapping("/update")
public String update() throws SQLException {
workerRepo.update(new Worker(419, "Prem", "Tesla", "ECE",200000.0, "prem3@gmail.com"));
return " Record Updated Successfully";
}
@GetMapping("/delete")
public String delete() throws SQLException {
workerRepo.delete(1);
return "Record Deleted Successfully";
}
}