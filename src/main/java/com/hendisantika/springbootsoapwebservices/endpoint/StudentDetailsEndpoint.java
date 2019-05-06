package com.hendisantika.springbootsoapwebservices.endpoint;

import com.hendisantika.springbootsoapwebservices.students.GetStudentDetailsRequest;
import com.hendisantika.springbootsoapwebservices.students.GetStudentDetailsResponse;
import com.hendisantika.springbootsoapwebservices.students.StudentDetails;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-soap-web-services
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-07
 * Time: 04:55
 */
@Endpoint
public class StudentDetailsEndpoint {

    @PayloadRoot(namespace = "http://hendisantika.com/students", localPart = "GetStudentDetailsRequest")
    @ResponsePayload
    public GetStudentDetailsResponse processCourseDetailsRequest(@RequestPayload GetStudentDetailsRequest request) {
        GetStudentDetailsResponse response = new GetStudentDetailsResponse();

        StudentDetails studentDetails = new StudentDetails();
        studentDetails.setId(request.getId());
        studentDetails.setName("Uzumaki Naruto");
        studentDetails.setPassportNumber("E1234567");

        response.setStudentDetails(studentDetails);

        return response;
    }

}