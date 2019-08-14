package com.carledwinti.springboot.soap.pjspringbootsoap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.carledwinti.notes.GetNotesRequest;
import com.carledwinti.notes.GetNotesResponse;
import com.carledwinti.notes.Note;
import com.carledwinti.notes.User;

@Endpoint
public class NotesDetailsEndpoint {

	
	@PayloadRoot(namespace="http://carledwinti.com/notes", localPart="GetNotesRequest")
	@ResponsePayload
	public GetNotesResponse processCourseDetailsRequest(@RequestPayload GetNotesRequest getNotesRequest) {
		
		GetNotesResponse getNotesResponse = new GetNotesResponse();
		
		Note note = new Note();
		note.setValue(10);
		note.setDescription("Ótima Nota");
		
		User user = new User();
		user.setName("Fulano de Tal");
		user.setAge(36);
		user.setDocument(12345678901l);
		user.setDocumentType(com.carledwinti.springboot.soap.pjspringbootsoap.enums.DocumentType.CPF.toString());
		
		note.setUser(user);
		
		getNotesResponse.setNote(note);
		
		return getNotesResponse;
	}
}
