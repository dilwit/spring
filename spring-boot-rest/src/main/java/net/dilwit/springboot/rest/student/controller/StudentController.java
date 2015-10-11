package net.dilwit.springboot.rest.student.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.dilwit.springboot.rest.student.domain.Student;
import net.dilwit.springboot.rest.student.domain.StudentDomain;

@RestController
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/retrieve")
    public Student greeting(@RequestParam(value="studentId") String studentId) {
       
    	if(StringUtils.isEmpty(studentId)) {
    		throw new IllegalArgumentException();
    	}
    	
    	Student student = new StudentDomain();
    	student.setId(1);
    	student.setFirstName("Drew");
    	student.setLastName("Rex");
    	return student;
    }
    
    
    @ExceptionHandler({IllegalArgumentException.class, NullPointerException.class})
    private void handleBadRequests(HttpServletResponse response) throws IOException {
    	response.sendError(HttpStatus.BAD_REQUEST.value(), "Please check if service parameters provided correctly.");
    }
}