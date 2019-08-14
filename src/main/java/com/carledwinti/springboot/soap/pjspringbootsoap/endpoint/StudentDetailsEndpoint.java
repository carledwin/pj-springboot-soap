package com.carledwinti.springboot.soap.pjspringbootsoap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.carledwinti.students.GetStudentDetailsRequest;
import com.carledwinti.students.GetStudentDetailsResponse;
import com.carledwinti.students.StudentDetails;

@Endpoint
public class StudentDetailsEndpoint {

	
	@PayloadRoot(namespace="http://carledwinti.com/students", localPart="GetStudentDetailsRequest")
	@ResponsePayload
	public GetStudentDetailsResponse processCourseDetailsRequest(@RequestPayload GetStudentDetailsRequest getStudentDetailsRequest) {
		
		GetStudentDetailsResponse getStudentDetailsResponse = new GetStudentDetailsResponse();
		
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setId(getStudentDetailsRequest.getId());
		studentDetails.setName("Fulano de Tal");
		studentDetails.setPassportNumber("3423243233");
		
		getStudentDetailsResponse.setStudentDetails(studentDetails);
		
		return getStudentDetailsResponse;
	}
}
